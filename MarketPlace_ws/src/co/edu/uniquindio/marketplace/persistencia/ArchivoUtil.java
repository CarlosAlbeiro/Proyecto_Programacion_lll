package co.edu.uniquindio.marketplace.persistencia;

/**
 * Esta clase teine metodo estaticos que permite usarlos sin crear instancias de la clase
 * Lo que se hizo fue crear esta libreria para el manejo de los archivos
 * @author Admin
 *
 */
public  class ArchivoUtil {

	static String fechaSistema = "";
	/**
	 * Este metodo recibe una cadena con el contenido que se quiere guardar en el archivo
	 * @param ruta es la ruta o path donde esta ubicado el archivo
	 * @throws IOException
	 */
	public static void guardarArchivo(String ruta,String contenido, Boolean flagAnexarContenido) throws IOException {

		FileWriter fw = new FileWriter(ruta,flagAnexarContenido);
		BufferedWriter bfw = new BufferedWriter(fw);
		bfw.write(contenido);
		bfw.close();
		fw.close();
	}

//	/**
//	 * ESte metodo retorna el contendio del archivo ubicado en una ruta,con la lista de cadenas.
//	 * @param ruta
//	 * @return
//	 * @throws IOException
//	 */
//	public static ArrayList<String> leerArchivo(String ruta) throws IOException {
//
//		ArrayList<String>  contenido = new ArrayList<String>();
//		FileReader fr=new FileReader(ruta);
//		BufferedReader bfr=new BufferedReader(fr);
//		String linea="";
//		while((linea = bfr.readLine())!=null)
//		{
//			contenido.add(linea);
//		}
//		bfr.close();
//		fr.close();
//		return contenido;
//	}


 
//
//	private static void cargarFechaSistema() {
//
//		String diaN = "";
//		String mesN = "";
//		String añoN = "";
//
//		Calendar cal1 = Calendar.getInstance();
//
//
//		int  dia = cal1.get(Calendar.DATE);
//		int mes = cal1.get(Calendar.MONTH)+1;
//		int año = cal1.get(Calendar.YEAR);
//		int hora = cal1.get(Calendar.HOUR);
//		int minuto = cal1.get(Calendar.MINUTE);
//
//
//		if(dia < 10){
//			diaN+="0"+dia;
//		}
//		else{
//			diaN+=""+dia;
//		}
//		if(mes < 10){
//			mesN+="0"+mes;
//		}
//		else{
//			mesN+=""+mes;
//		}
//
//		//		fecha_Actual+= año+"-"+mesN+"-"+ diaN;
//		//		fechaSistema = año+"-"+mesN+"-"+diaN+"-"+hora+"-"+minuto;
//		fechaSistema = año+"-"+mesN+"-"+diaN;
//		//		horaFechaSistema = hora+"-"+minuto;
//	}


}
