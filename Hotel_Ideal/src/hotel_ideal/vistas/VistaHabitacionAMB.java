package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.accesoADatos.TipoDeHabitacionData;
import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.TipoDeHabitacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.entidades.Habitacion;
import javax.swing.JOptionPane;

public class VistaHabitacionAMB extends javax.swing.JInternalFrame {

    Habitacion habitacion = null;
    HabitacionData habitacionData = new HabitacionData();

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

    public VistaHabitacionAMB() {
        initComponents();
        armarCabeceraDesocupadas();
        armarCabeceraOcupadas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCargarTablas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtOcupadas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDesocupadas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BtLimpiar = new javax.swing.JButton();
        jcbTipoDeHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtPiso = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbAgregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BtBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbBuscarTipoDeHabitacion = new javax.swing.JComboBox<>();
        jBSalir2 = new javax.swing.JButton();

        jbCargarTablas.setText("Mostrar Habitaciones");
        jbCargarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarTablasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Habitaciones Disponibles");
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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de Habitacion");

        BtLimpiar.setText("LIMPIAR CAMPOS");
        BtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpiarActionPerformed(evt);
            }
        });

        jcbTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbTipoDeHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar Simple", "Doble ", "Triple", "Suite Lujo" }));
        jcbTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoDeHabitacionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("N° Piso");

        jtPiso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jrbEstado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbEstado.setText("Estado");
        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("N° Habitacion");

        jtId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("Agragar ó Modificar una Habitacion");

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setText("Habitaciones Ocupadas");
        jLabel12.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Buscar Tipo De Habitacion");
        jLabel4.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Buscar una Habitacion");
        jLabel5.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Tipo de Habitacion");

        jcbBuscarTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbBuscarTipoDeHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar Simple", "Doble ", "Triple", "Suite Lujo" }));
        jcbBuscarTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBuscarTipoDeHabitacionActionPerformed(evt);
            }
        });

        jBSalir2.setText("Salir");
        jBSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTipoDeHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBborrar)
                                            .addComponent(BtLimpiar))
                                        .addGap(45, 45, 45)
                                        .addComponent(jbAgregar)
                                        .addGap(73, 73, 73)
                                        .addComponent(Modificar)))
                                .addGap(0, 23, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jcbBuscarTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jbCargarTablas)
                .addGap(179, 179, 179)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtBuscar))
                    .addComponent(jLabel5))
                .addGap(104, 104, 104)
                .addComponent(jBSalir2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCargarTablas)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtBuscar)))
                    .addComponent(jBSalir2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jcbBuscarTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEstado))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtLimpiar)
                            .addComponent(jbAgregar)
                            .addComponent(Modificar))
                        .addGap(47, 47, 47)
                        .addComponent(jBborrar)))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCargarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarTablasActionPerformed
        modelo.setRowCount(0);
        modelo2.setRowCount(0);
        cargarTablas();
    }//GEN-LAST:event_jbCargarTablasActionPerformed

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed

        jtId.setText("");
        jcbTipoDeHabitacion.setSelectedIndex(0);
        jtPiso.setText("");
        jrbEstado.setSelected(false);
        
    }//GEN-LAST:event_BtLimpiarActionPerformed

    private void jcbTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoDeHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoDeHabitacionActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        try {
            String eleccionTipoHab = (String) jcbTipoDeHabitacion.getSelectedItem();

            int idTpoHab = 0;

            if (eleccionTipoHab != null) {

                switch (eleccionTipoHab) {

                    case "Estandar Simple":
                        idTpoHab = 1;
                        break;
                    case "Doble":
                        idTpoHab = 2;
                        break;
                    case "Triple":
                        idTpoHab = 3;
                        break;
                    case "Suite Lujo":
                        idTpoHab = 4;
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de habitacion antes de guardar o modificar");
            }

            int piso = Integer.parseInt(jtPiso.getText());
            boolean estado = jrbEstado.isSelected();
            habitacion = new Habitacion(idTpoHab, piso, estado);
            habitacionData.altaHabitacion(habitacion);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
        }

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
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        try {
            int idHabi = Integer.parseInt(jtId.getText());

            String eleccionTipoHab = (String) jcbTipoDeHabitacion.getSelectedItem();

            int idTpoHab;
            switch (eleccionTipoHab) {
                case "Estandar Simple":
                    idTpoHab = 1;
                    break;
                case "Doble":
                    idTpoHab = 2;
                    break;
                case "Triple":
                    idTpoHab = 3;
                    break;
                case "Suite Lujo":
                    idTpoHab = 4;
                    break;
                default:
                    idTpoHab = 0;
                    break;
            }
            System.out.println(idTpoHab);
            int piso = Integer.parseInt(jtPiso.getText());
            boolean estado = jrbEstado.isSelected();

            Habitacion habitacion = new Habitacion(idHabi, idTpoHab, piso, estado);
            habitacionData.modificarHabitacion(habitacion);
//            jtId.setText(habitacion.getIdHabitacion() + "");
//            JOptionPane.showMessageDialog(rootPane, "La Habitacion N°: " + idHabi + ", se guardó Correctamente");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        try {
            int id = Integer.parseInt(jtId.getText());
            habitacion.setIdHabitacion(id);
            habitacionData.bajaHabitacion(habitacion);

            JOptionPane.showMessageDialog(null, " La habitación N°:" + habitacion + ", se borró satisfactoriamente ");

            jtId.setText("");
            jcbTipoDeHabitacion.setSelectedIndex(-1);
            jtPiso.setText("");
            jrbEstado.setSelected(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
        }
    }//GEN-LAST:event_jBborrarActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        try {
            if (!jtId.getText().isEmpty()) {

                int id = Integer.parseInt(jtId.getText());

                habitacion = new HabitacionData().buscarHabitacionPorId(id);
                if (habitacion != null) {

                    int tipoHabitacion = habitacion.getIdTipoDeHab();
                    String tipoHabi;
                    switch (tipoHabitacion) {
                        case 1:
                            tipoHabi = "Estandar Simple";
                            break;
                        case 2:
                            tipoHabi = "Doble";
                            break;
                        case 3:
                            tipoHabi = "Triple";
                            break;
                        case 4:
                            tipoHabi = "Suite Lujo";
                            break;
                        default:
                            tipoHabi = "";
                            break;
                    }

                    jcbTipoDeHabitacion.setSelectedItem(tipoHabi);
                    jtPiso.setText(habitacion.getPiso() + "");
                    jrbEstado.setSelected(habitacion.isEstado());
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontro el ID");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
        }
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void jcbBuscarTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBuscarTipoDeHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbBuscarTipoDeHabitacionActionPerformed

    private void jBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir2ActionPerformed

        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jBSalir2ActionPerformed

    public void cargarTablas() {
        HabitacionData hd = new HabitacionData();
        List<Habitacion> hab = hd.obtenerHabitaciones();
        for (Habitacion arg : hab) {
            if (arg.isEstado() == true) {
                modelo.addRow(new Object[]{
                    arg.getIdHabitacion(), arg.getIdTipoDeHab(), arg.getPiso()
                });
            } else {
                modelo2.addRow(new Object[]{
                    arg.getIdHabitacion(), arg.getIdTipoDeHab(), arg.getPiso()
                });
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalir1;
    private javax.swing.JButton jBSalir2;
    private javax.swing.JButton jBborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbCargarTablas;
    private javax.swing.JComboBox<String> jcbBuscarTipoDeHabitacion;
    private javax.swing.JComboBox<String> jcbTipoDeHabitacion;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTable jtDesocupadas;
    private javax.swing.JTextField jtId;
    private javax.swing.JTable jtOcupadas;
    private javax.swing.JTextField jtPiso;
    // End of variables declaration//GEN-END:variables
private void armarCabeceraOcupadas() {
        modelo.addColumn("N° Habitacion");
        modelo.addColumn("Tipo Habitacion");
        modelo.addColumn("Piso");
        jtOcupadas.setModel(modelo);
    }

    private void armarCabeceraDesocupadas() {
        modelo2.addColumn("N° Habitacion");
        modelo2.addColumn("Tipo Habitacion");
        modelo2.addColumn("Piso");
        jtDesocupadas.setModel(modelo2);
    } 

}
