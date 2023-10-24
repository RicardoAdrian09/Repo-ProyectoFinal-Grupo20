/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.ReservaData;
import hotel_ideal.entidades.Reserva;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gtorre
 */
public class GestionReservasView extends javax.swing.JInternalFrame {

    private ReservaData rd = new ReservaData();
    private DefaultTableModel modelo = new DefaultTableModel();
    int filaSeleccionada;

    public GestionReservasView() {
        initComponents();
        armarCabecera();
        llenarTabla();
        jTReserva.setFocusable(false);
        jDFechaEntrada.setEnabled(false);
        jDFechaSalida.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLBusquedasReservas = new javax.swing.JLabel();
        jLBusquedaporid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTReserva = new javax.swing.JTable();
        jBEliminarReservas = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jTId = new javax.swing.JTextField();
        jDFechaEntrada = new com.toedter.calendar.JDateChooser();
        jDFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        JBGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBuscar = new javax.swing.JButton();
        jBGuardarCambios = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

        jLBusquedasReservas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLBusquedasReservas.setText("Manejo  de Reservas ");

        jLBusquedaporid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLBusquedaporid.setText("Busqueda de reserva por ID ");

        jTReserva = new javax.swing.JTable(){
            public boolean isCellEditable (int rowIndex ,int colIndex){
                return false;
            }
        };
        jTReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IDReserva", "IDHabitacion", "IDHuesped", "F ingreso", "F salida", "Precio Estadia", "Personas Alojadas", "Dias Estadia", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTReserva.setFocusable(false);
        jTReserva.getTableHeader().setResizingAllowed(false);
        jTReserva.getTableHeader().setReorderingAllowed(false);
        jTReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTReserva);

        jBEliminarReservas.setText("Eliminar  Registro");
        jBEliminarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarReservasActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTId.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Para actualizar datos  seleccione una fila de la tabla y elija los registros que desee editar . ");

        JBGuardar.setText("Registar  Cambios");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("MODIFICACIONES :");

        jLabel3.setText("BUSQUEDAS :");

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton guardar.png"))); // NOI18N
        jBGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarCambiosActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLBusquedasReservas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLBusquedaporid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBEliminarReservas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDFechaEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDFechaSalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JBGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBGuardarCambios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEliminarReservas)
                        .addGap(204, 204, 204))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(383, 383, 383)
                                        .addComponent(jLBusquedasReservas)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jDFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10))
                                            .addComponent(jLabel1))
                                        .addGap(267, 267, 267)
                                        .addComponent(jBuscar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLBusquedaporid)
                                .addGap(38, 38, 38)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jBSalir)
                                .addContainerGap())))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBSalir))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLBusquedasReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDFechaSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBusquedaporid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminarReservas)
                    .addComponent(JBGuardar))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }

