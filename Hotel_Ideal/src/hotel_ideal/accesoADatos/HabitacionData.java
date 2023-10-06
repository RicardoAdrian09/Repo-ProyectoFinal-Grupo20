
package hotel_ideal.accesoADatos;

import hotel_ideal.entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HabitacionData {
    
    Connection con = Conexion.getConexion();

    public HabitacionData() {
    }
    
    
    public void altaHabitacion(Habitacion habitacion){
        try {
            String sql ="INSERT INTO habitacion(idTipoDeHabitacion, piso, estado) VALUES (?,?,?)";
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setObject(1, habitacion.getTipo());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                JOptionPane.showMessageDialog(null, "Se añadio una habitacion con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo añadir la habitacion ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarHabitacion(Habitacion habitacion){
        try {
            String sql = "UPDATE habitacion SET idTipoDeHabitacion=?,piso=? WHERE idHabitacion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setObject(1, habitacion.getTipo());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La habitacion ha sido modificada exitosamente");
            } else {

                JOptionPane.showMessageDialog(null, "La habitacion no existe en la base de datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void bajaHabitacion(Habitacion habitacion){
        String sql = "DELETE FROM habitacion WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());

            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "La habitacion se ha eliminado con exito");
            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la Base de Datos" + ex.getMessage());
        }
    } 
}
