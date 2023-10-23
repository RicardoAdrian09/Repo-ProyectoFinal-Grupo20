/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.accesoADatos;

import hotel_ideal.entidades.TipoDeHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gtorre
 */
public class TipoDeHabitacionData {
    Connection con = Conexion.getConexion();

    public TipoDeHabitacionData() {
    }
     public List<TipoDeHabitacion> listarTipoDeHabitaciones() {
        String sql = "SELECT idTipoDeHabitacion, tipo, cantidadDePersonas, cantCamas, tipoDeCamas, precioPorNoche FROM tipodehabitacion";
        List<TipoDeHabitacion> tipoDeHabitaciones = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoDeHabitacion tipoDeHabitacion = new TipoDeHabitacion();
                tipoDeHabitacion.setIdTipoDeHabitacion(rs.getInt("idTipoDeHabitacion"));
                tipoDeHabitacion.setTipo(rs.getString("tipo"));
                tipoDeHabitacion.setCantPersonas(rs.getInt("cantidadDePersonas"));
                tipoDeHabitacion.setCantCamas(rs.getInt("cantCamas"));
                tipoDeHabitacion.setTipoDeCama("tipoDeCamas");
                tipoDeHabitacion.setPrecioPorNoche(rs.getInt("precioPorNoche"));

                tipoDeHabitaciones.add(tipoDeHabitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de tipo de habitaciones");
        }
        return tipoDeHabitaciones;
    }

       public List<TipoDeHabitacion> listarTipoDeHabitacionesComboBox() {
        String sql = "SELECT idTipoDeHabitacion, tipo FROM tipodehabitacion";
        List<TipoDeHabitacion> tipoDeHabitaciones = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoDeHabitacion tipoDeHabitacion = new TipoDeHabitacion();
                tipoDeHabitacion.setIdTipoDeHabitacion(rs.getInt("idTipoDeHabitacion"));
                tipoDeHabitacion.setTipo(rs.getString("tipo"));

                tipoDeHabitaciones.add(tipoDeHabitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de tipo de habitaciones");
        }
        return tipoDeHabitaciones;
    }
 
     public TipoDeHabitacion buscarxTipoDeHabitacion(String tipo){
        TipoDeHabitacion tipoDeHabitacion = null;
        try {
            
            String sql = "SELECT * FROM tipodehabitacion WHERE tipo = ? ;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, tipo);
           
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                tipoDeHabitacion = new TipoDeHabitacion();
                tipoDeHabitacion.setIdTipoDeHabitacion(resultSet.getInt("idTipodeHabitacion"));
                tipoDeHabitacion.setTipo(resultSet.getString("tipo"));
                tipoDeHabitacion.setCantPersonas(resultSet.getInt("cantidadDePersonas"));
                tipoDeHabitacion.setCantCamas(resultSet.getInt("cantCamas"));
                tipoDeHabitacion.setTipoDeCama(resultSet.getString("tipoCamas"));
                tipoDeHabitacion.setPrecioPorNoche(resultSet.getInt("precioPorNoche"));

                
            }      
            statement.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar un Tipo De Habitacion: " + ex.getMessage());
        }
        
        return tipoDeHabitacion;
    }
     
     
     
}
