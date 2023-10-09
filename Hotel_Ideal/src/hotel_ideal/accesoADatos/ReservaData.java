/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gtorre
 */
public class ReservaData {
    
    Connection con = Conexion.getConexion();
    
    
    
    public void crearReserva (){
        
       String sql= "INSERT INTO reserva (idHabitacion ,idHuesped ,fechaInicio ,fechaFin ,precioTotal ,cantPersonas,cantidadDeDias,activo) VALUES (?,?,?,?,?,?,?,?)";
       
       PreparedStatement ps;
        
        
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
            
            
            
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," No se ha podido dar de alta la reserva ");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
