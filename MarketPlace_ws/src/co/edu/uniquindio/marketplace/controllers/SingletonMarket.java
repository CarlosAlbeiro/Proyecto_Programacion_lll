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

	
	
//
//	@Override
//	public ArrayList<Empleado> obtenerEmpleados() {
//
//		return banco.getListaEmpleados();
//	}
//




}