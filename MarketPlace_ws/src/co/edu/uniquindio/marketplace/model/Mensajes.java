
package co.edu.uniquindio.marketplace.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Catalina
 */
 public class Mensajes {
    private Vendedores remitente;
    private Vendedores  destinatario;
    private LocalTime hora;
    private LocalDate fecha;
    private String mensaje;

    public Mensajes(Vendedores remitente, Vendedores destinatario, LocalTime hora, LocalDate fecha, String mensaje) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.hora = hora;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

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
