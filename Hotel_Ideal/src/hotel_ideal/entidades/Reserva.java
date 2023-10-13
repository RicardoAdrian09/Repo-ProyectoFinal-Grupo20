
package hotel_ideal.entidades;

import java.time.LocalDate;

public class Reserva {
    private int idReserva;
    private Huesped huesped;
    private Habitacion habitacion;
    private LocalDate fechaFin;
    private LocalDate fechaInicio;
    private double precioFinal;
    private int cantidadDeDias;   

    private boolean activo;

    
     // constructor para modificar reserva.
    
    public Reserva( LocalDate fechaInicio, LocalDate fechaFin,double precioFinal, boolean activo , int idReserva ) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioFinal = precioFinal;
        this.activo = activo;
        this.idReserva=idReserva;
    }

     // constructor completo para Alta reserva.
    
    public Reserva(Huesped huesped, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin,double precioFinal,int cantidadDeDias, boolean activo) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioFinal = precioFinal;
        this.cantidadDeDias=cantidadDeDias;
        this.activo = activo;
    }
   
    
      // constructor solo de idReserva
    
    public Reserva(int idReserva) {
        this.idReserva = idReserva;
    }
     // constructor vacio 
    public Reserva() {
    }

    public int getidReserva() {
        return idReserva;
    }

    public void setidReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidadDeDias() {
        return cantidadDeDias;
    }

    public void setCantidadDeDias(int cantidadDeDias) {
        this.cantidadDeDias = cantidadDeDias;
    }

    
    
}
