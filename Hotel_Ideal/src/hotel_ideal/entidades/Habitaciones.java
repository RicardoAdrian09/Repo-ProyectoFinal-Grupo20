
package hotel_ideal.entidades;

public class Habitaciones {
    private int idHabitacion;
    private TipoDeHabitación tipo;
    private int piso;
    private boolean estado;

    public Habitaciones(TipoDeHabitación tipo, int piso, boolean estado) {
        this.tipo = tipo;
        this.piso = piso;
        this.estado = estado;
    }

    public Habitaciones(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Habitaciones() {
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoDeHabitación getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeHabitación tipo) {
        this.tipo = tipo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
