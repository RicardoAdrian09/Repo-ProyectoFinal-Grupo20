/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.vistas;

public class VistaPrincipal extends javax.swing.JFrame {
    
 
    public VistaPrincipal() {
        initComponents();
              
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
        jMenu3 = new javax.swing.JMenu();
        jmReserva = new javax.swing.JMenuItem();
        jMGestionReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setText("HOTEL IDEAL");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(549, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(541, 541, 541))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 6, 1410, 900));

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
        jmHabitaciones.setText("Gestion de Habitaciones");
        jmHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHabitacionesActionPerformed(evt);
            }
        });
        jMenu2.add(jmHabitaciones);

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
        VistaHabitacion vh = new VistaHabitacion();
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





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel2;
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
