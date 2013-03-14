package vnomina;

import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author cahoperro
 */
public class Principal extends javax.swing.JFrame {

    int anio;
    Objeto principal;
    Datos d;
    MeterDatos meteDato;
    String fichero, textomes;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        chkBuena.setVisible(false);
        chkVieja.setVisible(false);
        selectorMes.setEnabled(false);
        btnCalcular.setEnabled(false);
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
        btnCambio = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnAcerca = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        selectorMes = new javax.swing.JComboBox();
        panelGeneral = new javax.swing.JTabbedPane();
        javax.swing.JPanel panelNomina = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        radioQuinquenios = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        javax.swing.JCheckBox chkPagas = new javax.swing.JCheckBox();
        chkBuena = new javax.swing.JCheckBox();
        chkVieja = new javax.swing.JCheckBox();
        panelHoras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vnomina");
        setName("principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(825, 535));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        barra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        barra.setFloatable(false);
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
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        barra.add(btnAbrir);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/cerrar.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        barra.add(btnCerrar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/modificar.png"))); // NOI18N
        btnModificar.setToolTipText("Meter horarios");
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
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        barra.add(btnGuardar);

        btnGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/guardarComo.png"))); // NOI18N
        btnGuardarComo.setToolTipText("Guardar como");
        btnGuardarComo.setFocusable(false);
        btnGuardarComo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarComo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });
        barra.add(btnGuardarComo);

        btnCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/cambio.png"))); // NOI18N
        btnCambio.setToolTipText("Cambiar los datos iniciales");
        btnCambio.setFocusable(false);
        btnCambio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });
        barra.add(btnCambio);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/imprimir.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        barra.add(btnImprimir);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/ayuda.png"))); // NOI18N
        btnAyuda.setToolTipText("Ayuda");
        btnAyuda.setFocusable(false);
        btnAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        barra.add(btnAyuda);

        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/acerca.png"))); // NOI18N
        btnAcerca.setToolTipText("Acerca de");
        btnAcerca.setFocusable(false);
        btnAcerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        barra.add(btnAcerca);

        lblInfo.setFont(new java.awt.Font("DejaVu Sans", 3, 16)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 0, 255));
        lblInfo.setText("Ningun documento abierto");

        selectorMes.setMaximumRowCount(12);
        selectorMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        selectorMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorMesItemStateChanged(evt);
            }
        });

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
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        grupo.add(radioQuinquenios);
        radioQuinquenios.setSelected(true);
        radioQuinquenios.setText("Quinquenios");

        grupo.add(jRadioButton1);
        jRadioButton1.setText("Trienios");

        chkPagas.setSelected(true);
        chkPagas.setText("Prorrateo P.extras");

        chkBuena.setText("Nochebuena");

        chkVieja.setText("Nochevieja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioQuinquenios)
                    .addComponent(jRadioButton1)
                    .addComponent(chkPagas)
                    .addComponent(chkBuena)
                    .addComponent(chkVieja))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(radioQuinquenios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPagas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkBuena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkVieja)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelNominaLayout = new javax.swing.GroupLayout(panelNomina);
        panelNomina.setLayout(panelNominaLayout);
        panelNominaLayout.setHorizontalGroup(
            panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNominaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelNominaLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalDevengado)
                                    .addComponent(lblVestuario)
                                    .addComponent(lblTransporte)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNominaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNocturnidad)
                                    .addComponent(lblPeligrosidad)
                                    .addComponent(lblFestivos)
                                    .addComponent(lblAntiguedad)
                                    .addComponent(lblPagas)
                                    .addComponent(lblHorasExtras)
                                    .addComponent(lblSalarioBase))
                                .addGap(2, 2, 2)))))
                .addGap(110, 110, 110)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComunes)
                            .addComponent(lblDesempleo)
                            .addComponent(lblFP)
                            .addComponent(lblTolalAportaciones)
                            .addComponent(lblIrpf)
                            .addComponent(lblTotalDeducir)
                            .addComponent(lblLiquido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addComponent(txtIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNominaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(24, 24, 24))
        );
        panelNominaLayout.setVerticalGroup(
            panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNominaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelNominaLayout.createSequentialGroup()
                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel24)
                                .addComponent(lblComunes))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel25)
                                .addComponent(lblDesempleo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel26)
                                .addComponent(lblFP))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel27)
                                .addComponent(lblTolalAportaciones))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel28)
                                .addComponent(lblIrpf))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel29)
                                .addComponent(lblTotalDeducir))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addComponent(lblSalarioBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHorasExtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAntiguedad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFestivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPeligrosidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNocturnidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPagas)))
                .addGap(28, 28, 28)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(txtIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTransporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblVestuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(lblLiquido))
                    .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblTotalDevengado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addContainerGap())
        );

        panelGeneral.addTab("Mostrar nomina", panelNomina);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Dia", "Servicio 1", "Ent", "Sal", "Servicio 2", "Ent", "Sal", "Horas", "Nocturnas", "Festivas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setColumnSelectionAllowed(true);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(35);
        tabla.getColumnModel().getColumn(0).setMaxWidth(35);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(180);

        javax.swing.GroupLayout panelHorasLayout = new javax.swing.GroupLayout(panelHoras);
        panelHoras.setLayout(panelHorasLayout);
        panelHorasLayout.setHorizontalGroup(
            panelHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        panelHorasLayout.setVerticalGroup(
            panelHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelGeneral.addTab("Mostrar horarios", panelHoras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblInfo)
                        .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGeneral)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        String p = JOptionPane.showInputDialog("Introduce el año");
        try {
            anio = Integer.parseInt(p);
            meteDato = new MeterDatos(this);
            d = new Datos();
            principal = new Objeto(d, anio);
            selectorMes.setEnabled(true);
            btnCalcular.setEnabled(true);
        } catch (NumberFormatException ex) {
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (principal != null) {
            new MeterHoras(principal);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (principal == null) {
            JFileChooser selector = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos chp", "chp");
            selector.setFileFilter(filtro);
            try {
                if (selector.showOpenDialog(null) == selector.APPROVE_OPTION) {
                    fichero = selector.getSelectedFile().toString();
                    FileInputStream fis = new FileInputStream(fichero);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    //El método readObject() recupera el objeto
                    principal = (Objeto) ois.readObject();
                    ois.close();
                    anio = principal.anio;
                    selectorMes.setSelectedIndex(principal.mesActual);
                    selectorMes.setEnabled(true);
                    btnCalcular.setEnabled(true);
                    mostrarTitulo();
                    mostrarResultado();
                }
            } catch (HeadlessException | IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "Error al abrir el archivo",
                        "Aviso",
                        JOptionPane.ERROR_MESSAGE);
                fichero = null;
            }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Ya hay un archivo abierto",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //codigo cerrar

        if (principal != null && !principal.guardado) {
            int g = JOptionPane.showConfirmDialog(null, "¿Quieres guardar antes de cerrar?");
            if (g == 0) {
                guardar();
                principal = null;
                reiniciar();
            } else {
                principal = null;
                reiniciar();
            }
        } else {
            principal = null;
            reiniciar();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //codigo guardar
        if (principal != null) {
            if (fichero == null) {
                guardarComo();
            } else {
                guardar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        //codigo guardar como
        if (principal != null) {
            guardarComo();
        }
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // Codigo de imprimir
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // Codigo de ayuda
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
        new AcercaDe();
    }//GEN-LAST:event_btnAcercaActionPerformed

    private void selectorMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorMesItemStateChanged

        if (selectorMes.getSelectedIndex() == 11) {
            chkBuena.setVisible(true);
            chkVieja.setVisible(true);
        } else {
            chkBuena.setVisible(false);
            chkVieja.setVisible(false);
        }
        principal.mesActual = selectorMes.getSelectedIndex();
        mostrarTitulo();
        mostrarResultado();
    }//GEN-LAST:event_selectorMesItemStateChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        mostrarResultado();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (principal != null && !principal.guardado) {
            int g = JOptionPane.showConfirmDialog(null, "¿Quieres guardar antes de salir?");
            if (g == 0) {
                if (principal != null) {
                    if (fichero == null) {
                        guardarComo();
                    } else {
                        guardar();
                    }
                }
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        // TODO add your handling code here:
        if (principal != null){
           meteDato = new MeterDatos(this);
        }
    }//GEN-LAST:event_btnCambioActionPerformed
    private void guardarComo() {
        JFileChooser selector = new JFileChooser();
        try {
            if (selector.showSaveDialog(null) == selector.APPROVE_OPTION) {
                fichero = selector.getSelectedFile().toString();
                //Creamos el archivo
                FileOutputStream fs = new FileOutputStream(fichero + ".chp");
                //Esta clase tiene el método writeObject() que necesitamos
                ObjectOutputStream os = new ObjectOutputStream(fs);
                //El método writeObject() serializa el objeto y lo escribe en el archivo
                os.writeObject(principal);
                //Hay que cerrar siempre el archivo
                os.close();
                principal.guardado = true;
            }
        } catch (HeadlessException | IOException e) {
            fichero = null;
            JOptionPane.showMessageDialog(null,
                    "Errror al guardar el archivo",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardar() {

        try {
            FileOutputStream fs = new FileOutputStream(fichero);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(principal);
            os.close();
            principal.guardado = true;
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Errror al guardar el archivo",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarTitulo() {
        int texto = anio;
        textomes = selectorMes.getSelectedItem().toString();
        lblInfo.setText(textomes + " de " + texto);
    }

    public void mostrarResultado() {
        lblSalarioBase.setText("" + principal.datos.getSalarioBase());
        lblPeligrosidad.setText("" + principal.datos.getPeligro());
        lblTransporte.setText("" + principal.datos.getTransporte());
        lblVestuario.setText("" + principal.datos.getVestuario());
        
    }

    private void reiniciar() {
        lblSalarioBase.setText("00.00");
        lblPeligrosidad.setText("00.00");
        lblTransporte.setText("00.00");
        lblVestuario.setText("00.00");
        lblAntiguedad.setText("00.00");
        lblComunes.setText("00.00");
        lblDesempleo.setText("00.00");
        lblFP.setText("00.00");
        lblFestivos.setText("00.00");
        lblHorasExtras.setText("00.00");
        lblInfo.setText("Ningun documento abierto");
        lblIrpf.setText("00.00");
        lblLiquido.setText("000.00");
        lblNocturnidad.setText("00.00");
        lblPagas.setText("00.00");
        lblTolalAportaciones.setText("00.00");
        lblTotalDeducir.setText("00.00");
        lblTotalDevengado.setText("00.00");
        selectorMes.setEnabled(false);
        btnCalcular.setEnabled(false);
    }

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
                Principal inicio = new Principal();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barra;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkBuena;
    private javax.swing.JCheckBox chkVieja;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTabbedPane panelGeneral;
    private javax.swing.JPanel panelHoras;
    private javax.swing.JRadioButton radioQuinquenios;
    private javax.swing.JComboBox selectorMes;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtIrpf;
    // End of variables declaration//GEN-END:variables
}
