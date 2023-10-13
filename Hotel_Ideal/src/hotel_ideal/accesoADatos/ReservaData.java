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

    public ReservaData() {

    }

    public void crearReserva(Reserva reserva) {

        String sql = "INSERT INTO reserva (idHabitacion,idHuesped,fechaInicio ,fechaFin,precioTotal,cantidadDeDias, activo) VALUES (?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps;
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // metodo get de la entidad
            ps.setInt(1, reserva.getHabitacion().getIdHabitacion());
            ps.setInt(2, reserva.getHuesped().getIdHuesped());
            ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(5, reserva.getPrecioFinal());
            ps.setInt(6, reserva.getCantidadDeDias());
            ps.setBoolean(7, true);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setidReserva(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Reserva generada con exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " No se pudo  generar la reserva. ");
        }
    }

    public void eliminarReserva(int id) {
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno Eliminado exitosamente!");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno al eliminar" + ex.getMessage());
        }
    }

    public void eliminarReservaPorId(int id) {
        String sql = "DELETE FROM reserva WHERE idReserva = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reserva eliminada con exito");

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar la reserva");
        }
    }

    public void modificarReservaPorId(Reserva reserva) {

//          (idHabitacion,idHuesped,fechaInicio ,fechaFin,precioTotal,activo) VALUES (?,?,?,?,?,?)";
        String sql = "UPDATE reserva  SET fechaInicio = ?, fechaFin = ?, precioTotal = ?, activo= ? WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(2, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(3, reserva.getPrecioFinal());
            ps.setBoolean(4, reserva.isActivo());
            ps.setInt(5, reserva.getidReserva());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La reserva se actualizo correctamente");
            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo modificar correctamente la reserva");

        }
    }
}
