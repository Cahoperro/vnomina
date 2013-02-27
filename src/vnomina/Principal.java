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
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vnomina");
        setName("principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 600));

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

        lblInfo.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        lblInfo.setText("Ningun documento abierto");

        selectorMes.setMaximumRowCount(12);
        selectorMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1034, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo)
                    .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox selectorMes;
    // End of variables declaration//GEN-END:variables
}
