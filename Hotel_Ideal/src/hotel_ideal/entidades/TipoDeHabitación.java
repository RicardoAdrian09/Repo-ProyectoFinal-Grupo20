
package hotel_ideal.entidades;

public class TipoDeHabitación {
    private int idTipoDeHabitacion;
    private int cantPersonas;
    private int cantCamas;
    private String tipoDeCama;

    public TipoDeHabitación(int cantPersonas, int cantCamas, String tipoDeCama) {
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoDeCama = tipoDeCama;
    }

    public TipoDeHabitación(int idTipoDeHabitacion) {
        this.idTipoDeHabitacion = idTipoDeHabitacion;
    }

    public TipoDeHabitación() {
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

    
    
    
}
