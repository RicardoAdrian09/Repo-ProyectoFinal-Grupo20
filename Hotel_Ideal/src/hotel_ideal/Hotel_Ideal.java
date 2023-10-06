package hotel_ideal;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.accesoADatos.HuespedData;
import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.Huesped;
import hotel_ideal.entidades.TipoDeHabitación;

public class Hotel_Ideal {

    public static void main(String[] args) {
        
        
        
        
        
        
        //  pruebas de metodos HuespedData 

//        Huesped huesped = new Huesped();
//        huespedData.altaHuesped(huesped);
//        huespedData.eliminarHuesped(1);



//        Huesped huesped = new Huesped(1, "Pepe", "Argento", "calle 2", "pepe@gmail.com", "12345");
//        HuespedData huespedData = new HuespedData();

//        huespedData.modificarHuesped(huesped);
    

     // pruebas de metodos HabitacionData 
    
    
    
     //   TipoDeHabitación tdh= new TipoDeHabitación(1);
       
        Habitacion habitacion =new Habitacion (1,1);
       
        HabitacionData hd = new HabitacionData();
        
        hd.altaHabitacion(habitacion);
    
    }   
        
        

        
       
       
    
       
       
       
       
       
       
       
       
    
    
    
    
    
    
    
    
    
    
    
    
    
}
