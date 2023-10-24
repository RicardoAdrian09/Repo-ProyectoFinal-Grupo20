/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.vistas;

import java.awt.Dimension;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();

        //Centro la ventana a la pantalla
        this.setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMHuesped = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmHabitaciones = new javax.swing.JMenuItem();
        jMGestionHabitaciones = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmReserva = new javax.swing.JMenuItem();
        jMGestionReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Ideal");
        setPreferredSize(new java.awt.Dimension(800, 600));

        escritorio.setBackground(new java.awt.Color(0, 102, 204));
        escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setText("HOTEL IDEAL");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(212, 212, 212))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jMenuBar1.setMaximumSize(null);
        jMenuBar1.setMinimumSize(null);

        jMenu1.setText("Huesped");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMHuesped.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMHuesped.setText("Gestion de Huesped");
        jMHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(jMHuesped);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Habitaciones");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmHabitaciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmHabitaciones.setText("Habitaciones");
        jmHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHabitacionesActionPerformed(evt);
            }
        });
        jMenu2.add(jmHabitaciones);

        jMGestionHabitaciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMGestionHabitaciones.setText("Gestion Habitaciones");
        jMGestionHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGestionHabitacionesActionPerformed(evt);
            }
        });
        jMenu2.add(jMGestionHabitaciones);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reservas");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmReserva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmReserva.setText("Crear nueva Reserva");
        jmReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmReservaActionPerformed(evt);
            }
        });
        jMenu3.add(jmReserva);

        jMGestionReservas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMGestionReservas.setText("Gestion de Reservas");
        jMGestionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGestionReservasActionPerformed(evt);
            }
        });
        jMenu3.add(jMGestionReservas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMHuespedActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaHuesped vi = new VistaHuesped();
        vi.setVisible(true);
        escritorio.add(vi);
        escritorio.moveToFront(vi);
    }//GEN-LAST:event_jMHuespedActionPerformed

    private void jmReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmReservaActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();
        VistaReserva vi = new VistaReserva();
        vi.setVisible(true);
        escritorio.add(vi);
        escritorio.moveToFront(vi);

    }//GEN-LAST:event_jmReservaActionPerformed

    private void jmHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHabitacionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaHabitaciones vh = new VistaHabitaciones();
        vh.setVisible(true);
        escritorio.add(vh);
        escritorio.moveToFront(vh);

    }//GEN-LAST:event_jmHabitacionesActionPerformed

    private void jMGestionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGestionReservasActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        GestionReservasView gr = new GestionReservasView();
        gr.setVisible(true);
        escritorio.add(gr);
        escritorio.moveToFront(gr);

    }//GEN-LAST:event_jMGestionReservasActionPerformed

    private void jMGestionHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGestionHabitacionesActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        VistaGestionHabitacion vh = new VistaGestionHabitacion();
        vh.setVisible(true);
        escritorio.add(vh);
        // Para centrar el JInternalFrame en el escritorio ---------------------
        Dimension escritorioSize = escritorio.getSize();
        Dimension FrameSize = vh.getSize();
        vh.setLocation(
                (escritorioSize.width - FrameSize.width) / 2,
                (escritorioSize.height - FrameSize.height) / 2
        );
        // ---------------------------------------------------------------------
        escritorio.moveToFront(vh);

    }//GEN-LAST:event_jMGestionHabitacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMGestionHabitaciones;
    private javax.swing.JMenuItem jMGestionReservas;
    private javax.swing.JMenuItem jMHuesped;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmHabitaciones;
    private javax.swing.JMenuItem jmReserva;
    // End of variables declaration//GEN-END:variables
}
