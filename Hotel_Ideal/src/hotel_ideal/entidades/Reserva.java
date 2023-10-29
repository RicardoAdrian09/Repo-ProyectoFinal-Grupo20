
package hotel_ideal.entidades;

import java.time.LocalDate;

public class Reserva {
    private int idReserva;
    private Huesped huesped;
    private Habitacion habitacion;
    private LocalDate fechaFin;
    private LocalDate fechaInicio;
    private double precioFinal;
    private int cantPersonas;
    private int cantidadDeDias;   

    private boolean activo;

    
     // constructor para modificar reserva.
    
    public Reserva( LocalDate fechaInicio, LocalDate fechaFin,double precioFinal,int cantidadDeDias , int idReserva ) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioFinal = precioFinal;
        this.cantidadDeDias= cantidadDeDias;
        this.idReserva=idReserva;
    }

     // constructor completo para Alta reserva.
    
    public Reserva(Huesped huesped, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin,double precioFinal,int cantPersonas ,int cantidadDeDias, boolean activo) {
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

    public Reserva() {
        
    }
    
      // guetter and setters 
    
    public int getidReserva() {
        return idReserva;
    }

    public void setidReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    
      //  hueped 
    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }
      // habitacion
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
      // precio final 
    public double getPrecioFinal() {
        return precioFinal;
    }

      public void getPrecioFinal(double precioFinal) {    // creado automaticamente
        
    }
    
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }


    // fecha fin 
    
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
       // fecha inicio 
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
      // estado 
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

        // cantidad de dias 
    
    public int getCantidadDeDias() {
        return cantidadDeDias;
    }

    public void setCantidadDeDias(int cantidadDeDias) {
        this.cantidadDeDias = cantidadDeDias;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", huesped=" + huesped + ", habitacion=" + habitacion + ", fechaFin=" + fechaFin + ", fechaInicio=" + fechaInicio + ", precioFinal=" + precioFinal + ", cantPersonas=" + cantPersonas + ", cantidadDeDias=" + cantidadDeDias + ", activo=" + activo + '}';
    }

  

   

    
    
}
