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
    private String[] diaSemana = {"Domingo", "Lunes", "Martes", "Miercoles",
        "Jueves", "Viernes", "Sabado"};
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
        jPanel1 = new javax.swing.JPanel();
        checkRadio = new javax.swing.JCheckBox();
        checkArma = new javax.swing.JCheckBox();
        checkFestivo = new javax.swing.JCheckBox();
        optBasica = new javax.swing.JRadioButton();
        optPortuaria = new javax.swing.JRadioButton();
        btnGuardarClave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBorrarClave = new javax.swing.JButton();
        checkVacaciones = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Introducir horarios");
        setName("MeterHoras"); // NOI18N
        setPreferredSize(new java.awt.Dimension(530, 345));
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
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

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
        btnBorrarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClaveActionPerformed(evt);
            }
        });

        checkVacaciones.setText("Vacaciones");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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
                                .addGap(18, 18, 18)
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
                                                    .addComponent(txtEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(checkVacaciones))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAtras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAdelante))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAceptar)))
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
                                .addComponent(txtSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkVacaciones))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar)
                    .addComponent(btnGuardarClave)
                    .addComponent(btnBorrarClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnLimpiar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        insertar();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        if (Obj.diaActual > 0) {
            Obj.diaActual--;
            mostrar();
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed

        if (Obj.diaActual < Obj.mes[Obj.mesActual].getN() - 1) {
            Obj.diaActual++;
            mostrar();
        }
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClaveActionPerformed
        Dias tem = new Dias();
        tem.setServicio1(txtServicio1.getText());
        tem.setServicio2(txtServicio2.getText());
        tem.setEntrada1(txtEntrada1.getText());
        tem.setEntrada2(txtEntrada2.getText());
        tem.setSalida1(txtSalida1.getText());
        tem.setSalida2(txtSalida2.getText());
        if (checkArma.isSelected()) {
            tem.setArma(true);
        } else {
            tem.setArma(false);
        }
        if (checkFestivo.isSelected()) {
            tem.setFestivo(true);
        } else {
            tem.setFestivo(false);
        }

        if (checkRadio.isSelected()) {
            tem.setRadioscopia(true);
        } else {
            tem.setRadioscopia(false);
        }

        if (optBasica.isSelected()) {
            tem.setRadioB(true);
        } else {
            tem.setRadioB(false);
        }
        if (optPortuaria.isSelected()) {
            tem.setRadio(true);
        } else {
            tem.setRadio(false);
        }

        if (checkVacaciones.isSelected()) {
            tem.setVacaciones(true);
        } else {
            tem.setVacaciones(false);
        }
        Obj.claves.put(txtClave.getText(), tem);

    }//GEN-LAST:event_btnGuardarClaveActionPerformed

    private void checkRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkRadioStateChanged

        if (checkRadio.isSelected()) {
            optBasica.setEnabled(true);
            optPortuaria.setEnabled(true);
        } else {
            optBasica.setEnabled(false);
            optPortuaria.setEnabled(false);
        }
    }//GEN-LAST:event_checkRadioStateChanged

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed

        if (evt.getKeyCode() == 10) {
            if (Obj.claves.get(txtClave.getText()) != null) {
                Dias clave = Obj.claves.get(txtClave.getText());
                txtServicio1.setText(clave.getServicio1());
                txtServicio2.setText(clave.getServicio2());
                txtSalida1.setText(clave.getSalida1());
                txtSalida2.setText(clave.getSalida2());
                txtEntrada1.setText(clave.getEntrada1());
                txtEntrada2.setText(clave.getEntrada2());
                checkArma.setSelected(clave.isArma());
                checkFestivo.setSelected(clave.isFestivo());
                checkRadio.setSelected(clave.isRadioscopia());
                optPortuaria.setSelected(clave.isRadio());
                optBasica.setSelected(clave.isRadioB());
                checkVacaciones.setSelected(clave.isVacaciones());
                txtClave.setText("");
                insertar();
            }
        }
    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtServicio1.setText("");
        txtServicio2.setText("");
        txtSalida1.setText("");
        txtSalida2.setText("");
        txtEntrada1.setText("");
        txtEntrada2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBorrarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClaveActionPerformed
        // TODO add your handling code here:
        Obj.claves.remove(txtClave.getText());
        txtClave.setText("");
    }//GEN-LAST:event_btnBorrarClaveActionPerformed
    private void mostrar() {
        calendario = new GregorianCalendar(Obj.anio, Obj.mesActual, Obj.diaActual + 1);
        diaSem = calendario.get(Calendar.DAY_OF_WEEK);
        if (diaSem == 1 || diaSem == 7){
           Obj.mes[Obj.mesActual].dia[Obj.diaActual].setFestivo(true);
        }
        lblFecha.setText(diaSemana[diaSem - 1] + " " + (Obj.diaActual + 1) + " de " + nombreMeses[Obj.mesActual]);
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
        checkVacaciones.setSelected(Obj.mes[Obj.mesActual].dia[Obj.diaActual].isVacaciones());
    }

    public void insertar() {
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setServicio1(txtServicio1.getText());
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setServicio2(txtServicio2.getText());
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setEntrada1(txtEntrada1.getText().replace('.', ':'));
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setEntrada2(txtEntrada2.getText().replace('.', ':'));
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setSalida1(txtSalida1.getText().replace('.', ':'));
        Obj.mes[Obj.mesActual].dia[Obj.diaActual].setSalida2(txtSalida2.getText().replace('.', ':'));
        if (checkArma.isSelected()) {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setArma(true);
        } else {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setArma(false);
        }
        if (checkFestivo.isSelected()) {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setFestivo(true);
        } else {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setFestivo(false);
        }

        if (checkRadio.isSelected()) {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioscopia(true);
        } else {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioscopia(false);
        }

        if (optBasica.isSelected()) {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioB(true);
        } else {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadioB(false);
        }
        if (optPortuaria.isSelected()) {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadio(true);
        } else {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setRadio(false);
        }

        if (checkVacaciones.isSelected()) {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setVacaciones(true);
        } else {
            Obj.mes[Obj.mesActual].dia[Obj.diaActual].setVacaciones(false);
        }

        if (Obj.diaActual < Obj.mes[Obj.mesActual].getN() - 1) {
            Obj.diaActual++;
        }
        mostrar();
        txtClave.setText("");
        Obj.guardado = false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrarClave;
    private javax.swing.JButton btnGuardarClave;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox checkArma;
    private javax.swing.JCheckBox checkFestivo;
    private javax.swing.JCheckBox checkRadio;
    private javax.swing.JCheckBox checkVacaciones;
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
