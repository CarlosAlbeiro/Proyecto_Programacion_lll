/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;

/**
 *
 * @author Catalina
 */
public class MarketPlace {
	
    public  ArrayList<Vendedores> listaVendedores;
	
    
    public MarketPlace(){
        
    }
    
//    public boolean registrarVendedor(String nombre, String apellido,String telefono, String cedula,String correo,String clave){
//        listaVendedores.add(new Vendedores(nombre,apellido,telefono,cedula, correo, clave));
//        return true;
//    }
//    public String ultimoVendedor(){
//            String c;
//            int cantidad=listaVendedores.size()-1;
//            c="\nNombre: "+listaVendedores.get(cantidad).getNombre()+"\nApellido: "+listaVendedores.get(cantidad).getApellido()
//                +"\nTelefono: "+listaVendedores.get(cantidad).getTelefono()+"\nCedula: "+listaVendedores.get(cantidad).getCedula()+"\nCorreo: "+listaVendedores.get(cantidad).getCorreo();
//        return c;
//    }
//    public boolean loginVendedor(String clave, String correo){
//        int indicador=0;
//        for (int i = 0; i <= listaVendedores.size()-1 ; i++) {
//            if (listaVendedores.get(i).getClave().equals(clave) && listaVendedores.get(i).getCorreo().equals(correo) ){
//                indicador=1;
//                i=listaVendedores.size()+1;
//            }
//        } 
//        if(indicador==1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

	public ArrayList<Vendedores> getListaVendedores() {
		return listaVendedores;
	}

	public void setListaVendedores(ArrayList<Vendedores> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}

	

    
}
