package vnomina;

/**
 *
 * @author cahoperro
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        barra = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarComo = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnAcerca = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        selectorMes = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblSalarioBase = new javax.swing.JLabel();
        lblHorasExtras = new javax.swing.JLabel();
        lblAntiguedad = new javax.swing.JLabel();
        lblFestivos = new javax.swing.JLabel();
        lblPeligrosidad = new javax.swing.JLabel();
        lblNocturnidad = new javax.swing.JLabel();
        lblPagas = new javax.swing.JLabel();
        lblTransporte = new javax.swing.JLabel();
        lblVestuario = new javax.swing.JLabel();
        lblTotalDevengado = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblComunes = new javax.swing.JLabel();
        lblDesempleo = new javax.swing.JLabel();
        lblFP = new javax.swing.JLabel();
        lblTolalAportaciones = new javax.swing.JLabel();
        lblIrpf = new javax.swing.JLabel();
        lblTotalDeducir = new javax.swing.JLabel();
        lblLiquido = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIrpf = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        javax.swing.JCheckBox chkPagas = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vnomina");
        setName("principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 580));
        setResizable(false);

        barra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        barra.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        barra.add(btnNuevo);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/abrir.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barra.add(btnAbrir);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/cerrar.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barra.add(btnCerrar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/modificar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        barra.add(btnModificar);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barra.add(btnGuardar);

        btnGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/guardarComo.png"))); // NOI18N
        btnGuardarComo.setToolTipText("Guardar como");
        btnGuardarComo.setFocusable(false);
        btnGuardarComo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarComo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barra.add(btnGuardarComo);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/imprimir.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barra.add(btnImprimir);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/ayuda.png"))); // NOI18N
        btnAyuda.setToolTipText("Ayuda");
        btnAyuda.setFocusable(false);
        btnAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barra.add(btnAyuda);

        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/acerca.png"))); // NOI18N
        btnAcerca.setToolTipText("Acerca de");
        btnAcerca.setFocusable(false);
        btnAcerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barra.add(btnAcerca);

        lblInfo.setFont(new java.awt.Font("DejaVu Sans", 3, 16)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 0, 255));
        lblInfo.setText("Ningun documento abierto");

        selectorMes.setMaximumRowCount(12);
        selectorMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("PERCEPCIONES SALARIALES:");

        jLabel2.setText("Salario base");

        jLabel3.setText("Horas extras");

        jLabel4.setText("Antiguedad");

        jLabel5.setText("Plus festivos");

        jLabel6.setText("Plus peligrosidad");

        jLabel7.setText("Plus nocturnidad");

        jLabel8.setText("P.P.Pagas extras");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel9.setText("PERCEPCIONES NO SALARIALES:");

        jLabel10.setText("Plus transporte");

        jLabel11.setText("Plus vestuario");

        jLabel12.setText("Total devengado");

        lblSalarioBase.setText("00.00");

        lblHorasExtras.setText("00.00");

        lblAntiguedad.setText("00.00");

        lblFestivos.setText("00.00");

        lblPeligrosidad.setText("00.00");

        lblNocturnidad.setText("00.00");

        lblPagas.setText("00.00");

        lblTransporte.setText("00.00");

        lblVestuario.setText("00.00");

        lblTotalDevengado.setText("00.00");

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel23.setText("DEDUCCIONES:");

        jLabel24.setText("C.comunes");

        jLabel25.setText("Desempleo");

        jLabel26.setText("F.profesional");

        jLabel27.setText("Total aportaciones");

        jLabel28.setText("IRPF");

        jLabel29.setText("Total a deducir");

        jLabel30.setText("Liquido a percibir");

        lblComunes.setText("00.00");

        lblDesempleo.setText("00.00");

        lblFP.setText("00.00");

        lblTolalAportaciones.setText("00.00");

        lblIrpf.setText("00.00");

        lblTotalDeducir.setText("00.00");

        lblLiquido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLiquido.setForeground(new java.awt.Color(0, 51, 51));
        lblLiquido.setText("000.00");

        jLabel13.setText("Introduce el IRPF");

        txtIrpf.setColumns(3);

        btnCalcular.setText("Calcular");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalDevengado)
                                    .addComponent(lblVestuario)
                                    .addComponent(lblTransporte)
                                    .addComponent(lblNocturnidad)
                                    .addComponent(lblPeligrosidad)
                                    .addComponent(lblFestivos)
                                    .addComponent(lblAntiguedad)
                                    .addComponent(lblHorasExtras)
                                    .addComponent(lblSalarioBase)
                                    .addComponent(lblPagas)))
                            .addComponent(jLabel8))
                        .addGap(237, 237, 237)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel13)
                            .addComponent(jLabel30))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblComunes)
                                .addComponent(lblDesempleo)
                                .addComponent(lblFP)
                                .addComponent(lblTolalAportaciones)
                                .addComponent(lblIrpf)
                                .addComponent(lblTotalDeducir)
                                .addComponent(lblLiquido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSalarioBase)
                    .addComponent(jLabel24)
                    .addComponent(lblComunes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblHorasExtras)
                    .addComponent(jLabel25)
                    .addComponent(lblDesempleo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAntiguedad)
                    .addComponent(jLabel26)
                    .addComponent(lblFP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblFestivos)
                    .addComponent(jLabel27)
                    .addComponent(lblTolalAportaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblPeligrosidad)
                    .addComponent(jLabel28)
                    .addComponent(lblIrpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblNocturnidad)
                    .addComponent(jLabel29)
                    .addComponent(lblTotalDeducir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblPagas))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(txtIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTransporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblVestuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(lblLiquido))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblTotalDevengado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnCalcular))
        );

        chkPagas.setSelected(true);
        chkPagas.setText("Prorrateo P.extras");

        grupo.add(jRadioButton1);
        jRadioButton1.setText("Trienios");

        grupo.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Quinquenios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(chkPagas)
                .addGap(18, 18, 18)
                .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfo)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkPagas)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18)
                .addComponent(lblInfo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        new MeterDatos().setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        new MeterHoras().setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barra;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblAntiguedad;
    private javax.swing.JLabel lblComunes;
    private javax.swing.JLabel lblDesempleo;
    private javax.swing.JLabel lblFP;
    private javax.swing.JLabel lblFestivos;
    private javax.swing.JLabel lblHorasExtras;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblIrpf;
    private javax.swing.JLabel lblLiquido;
    private javax.swing.JLabel lblNocturnidad;
    private javax.swing.JLabel lblPagas;
    private javax.swing.JLabel lblPeligrosidad;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblTolalAportaciones;
    private javax.swing.JLabel lblTotalDeducir;
    private javax.swing.JLabel lblTotalDevengado;
    private javax.swing.JLabel lblTransporte;
    private javax.swing.JLabel lblVestuario;
    private javax.swing.JComboBox selectorMes;
    private javax.swing.JTextField txtIrpf;
    // End of variables declaration//GEN-END:variables
}