//        doDefaultCloseAction();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReservaMouseClicked

        filaSeleccionada = jTReserva.getSelectedRow();

        if (filaSeleccionada >= 0) {

            jDFechaEntrada.setEnabled(true);
            jDFechaSalida.setEnabled(true);


        }


    }//GEN-LAST:event_jTReservaMouseClicked

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed

        Date fechaInicio = jDFechaEntrada.getDate();
        Date fechaSalida = jDFechaSalida.getDate();

        LocalDate fecha1 = fechaInicio.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2 = fechaSalida.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        if (fecha1.isAfter(fecha2) || fecha1.isEqual(fecha2)) {
            JOptionPane.showMessageDialog(null, "¡Atención! La fecha de ingreso no puede ser posterior a la fecha de salida");
            return;
        }

        // diferencia entre ambas fechas.
        long difdias = ChronoUnit.DAYS.between(fecha1, fecha2);
        String difedias = String.valueOf(difdias);
        int cantdias = (int) difdias;

        // Calculo del precio de la estadia !!
        int precioEstadia = (int) difdias * 5000;

        // Habilito la celdas y llena el campo de cantidad de dias.
        jTReserva.setValueAt(fecha1, filaSeleccionada, 3);
        jTReserva.setValueAt(fecha2, filaSeleccionada, 4);
        jTReserva.setValueAt(cantdias, filaSeleccionada, 7);
        jTReserva.setValueAt(precioEstadia, filaSeleccionada, 5);
        
     // ---------------------------------------------------------------------------------------------------------------------------------------------------

        // una vez modificada la reserva en la tabla  , al momento de guardar la misma tengo la necesidad de ubicar esa reserva en la lista de la tabla.Para ubicar la reserva tengo que recorrer la lista.
        String idseleccionado = modelo.getValueAt(filaSeleccionada, 0).toString();   // obtengo id de la tabla clickeada 
        int idselecentero = Integer.parseInt(idseleccionado);
        
        Reserva reservaSeleccionada = null;
        List<Reserva> reservas = rd.listarReservas();  // misma lista que cargo en la tabla 
        for (Reserva reserva : reservas) {
            if (String.valueOf(reserva.getidReserva()).equals(idseleccionado)) {   // id reserva en un int ,necesito pasar a Sstring 
                reservaSeleccionada = reserva;
                break;
            }
        }

        if (reservaSeleccionada != null) {
            rd.modificarReservaPorId(new Reserva(fecha1, fecha2, precioEstadia, cantdias, idselecentero));  // Encuentro la reserva y  paso  la reserva como argumento al método
          
        } else {

            JOptionPane.showMessageDialog(null, " ID seleccionado inexitente : " + idseleccionado);  // Si no encuentro Maneja el caso en el que la reserva no se encontró
        }
        
        
        jDFechaEntrada.setDate(null);
        jDFechaSalida.setDate (null) ;
        
        
        
        
   
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void jBEliminarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarReservasActionPerformed

        filaSeleccionada = jTReserva.getSelectedRow(); // si o si selecciono una fila 
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Confirma que desea eliminar el registro ?", "SALIR", a);
        if (resultado == 0) {
            String idseleccionado = modelo.getValueAt(filaSeleccionada, 0).toString();
            int idselecentero = Integer.parseInt(idseleccionado);
            rd.eliminarReservaPorId(idselecentero);
            modelo.removeRow(filaSeleccionada);

        }

    }//GEN-LAST:event_jBEliminarReservasActionPerformed

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed


           
        
           
        
        
        
        












        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

