package co.edu.uniquindio.marketplace.persistencia;

import co.edu.uniquindio.marketplace.model.MarketPlace;

public class Persistencia {

	//public static final String RUTA_ARCHIVO_CLIENTES = "src/resources/archivoClientes.txt";
	public static final String RUTA_ARCHIVO_EMPLEADOS = "src/resources/archivoEmpleados.txt";
	
	public static void guardarEmpleados(ArrayList<Empleado> listaEmpleados) throws IOException {

	
		String contenido = "";

		for(MarketPlace vendedor:listaVendedores)
		{
			contenido+= vendedor.getNombre()+"#"+empleado.getApelli()+"#"+empleado.getCedula()+"\n";
		}
		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_EMPLEADOS, contenido, false);
	}

}

