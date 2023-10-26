package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.accesoADatos.TipoDeHabitacionData;
import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.TipoDeHabitacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaHabitacion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private DefaultTableModel modelo2 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public VistaHabitacion() {
//        initComponents();
//        armarCabeceraDesocupadas();
//        armarCabeceraOcupadas();
//        cargarCBTipoDeHabitaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtOcupadas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDesocupadas = new javax.swing.JTable();
        jbCargarTablas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        BtBuscar = new javax.swing.JButton();
        BtLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbTipoDeHabitacion1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jtPiso1 = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbAgregar1 = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Habitaciones");
        jLabel1.setToolTipText("");

        jtOcupadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Habitacion", "Tipo de Habitacion", "Piso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtOcupadas);
        if (jtOcupadas.getColumnModel().getColumnCount() > 0) {
            jtOcupadas.getColumnModel().getColumn(0).setResizable(false);
            jtOcupadas.getColumnModel().getColumn(1).setResizable(false);
            jtOcupadas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setText("Ocupadas");

        jLabel5.setText("Desocupadas");

        jtDesocupadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Habitacion", "Tipo de Habitacion", "Piso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtDesocupadas);
        if (jtDesocupadas.getColumnModel().getColumnCount() > 0) {
            jtDesocupadas.getColumnModel().getColumn(0).setResizable(false);
            jtDesocupadas.getColumnModel().getColumn(1).setResizable(false);
            jtDesocupadas.getColumnModel().getColumn(2).setResizable(false);
        }

        jbCargarTablas.setText("Mostrar Habitaciones");
        jbCargarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarTablasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("N° Habitacion");

        jtId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtLimpiar.setText("Limpiar");
        BtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Gestion Habitacion");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Tipo de Habitacion");

        jcbTipoDeHabitacion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar Simple", "Doble ", "Triple", "Suite Lujo" }));
        jcbTipoDeHabitacion1.setSelectedIndex(1);
        jcbTipoDeHabitacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoDeHabitacion1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("N° Piso");

        jtPiso1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jrbEstado.setText("Estado");
        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jbAgregar1.setText("Agregar");
        jbAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregar1ActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jBborrar.setText("Borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(95, 95, 95)
                        .addComponent(jbCargarTablas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jbAgregar1)
                        .addGap(18, 18, 18)
                        .addComponent(Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBborrar)
                        .addGap(18, 18, 18)
                        .addComponent(BtLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(BtBuscar))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jcbTipoDeHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jtPiso1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jrbEstado)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jbCargarTablas)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtBuscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoDeHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtPiso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEstado))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregar1)
                            .addComponent(jBborrar)
                            .addComponent(Modificar)
                            .addComponent(BtLimpiar))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCargarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarTablasActionPerformed
//        modelo.setRowCount(0);
//        modelo2.setRowCount(0);
//        cargarTablas();
    }//GEN-LAST:event_jbCargarTablasActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
//        try {
//            if (!jtId.getText().isEmpty()) {
//
//                int id = Integer.parseInt(jtId.getText());
//
////                habitacion = new HabitacionData().buscarHabitacionPorId(id);
////                if (habitacion != null) {
////
////                    int tipoHabitacion = habitacion.getIdTipoDeHab();
//                    String tipoHabi;
//                    switch (tipoHabitacion) {
//                        case 1:
//                        tipoHabi = "Estandar Simple";
//                        break;
//                        case 2:
//                        tipoHabi = "Doble";
//                        break;
//                        case 3:
//                        tipoHabi = "Triple";
//                        break;
//                        case 4:
//                        tipoHabi = "Suite Lujo";
//                        break;
//                        default:
//                        tipoHabi = "";
//                        break;
//                    }

//                    jcbTipoDeHabitacion.setSelectedItem(tipoHabi);
//                    jtPiso.setText(habitacion.getPiso() + "");
//                    jrbEstado.setSelected(habitacion.isEstado());
//                } else {
//                    JOptionPane.showMessageDialog(this, "No se encontro el ID");
//                }
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
//        }
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed

//        jtId.setText("");
//        jcbTipoDeHabitacion.setSelectedIndex(-1);
//        jtPiso.setText("");
//        jrbEstado.setSelected(false);
    }//GEN-LAST:event_BtLimpiarActionPerformed

    private void jcbTipoDeHabitacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoDeHabitacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoDeHabitacion1ActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jbAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregar1ActionPerformed
