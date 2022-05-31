/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.marketplace.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Catalina
 */
public class MarketPlace  {
	
	private String nombre;
    public  ArrayList<Vendedores> listaVendedores = new ArrayList<>();
	
    
    public MarketPlace(){
        
    }
    

	public void setListaVendedores(ArrayList<Vendedores> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean registrarVendedores(Vendedores vendedor) {
		
		getListaVendedores().add(vendedor);
		
		return true;
	}
	
	public ArrayList<Vendedores> getListaVendedores() {
		return listaVendedores;
	}

	

    
}
