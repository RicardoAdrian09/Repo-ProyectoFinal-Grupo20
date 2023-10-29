
package hotel_ideal.entidades;

public class TipoDeHabitacion {
    private int idTipoDeHabitacion;
     private String tipo;
    private int cantPersonas;
    private int cantCamas;
    private String tipoDeCama;
    private int precioPorNoche;

    public TipoDeHabitacion(int idTipoDeHabitacion, String tipo, int cantPersonas, int cantCamas, String tipoDeCama, int precioPorNoche) {
        this.idTipoDeHabitacion = idTipoDeHabitacion;
        this.tipo = tipo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoDeCama = tipoDeCama;
        this.precioPorNoche = precioPorNoche;
    }

    public TipoDeHabitacion(String tipo, int cantPersonas, int cantCamas, String tipoDeCama, int precioPorNoche) {
        this.tipo = tipo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoDeCama = tipoDeCama;
        this.precioPorNoche = precioPorNoche;
    }
    
    public TipoDeHabitacion(int idTipoDeHabitacion) {
        this.idTipoDeHabitacion = idTipoDeHabitacion;
    }

    public TipoDeHabitacion(int idTipoDeHabitacion, String tipo) {
        this.idTipoDeHabitacion = idTipoDeHabitacion;
        this.tipo = tipo;
    }

    public TipoDeHabitacion(String tipo, int precioPorNoche) {
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
    }

    public TipoDeHabitacion(String tipo) {
        this.tipo = tipo;
    }
    
    public TipoDeHabitacion() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(int precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public int getIdTipoDeHabitacion() {
        return idTipoDeHabitacion;
    }

    public void setIdTipoDeHabitacion(int idTipoDeHabitacion) {
        this.idTipoDeHabitacion = idTipoDeHabitacion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoDeCama() {
        return tipoDeCama;
    }

    public void setTipoDeCama(String tipoDeCama) {
        this.tipoDeCama = tipoDeCama;
    }

    @Override
    public String toString() {
        return "ID: " + idTipoDeHabitacion + ", Tipo: " + tipo + ", Cantidad de personas: " + cantPersonas + ", Cantidad de camas: " + cantCamas + ", Tipo de cama: " + tipoDeCama + ", Precio por noche: " + precioPorNoche;
    }

    
    
    
}
