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
			//inicializarDatos();
//			guardarResourceSerializable();
			//guardarResourceXML();
		}

		//Registrar la accion de incio de sesión
		//Persistencia.guardaRegistroLog("Inicio de sesión del usuario:pedro", 1, "inicioSesion");


	}



//	private void iniciarSalvarDatosPrueba() {
//
//		inicializarDatos();
//
//		try {
//
//			Persistencia.guardarEmpleados(getBanco().getListaEmpleados());
//			Persistencia.guardarClientes(getBanco().getListaClientes());
//
//			//Persistencia.cargarDatosArchivos(getBanco());
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


//	private void cargarDatosDesdeArchivos() {
//
//		market = new MarketPlace();
//
//		try {
//
//			Persistencia.cargarDatosArchivos(getBanco());
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

//	public void cargarResourceBinario() {
//
//		banco = Persistencia.cargarRecursoBancoBinario();
//	}
//
//
//	public void guardarResourceBinario() {
//
//	    Persistencia.guardarRecursoBancoBinario(banco);
//	}


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
//	private void inicializarDatos() {
//
//		banco = new Banco();
//
//		Cliente cliente = new Cliente();
//		cliente.setNombre("juan");
//		cliente.setApellido("arias");
//		cliente.setCedula("125454");
//		cliente.setDireccion("Armenia");
//		cliente.setCorreo("uni1@");
//		cliente.setFechaNacimiento("12454");
//		cliente.setTelefono("125444");
//
//		banco.getListaClientes().add(cliente);
//
//		cliente = new Cliente();
//		cliente.setNombre("Pedro");
//		cliente.setApellido("Perez");
//		cliente.setCedula("77787");
//		cliente.setDireccion("Pererira");
//		cliente.setCorreo("uni2@");
//		cliente.setFechaNacimiento("12454");
//		cliente.setTelefono("125444");
//
//		banco.getListaClientes().add(cliente);
//
//		cliente = new Cliente();
//		cliente.setNombre("Alberto");
//		cliente.setApellido("Arias");
//		cliente.setCedula("12555");
//		cliente.setDireccion("Pererira");
//		cliente.setCorreo("uni3@");
//		cliente.setFechaNacimiento("12454");
//		cliente.setTelefono("125444");
//
//		banco.getListaClientes().add(cliente);
//
//
//		Empleado empleado = new Empleado();
//		empleado.setNombre("juan");
//		empleado.setApellido("arias");
//		empleado.setCedula("125454");
//		empleado.setFechaNacimiento("12454");
//		banco.getListaEmpleados().add(empleado);
//
//
//		empleado = new Empleado();
//		empleado.setNombre("Ana");
//		empleado.setApellido("alzate");
//		empleado.setCedula("125454");
//		empleado.setFechaNacimiento("12454");
//		banco.getListaEmpleados().add(empleado);
//
//		empleado = new Empleado();
//		empleado.setNombre("Pedro");
//		empleado.setApellido("perez");
//		empleado.setCedula("125454");
//		empleado.setFechaNacimiento("12454");
//		banco.getListaEmpleados().add(empleado);
//
//		System.out.println("Banco inicializado "+banco );
//
//	}

	

//
//	@Override
//	public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) {
//
//
//		Empleado empleado = null;
//
//		try {
//			empleado = getBanco().crearEmpleado(nombre, apellido, cedula, fechaNacimiento);
//		} catch (EmpleadoException e) {
//			e.getMessage();
//		}
//
//		return empleado;
//
//	}

	public MarketPlace getMarket() {
		return market;
	}

	public void setMarket(MarketPlace market) {
		this.market = market;
	}

//	@Override
//	public boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula, String fechaNacimiento) {
//
//		return getBanco().actualizarEmpleado(cedulaActual, nombre, apellido, cedula, fechaNacimiento);
//	}
//
//	@Override
//	public Boolean eliminarEmpleado(String cedula) {
//
//		boolean flagEmpleadoExiste = false;
//
//		try {
//			flagEmpleadoExiste = getBanco().eliminarEmpleado(cedula);
//		} catch (EmpleadoException e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
//		return flagEmpleadoExiste;
//	}

//	@Override
//	public Empleado obtenerEmpleado(String cedula) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ArrayList<Empleado> obtenerEmpleados() {
//
//		return banco.getListaEmpleados();
//	}
//




}