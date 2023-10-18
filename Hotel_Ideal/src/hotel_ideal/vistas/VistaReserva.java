package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.accesoADatos.ReservaData;
import hotel_ideal.accesoADatos.TipoDeHabitacionData;
import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.Huesped;
import hotel_ideal.entidades.Reserva;
import hotel_ideal.entidades.TipoDeHabitacion;
import java.awt.List;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class VistaReserva extends javax.swing.JInternalFrame {

    private HabitacionData hd = new HabitacionData();
    private ReservaData rd = new ReservaData();

    public VistaReserva() {
        initComponents();
        jTCantidadDias.setEnabled(false);
        jTPrecioTotal.setEnabled(false);
        cargarCBTipoDeHabitaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLHuesped = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDFechaSalida = new com.toedter.calendar.JDateChooser();
        jDFechaEntrada = new com.toedter.calendar.JDateChooser();
        jCBTipoHabitacion = new javax.swing.JComboBox<>();
        jtIdReserva = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jCHabitacionesDisponbiles = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTCantidadDias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTPrecioTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jTCantidadPersonas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTHuesped1 = new javax.swing.JTextField();
        jTDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Reservas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLHuesped.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jLHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 317, 236, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("ID: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Tipo de Habitacion : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Fecha Check IN : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Fecha Check OUT :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        getContentPane().add(jDFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 240, 40));
        getContentPane().add(jDFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 240, 40));

        jCBTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(jCBTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 710, 38));
        getContentPane().add(jtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 300, 30));

        jBGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBGuardar.setText("Generar Reserva");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jCHabitacionesDisponbiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCHabitacionesDisponbilesActionPerformed(evt);
            }
        });
        getContentPane().add(jCHabitacionesDisponbiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 432, 460, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Cantidad de dias :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, 33));

        jTCantidadDias.setBackground(new java.awt.Color(153, 153, 153));
        jTCantidadDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantidadDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTCantidadDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 583, 150, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Lista Habitaciones Disponibles :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jTPrecioTotal.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 144, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Precio Total :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, -1, -1));

        jBLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 780, -1, -1));

        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 780, -1, -1));

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 780, -1, -1));

        jbModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 780, -1, -1));
        getContentPane().add(jTCantidadPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 230, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Cantidad de personas: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("DNI Huesped:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Datos Huesped :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        getContentPane().add(jTHuesped1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 700, 40));

        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });
        getContentPane().add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 90, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Gestion de Reservas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 241, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoHabitacionActionPerformed

        TipoDeHabitacion tipoh = (TipoDeHabitacion) jCBTipoHabitacion.getSelectedItem();
        int tdh = tipoh.getIdTipoDeHabitacion();
        System.out.println(tipoh);

        switch (tdh) {
            case 1:
            jCHabitacionesDisponbiles.removeAllItems(); // voy limpiando el combo
            hd.listarHabitacionesTipo1(); // mediante consulta SQL obtengo el listado de todas las habitaciones de tipo 1 desocupadas .
            llenarCBHabitacionesDisponible1();
            break;
            case 2:
            jCHabitacionesDisponbiles.removeAllItems();
            hd.listarHabitacionesTipo2();
            llenarCBHabitacionesDisponible2();
            break;
            case 3:
            jCHabitacionesDisponbiles.removeAllItems();
            hd.listarHabitacionesTipo3();
            llenarCBHabitacionesDisponible3();
            break;
            default:
            jCHabitacionesDisponbiles.removeAllItems();
            hd.listarHabitacionesTipo4();
            llenarCBHabitacionesDisponible4();
            break;
        }
    }//GEN-LAST:event_jCBTipoHabitacionActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        Reserva guardaReserva = new Reserva();

        // EXTRAIGO LOS VALORES DE LOS CONTENEDORES DE LA VISTA Y LOS PASO A VARIABLES.

        String canPersonas = jTCantidadPersonas.getText();
        int cantPer = Integer.valueOf(canPersonas);

        Date fechaInicio = jDFechaEntrada.getDate();
        Date fechaSalida = jDFechaSalida.getDate();

        // Calculo diferencia de dias de la estadia
        LocalDate fecha1 = fechaInicio.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2 = fechaSalida.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        long difdias = ChronoUnit.DAYS.between(fecha1, fecha2);
        String difedias = String.valueOf(difdias);
        int cantdias = (int) difdias;
        // Habilito la celdaS y llena el campo de cantidad de dias
        jTCantidadDias.setEnabled(true);
        jTPrecioTotal.setEnabled(true);
        jTCantidadDias.setText(difedias);

        // Calculo del precio de la estadia !!
        int precioEstadia = (int) difdias * 5000;
        double precioEstadiad = (double) precioEstadia;
        double precioFinal = precioEstadiad;
        //        System.out.println(precioEstadia);
        String precioEstadia2String = String.valueOf(precioEstadia);
        jTPrecioTotal.setText(precioEstadia2String);

        // -----------------------------------------------------------------------

        Habitacion habit = (Habitacion) jCHabitacionesDisponbiles.getSelectedItem();
        int idehab = habit.getIdHabitacion();

        // **************   crear un objeto y pasarlo a la consulta sql.  Respeta el orden del  constructor  ******************

        guardaReserva.setHuesped(new Huesped(3));               // id hueped
        guardaReserva.setHabitacion(new Habitacion(idehab));    // id habitacion
        guardaReserva.setFechaInicio(fecha1);                   // fehca inicio
        guardaReserva.setFechaFin(fecha2);                      // fehca salida
        guardaReserva.setCantPersonas(cantPer);                 // cantidad de personas
        guardaReserva.setPrecioFinal(precioFinal);              //precio total
        guardaReserva.setCantidadDeDias(cantdias);              // cantidad de dias
        guardaReserva.setActivo(true);                          // estado

        rd.crearReserva(guardaReserva);

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jCHabitacionesDisponbilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCHabitacionesDisponbilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCHabitacionesDisponbilesActionPerformed

    private void jTCantidadDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantidadDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCantidadDiasActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        limpiarCampos();

    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try {
            int idAEliminar = Integer.parseInt(jtIdReserva.getText());
            ReservaData reservaAEliminar = new ReservaData();

            // Mostrar un cuadro de diálogo de confirmación para eliminar el proveedor, para evitar accidentes.
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta reserva", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                reservaAEliminar.eliminarReservaPorId(idAEliminar);
                limpiarCampos();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar un código válido.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        doDefaultCloseAction();

    }//GEN-LAST:event_jBSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<TipoDeHabitacion> jCBTipoHabitacion;
    private javax.swing.JComboBox<Habitacion> jCHabitacionesDisponbiles;
    private com.toedter.calendar.JDateChooser jDFechaEntrada;
    private com.toedter.calendar.JDateChooser jDFechaSalida;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTCantidadDias;
    private javax.swing.JTextField jTCantidadPersonas;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTHuesped1;
    private javax.swing.JTextField jTPrecioTotal;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jtIdReserva;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {

        jTDni.setText("");
        jtIdReserva.setText("");
        jTCantidadPersonas.setText("");
        jDFechaEntrada.setDate(null);
        jDFechaSalida.setDate(null);
        jTCantidadDias.setText("");
        jTPrecioTotal.setText("");
        jCHabitacionesDisponbiles.removeAllItems();
//        jCBTipoHabitacion.removeAllItems();
//        jcbEstado.setSelected(false);

    }
    private void cargarCBTipoDeHabitaciones() {

        TipoDeHabitacionData thd = new TipoDeHabitacionData();

        for (TipoDeHabitacion tipodehabitaciones : thd.listarTipoDeHabitaciones()) {
            jCBTipoHabitacion.addItem(tipodehabitaciones);
        }
    }
    private void llenarCBHabitacionesDisponible1() {

        HabitacionData hds1 = new HabitacionData();

        for (Habitacion habitaciones : hds1.listarHabitacionesTipo1()) {
            jCHabitacionesDisponbiles.addItem(habitaciones);
        }
    }
    private void llenarCBHabitacionesDisponible2() {

        HabitacionData hds2 = new HabitacionData();

        for (Habitacion habitaciones : hds2.listarHabitacionesTipo2()) {
            jCHabitacionesDisponbiles.addItem(habitaciones);
        }
    }
    private void llenarCBHabitacionesDisponible3() {

        HabitacionData hds3 = new HabitacionData();

        for (Habitacion habitaciones : hds3.listarHabitacionesTipo3()) {
            jCHabitacionesDisponbiles.addItem(habitaciones);
        }
    }
    private void llenarCBHabitacionesDisponible4() {

        HabitacionData hds4 = new HabitacionData();

        for (Habitacion habitaciones : hds4.listarHabitacionesTipo4()) {
            jCHabitacionesDisponbiles.addItem(habitaciones);
        }
    }

}