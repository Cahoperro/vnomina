package vnomina;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author cahoperro
 */
public class MeterHoras extends javax.swing.JFrame {

    Objeto Obj;
    private String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
        "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private String[] diaSemana = {"Domingo","Lunes","Martes","Miercoles",
                                "Jueves","Viernes","Sabado"};
    GregorianCalendar calendario;
    int diaSem;
    /**
     * Creates new form MeterHoras
     */
    public MeterHoras(Objeto Obj) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.Obj = Obj;
        Obj.diaActual = 0;
        mostrar();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MeterHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeterHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeterHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeterHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadio = new javax.swing.ButtonGroup();
        btnAdelante = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        txtServicio1 = new javax.swing.JTextField();
        txtEntrada1 = new javax.swing.JTextField();
        txtSalida1 = new javax.swing.JTextField();
        txtServicio2 = new javax.swing.JTextField();
        txtEntrada2 = new javax.swing.JTextField();
        txtSalida2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        checkRadio = new javax.swing.JCheckBox();
        checkArma = new javax.swing.JCheckBox();
        checkFestivo = new javax.swing.JCheckBox();
        optBasica = new javax.swing.JRadioButton();
        optPortuaria = new javax.swing.JRadioButton();
        btnGuardarClave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBorrarClave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Introducir horarios");
        setName("MeterHoras"); // NOI18N
        setPreferredSize(new java.awt.Dimension(525, 345));
        setResizable(false);

        btnAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/Button_Next.png"))); // NOI18N
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/Button_Back.png"))); // NOI18N
        btnAtras.setToolTipText("");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        lblFecha.setText("Ninguna fecha seleccionada");

        txtServicio1.setColumns(15);

        txtEntrada1.setColumns(4);

        txtSalida1.setColumns(4);

        txtServicio2.setColumns(15);

        txtEntrada2.setColumns(4);

        txtSalida2.setColumns(4);

        jLabel2.setText("Servicio");

        jLabel3.setText("Entrada");

        jLabel4.setText("Salida");

        txtClave.setColumns(4);

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        checkRadio.setText("Radioscopia");
        checkRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkRadioStateChanged(evt);
            }
        });

        checkArma.setText("Arma");

        checkFestivo.setText("Festivo");

        grupoRadio.add(optBasica);
        optBasica.setSelected(true);
        optBasica.setText("Basica");
        optBasica.setEnabled(false);

        grupoRadio.add(optPortuaria);
        optPortuaria.setText("A. portuaria");
        optPortuaria.setToolTipText("");
        optPortuaria.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkFestivo)
                    .addComponent(checkArma)
                    .addComponent(checkRadio)
                    .addComponent(optBasica)
                    .addComponent(optPortuaria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkFestivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkArma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optBasica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optPortuaria))
        );

        btnGuardarClave.setText("Guardar clave");
        btnGuardarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Clave servicio");

        btnBorrarClave.setText("Borrar clave");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrarClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarClave))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtServicio2)
                                                    .addComponent(txtServicio1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(txtEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAceptar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnAtras)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnAdelante))))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdelante)
                    .addComponent(btnAtras)
                    .addComponent(lblFecha))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar)
                    .addComponent(btnGuardarClave)
                    .addComponent(btnBorrarClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setServicio1(txtServicio1.getText());
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setServicio2(txtServicio2.getText());
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setEntrada1(txtEntrada1.getText());
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setEntrada2(txtEntrada2.getText());
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setSalida1(txtSalida1.getText());
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setSalida2(txtSalida2.getText());
        if(checkArma.isSelected()){
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setArma(true);
        }else{
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setArma(false);
        }
        if(checkFestivo.isSelected()){
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setFestivo(true);
        }else{
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setFestivo(false);
        }
        
        if(checkRadio.isSelected()){
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioscopia(true);
        }else{
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioscopia(false);
        }
        
        if(optBasica.isSelected()){
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioB(true);
        }else{
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioB(false);
        }
        if(optPortuaria.isSelected()){
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadio(true);
        }else{
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadio(false);
        }
        
        if (Obj.diaActual < Obj.mes[Obj.mesActual].getN()-1){
        Obj.diaActual++;
        mostrar();
        }
        limpiarCampos();
        Obj.guardado = false;
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if (Obj.diaActual > 0) {
            Obj.diaActual--;
            mostrar();
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        // TODO add your handling code here:
        if (Obj.diaActual < Obj.mes[Obj.mesActual].getN()-1){
        Obj.diaActual++;
        mostrar();
        }
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClaveActionPerformed
        // TODO add your handling code here:
        Obj.claves.put(txtClave.getText(), null);
    }//GEN-LAST:event_btnGuardarClaveActionPerformed

    private void checkRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkRadioStateChanged
        // TODO add your handling code here:
        if (checkRadio.isSelected()) {
            optBasica.setEnabled(true);
            optPortuaria.setEnabled(true);
        } else {
            optBasica.setEnabled(false);
            optPortuaria.setEnabled(false);
        }
    }//GEN-LAST:event_checkRadioStateChanged
    private void mostrar() {
        calendario = new GregorianCalendar(Obj.anio, Obj.mesActual, Obj.diaActual+1);
        diaSem = calendario.get(Calendar.DAY_OF_WEEK);
        lblFecha.setText(diaSemana[diaSem-1]+" "+(Obj.diaActual+1) + " de " + nombreMeses[Obj.mesActual]);
        txtServicio1.setText(Obj.mes[Obj.mesActual].dia[Obj.diaActual].getServicio1());
        txtServicio2.setText(Obj.mes[Obj.mesActual].dia[Obj.diaActual].getServicio2());
        txtSalida1.setText(Obj.mes[Obj.mesActual].dia[Obj.diaActual].getSalida1());
        txtSalida2.setText(Obj.mes[Obj.mesActual].dia[Obj.diaActual].getSalida2());
        txtEntrada1.setText(Obj.mes[Obj.mesActual].dia[Obj.diaActual].getEntrada1());
        txtEntrada2.setText(Obj.mes[Obj.mesActual].dia[Obj.diaActual].getEntrada2());
        checkArma.setSelected(Obj.mes[Obj.mesActual].dia[Obj.diaActual].isArma());
        checkFestivo.setSelected(Obj.mes[Obj.mesActual].dia[Obj.diaActual].isFestivo());
        checkRadio.setSelected(Obj.mes[Obj.mesActual].dia[Obj.diaActual].isRadioscopia());
        optPortuaria.setSelected(Obj.mes[Obj.mesActual].dia[Obj.diaActual].isRadio());
        optBasica.setSelected(Obj.mes[Obj.mesActual].dia[Obj.diaActual].isRadioB());
    }
    private void limpiarCampos() {
        txtServicio1.setText("");
        txtServicio2.setText("");
        txtSalida1.setText("");
        txtSalida2.setText("");
        txtEntrada1.setText("");
        txtEntrada2.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrarClave;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarClave;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JCheckBox checkArma;
    private javax.swing.JCheckBox checkFestivo;
    private javax.swing.JCheckBox checkRadio;
    private javax.swing.ButtonGroup grupoRadio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JRadioButton optBasica;
    private javax.swing.JRadioButton optPortuaria;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtEntrada1;
    private javax.swing.JTextField txtEntrada2;
    private javax.swing.JTextField txtSalida1;
    private javax.swing.JTextField txtSalida2;
    private javax.swing.JTextField txtServicio1;
    private javax.swing.JTextField txtServicio2;
    // End of variables declaration//GEN-END:variables

    
}
