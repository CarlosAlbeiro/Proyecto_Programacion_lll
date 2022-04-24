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
class Vendedores {
    //Declaracion de las variables 
    private String nombre;
    private String apellido;
    private String telefono;
    private String cedula;
    private String clave;
    private String correo;
    private Comentario comentario;
    private Mensajes mensajes;
    public  ArrayList<Productos> listaProductos;
    public  ArrayList<Mensajes> listaMensaje;
    
    
    //Constructor de la clase
    public Vendedores(String nombre,String apellido,String telefono,String cedula, String correo,String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula = cedula;
        this.correo = correo;
        this.clave=clave;
       
        
    }

    //Get y Set de lac clases
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Mensajes getMensajes() {
        return mensajes;
    }

    public void setMensajes(Mensajes mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Mensajes> getListaMensaje() {
        return listaMensaje;
    }

    public void setListaMensaje(ArrayList<Mensajes> listaMensaje) {
        this.listaMensaje = listaMensaje;
    }

   
}
