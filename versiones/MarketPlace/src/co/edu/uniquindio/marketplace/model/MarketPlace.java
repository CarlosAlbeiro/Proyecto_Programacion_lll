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
    //Declaracio de variables
    public  ArrayList<Vendedores> listaVendedores;
    
    //Inicializar la clase MarketPlace
    public MarketPlace(){
        listaVendedores= new ArrayList();
        listaVendedores.add(new Vendedores("Carlos","Galeano","3005183772","1","carlos@gmail.com","carlos"));
        listaVendedores.add(new Vendedores("Ruben","Garrido","3456789023","2","ruben@gmail.com","ruben"));
    }
    
    //Metodo para registrar un nuevo vendedor
    public boolean registrarVendedor(String nombre, String apellido,String telefono, String cedula,String correo,String clave){
        listaVendedores.add(new Vendedores(nombre,apellido,telefono,cedula, correo, clave));
        return true;
    }
    
    //Metodo para obtener el ultimo vendedor registrado
    public String ultimoVendedor(){
            String c;
            int cantidad=listaVendedores.size()-1;
            c="\nNombre: "+listaVendedores.get(cantidad).getNombre()+"\nApellido: "+listaVendedores.get(cantidad).getApellido()
                +"\nTelefono: "+listaVendedores.get(cantidad).getTelefono()+"\nCedula: "+listaVendedores.get(cantidad).getCedula()+"\nCorreo: "+listaVendedores.get(cantidad).getCorreo();
        return c;
    }
    
    //Metodo para realizar el ingreso a la platafroma o login
    public boolean loginVendedor(String clave, String correo){
        int indicador=0;
        for (int i = 0; i <=listaVendedores.size()-1 ; i++) {
            if (listaVendedores.get(i).getClave().equals(clave) && listaVendedores.get(i).getCorreo().equals(correo) ){
                indicador=1;
                i=listaVendedores.size()+1;
            }
        } 
        if(indicador==1){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Metodo para sugerir vededores
    public String sugerirVendedores(){
        String c = null;
        for (int i = 0; i <=listaVendedores.size()-1 ; i++) {
            c="\nNombre: "+listaVendedores.get(i).getNombre()+"\nApellido: "+listaVendedores.get(i).getApellido()
                +"\nTelefono: "+listaVendedores.get(i).getTelefono()+"\nCorreo: "+listaVendedores.get(i).getCorreo();
            
        } 
        return c;
    }
}