//
//        try {
//            String eleccionTipoHab = (String) jcbTipoDeHabitacion.getSelectedItem();
//
//            int idTpoHab;
//            switch (eleccionTipoHab) {
//                case "Estandar Simple":
//                idTpoHab = 1;
//                break;
//                case "Doble":
//                idTpoHab = 2;
//                break;
//                case "Triple":
//                idTpoHab = 3;
//                break;
//                case "Suite Lujo":
//                idTpoHab = 4;
//                break;
//                default:
//                idTpoHab = 0; // Valor por defecto si no se encuentra ninguna coincidencia
//                break;
//            }
//
//            int piso = Integer.parseInt(jtPiso.getText());
//            boolean estado = jrbEstado.isSelected();
//            habitacion = new Habitacion(idTpoHab, piso, estado);
//            habitacionData.altaHabitacion(habitacion);
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
//        }

        //OTRA FORMA DE BUSCAR SELECCIONANDO DESDE LA TABLA LA HABITACION Y MOSTRANDO
        //SUS DATOS Y LUEGO ADMINISTRAR. PERO ESTÁ EN PROCESO DE PRUEBA
        //        int filaOcupadas = jtOcupadas.getSelectedRow();
        //        int columnaOcupadas = jtOcupadas.getSelectedColumn();
        //        int filaDesocupadas = jtDesocupadas.getSelectedRow();
        //        int columnaDesocupadas = jtDesocupadas.getSelectedColumn();
        //        Object datoTablaOcupadas = jtOcupadas.getValueAt(filaOcupadas, columnaOcupadas);
        //        Object datoTablaDesocupadas = jtDesocupadas.getValueAt(filaDesocupadas, columnaDesocupadas);
        //
        //        Object seleccion = new Habitacion();
        //
        //        if (datoTablaOcupadas != null) {
            //            seleccion = datoTablaOcupadas;
            //        } else if (datoTablaDesocupadas != null) {
            //            seleccion = datoTablaDesocupadas;
            //        }
        //        int idTipoHab = jcbTipoDeHabitacion.getItemCount();
    }//GEN-LAST:event_jbAgregar1ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

//        try {
//
//            int idHabi = Integer.parseInt(jtId.getText());
//
//            String eleccionTipoHab = (String) jcbTipoDeHabitacion.getSelectedItem();
//
//            int idTpoHab;
//            switch (eleccionTipoHab) {
//                case "Estandar Simple":
//                idTpoHab = 1;
//                break;
//                case "Doble":
//                idTpoHab = 2;
//                break;
//                case "Triple":
//                idTpoHab = 3;
//                break;
//                case "Suite Lujo":
//                idTpoHab = 4;
//                break;
//                default:
//                idTpoHab = 0; // Valor por defecto si no se encuentra ninguna coincidencia
//                break;
//            }
//
//            int piso = Integer.parseInt(jtPiso.getText());
//            boolean estado = jrbEstado.isSelected();
//
//            //        TipoDeHabitacion tipo_de_habitacion = tipoDeHabitacionData.buscarxTipoDeHabitacion(JtTipo.getText());
//            habitacion = new Habitacion(idHabi, idTpoHab, piso, estado);
//            habitacionData.modificarHabitacion(habitacion);
//            jtId.setText(habitacion.getIdHabitacion() + "");
//            JOptionPane.showMessageDialog(rootPane, "La Habitacion N°: " + idHabi + ", se guardó Correctamente");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
//        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
//        try {
//            int id = Integer.parseInt(jtId.getText());
//            habitacion.setIdHabitacion(id);
//            habitacionData.bajaHabitacion(habitacion);
//
//            JOptionPane.showMessageDialog(null, " La habitación N°:" + habitacion + ", se borró satisfactoriamente ");
//
//            jtId.setText("");
//            jcbTipoDeHabitacion.setSelectedIndex(-1);
//            jtPiso.setText("");
//            jrbEstado.setSelected(false);
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
//        }
    }//GEN-LAST:event_jBborrarActionPerformed
//
//    public void cargarTablas() {
//        HabitacionData hd = new HabitacionData();
//        List<Habitacion> hab = hd.obtenerHabitaciones();
//        for (Habitacion arg : hab) {
//            if (arg.isEstado() == true) {
//                modelo.addRow(new Object[]{
//                    arg.getIdHabitacion(), arg.getIdTipoDeHab(), arg.getPiso()
//                });
//            } else {
//                modelo2.addRow(new Object[]{
//                    arg.getIdHabitacion(), arg.getIdTipoDeHab(), arg.getPiso()
//                });
//            }
//        }
//
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAgregar1;
    private javax.swing.JButton jbCargarTablas;
    private javax.swing.JComboBox<String> jcbTipoDeHabitacion1;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTable jtDesocupadas;
    private javax.swing.JTextField jtId;
    private javax.swing.JTable jtOcupadas;
    private javax.swing.JTextField jtPiso1;
    // End of variables declaration//GEN-END:variables
//private void armarCabeceraOcupadas() {
//        modelo.addColumn("N° Habitacion");
//        modelo.addColumn("Tipo Habitacion");
//        modelo.addColumn("Piso");
//        jtOcupadas.setModel(modelo);
//    }
//
//    private void armarCabeceraDesocupadas() {
//        modelo2.addColumn("N° Habitacion");
//        modelo2.addColumn("Tipo Habitacion");
//        modelo2.addColumn("Piso");
//        jtDesocupadas.setModel(modelo2);
//    }
//
//        private void cargarCBTipoDeHabitaciones() {
//
//        TipoDeHabitacionData thd = new TipoDeHabitacionData();
//
//        for (TipoDeHabitacion tipo : thd.listarTipoDeHabitacionesComboBox()) {
//            jcbTipoDeHabitacion.addItem(tipo);
//        }
//    }
//        
    
}