// ---------------------------------------------------------------------------------------------------------------------------------------------------
        // obntengo el id del textField
        String idseleccionado = jTId.getText();
        int idseleccionadoEntero = Integer.parseInt(idseleccionado);

        // ------------------------------------------------------------------------------------------------       
        int filaSeleccionada = -1;

        for (int i = 0; i < jTReserva.getRowCount(); i++) {
            int idReserva = (int) jTReserva.getValueAt(i, 0); // Suponiendo que el idReserva se encuentra en la primera columna
            if (idReserva == idseleccionadoEntero) {
               filaSeleccionada = i;
                System.out.println("indice 1°: "+ filaSeleccionada ); //ok 
                break;
            }
        }

                jDFechaEntrada.setEnabled(true);
                jDFechaSalida.setEnabled(true);

    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarCambiosActionPerformed

        // obntengo el id del textField
        String idseleccionado = jTId.getText();
        int idseleccionadoEntero = Integer.parseInt(idseleccionado);

        // ------------------------------------------------------------------------------------------------       
        int filaSeleccionada = -1;

        for (int i = 0; i < jTReserva.getRowCount(); i++) {
            int idReserva = (int) jTReserva.getValueAt(i, 0); // Suponiendo que el idReserva se encuentra en la primera columna
            if (idReserva == idseleccionadoEntero) {
                filaSeleccionada = i;
                System.out.println("indice 1°: " + filaSeleccionada); //ok 
                break;
            }
        }

        if (filaSeleccionada != -1) {
            // El índice corresponde al objeto con el idReserva ingresado

            // BUSCO 
            Reserva reservaSeleccionada = null;
            List<Reserva> reservas = rd.listarReservas();  // misma lista que cargo en la tabla 
            for (Reserva reserva : reservas) {
                if (String.valueOf(reserva.getidReserva()).equals(idseleccionado)) {   // SI EL ID INGRESADO ES IGUAL UN ID DE LA LISTA DE RESERVAS (IDE RESERVA EN INT , SE PARSEA)
                    reservaSeleccionada = reserva;

                    System.out.println("reserva seleccionada :" + reservaSeleccionada);
                    break;
                }
             }

             if (reservaSeleccionada != null) {    // ENCUENTRA ID 

                if (jDFechaEntrada.getDate() == null || jDFechaSalida.getDate() == null) {   // Ambos DateChooser están vacíos o tienen una fecha no seleccionada

                    JOptionPane.showMessageDialog(null, "Debe ingresar ambas fechas para modificar el registro.");
                } else {

                    Date fechaInicio = jDFechaEntrada.getDate();
                    Date fechaSalida = jDFechaSalida.getDate();

                    LocalDate fecha1 = fechaInicio.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
                    LocalDate fecha2 = fechaSalida.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

                    if (fecha1.isAfter(fecha2) || fecha1.isEqual(fecha2)) {
                        JOptionPane.showMessageDialog(null, "¡Atención! La fecha de ingreso no puede ser posterior a la fecha de salida");
                        return;
                    }

                    // diferencia entre ambas fechas.
                    long difdias = ChronoUnit.DAYS.between(fecha1, fecha2);
                    String difedias = String.valueOf(difdias);
                    int cantdias = (int) difdias;

                    // Calculo del precio de la estadia !!
                    int precioEstadia = (int) difdias * 5000;

                    //  MODIFICO REGISTROS 
                    DefaultTableModel modelo = (DefaultTableModel) jTReserva.getModel();

                    jTReserva.setValueAt(fecha1, filaSeleccionada, 3);
                    jTReserva.setValueAt(fecha2, filaSeleccionada, 4);
                    jTReserva.setValueAt(cantdias, filaSeleccionada, 7);
                    jTReserva.setValueAt(precioEstadia, filaSeleccionada, 5);

                    jTReserva.setModel(modelo);

                    System.out.println("indice :" + filaSeleccionada);

                    // MODIFICO EN BASE DE DATOS   
                    rd.modificarReservaPorId(new Reserva(fecha1, fecha2, precioEstadia, cantdias, idseleccionadoEntero));  // Encuentro la reserva y  paso  la reserva como argumento al método
                }
            } else {

                // Si no encuentro Maneja el caso en el que la reserva no se encontró
            }

        } else {
            // No se encontró un objeto con el idReserva ingresado

            JOptionPane.showMessageDialog(null, " ID seleccionado  " + idseleccionado + " inexitente2 ");

        }

           jDFechaEntrada.setDate(null);
           jDFechaSalida.setDate(null);
           jTId.setText("");
    }//GEN-LAST:event_jBGuardarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton jBEliminarReservas;
    private javax.swing.JButton jBGuardarCambios;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private com.toedter.calendar.JDateChooser jDFechaEntrada;
    private com.toedter.calendar.JDateChooser jDFechaSalida;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLBusquedaporid;
    private javax.swing.JLabel jLBusquedasReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTId;
    private javax.swing.JTable jTReserva;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("IDReserva");
        modelo.addColumn("IDHabitacion");
        modelo.addColumn("IDHuesped");
        modelo.addColumn("F ingreso");
        modelo.addColumn("F salida");
        modelo.addColumn("Precio Estadia ");
        modelo.addColumn("Personas Alojadas");
        modelo.addColumn("Dias Estadia");
        modelo.addColumn("Estado");
        jTReserva.setModel(modelo);

    }

    private void llenarTabla() {

        // Obtiene la lista de reservas generadas.
        ReservaData rd = new ReservaData();
        List<Reserva> reserv = rd.listarReservas();

        // Limpia el modelo de la tabla antes de agregar nuevos datos
        DefaultTableModel modelo = (DefaultTableModel) jTReserva.getModel();
        modelo.setRowCount(0);

        // Llena la tabla con los productos asociados al proveedor y la fecha
        for (Reserva reserva : reserv) {
            modelo.addRow(new Object[]{reserva.getidReserva(), reserva.getHabitacion().getIdHabitacion(), reserva.getHuesped().getIdHuesped(), reserva.getFechaInicio(), reserva.getFechaFin(), reserva.getPrecioFinal(), reserva.getCantPersonas(), reserva.getCantidadDeDias(), reserva.isActivo()});
        }

    }

}
