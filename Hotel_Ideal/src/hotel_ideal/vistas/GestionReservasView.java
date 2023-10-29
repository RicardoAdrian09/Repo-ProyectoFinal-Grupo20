package hotel_ideal.vistas;

import hotel_ideal.accesoADatos.HabitacionData;
import hotel_ideal.accesoADatos.ReservaData;
import hotel_ideal.accesoADatos.TipoDeHabitacionData;
import hotel_ideal.entidades.Habitacion;
import hotel_ideal.entidades.Reserva;
import hotel_ideal.entidades.TipoDeHabitacion;
import java.time.LocalDate;
import java.time.ZoneId;
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
    private HabitacionData hd = new HabitacionData();
    private TipoDeHabitacionData tdh2 = new TipoDeHabitacionData();
    int filaSeleccionada;
    int precioEstadia;
    int idseleccionado;
    int idHabseleccionado;

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
        jBuscar = new javax.swing.JButton();
        jBGuardarCambios = new javax.swing.JButton();
        jBControlDiario = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

        jLBusquedasReservas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLBusquedasReservas.setText("Manejo  de Reservas ");

        jLBusquedaporid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLBusquedaporid.setText("Actualizacion por ID");

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

        jBEliminarReservas.setForeground(new java.awt.Color(255, 51, 51));
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

        jTId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Para actualizar datos  1°  seleccione una fila de la tabla y  luego ingrese las nuevas fechas ");

        JBGuardar.setText("Registar  Cambios");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardad.png"))); // NOI18N
        jBGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarCambiosActionPerformed(evt);
            }
        });

        jBControlDiario.setBackground(new java.awt.Color(153, 153, 153));
        jBControlDiario.setText("<html><center>Consultar Disponibilidades por Finalizacion de Reservas<html>");
        jBControlDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBControlDiarioActionPerformed(evt);
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
        jDesktopPane1.setLayer(jBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBGuardarCambios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBControlDiario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(JBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminarReservas)
                .addGap(202, 202, 202))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLBusquedasReservas)
                .addGap(372, 372, 372)
                .addComponent(jBSalir)
                .addGap(22, 22, 22))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jDFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addComponent(jDFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(338, 338, 338)
                                .addComponent(jBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jBGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jBControlDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLBusquedaporid)
                        .addGap(28, 28, 28)
                        .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jLBusquedasReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBControlDiario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLBusquedaporid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGuardarCambios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(JBGuardar)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jBEliminarReservas)
                        .addGap(20, 20, 20))))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarCambiosActionPerformed

        // obntengo el id del textField
        String idseleccionado3 = jTId.getText();
        int idseleccionadoEntero = Integer.parseInt(idseleccionado3);

        // ------------------------------------------------------------------------------------------------
        int filaSeleccionada = -1;

        for (int i = 0; i < jTReserva.getRowCount(); i++) {
            int idReserva = (int) jTReserva.getValueAt(i, 0); // yo se que el idReserva esta en la primera columna.
            if (idReserva == idseleccionadoEntero) {
                filaSeleccionada = i;
            
                break;
            }
        }

        if (filaSeleccionada != -1) {

            // BUSCO RESERVA
            Reserva reservaSeleccionada = null;
            List<Reserva> reservas = rd.listarReservas();  // misma lista que cargo en la tabla
            for (Reserva reserva : reservas) {
                if (String.valueOf(reserva.getidReserva()).equals(idseleccionado3)) {   // SI EL ID INGRESADO ES IGUAL UN ID DE LA LISTA DE RESERVAS (IDE RESERVA EN INT , SE PARSEA)
                    reservaSeleccionada = reserva;

                   
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

                    Object id = modelo.getValueAt(filaSeleccionada, 0);   // OBTENGO ID DE LA TABLA

                    int idseleccionado2 = Integer.parseInt(id.toString());    // id lo paso a idseleccionado2 , de string a int. RENOMBRAR VAVIABLE

                    Object idHab = modelo.getValueAt(filaSeleccionada, 1);  // ---- idHabitacion NUEVO

                    idHabseleccionado = Integer.parseInt(idHab.toString());   // idHab lo paso a idHabseleecionado

                    // 1°   ubicar la reserva en la lista  de la tabla
                   
                    List<Reserva> reservas2 = rd.listarReservas();

                    for (Reserva reserva : reservas2) {
                        if (reserva.getidReserva() == Integer.parseInt(id.toString())) {   // id reserva en un int ,necesito pasar a Sstring
                            reservaSeleccionada = reserva;
                         

                            break;

                        }
                    }

                    if (reservaSeleccionada != null) {

                        Reserva ffff = rd.buscarReservaPorId(idseleccionado2);   // obtengo   ID reserva BD


                        Habitacion idHabi = hd.buscarHabitacionPorId(idHabseleccionado);

                     

                        int idtdh = idHabi.getIdTipoDeHab();


                        TipoDeHabitacion tdh = tdh2.buscarTipoDeHabitacion(idtdh);

                        int resultado;
                        resultado = tdh.getPrecioPorNoche();

                        precioEstadia = (int) (difdias * resultado);

                        //  MODIFICO REGISTROS
                        DefaultTableModel modelo = (DefaultTableModel) jTReserva.getModel();

                        jTReserva.setValueAt(fecha1, filaSeleccionada, 3);
                        jTReserva.setValueAt(fecha2, filaSeleccionada, 4);
                        jTReserva.setValueAt(precioEstadia, filaSeleccionada, 5);
                        jTReserva.setValueAt(cantdias, filaSeleccionada, 7);

                        jTReserva.setModel(modelo);
                      
                        // MODIFICO EN BASE DE DATOS
                        
                        rd.modificarReservaPorId(new Reserva(fecha1, fecha2, precioEstadia, cantdias, idseleccionadoEntero));  // Encuentro la reserva y  paso  la reserva como argumento al método

                    } else {

                        // Si no encuentro Maneja el caso en el que la reserva no se encontró
                        // No se encontró un objeto con el idReserva ingresado
                        JOptionPane.showMessageDialog(null, " ID seleccionado  " + idseleccionadoEntero + " inexitente2 ");

                    }

                    jDFechaEntrada.setDate(null);
                    jDFechaSalida.setDate(null);
                    jTId.setText("");
                
                    
                }
                
            }
        }
        
       
        
        
        
        
    }//GEN-LAST:event_jBGuardarCambiosActionPerformed
           
    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

        // ---------------------------------------------------------------------------------------------------------------------------------------------------
        // obntengo el id del textField
        String idseleccionado2 = jTId.getText();
        int idseleccionadoEntero = Integer.parseInt(idseleccionado2);

        // ------------------------------------------------------------------------------------------------
        // RECORRO LA PRIMER COLUMNA BUSCANDO COINCIDENCIA ENTRE ID SACADO DEL TEXTFIELD  SI EXISTE EN LA TABLA
        int filaSeleccionada2 = -1;

        for (int i = 0; i < jTReserva.getRowCount(); i++) {
            int idReserva = (int) jTReserva.getValueAt(i, 0); 
            if (idReserva == idseleccionadoEntero) {
                filaSeleccionada2 = i;
               
                break;
            }
        }

        jDFechaEntrada.setEnabled(true);
        jDFechaSalida.setEnabled(true);
    }//GEN-LAST:event_jBuscarActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed

        Date fechaInicio = jDFechaEntrada.getDate();
        Date fechaSalida = jDFechaSalida.getDate();

        LocalDate fecha1 = fechaInicio.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2 = fechaSalida.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        if (fecha1.isAfter(fecha2) || fecha1.isEqual(fecha2)) {
            JOptionPane.showMessageDialog(null, "¡Atención! La fecha de ingreso no puede ser posterior a la fecha de salida");
            return;
        }
        
        // calulo diferencia entre ambas fechas
        long difdias = ChronoUnit.DAYS.between(fecha1, fecha2);
        String difedias = String.valueOf(difdias);
        int cantdias = (int) difdias;

        // Calculo del precio de la estadia 
        
        Object id = modelo.getValueAt(filaSeleccionada, 0);   // obtengo el id de la tacla

        idseleccionado = Integer.parseInt(id.toString());    // id lo paso a idseleccionado , de string a int.

        Object idHab = modelo.getValueAt(filaSeleccionada, 1);  // ---- idHabitacion NUEVO

        idHabseleccionado = Integer.parseInt(idHab.toString());   // idHab lo paso a idHabseleecionado
        
        // 1°   ubicar la reserva en la lista  de la tabla
        
        Reserva reservaSeleccionada = null;

        List<Reserva> reservas2 = rd.listarReservas();

        for (Reserva reserva : reservas2) {
            if (reserva.getidReserva() == Integer.parseInt(id.toString())) {   // id reserva en un int ,necesito pasar a Sstring
                reservaSeleccionada = reserva;

                break;

            }
        }

        if (reservaSeleccionada != null) {

            Reserva ffff = rd.buscarReservaPorId(idseleccionado);   // obtengo   ID reserva BD

            Habitacion idHabi = hd.buscarHabitacionPorId(idHabseleccionado);  // ontengo ID habitacion BD

           
            
            int idtdh = idHabi.getIdTipoDeHab();


            TipoDeHabitacion tdh = tdh2.buscarTipoDeHabitacion(idtdh);  // obtengo  ID tipo de habitacion BD 

            int resultado;
            
            resultado = tdh.getPrecioPorNoche();   // Obtengo precio por noche 

            precioEstadia = (int) (difdias * resultado);

            //  MODIFICO REGISTROS
            DefaultTableModel modelo = (DefaultTableModel) jTReserva.getModel();

            jTReserva.setValueAt(fecha1, filaSeleccionada, 3);
            jTReserva.setValueAt(fecha2, filaSeleccionada, 4);
            jTReserva.setValueAt(precioEstadia, filaSeleccionada, 5);
            jTReserva.setValueAt(cantdias, filaSeleccionada, 7);

            jTReserva.setModel(modelo);

            //  2°)  MODIFICAR BASE DE DATOS
            //   Ubico  reserva en la lista de la tabla recorriendo la lista.
            String idseleccionado2 = modelo.getValueAt(filaSeleccionada, 0).toString();   // obtengo id en la fila clickeada de la tabla.- NECESARIO ??? REPETIDO !!
            int idselecentero = Integer.parseInt(idseleccionado2);
            List<Reserva> reservas = rd.listarReservas();
            for (Reserva reserva : reservas) {

                if (reserva.getidReserva() == Integer.parseInt(id.toString())) {

                    reservaSeleccionada = reserva;
                    break;
                }
            }

            rd.modificarReservaPorId(new Reserva(fecha1, fecha2, precioEstadia, cantdias, idseleccionado));

            jDFechaEntrada.setDate(null);
            jDFechaSalida.setDate(null);

            
            
        } else {

            JOptionPane.showMessageDialog(null, " ID seleccionado esle inexitente : " + idseleccionado); 
        }

    }//GEN-LAST:event_JBGuardarActionPerformed

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jBSalirActionPerformed

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

    private void jTReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReservaMouseClicked

        filaSeleccionada = jTReserva.getSelectedRow();

        if (filaSeleccionada >= 0) {

            jDFechaEntrada.setEnabled(true);
            jDFechaSalida.setEnabled(true);

        }
    }//GEN-LAST:event_jTReservaMouseClicked

    private void jBControlDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBControlDiarioActionPerformed
        // TODO add your handling code here:
        
        controlDiarioDeHabitacionDisponible();
    }//GEN-LAST:event_jBControlDiarioActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton jBControlDiario;
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
    
    private void controlDiarioDeHabitacionDisponible (){
       
            // PASAR HABITACION A DISPONIBILIDAD POR FIN DE RESERVA
            
        
        for (int i = 0; i < jTReserva.getRowCount(); i++) {
            Object controlfechasalida = jTReserva.getValueAt(i, 4);

            LocalDate fechafinreserva2 = (LocalDate) controlfechasalida;

            if (fechafinreserva2.isAfter(LocalDate.now())) {
                Object idHabDisp = jTReserva.getValueAt(i, 1);
                Object idRes = jTReserva.getValueAt(i, 0);

                int idHabDisp2 = Integer.parseInt(idHabDisp.toString()); 
                
                int idRes2= Integer.parseInt(idRes.toString());

                Habitacion habbuscada;
                habbuscada = hd.buscarHabitacionPorId(idHabDisp2);

                hd.pasarHabitacionaDesocupada(habbuscada);
                
                Reserva reservaBuscada ;
                reservaBuscada= rd.buscarReservaPorId(idRes2);
                
                rd.pasarReservaaInactivo(reservaBuscada);
                
             } break; // Importante
        }
        
    }
}

