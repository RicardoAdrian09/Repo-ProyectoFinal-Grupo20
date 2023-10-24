package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.accesoADatos.HuespedData;
import hotel_ideal.accesoADatos.ReservaData;
import hotel_ideal.accesoADatos.TipoDeHabitacionData;
import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.Huesped;
import hotel_ideal.entidades.Reserva;
import hotel_ideal.entidades.TipoDeHabitacion;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;

public class VistaReserva extends javax.swing.JInternalFrame {

    private HabitacionData hd = new HabitacionData();
    private ReservaData rd = new ReservaData();
    private HuespedData huespedD = new HuespedData();
    private int dniHu;  //  inportante variable global
    private int canp;     //  necesario argumento en el constructor

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDFechaSalida = new com.toedter.calendar.JDateChooser();
        jDFechaEntrada = new com.toedter.calendar.JDateChooser();
        jCBTipoHabitacion = new javax.swing.JComboBox<>();
        jCHabitacionesDisponbiles = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTCantidadPersonas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTHuesped1 = new javax.swing.JTextField();
        jTDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTCantidadDias = new javax.swing.JTextField();
        jTPrecioTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setTitle("Reservas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLHuesped.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jLHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 317, 236, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de Habitacion : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Check IN : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Check OUT :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        getContentPane().add(jDFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 240, 30));
        getContentPane().add(jDFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 240, 30));

        jCBTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(jCBTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 710, 38));

        jCHabitacionesDisponbiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCHabitacionesDisponbilesActionPerformed(evt);
            }
        });
        getContentPane().add(jCHabitacionesDisponbiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 490, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Lista Habitaciones Disponibles :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jTCantidadPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantidadPersonasActionPerformed(evt);
            }
        });
        getContentPane().add(jTCantidadPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 230, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Cantidad de personas: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("DNI Huesped:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Datos Huesped :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(jTHuesped1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 700, 30));

        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });
        getContentPane().add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 90, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Generar  Reservas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 241, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jBGuardar.setBackground(new java.awt.Color(153, 102, 0));
        jBGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBGuardar.setText("Guadar Reserva");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Cantidad de dias :");

        jTCantidadDias.setBackground(new java.awt.Color(153, 153, 153));
        jTCantidadDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantidadDiasActionPerformed(evt);
            }
        });

        jTPrecioTotal.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Precio Total :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardar)
                .addGap(407, 407, 407))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addComponent(jTCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addComponent(jTPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1000, 230));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

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

        //-----------------------------------------------------------------------------------------------------------------------------------------------------       
        //  Control de cantidad de personas Vs. Capacidad de la habitacion
        try {
            String canPersonas = jTCantidadPersonas.getText();   // ingreso cantidad de personas.
            int cantPer = Integer.valueOf(canPersonas);         // necesario para que funciona el numberFormatException.
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, " ingrese caracteres numericos en el campo  * Cantidad de Personas * ");
        }

        String canpe = jTCantidadPersonas.getText();
        canp = Integer.valueOf(canpe);

        TipoDeHabitacion tipoh = (TipoDeHabitacion) jCBTipoHabitacion.getSelectedItem();   //   necesaario tipoh para obtener cdc ( capacidad de camas )
        int cdp = tipoh.getCantPersonas();        // ok 

        if (Integer.parseInt(jTCantidadPersonas.getText()) > cdp) {
            JOptionPane.showMessageDialog(null, "La cantidad de personas exede la capacidad de la habitacion ");
            return;
        }

