package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.entidades.Habitacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaHabitacion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();

    public VistaHabitacion() {
        initComponents();
        armarCabeceraDesocupadas();
        armarCabeceraOcupadas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbTipoDeHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtPiso = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtOcupadas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDesocupadas = new javax.swing.JTable();
        jbCargarTablas = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Habitaciones");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de Habitacion");

        jcbTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbTipoDeHabitacion.setToolTipText("");
        jcbTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoDeHabitacionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("N° Piso");

        jtPiso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbAgregar.setText("Agregar");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCargarTablas))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel3)
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbAgregar))
                                    .addComponent(jcbTipoDeHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jbCargarTablas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoDeHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoDeHabitacionActionPerformed

    private void jbCargarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarTablasActionPerformed
        modelo.setRowCount(0);
        modelo2.setRowCount(0);
        cargarTablas();
    }//GEN-LAST:event_jbCargarTablasActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbCargarTablas;
    private javax.swing.JComboBox<String> jcbTipoDeHabitacion;
    private javax.swing.JTable jtDesocupadas;
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
