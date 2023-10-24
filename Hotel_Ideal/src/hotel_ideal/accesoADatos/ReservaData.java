package hotel_ideal.accesoADatos;

import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {

    Connection con = Conexion.getConexion();

    public ReservaData() {

    }

    public void crearReserva(Reserva reserva) {

        String sql = "INSERT INTO reserva (idHabitacion,idHuesped,fechaInicio ,fechaFin,precioTotal,cantPersonas,cantidadDeDias, activo) VALUES (?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps;
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // metodo get de la entidad

            ps.setInt(1, reserva.getHabitacion().getIdHabitacion());
            ps.setInt(2, reserva.getHuesped().getIdHuesped());
            ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(5, reserva.getPrecioFinal());
            ps.setInt(6, reserva.getCantPersonas());
            ps.setInt(7, reserva.getCantidadDeDias());
            ps.setBoolean(8, true);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reserva.setidReserva(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Reserva  generada  satisfatoriamente. ID RESERVA generaDo :   " + rs.getInt(1));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " No se pudo  generar la reserva. ");
        }
    }

    public void eliminarReservaPorId(int id) {
        String sql = "DELETE FROM reserva WHERE idReserva = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro  eliminado Satisfactotiamente !!");

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar la reserva");
        }
    }

    public void modificarReservaPorId(Reserva reserva) {

        String sql = "UPDATE reserva  SET fechaInicio = ?, fechaFin = ?, precioTotal = ?, cantidadDeDias =?  WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(2, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(3, reserva.getPrecioFinal());
            ps.setInt(4, reserva.getCantidadDeDias());
            ps.setInt(5, reserva.getidReserva());  //  importante .. 

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente");
            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo encontro la reserva");

        }
    }

    public List<Reserva> listarReservas() {

        String sql = "SELECT idReserva, idHabitacion, idHuesped, fechaInicio, fechaFin, precioTotal, cantPersonas, cantidadDeDias, activo FROM reserva";

        List<Reserva> reservas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Reserva reserva = new Reserva();
                HabitacionData hd = new HabitacionData();
                HuespedData huespedD = new HuespedData();
                reserva.setidReserva(rs.getInt("idReserva"));

                reserva.setHabitacion(hd.buscarHabitacionPorId(rs.getInt("idHabitacion")));
                reserva.setHuesped(huespedD.buscarHuespedPorId(rs.getInt("idHuesped")));
                reserva.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                reserva.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                reserva.setPrecioFinal(rs.getDouble("precioTotal"));
                reserva.setCantPersonas(rs.getInt("cantPersonas"));
                reserva.setCantidadDeDias(rs.getInt("cantidadDeDias"));
                reserva.setActivo(rs.getBoolean("activo"));

                reservas.add(reserva);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de reservas");
        }
        return reservas;
    }

}
