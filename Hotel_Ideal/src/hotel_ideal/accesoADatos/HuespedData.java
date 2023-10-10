
package hotel_ideal.accesoADatos;

import hotel_ideal.entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class HuespedData {
    
    Connection con = Conexion.getConexion();
    
    
    
    public void altaHuesped(Huesped huesped) {
        String sql = "INSERT INTO huesped (nombre,apellido,dni,domicilio,correo,"
                + "celular,activo) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                huesped.setIdHuesped(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Huesped: "+huesped.getNombre()+". añadido con exito");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de huesped" + ex.getMessage());
        }

    }
    
    public void eliminarHuesped(int dni) {

        try {
            String sql = "UPDATE huesped SET activo=0 WHERE dni = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el Huesped");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de huesped"+ex.getMessage());
        }

    }
    
    public void modificarHuesped(Huesped huesped) {
        
        String sql = "UPDATE huesped  SET nombre=?, apellido=?, dni=?, domicilio=?,"
                + "correo=?,celular=?,activo=?  WHERE idHuesped = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isActivo());
            ps.setInt(8, huesped.getIdHuesped());
            

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente !!");
            } else {
                JOptionPane.showMessageDialog(null, "El Huesped no existe ");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Huesped"+ex.getMessage());

        }
    
    }
    
    public Huesped buscarHuespedPorDni(int dni) {

        Huesped huesped = null;
        String sql = "SELECT idHuesped, nombre, apellido, dni, domicilio, correo, celular, activo FROM dni WHERE ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setActivo(rs.getBoolean("activo"));

            } else {

                JOptionPane.showMessageDialog(null, "El huesped no existe");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped"+ex.getMessage());
        }

        return huesped;
    }
    
}
