package co.edu.uniquindio.marketplace.persistencia;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.uniquindio.marketplace.exceptions.VendodoresException;
import co.edu.uniquindio.marketplace.model.MarketPlace;
import co.edu.uniquindio.marketplace.model.Vendedores;




public class Persistencia {

	public static final String RUTA_ARCHIVO_VENDEDORES = "src/resources/vendedores.txt";
	public static final String RUTA_ARCHIVO_LOG = "src/resources/MarketPlaceLog.txt";
	public static final String RUTA_ARCHIVO_OBJETOS = "src/resources/archivoObjetos.txt";
	public static final String RUTA_ARCHIVO_MODELO_MARKETPLACE_BINARIO = "src/resources/model.dat";
	public static final String RUTA_ARCHIVO_MODELO_MARKETPLACE_XML = "src/resources/model.xml";

	MarketPlace market = new MarketPlace();


	public static void cargarDatosArchivos(MarketPlace market) throws FileNotFoundException, IOException {
		//cargar archivo de vendedores
		ArrayList<Vendedores> vendedoresCargados = cargarVendedores(null);

		if(vendedoresCargados.size() > 0)
			market.getListaVendedores().addAll(vendedoresCargados);

		//cargar archivos vendedores
		//ArrayList<Vendedores> vendedoressCargados = cargarVendedores(null);

		//cargar archivo objetos

		//cargar archivo empleados

		//cargar archivo prestamo

	}





	public static ArrayList<Vendedores> cargarVendedores(String ruta) throws IOException {
		ArrayList<Vendedores> vendedores = new ArrayList<Vendedores>();

		ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_VENDEDORES);
		String linea="";

		for (int i = 0; i < contenido.size(); i++)
		{
			linea = contenido.get(i);
			Vendedores vendedor = new Vendedores();
			vendedor.setNombre(linea.split("#")[0]);
			vendedor.setApellido(linea.split("#")[1]);
			vendedor.setCedula(linea.split("#")[2]);
			vendedor.setCorreo(linea.split("#")[3]);
			vendedor.setClave(linea.split("#")[4]);
			vendedor.setTelefono(linea.split("#")[5]);
			
			vendedores.add(vendedor);
		}
		return vendedores;
	}





	/**
	 * Guarda en un archivo de texto todos la información de las personas almacenadas en el ArrayList
	 * @param objetos
	 * @param ruta
	 * @throws IOException
	 */



	public static void guardarVendedor(ArrayList<Vendedores> listaVendedores) throws IOException {

	
		String contenido = "";

		for(Vendedores vendedor:listaVendedores)
		{
			contenido+= vendedor.getNombre()+"#"+vendedor.getApellido()+"#"+vendedor.getCedula()+"#"+vendedor.getCorreo()+"#"+vendedor.getClave()+"#"+vendedor.getTelefono()+"\n";
		}
		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_VENDEDORES, contenido, true);
	}
 


//	----------------------LOADS------------------------

	/**
	 *
	 * @param tipoPersona
	 * @param ruta
	 * @return un Arraylist de personas con los datos obtenidos del archivo de texto indicado
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public static void guardaRegistroLog(String mensajeLog, int nivel, String accion)
	{

		ArchivoUtil.guardarRegistroLog(mensajeLog, nivel, accion, RUTA_ARCHIVO_LOG);
	}


	public static boolean iniciarSesion(String correo, String clave) throws FileNotFoundException, IOException, VendodoresException {

		if(validarUsuario(correo,clave)) {
			return true;
		}else {
			throw new VendodoresException();
			
		}

	}

	private static boolean validarUsuario(String correo, String clave) throws FileNotFoundException, IOException
	{
		ArrayList<Vendedores> vendedores = Persistencia.cargarVendedores(RUTA_ARCHIVO_VENDEDORES);

		for (int indiceUsuario = 0; indiceUsuario < vendedores.size(); indiceUsuario++)
		{
			Vendedores usuarioAux = vendedores.get(indiceUsuario);
			if(usuarioAux.getCorreo().equalsIgnoreCase(correo) && usuarioAux.getClave().equalsIgnoreCase(clave)) {
				return true;
			}
		}
		return false;
	}

//	public static ArrayList<Vendedores> cargarUsuarios(String ruta) throws FileNotFoundException, IOException {
//		ArrayList<Vendedores> vendedores =new ArrayList<Vendedores>();
//
//		ArrayList<String> contenido = ArchivoUtil.leerArchivo(ruta);
//		String linea="";
//
//		for (int i = 0; i < contenido.size(); i++) {
//			linea = contenido.get(i);
//
//			Vendedores vendedor = new Vendedores();
//			vendedor.setCorreo(linea.split("")[0]);
//			vendedor.setClave(linea.split("")[1]);
//
//			Vendedores.add(vendedor);
//		}
//		return vendedores;
//	}





	public static void guardarRecursoMarketPlaceXML(MarketPlace market) {
		try {
			ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_MARKETPLACE_XML, market);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





	public static MarketPlace leerMarketPlaceXML() throws IOException {
		Object objeto = ArchivoUtil.cargarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_MARKETPLACE_XML);
	
		MarketPlace market =(MarketPlace) objeto;
		
		return market;
	}


//	----------------------SAVES------------------------

	/**
	 * Guarda en un archivo de texto todos la información de las personas almacenadas en el ArrayList
	 * @param objetos
	 * @param ruta
	 * @throws IOException
	 */

//	public static void guardarObjetos(ArrayList<Cliente> listaClientes, String ruta) throws IOException  {
//		String contenido = "";
//
//		for(Cliente clienteAux:listaClientes) {
//			contenido+= clienteAux.getNombre()+","+clienteAux.getApellido()+","+clienteAux.getCedula()+clienteAux.getDireccion()
//					     +","+clienteAux.getCorreo()+","+clienteAux.getFechaNacimiento()+","+clienteAux.getTelefono()+"\n";
//		}
//		ArchivoUtil.guardarArchivo(ruta, contenido, true);
//	}





	//------------------------------------SERIALIZACIÓN  y XML

//
//	public static Banco cargarRecursoBancoBinario() {
//
//		Banco banco = null;
//
//		try {
//			banco = (Banco)ArchivoUtil.cargarRecursoSerializado(RUTA_ARCHIVO_MODELO_BANCO_BINARIO);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return banco;
//	}
//
//	public static void guardarRecursoBancoBinario(Banco banco) {
//
//		try {
//			ArchivoUtil.salvarRecursoSerializado(RUTA_ARCHIVO_MODELO_BANCO_BINARIO, banco);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//

//	public static Banco cargarRecursoBancoXML() {
//
//		Banco banco = null;
//
//		try {
//			banco = (Banco)ArchivoUtil.cargarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_BANCO_XML);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return banco;
//
//	}
//
//
//
//	public static void guardarRecursoBancoXML(Banco banco) {
//
//		try {
//			ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_BANCO_XML, banco);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//








}