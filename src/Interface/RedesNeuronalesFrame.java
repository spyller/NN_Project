package Interface;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import Source.*;

public class RedesNeuronalesFrame extends javax.swing.JFrame {

    RedesNeuronales Red = new RedesNeuronales();

    /**
     * Creates new form RedesNeuronalesFrame
     */
    public RedesNeuronalesFrame() {
        initComponents();
        this.dibujarGuias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zona = new java.awt.Canvas();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        alfa = new javax.swing.JTextField();
        errorMeta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entrenarButton = new javax.swing.JButton();
        evaluarButton = new javax.swing.JButton();
        zonaSalida = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Redes Neuronales");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        zona.setBackground(new java.awt.Color(253, 250, 247));
        zona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zona.setEnabled(false);
        zona.setName("zona"); // NOI18N
        zona.setPreferredSize(new java.awt.Dimension(100, 140));
        zona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                zonaMousePressed(evt);
            }
        });
        zona.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                zonaMouseMoved(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("REDES NEURONALES");

        label2.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        label2.setText("Entrada");

        label3.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        label3.setText("Salida");

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel1.setText("Factor de aprendizaje:");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel2.setText("Error mínimo:");

        jLabel3.setText("<html>\nAplicación que hace uso de una red neuronal para reconocer letras a partir de <br>una entrada a mano alzada.\n</html>");

        entrenarButton.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        entrenarButton.setText("Entrenar");
        entrenarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrenarButtonActionPerformed(evt);
            }
        });

        evaluarButton.setText("Evaluar");
        evaluarButton.setEnabled(false);
        evaluarButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                evaluarButtonMouseMoved(evt);
            }
        });
        evaluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarButtonActionPerformed(evt);
            }
        });

        zonaSalida.setBackground(new java.awt.Color(253, 250, 247));
        zonaSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zonaSalida.setName("zona"); // NOI18N
        zonaSalida.setPreferredSize(new java.awt.Dimension(100, 140));
        zonaSalida.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                zonaSalidaMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                .addComponent(errorMeta)
                                                .addComponent(alfa)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(entrenarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(59, 59, 59)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(zonaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(125, 125, 125)
                                                        .addComponent(evaluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(errorMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(zonaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(evaluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(entrenarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void evaluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarButtonActionPerformed
        evaluarButton.setEnabled(false);
        System.out.print("Evaluar...");

        Red.Calcular();

        dibujarSalida(Red.getMatrizSalida());
        // Reiniciar la matriz.
        for (int j = 0; j <= 34; j++) {
            Red.getMatriz()[j] = 0;
        }
        zona.repaint();
        System.out.println("[OK]");
        evaluarButton.setEnabled(true);
    }//GEN-LAST:event_evaluarButtonActionPerformed

    private void entrenarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrenarButtonActionPerformed
        entrenarButton.setEnabled(false);
        alfa.setEnabled(false);
        errorMeta.setEnabled(false);
        System.out.print("Entrenar...");

        double[][] matrixP = {{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0},
        {1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0},
        {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0}};

        String[] nombres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        Red.setMatPatrones(matrixP);

        Red.iniObjetivos();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 35; j++) {
                Red.getMatriz()[j] = matrixP[i][j];
            }
            Red.agregarPatron(nombres[i]);
        }

        // AQUI EL ENTRENAMIENTO
        Red.Entrenar(Double.parseDouble(alfa.getText()), Double.parseDouble(errorMeta.getText()));

        evaluarButton.setEnabled(true);
        zona.setEnabled(true);
        dibujarGuias();
        System.out.println("[OK]");
    }//GEN-LAST:event_entrenarButtonActionPerformed

    private void zonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zonaMousePressed
        /**
         * AREA DE DIBUJO: MOUSE PRESIONADO
         */
        this.pintarCasilla(evt.getX(), evt.getY());
    }//GEN-LAST:event_zonaMousePressed

    private void zonaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zonaMouseMoved
        this.dibujarGuias();
    }//GEN-LAST:event_zonaMouseMoved

    private void zonaSalidaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zonaSalidaMouseMoved
        this.dibujarGuias();
    }//GEN-LAST:event_zonaSalidaMouseMoved

    private void evaluarButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evaluarButtonMouseMoved
        this.dibujarGuias();
    }//GEN-LAST:event_evaluarButtonMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.dibujarGuias();
    }//GEN-LAST:event_formMouseMoved

    private void dibujarGuias() {
        this.dibujarGuias(zona);
        this.dibujarGuias(zonaSalida);
    }

    private void dibujarGuias(Canvas zona) {
        Graphics g = zona.getGraphics();
        g.setColor(Color.red);
        g.drawLine(0, 0, 0, 140);
        g.drawLine(20, 0, 20, 140);
        g.drawLine(40, 0, 40, 140);
        g.drawLine(60, 0, 60, 140);
        g.drawLine(80, 0, 80, 140);
        g.drawLine(99, 0, 99, 140);

        g.drawLine(0, 0, 100, 0);
        g.drawLine(0, 20, 100, 20);
        g.drawLine(0, 40, 100, 40);
        g.drawLine(0, 60, 100, 60);
        g.drawLine(0, 80, 100, 80);
        g.drawLine(0, 100, 100, 100);
        g.drawLine(0, 120, 100, 120);
        g.drawLine(0, 139, 100, 139);
        g.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alfa;
    private javax.swing.JButton entrenarButton;
    private javax.swing.JTextField errorMeta;
    private javax.swing.JButton evaluarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Canvas zona;
    private java.awt.Canvas zonaSalida;
    // End of variables declaration//GEN-END:variables

    private void pintarCasilla(int fX, int fY) {

        Graphics g = zona.getGraphics();

        /*Código para llenar el vector de entrada
         Según la posición del puntero se determina la zona y se pone 1 o 0 en el
         vector correspondiente*/
        //Fila1
        if ((fY > 0 && fY <= 20)) {
            if (fX > 0 && fX <= 20) {
                if (Red.getMatriz()[0] == 1) {
                    Red.getMatriz()[0] = 0;
                    g.clearRect(0, 0, 20, 20);
                } else {
                    Red.getMatriz()[0] = 1;
                    g.fillRect(0, 0, 20, 20);
                }
            }
            if (fX > 20 && fX <= 40) {
                if (Red.getMatriz()[1] == 1) {
                    Red.getMatriz()[1] = 0;
                    g.clearRect(20, 0, 20, 20);
                } else {
                    Red.getMatriz()[1] = 1;
                    g.fillRect(20, 0, 20, 20);
                }
            }

            if (fX > 40 && fX <= 60) {
                if (Red.getMatriz()[2] == 1) {
                    Red.getMatriz()[2] = 0;
                    g.clearRect(40, 0, 20, 20);
                } else {
                    Red.getMatriz()[2] = 1;
                    g.fillRect(40, 0, 20, 20);
                }
            }
            if (fX > 60 && fX <= 80) {
                if (Red.getMatriz()[3] == 1) {
                    Red.getMatriz()[3] = 0;
                    g.clearRect(60, 0, 20, 20);
                } else {
                    Red.getMatriz()[3] = 1;
                    g.fillRect(60, 0, 20, 20);
                }

            }
            if (fX > 80 && fX <= 100) {
                if (Red.getMatriz()[4] == 1) {
                    Red.getMatriz()[4] = 0;
                    g.clearRect(80, 0, 20, 20);
                } else {
                    Red.getMatriz()[4] = 1;
                    g.fillRect(80, 0, 20, 20);
                }
            }
        }
        //Fila2
        if ((fY > 20 && fY <= 40)) {
            if (fX > 0 && fX <= 20) {
                if (Red.getMatriz()[5] == 1) {
                    Red.getMatriz()[5] = 0;
                    g.clearRect(0, 20, 20, 20);
                } else {
                    Red.getMatriz()[5] = 1;
                    g.fillRect(0, 20, 20, 20);
                }
            }
            if (fX > 20 && fX <= 40) {
                if (Red.getMatriz()[6] == 1) {
                    Red.getMatriz()[6] = 0;
                    g.clearRect(20, 20, 20, 20);
                } else {
                    Red.getMatriz()[6] = 1;
                    g.fillRect(20, 20, 20, 20);
                }
            }

            if (fX > 40 && fX <= 60) {
                if (Red.getMatriz()[7] == 1) {
                    Red.getMatriz()[7] = 0;
                    g.clearRect(40, 20, 20, 20);
                } else {
                    Red.getMatriz()[7] = 1;
                    g.fillRect(40, 20, 20, 20);
                }
            }
            if (fX > 60 && fX <= 80) {
                if (Red.getMatriz()[8] == 1) {
                    Red.getMatriz()[8] = 0;
                    g.clearRect(60, 20, 20, 20);
                } else {
                    Red.getMatriz()[8] = 1;
                    g.fillRect(60, 20, 20, 20);
                }

            }
            if (fX > 80 && fX <= 100) {
                if (Red.getMatriz()[9] == 1) {
                    Red.getMatriz()[9] = 0;
                    g.clearRect(80, 20, 20, 20);
                } else {
                    Red.getMatriz()[9] = 1;
                    g.fillRect(80, 20, 20, 20);
                }
            }
        }
        //Fila3
        if ((fY > 40 && fY <= 60)) {
            if (fX > 0 && fX <= 20) {
                if (Red.getMatriz()[10] == 1) {
                    Red.getMatriz()[10] = 0;
                    g.clearRect(0, 40, 20, 20);
                } else {
                    Red.getMatriz()[10] = 1;
                    g.fillRect(0, 40, 20, 20);
                }
            }
            if (fX > 20 && fX <= 40) {
                if (Red.getMatriz()[11] == 1) {
                    Red.getMatriz()[11] = 0;
                    g.clearRect(20, 40, 20, 20);
                } else {
                    Red.getMatriz()[11] = 1;
                    g.fillRect(20, 40, 20, 20);
                }
            }

            if (fX > 40 && fX <= 60) {
                if (Red.getMatriz()[12] == 1) {
                    Red.getMatriz()[12] = 0;
                    g.clearRect(40, 40, 20, 20);
                } else {
                    Red.getMatriz()[12] = 1;
                    g.fillRect(40, 40, 20, 20);
                }
            }
            if (fX > 60 && fX <= 80) {
                if (Red.getMatriz()[13] == 1) {
                    Red.getMatriz()[13] = 0;
                    g.clearRect(60, 40, 20, 20);
                } else {
                    Red.getMatriz()[13] = 1;
                    g.fillRect(60, 40, 20, 20);
                }

            }
            if (fX > 80 && fX <= 100) {
                if (Red.getMatriz()[14] == 1) {
                    Red.getMatriz()[14] = 0;
                    g.clearRect(80, 40, 20, 20);
                } else {
                    Red.getMatriz()[14] = 1;
                    g.fillRect(80, 40, 20, 20);
                }
            }
        }
        //Fila4
        if ((fY > 60 && fY <= 80)) {
            if (fX > 0 && fX <= 20) {
                if (Red.getMatriz()[15] == 1) {
                    Red.getMatriz()[15] = 0;
                    g.clearRect(0, 60, 20, 20);
                } else {
                    Red.getMatriz()[15] = 1;
                    g.fillRect(0, 60, 20, 20);
                }
            }
            if (fX > 20 && fX <= 40) {
                if (Red.getMatriz()[16] == 1) {
                    Red.getMatriz()[16] = 0;
                    g.clearRect(20, 60, 20, 20);
                } else {
                    Red.getMatriz()[16] = 1;
                    g.fillRect(20, 60, 20, 20);
                }
            }

            if (fX > 40 && fX <= 60) {
                if (Red.getMatriz()[17] == 1) {
                    Red.getMatriz()[17] = 0;
                    g.clearRect(40, 60, 20, 20);
                } else {
                    Red.getMatriz()[17] = 1;
                    g.fillRect(40, 60, 20, 20);
                }
            }
            if (fX > 60 && fX <= 80) {
                if (Red.getMatriz()[18] == 1) {
                    Red.getMatriz()[18] = 0;
                    g.clearRect(60, 60, 20, 20);
                } else {
                    Red.getMatriz()[18] = 1;
                    g.fillRect(60, 60, 20, 20);
                }

            }
            if (fX > 80 && fX <= 100) {
                if (Red.getMatriz()[19] == 1) {
                    Red.getMatriz()[19] = 0;
                    g.clearRect(80, 60, 20, 20);
                } else {
                    Red.getMatriz()[19] = 1;
                    g.fillRect(80, 60, 20, 20);
                }
            }
        }
        //Fila5
        if ((fY > 80 && fY <= 100)) {
            if (fX > 0 && fX <= 20) {
                if (Red.getMatriz()[20] == 1) {
                    Red.getMatriz()[20] = 0;
                    g.clearRect(0, 80, 20, 20);
                } else {
                    Red.getMatriz()[20] = 1;
                    g.fillRect(0, 80, 20, 20);
                }
            }
            if (fX > 20 && fX <= 40) {
                if (Red.getMatriz()[21] == 1) {
                    Red.getMatriz()[21] = 0;
                    g.clearRect(20, 80, 20, 20);
                } else {
                    Red.getMatriz()[21] = 1;
                    g.fillRect(20, 80, 20, 20);
                }
            }

            if (fX > 40 && fX <= 60) {
                if (Red.getMatriz()[22] == 1) {
                    Red.getMatriz()[22] = 0;
                    g.clearRect(40, 80, 20, 20);
                } else {
                    Red.getMatriz()[22] = 1;
                    g.fillRect(40, 80, 20, 20);
                }
            }
            if (fX > 60 && fX <= 80) {
                if (Red.getMatriz()[23] == 1) {
                    Red.getMatriz()[23] = 0;
                    g.clearRect(60, 80, 20, 20);
                } else {
                    Red.getMatriz()[23] = 1;
                    g.fillRect(60, 80, 20, 20);
                }

            }
            if (fX > 80 && fX <= 100) {
                if (Red.getMatriz()[24] == 1) {
                    Red.getMatriz()[24] = 0;
                    g.clearRect(80, 80, 20, 20);
                } else {
                    Red.getMatriz()[24] = 1;
                    g.fillRect(80, 80, 20, 20);
                }
            }
        }
        //Fila6
        if ((fY > 100 && fY <= 120)) {
            if (fX > 0 && fX <= 20) {
                if (Red.getMatriz()[25] == 1) {
                    Red.getMatriz()[25] = 0;
                    g.clearRect(0, 100, 20, 20);
                } else {
                    Red.getMatriz()[25] = 1;
                    g.fillRect(0, 100, 20, 20);
                }
            }
            if (fX > 20 && fX <= 40) {
                if (Red.getMatriz()[26] == 1) {
                    Red.getMatriz()[26] = 0;
                    g.clearRect(20, 100, 20, 20);
                } else {
                    Red.getMatriz()[26] = 1;
                    g.fillRect(20, 100, 20, 20);
                }
            }
            if (fX > 40 && fX <= 60) {
                if (Red.getMatriz()[27] == 1) {
                    Red.getMatriz()[27] = 0;
                    g.clearRect(40, 100, 20, 20);
                } else {
                    Red.getMatriz()[27] = 1;
                    g.fillRect(40, 100, 20, 20);
                }
            }
            if (fX > 60 && fX <= 80) {
                if (Red.getMatriz()[28] == 1) {
                    Red.getMatriz()[28] = 0;
                    g.clearRect(60, 100, 20, 20);
                } else {
                    Red.getMatriz()[28] = 1;
                    g.fillRect(60, 100, 20, 20);
                }
            }
            if (fX > 80 && fX <= 100) {
                if (Red.getMatriz()[29] == 1) {
                    Red.getMatriz()[29] = 0;
                    g.clearRect(80, 100, 20, 20);
                } else {
                    Red.getMatriz()[29] = 1;
                    g.fillRect(80, 100, 20, 20);
                }
            }
        }
        //Fila7
        if ((fY > 120 && fY <= 140)) {
            if (fX > 0 && fX <= 20) {
                if (Red.getMatriz()[30] == 1) {
                    Red.getMatriz()[30] = 0;
                    g.clearRect(0, 120, 20, 20);
                } else {
                    Red.getMatriz()[30] = 1;
                    g.fillRect(0, 120, 20, 20);
                }
            }
            if (fX > 20 && fX <= 40) {
                if (Red.getMatriz()[31] == 1) {
                    Red.getMatriz()[31] = 0;
                    g.clearRect(20, 120, 20, 20);
                } else {
                    Red.getMatriz()[31] = 1;
                    g.fillRect(20, 120, 20, 20);
                }
            }

            if (fX > 40 && fX <= 60) {
                if (Red.getMatriz()[32] == 1) {
                    Red.getMatriz()[32] = 0;
                    g.clearRect(40, 120, 20, 20);
                } else {
                    Red.getMatriz()[32] = 1;
                    g.fillRect(40, 120, 20, 20);
                }
            }
            if (fX > 60 && fX <= 80) {
                if (Red.getMatriz()[33] == 1) {
                    Red.getMatriz()[33] = 0;
                    g.clearRect(60, 120, 20, 20);
                } else {
                    Red.getMatriz()[33] = 1;
                    g.fillRect(60, 120, 20, 20);
                }

            }
            if (fX > 80 && fX <= 100) {
                if (Red.getMatriz()[34] == 1) {
                    Red.getMatriz()[34] = 0;
                    g.clearRect(80, 120, 20, 20);
                } else {
                    Red.getMatriz()[34] = 1;
                    g.fillRect(80, 120, 20, 20);
                }
            }
        }
        g.dispose();
    }

    private void dibujarSalida(double[] matriz) {

        int i = 0;
        int ini = 0, end = 0;

        int dim = 20;
        Graphics g = zonaSalida.getGraphics();

        for (i = 0; i < 35; i++) {

            if (ini == 100) {
                end += dim;
                ini = 0;
            }
            g.clearRect(ini, end, dim, dim);
            if (matriz[i] == 1) {
                g.fillRect(ini, end, dim, dim);
            }
            ini += dim;
            dibujarGuias();
        }
        g.dispose();
    }

    public static void main(String[] args) {
        RedesNeuronalesFrame red = new RedesNeuronalesFrame();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                red.setVisible(true);

            }
        });
    }
}