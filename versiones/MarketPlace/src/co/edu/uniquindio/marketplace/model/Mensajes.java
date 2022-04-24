/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.marketplace.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Catalina
 */
class Mensajes {
    //Declaracion de las variables 
    private Vendedores remitente;
    private Vendedores  destinatario;
    private LocalTime hora;
    private LocalDate fecha;
    private String mensaje;

    //Constructor de la aplicacion 
    public Mensajes(Vendedores remitente, Vendedores destinatario, LocalTime hora, LocalDate fecha, String mensaje) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.hora = hora;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    //Get y Set de las variables 
    public Vendedores getRemitente() {
        return remitente;
    }

    public void setRemitente(Vendedores remitente) {
        this.remitente = remitente;
    }

    public Vendedores getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Vendedores destinatario) {
        this.destinatario = destinatario;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}