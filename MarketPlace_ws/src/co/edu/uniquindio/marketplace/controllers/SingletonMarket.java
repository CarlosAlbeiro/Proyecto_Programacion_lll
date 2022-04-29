package co.edu.uniquindio.marketplace.controllers;

import co.edu.uniquindio.marketplace.model.MarketPlace;

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
			inicializarDatos();
//			guardarResourceSerializable();
// 			guardarResourceXML();
		}

	}



	public void inicializarDatos() {
		
	}

	public MarketPlace getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public boolean crearEmpleado(String nombre, String apellido, String cedula) throws IOException {
		boolean creado = false;
		Empleado emple = new Empleado();
		emple.setNombre(nombre);
		emple.setApelli(apellido);
		emple.setCedula(cedula);
		creado = empresa.crearEmpleado(emple);
		
		if(creado) {
		 Persistencia.guardarEmpleados(empresa.getListaEmpleados());
		}
		
		return creado;
		
	}

}
