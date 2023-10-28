/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.entidades.Habitacion;
import javax.swing.JOptionPane;

/**
 *
 * @author 123
 */
public class VistaGestionHabitacion extends javax.swing.JInternalFrame {

    Habitacion habitacion = null;
    HabitacionData habitacionData = new HabitacionData();

    /**
     * Creates new form VistaGestionHabitacion
     */
    public VistaGestionHabitacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbTipoDeHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtPiso = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbAgregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        BtBuscar = new javax.swing.JButton();
        BtLimpiar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Gestion Habitacion");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de Habitacion");

        jcbTipoDeHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar Simple", "Doble ", "Triple", "Suite Lujo" }));
        jcbTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoDeHabitacionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("N° Piso");

        jtPiso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

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

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("N° Habitacion");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(Modificar)
                                .addGap(18, 18, 18)
                                .addComponent(jBborrar)))
                        .addGap(18, 18, 18)
                        .addComponent(BtLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jrbEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcbTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(BtBuscar))
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtBuscar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jBborrar)
                    .addComponent(Modificar)
                    .addComponent(BtLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

            if (eleccionTipoHab!=null) {

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
                    idTpoHab = 0; // Valor por defecto si no se encuentra ninguna coincidencia
                    break;
            }
            System.out.println(idTpoHab);
            int piso = Integer.parseInt(jtPiso.getText());
            boolean estado = jrbEstado.isSelected();

//        TipoDeHabitacion tipo_de_habitacion = tipoDeHabitacionData.buscarxTipoDeHabitacion(JtTipo.getText());
            Habitacion habitacion = new Habitacion(idHabi, idTpoHab, piso, estado);
            habitacionData.modificarHabitacion(habitacion);
            jtId.setText(habitacion.getIdHabitacion() + "");
            JOptionPane.showMessageDialog(rootPane, "La Habitacion N°: " + idHabi + ", se guardó Correctamente");

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

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed

        jtId.setText("");
        jcbTipoDeHabitacion.setSelectedIndex(0);
        jtPiso.setText("");
        jrbEstado.setSelected(false);

    }//GEN-LAST:event_BtLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JComboBox<String> jcbTipoDeHabitacion;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtPiso;
    // End of variables declaration//GEN-END:variables
}
