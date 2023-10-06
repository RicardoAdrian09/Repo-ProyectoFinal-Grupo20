
package hotel_ideal.entidades;

import java.time.LocalDate;

public class Reserva {
    private int idReserva;
    private Huesped huesped;
    private Habitaciones habitacion;
    private double precioFinal;
    private LocalDate fechaFin;
    private LocalDate fechaInicio;
    private boolean activo;

    public Reserva(Huesped huesped, Habitaciones habitacion, double precioFinal, LocalDate fechaFin, LocalDate fechaInicio, boolean activo) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.precioFinal = precioFinal;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.activo = activo;
    }

    public Reserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitaciones getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitaciones habitacion) {
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

    
    
}
