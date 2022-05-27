package co.edu.uniquindio.marketplace.controllers;

import java.io.IOException;

import co.edu.uniquindio.marketplace.exceptions.VendodoresException;
import co.edu.uniquindio.marketplace.model.MarketPlace;
import co.edu.uniquindio.marketplace.model.Vendedores;
import co.edu.uniquindio.marketplace.persistencia.Persistencia;


public class SingletonMarket {

	MarketPlace market = new MarketPlace();


	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static SingletonMarket eINSTANCE = new SingletonMarket();
	}

	// Método para obtener la instancia de nuestra clase
	public static SingletonMarket getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public SingletonMarket() {


		//1. inicializar datos y luego guardarlo en archivos
//		iniciarSalvarDatosPrueba();

		//2. Cargar los datos de los archivos
		//cargarDatosDesdeArchivos();


		//3. Guardar y Cargar el recurso serializable binario
//		guardarResourceBinario();
//		cargarResourceBinario();

		//4. Guardar y Cargar el recurso serializable XML
//		guardarResourceXML();
//		cargarResourceXML();


		//Siempre se debe verificar si la raiz del recurso es null
		if(market == null)
		{
			System.out.println("es null");
			//inicializarDatos();
//			guardarResourceSerializable();
			//guardarResourceXML();
		}

		//Registrar la accion de incio de sesión
		//Persistencia.guardaRegistroLog("Inicio de sesión del usuario:pedro", 1, "inicioSesion");


	}



	private void iniciarSalvarDatosPrueba() {

	
	}


	private void cargarDatosDesdeArchivos() {

		
	}

//	public void cargarResourceBinario() {
//
//		banco = Persistencia.cargarRecursoBancoBinario();
//	}
//

//	public void guardarResourceBinario() {
//
//	    Persistencia.guardarRecursoBancoBinario(banco);
//	}
//
//
//	public void cargarResourceXML() {
//
//		banco = Persistencia.cargarRecursoBancoXML();
//	}
//
//
//	public void guardarResourceXML() {
//
//	    Persistencia.guardarRecursoBancoXML(banco);
//	}


//
	private void inicializarDatos() {
//
//		market = new MarketPlace();
//
//		Vendedores vendedores = new Vendedores();
//		vendedores.setNombre("juan");
//		vendedores.setApellido("arias");
//		vendedores.setCedula("125454");
//		vendedores.setClave("Arme");
//		vendedores.setCorreo("uni1@");
//		vendedores.setTelefono("125444");
//
//		market.getListaVendedores().add(vendedores);
//
//		
//
//		System.out.println("Banco inicializado "+market );
		

	}

	
	public MarketPlace getMarket() {
		return market;
	}

	public void setMarket(MarketPlace market) {
		this.market = market;
	}

	public boolean registrarVendedores(String nombre, String apellido, String telefono, String cedula, String correo,
		String clave, String confirClave) throws IOException   {
		boolean creado = false;
		Vendedores vendedor = new Vendedores();
		vendedor.setNombre(nombre);
		vendedor.setApellido(apellido);
		vendedor.setCedula(cedula);
		vendedor.setCorreo(correo);
		vendedor.setClave(clave);
		vendedor.setConfiClave(confirClave);
		vendedor.setTelefono(telefono);
		
		creado = market.registrarVendedores(vendedor);
		
		if (creado) {
			
				Persistencia.guardarVendedor(market.getListaVendedores());
			
		}
		return creado;
	}

	
	
//
//	@Override
//	public ArrayList<Empleado> obtenerEmpleados() {
//
//		return banco.getListaEmpleados();
//	}
//




}