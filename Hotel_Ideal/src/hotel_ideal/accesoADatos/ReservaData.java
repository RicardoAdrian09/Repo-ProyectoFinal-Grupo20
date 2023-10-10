/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.accesoADatos;

import hotel_ideal.entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gtorre
 */
public class ReservaData {

    Connection con = Conexion.getConexion();
    
    public ReservaData(){
        
    }

    

    

    public void crearReserva( Reserva reserva) {

        String sql = "INSERT INTO reserva (idHabitacion,idHuesped,fechaInicio ,fechaFin,precioTotal,cantidadDeDias,activo) VALUES (?,?,?,?,?,?,?,?)";

        try {
            
            
            
            
            
            

            PreparedStatement ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);

            ps = con.prepareStatement(sql);
            ps.setInt(1,reserva.getHabitacion().getIdHabitacion());
            ps.setInt(2, reserva.getHuesped().getIdHuesped());
            ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(5, reserva.getPrecioFinal());
            ps.setInt(6,reserva.);
            ps.setInt(7,reserva.);
            ps.setBoolean(8,true);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt("idReserva"));

                JOptionPane.showMessageDialog(null, "Reserva  concretada con exito");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " No se ha podido dar de alta la reserva ");
        }

    }

}
