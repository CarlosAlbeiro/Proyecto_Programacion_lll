/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniquindio.marketplace.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Catalina
 */
public class MeGusta {
    //Declaracion de las varaibles 
    private LocalDate  fecha;
    private LocalTime  hora;

    //Constructor de laclase
    public MeGusta(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    //Get y Set de las variables 

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    
}
