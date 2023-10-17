package hotel_ideal.accesoADatos;

import hotel_ideal.entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HabitacionData {

    Connection con = Conexion.getConexion();
    private Object hab;

    public HabitacionData() {
    }

    public void altaHabitacion(Habitacion habitacion) {
        try {
            String sql = "INSERT INTO habitacion(idTipoDeHabitacion, piso, estado) VALUES (?,?,?)";
            PreparedStatement ps;
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getIdTipoDeHab());   // tipo de habitacion
            ps.setInt(2, habitacion.getPiso());          //  en que piso se da de alta la habitacion
            ps.setBoolean(3, true);                      // si esta en servicio 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se añadio una habitacion con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo añadir la habitacion ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarHabitacion(Habitacion habitacion) {
        try {
            String sql = "UPDATE habitacion SET idTipoDeHabitacion=?,piso=? WHERE idHabitacion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdTipoDeHab());
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

    public void bajaHabitacion (Habitacion habitacion) {
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

    public List<Habitacion> listarHabitaciones() {

        String sql = "SELECT idHabitacion,idTipoDeHabitacion,piso,estado  FROM habitacion ";

        List<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Habitacion hab = new Habitacion();

                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setIdTipoDeHab(rs.getInt("idTipoDeHabitacion"));
                hab.setPiso(rs.getInt("piso"));
                hab.setEstado(true);

                habitaciones.add(hab);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de tipo de habitaciones");
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesTipo1() {

        String sql;
        sql = "SELECT idHabitacion,idTipoDeHabitacion,piso,estado FROM habitacion WHERE idTipoDeHabitacion = 1 AND estado= 0 ";

        List<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Habitacion hab1 = new Habitacion();

                hab1.setIdHabitacion(rs.getInt("idHabitacion"));
                hab1.setIdTipoDeHab(rs.getInt("idTipoDeHabitacion"));
                hab1.setPiso(rs.getInt("piso"));
                hab1.setEstado(true);

                habitaciones.add(hab1);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de tipo de habitaciones 1");
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesTipo2() {

        String sql;
        sql = "SELECT idHabitacion,idTipoDeHabitacion,piso,estado FROM habitacion WHERE idTipoDeHabitacion = 2 AND estado= 0 ";

        List<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Habitacion hab2 = new Habitacion();

                hab2.setIdHabitacion(rs.getInt("idHabitacion"));
                hab2.setIdTipoDeHab(rs.getInt("idTipoDeHabitacion"));
                hab2.setPiso(rs.getInt("piso"));
                hab2.setEstado(true);

                habitaciones.add(hab2);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de tipo de habitaciones 2");
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesTipo3() {

        String sql;
        sql = "SELECT idHabitacion,idTipoDeHabitacion,piso,estado FROM habitacion WHERE idTipoDeHabitacion = 3 AND estado= 0 ";

        List<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Habitacion hab3 = new Habitacion();

                hab3.setIdHabitacion(rs.getInt("idHabitacion"));
                hab3.setIdTipoDeHab(rs.getInt("idTipoDeHabitacion"));
                hab3.setPiso(rs.getInt("piso"));
                hab3.setEstado(true);

                habitaciones.add(hab3);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de tipo de habitaciones 3");
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesTipo4() {

        String sql = "SELECT idHabitacion,idTipoDeHabitacion,piso,estado FROM habitacion WHERE idTipoDeHabitacion = 4 AND estado= 0 ";

        List<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Habitacion hab4 = new Habitacion();

                hab4.setIdHabitacion(rs.getInt("idHabitacion"));
                hab4.setIdTipoDeHab(rs.getInt("idTipoDeHabitacion"));
                hab4.setPiso(rs.getInt("piso"));
                hab4.setEstado(true);

                habitaciones.add(hab4);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de tipo de habitaciones 4");
        }
        return habitaciones;
    }

    public List<Habitacion> obtenerHabitaciones(){
        List<Habitacion> habitaciones = new ArrayList<Habitacion>();
            

        try {
            String sql = "SELECT * FROM habitacion;";
            
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            Habitacion habitacion;
            while(resultSet.next()){
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(resultSet.getInt("idHabitacion"));
                habitacion.setIdTipoDeHab(resultSet.getInt("idTipoDeHabitacion"));
                habitacion.setPiso(resultSet.getInt("piso"));
                habitacion.setEstado(resultSet.getBoolean("estado"));
                                                                
                habitaciones.add(habitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener una Habitacion: " + ex.getMessage());
        }
        
        
        return habitaciones;
    }
    
}
