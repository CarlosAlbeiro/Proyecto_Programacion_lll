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
class Productos {
    //Declaracion de variables
    private String nombre;
    private String codigo;
    private String imagen;
    private String categoria;
    private String precio;
    private String estado;
    public  ArrayList<Comentario> listaComentarios;
    public  ArrayList<MeGusta> listaMegusta;
    
    //Constructor de la clase
    public Productos(String nombre, String codigo, String imagen, String categoria, String precio, String estado, ArrayList<Comentario> listaComentarios) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;
        this.listaComentarios = null;
        this.listaMegusta= null;
    }

    //Get y Set de las variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Comentario> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<Comentario> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public ArrayList<MeGusta> getListaMegusta() {
        return listaMegusta;
    }

    public void setListaMegusta(ArrayList<MeGusta> listaMegusta) {
        this.listaMegusta = listaMegusta;
    }
    
    
    
}
