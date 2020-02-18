package telas;

public class CalculoDelta extends javax.swing.JDialog {

    public CalculoDelta() {
        initComponents();
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        panel_1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_A = new javax.swing.JLabel();
        label_M6 = new javax.swing.JLabel();
        spinner_A = new javax.swing.JSpinner();
        label_C = new javax.swing.JLabel();
        spinner_B = new javax.swing.JSpinner();
        button_Calc = new javax.swing.JButton();
        spinner_C = new javax.swing.JSpinner();
        label_M1 = new javax.swing.JLabel();
        label_M2 = new javax.swing.JLabel();
        label_M3 = new javax.swing.JLabel();
        label_M4 = new javax.swing.JLabel();
        panel_1 = new javax.swing.JPanel();
        label_M7 = new javax.swing.JLabel();
        label_M8 = new javax.swing.JLabel();
        label_ResultDelta = new javax.swing.JLabel();
        label_ResultRaiz = new javax.swing.JLabel();
        label_B = new javax.swing.JLabel();
        label_M5 = new javax.swing.JLabel();
        button_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cálculo de Delta");
        setResizable(false);

        label_A.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_A.setForeground(new java.awt.Color(102, 102, 102));
        label_A.setText("A");

        label_M6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_M6.setText(".");

        spinner_A.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spinner_A.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_AStateChanged(evt);
            }
        });

        label_C.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_C.setForeground(new java.awt.Color(102, 102, 102));
        label_C.setText("C");

        spinner_B.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spinner_B.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_BStateChanged(evt);
            }
        });

        button_Calc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        button_Calc.setText("<html>Calcular &Delta;<html>");
        button_Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CalcActionPerformed(evt);
            }
        });

        spinner_C.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spinner_C.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_CStateChanged(evt);
            }
        });

        label_M1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_M1.setText("<html>X<sup>2</sup> +<html>");

        label_M2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_M2.setText("X +");

        label_M3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_M3.setText("= 0");

        label_M4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_M4.setText("<html>&Delta; =<html>");

        label_M7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_M7.setText("<html>Valor de &Delta;:<html>");

        label_M8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_M8.setText("Tipo de Raízes:");

        label_ResultDelta.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_ResultDelta.setText("0");

        label_ResultRaiz.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_ResultRaiz.setText("0");

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_M8)
                    .addComponent(label_M7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ResultDelta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_ResultRaiz, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_M7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_ResultDelta))
                .addGap(18, 18, 18)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_M8)
                    .addComponent(label_ResultRaiz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_B.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_B.setForeground(new java.awt.Color(102, 102, 102));
        label_B.setText("B");

        label_M5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_M5.setText("<html><sup>2</sup> - 4 .<html>");

        button_Close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Close.setText("Fechar");
        button_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(spinner_A, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(label_M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(spinner_B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(label_M2)
                                .addGap(5, 5, 5)
                                .addComponent(spinner_C, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(label_M3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button_Calc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_M4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(label_B)
                                        .addGap(5, 5, 5)
                                        .addComponent(label_M5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(label_A)
                                        .addGap(5, 5, 5)
                                        .addComponent(label_M6)))
                                .addGap(5, 5, 5)
                                .addComponent(label_C))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinner_B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_A, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_M2)
                    .addComponent(spinner_C, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_M3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_M4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_M5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_B)
                                .addComponent(label_A)
                                .addComponent(label_M6)
                                .addComponent(label_C)))))
                .addGap(25, 25, 25)
                .addComponent(button_Calc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spinner_AStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_AStateChanged
        //StateChanged é um evento que faz com que uma ação ocorra sempre que o conteúdo do Spinner é alterado.
        label_B.setText(spinner_A.getValue().toString());
        //Neste Caso, sempre que o Spinner sofrer alteração seu valor atual será mostrado no Label_B.
    }//GEN-LAST:event_spinner_AStateChanged

    private void spinner_BStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_BStateChanged
        label_A.setText(spinner_B.getValue().toString());
    }//GEN-LAST:event_spinner_BStateChanged

    private void button_CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CalcActionPerformed
        //Criação das variáveis para armazenamento de A, B e C
        int A = Integer.parseInt(spinner_A.getValue().toString());
        int B = Integer.parseInt(spinner_B.getValue().toString());
        int C = Integer.parseInt(spinner_C.getValue().toString());

        //Calculo de Delta e impressão dos resultados
        double Delta = Math.pow(B, 2) - 4 * A * C;
        label_ResultDelta.setText(String.format("%.1f", Delta));

        if(Delta < 0)       label_ResultRaiz.setText("Não existe raíz real");
        else if(Delta == 0) label_ResultRaiz.setText("Existe uma única raíz real");
        else                label_ResultRaiz.setText("Existem duas raízes reais");

        panel_1.setVisible(true);
    }//GEN-LAST:event_button_CalcActionPerformed

    private void spinner_CStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_CStateChanged
        label_C.setText(spinner_C.getValue().toString());
    }//GEN-LAST:event_spinner_CStateChanged

    private void button_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_button_CloseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoDelta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Calc;
    private javax.swing.JButton button_Close;
    private javax.swing.JLabel label_A;
    private javax.swing.JLabel label_B;
    private javax.swing.JLabel label_C;
    private javax.swing.JLabel label_M1;
    private javax.swing.JLabel label_M2;
    private javax.swing.JLabel label_M3;
    private javax.swing.JLabel label_M4;
    private javax.swing.JLabel label_M5;
    private javax.swing.JLabel label_M6;
    private javax.swing.JLabel label_M7;
    private javax.swing.JLabel label_M8;
    private javax.swing.JLabel label_ResultDelta;
    private javax.swing.JLabel label_ResultRaiz;
    private javax.swing.JPanel panel_1;
    private javax.swing.JSpinner spinner_A;
    private javax.swing.JSpinner spinner_B;
    private javax.swing.JSpinner spinner_C;
    // End of variables declaration//GEN-END:variables
}