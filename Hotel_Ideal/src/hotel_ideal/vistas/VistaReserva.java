/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.ReservaData;
import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.Huesped;
import hotel_ideal.entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class VistaReserva extends javax.swing.JInternalFrame {

    public VistaReserva() {
        initComponents();
        jTCantidadDias.setEnabled(false);
        jTPrecioTotal.setEnabled (false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDFechaSalida = new com.toedter.calendar.JDateChooser();
        jDFechaEntrada = new com.toedter.calendar.JDateChooser();
        jCBTipoHabitacion = new javax.swing.JComboBox<>();
        jLHuesped = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTHuesped = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jCHabitacionesDisponbiles = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTCantidadDias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTPrecioTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Reservas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Gestion de Reservas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 14, 241, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Datos Huesped :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Tipo de Habitacion : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Fecha Check IN : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Fecha Check OUT :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        getContentPane().add(jDFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 236, -1));
        getContentPane().add(jDFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 236, -1));

        jCBTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(jCBTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 236, 38));

        jLHuesped.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jLHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 317, 236, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("DNI Huesped:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 96, 35));
        getContentPane().add(jTHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 410, 35));

        jBGuardar.setText("Generar Reserva");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jCHabitacionesDisponbiles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));
        getContentPane().add(jCHabitacionesDisponbiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 200, 32));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad de dias :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, 33));

        jTCantidadDias.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTCantidadDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 144, 33));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Lista Habitaciones Disponibles :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jTPrecioTotal.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 144, 33));

        jLabel9.setText("Precio Total :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 52, -1));

        jButton1.setText("Limpiar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, -1));

        jButton2.setText("Eliminar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 750, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 750, -1, -1));

        jButton4.setText("Modificar");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 750, -1, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 230, -1));

        jLabel10.setText("Cantidad de personas: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        ReservaData rd = new ReservaData();
        Reserva guardaReserva = new Reserva();

//        Object tipoHabitacion = jCBTipoHabitacion.getSelectedItem();
        Date fechaInicio = jDFechaEntrada.getDate();
        Date fechaSalida = jDFechaSalida.getDate();
//        Object habDisponibles = jCHabitacionesDisponbiles.getSelectedItem();

        // Calculo difereancia de dias de la estadia
        LocalDate fecha1 = fechaInicio.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2 = fechaSalida.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        long difdias = ChronoUnit.DAYS.between(fecha1, fecha2);
        String difedias = String.valueOf(difdias);
        // Llena el campo de cantidad de dias
        jTCantidadDias.setEnabled(true);
        jTPrecioTotal.setEnabled (true);
        jTCantidadDias.setText(difedias);

        // Calculo del precio de la estadia !! 
        
        int precioEstadia = (int) difdias * 5000;
        System.out.println( precioEstadia);
        
        String precioEstadia2String= String.valueOf(precioEstadia);
       
        jTPrecioTotal.setText(precioEstadia2String);
        
        
        
        
        
        
        // intancio un nueva reserva.
//        Reserva reserva = new Reserva ( new Huesped(3),new Habitacion(2),LocalDate.of(2023,10,11),LocalDate.of(2023, 10,18),2500,true);
//         ReservaData rd = new ReservaData();
//        rd.modificarReservaPorId(reserva);

        guardaReserva.setHabitacion(new Habitacion(2));
        guardaReserva.setHuesped(new Huesped(3));
        guardaReserva.setFechaInicio(fecha1);
        guardaReserva.setFechaFin(fecha2);
        guardaReserva.getCantidadDeDias();
        guardaReserva.getPrecioFinal();
        guardaReserva.setActivo(true);
        
        rd.crearReserva(guardaReserva);
        


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:

       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCBTipoHabitacion;
    private javax.swing.JComboBox<String> jCHabitacionesDisponbiles;
    private com.toedter.calendar.JDateChooser jDFechaEntrada;
    private com.toedter.calendar.JDateChooser jDFechaSalida;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTCantidadDias;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTHuesped;
    private javax.swing.JTextField jTPrecioTotal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbBuscar;
    // End of variables declaration//GEN-END:variables
}