// -------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Control de fechas de ingreso y egreso
        Date fechaInicio = jDFechaEntrada.getDate();
        Date fechaSalida = jDFechaSalida.getDate();
        
      
            
            
        

        // Calculo diferencia de dias de la estadia
        LocalDate fecha1 = fechaInicio.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2 = fechaSalida.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        
       if (fecha1.isAfter(fecha2) || fecha1.isEqual(fecha2)) {
    JOptionPane.showMessageDialog(null, "¡Atención! La fecha de ingreso no puede ser posterior a la fecha de salida");
     return;
  } 
        
        
        long difdias = ChronoUnit.DAYS.between(fecha1, fecha2);
        String difedias = String.valueOf(difdias);
        int cantdias = (int) difdias;

        // Habilito la celdas y llena el campo de cantidad de dias.
        jTCantidadDias.setEnabled(true);
        jTPrecioTotal.setEnabled(true);
        jTCantidadDias.setText(difedias);

        // Calculo del precio de la estadia !!
        int precioEstadia = (int) difdias * 5000;
        double precioEstadiad = (double) precioEstadia;
        double precioFinal = precioEstadiad;

        String precioEstadia2String = String.valueOf(precioEstadia);
        jTPrecioTotal.setText(precioEstadia2String);
        // --------------------------------------------------------------------------------------------------------------------------------------------------

        // Lista de Habitaciones Disponibles
        Habitacion habit = (Habitacion) jCHabitacionesDisponbiles.getSelectedItem();
        int idehab = habit.getIdHabitacion();  // necesario para armar el constructor 

        // --------------------------------------------------------------------------------------------------------------------------------------------
        Huesped xxxx = huespedD.buscarHuespedPorDni(dniHu);
        int idhu = xxxx.getIdHuesped();   // necesario para armar el construcotr 

// ----------------------------------------------------------------------------------------------------------------------------------------------------
        // **************   crear un objeto y pasarlo a la consulta sql.  Respeta el orden del  constructor  ******************
        guardaReserva.setHuesped(new Huesped(idhu));           // id hueped
        guardaReserva.setHabitacion(new Habitacion(idehab));    // id habitacion
        guardaReserva.setFechaInicio(fecha1);                   // fecha inicio
        guardaReserva.setFechaFin(fecha2);                      // fecha salida
        guardaReserva.setCantPersonas(canp);                 // cantidad de personas
        guardaReserva.setPrecioFinal(precioFinal);              // precio total
        guardaReserva.setCantidadDeDias(cantdias);              // cantidad de dias
        guardaReserva.setActivo(true);                          // estado

        rd.crearReserva(guardaReserva);

    }//GEN-LAST:event_jBGuardarActionPerformed
    private void jCHabitacionesDisponbilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCHabitacionesDisponbilesActionPerformed
    }//GEN-LAST:event_jCHabitacionesDisponbilesActionPerformed
    private void jTCantidadDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantidadDiasActionPerformed
    }//GEN-LAST:event_jTCantidadDiasActionPerformed
    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed

        try {

            String dniH = jTDni.getText();
            dniHu = Integer.valueOf(dniH);    // dnI ingresado paso a INT

            Huesped ffff = huespedD.buscarHuespedPorDni(dniHu);    //  obtengo objeto  tipo Huesped llamado ffff
            String ddddd = String.valueOf(ffff);    // paso dni a String

            if (ffff == null) {
                jTHuesped1.setText("");
            } else {
                jTHuesped1.setText(ddddd);    // si existe dni -->  completo y muestro el objeto tipo Hupesd encontrado 
            }
        } catch (NumberFormatException ex) {
            jTHuesped1.setText("");
            JOptionPane.showMessageDialog(null, " Por favor , ingrese caracteres Numericos en el campo * DNI *  ");
        }

    }//GEN-LAST:event_jTDniActionPerformed
    private void jTCantidadPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantidadPersonasActionPerformed
    }//GEN-LAST:event_jTCantidadPersonasActionPerformed
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
     
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        } 
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<TipoDeHabitacion> jCBTipoHabitacion;
    private javax.swing.JComboBox<Habitacion> jCHabitacionesDisponbiles;
    private com.toedter.calendar.JDateChooser jDFechaEntrada;
    private com.toedter.calendar.JDateChooser jDFechaSalida;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCantidadDias;
    private javax.swing.JTextField jTCantidadPersonas;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTHuesped1;
    private javax.swing.JTextField jTPrecioTotal;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {

        jTDni.setText("");
        jTHuesped1.setText("");
        jTCantidadPersonas.setText("");
        jDFechaEntrada.setDate(null);
        jDFechaSalida.setDate(null);
        jTCantidadDias.setText("");
        jTPrecioTotal.setText("");
        jCHabitacionesDisponbiles.removeAllItems();

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
