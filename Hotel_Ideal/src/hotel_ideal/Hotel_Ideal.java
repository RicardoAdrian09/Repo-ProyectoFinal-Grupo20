package hotel_ideal;

import hotel_ideal.accesoADatos.HuespedData;
import hotel_ideal.entidades.Huesped;

public class Hotel_Ideal {

    public static void main(String[] args) {

//        Huesped huesped = new Huesped();
        

//        huespedData.altaHuesped(huesped);
//huespedData.eliminarHuesped(1);

        Huesped huesped = new Huesped(1,"Pepe","Argento","calle 2","pepe@gmail.com","12345");
HuespedData huespedData = new HuespedData();

huespedData.modificarHuesped(huesped);
    }

}
