package co.edu.uniquindio.marketplace.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import co.edu.uniquindio.marketplace.exceptions.VendodoresException;
import co.edu.uniquindio.marketplace.model.MarketPlace;
import co.edu.uniquindio.marketplace.model.Vendedores;
import co.edu.uniquindio.marketplace.persistencia.Persistencia;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;


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
	public void guardarResourceXML() {
		market = new MarketPlace();
		market.setNombre("MI MARKTEPLACE");
		
		Vendedores vendedores = new Vendedores();//hay que mirar si esto se puede sacar del archivo vendedores
		vendedores.setNombre("Ruben");
		vendedores.setApellido("Garrido");
		vendedores.setCedula("100939838");
		vendedores.setCorreo("admi");
		vendedores.setClave("pepe");
		vendedores.setTelefono("100938");
		
		market.getListaVendedores().add(vendedores);

		try {
			 Persistencia.guardarRecursoMarketPlaceXML(market);
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Datos no existen");
			
		}
	   
	}
	
	public MarketPlace leerEmpresaXML() {
		
		MarketPlace market = null;
		
		try {
			market = Persistencia.leerMarketPlaceXML();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No hay datos");
		}
		
		return market;
	}


//
	private void inicializarDatos() {
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
		String clave) throws IOException   {
		boolean creado = false;
		Vendedores vendedor = new Vendedores();
		vendedor.setNombre(nombre);
		vendedor.setApellido(apellido);
		vendedor.setCedula(cedula);
		vendedor.setCorreo(correo);
		vendedor.setClave(clave);
		vendedor.setTelefono(telefono);
		
		creado = market.registrarVendedores(vendedor);
		
		if (creado) {
			
				Persistencia.guardarVendedor(market.getListaVendedores());
			
		}
		return creado;
	}

	public boolean validarUsuario(String correo, String clave) throws FileNotFoundException, IOException, VendodoresException {
		boolean verificado = false;
		
		verificado=Persistencia.iniciarSesion(correo, clave);
		if (verificado) {
			
			return verificado;
		}
		
		return verificado;
	}
	



	
	
//
//	@Override
//	public ArrayList<Empleado> obtenerEmpleados() {
//
//		return banco.getListaEmpleados();
//	}
//


	

}