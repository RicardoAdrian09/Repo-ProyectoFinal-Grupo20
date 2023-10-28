/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ideal.vistas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class VistaPrincipal extends javax.swing.JFrame {
    
 
    public VistaPrincipal() {
        initComponents();
              
    }
    public void determinarFondo(){
        JLabel fondo = new JLabel();
        fondo.setIcon(new ImageIcon("/Imagenes/hotel11"));
        fondo.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
        fondo.setOpaque(true);
        escritorio.add(fondo);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMHuesped = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmHabitaciones = new javax.swing.JMenuItem();
        jmGestionDeHabitaciones = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmReserva = new javax.swing.JMenuItem();
        jMGestionReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hotel11.jpg"))); // NOI18N

        escritorio.setLayer(fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 794, Short.MAX_VALUE))
        );

        fondo.getAccessibleContext().setAccessibleName("fondo");

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1400, 800));

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

        jmGestionDeHabitaciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmGestionDeHabitaciones.setText("Gestion de Habitaciones");
        jmGestionDeHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionDeHabitacionesActionPerformed(evt);
            }
        });
        jMenu2.add(jmGestionDeHabitaciones);

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
        escritorio.add(fondo);
        escritorio.add(vi);
        escritorio.moveToBack(fondo);
        escritorio.moveToFront(vi);
        
    }//GEN-LAST:event_jMHuespedActionPerformed

    private void jmReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmReservaActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        escritorio.repaint();
        VistaReserva vi = new VistaReserva();
        vi.setVisible(true);
        escritorio.add(fondo);
        escritorio.add(vi);
        escritorio.moveToBack(fondo);
        escritorio.moveToFront(vi);
        
    }//GEN-LAST:event_jmReservaActionPerformed

    private void jmHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHabitacionesActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        VistaHabitaciones vh = new VistaHabitaciones();
        vh.setVisible(true);
        escritorio.add(fondo);
        escritorio.add(vh);
        escritorio.moveToBack(fondo);
        escritorio.moveToFront(vh);
        
    }//GEN-LAST:event_jmHabitacionesActionPerformed

    private void jMGestionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGestionReservasActionPerformed
       
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionReservasView gr = new GestionReservasView();
        gr.setVisible(true);
        escritorio.add(fondo);
        escritorio.add(gr);
        escritorio.moveToBack(fondo);
        escritorio.moveToFront(gr);

    }//GEN-LAST:event_jMGestionReservasActionPerformed

    private void jmGestionDeHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionDeHabitacionesActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        VistaGestionHabitacion gh = new VistaGestionHabitacion();
        gh.setVisible(true);
        escritorio.add(fondo);
        escritorio.add(gh);
        escritorio.moveToBack(fondo);
        escritorio.moveToFront(gh);
        
    }//GEN-LAST:event_jmGestionDeHabitacionesActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenuItem jMGestionReservas;
    private javax.swing.JMenuItem jMHuesped;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmGestionDeHabitaciones;
    private javax.swing.JMenuItem jmHabitaciones;
    private javax.swing.JMenuItem jmReserva;
    // End of variables declaration//GEN-END:variables
}
