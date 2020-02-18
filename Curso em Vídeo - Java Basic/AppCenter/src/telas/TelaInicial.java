package telas;

import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        //Nas propriedades do JFrame, vá em "code" e habilite a opção "Generate center" 
        //para que a janela seja iniciada no centro da tela do pc.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Titulo = new javax.swing.JLabel();
        label_SubTitulo = new javax.swing.JLabel();
        button_Delta = new javax.swing.JButton();
        button_For = new javax.swing.JButton();
        button_Vetor = new javax.swing.JButton();
        button_Genio = new javax.swing.JButton();
        button_Close = new javax.swing.JButton();
        button_Triangulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Curso em Video");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        label_Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Titulo.setText("Central de Aplicativos");

        label_SubTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_SubTitulo.setText("Curso em Video - Java para Iniciantes");

        button_Delta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Delta.setText("Cálculo de Delta");
        button_Delta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeltaActionPerformed(evt);
            }
        });

        button_For.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_For.setText("Contador For");
        button_For.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ForActionPerformed(evt);
            }
        });

        button_Vetor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Vetor.setText("Editor de Vetor");
        button_Vetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_VetorActionPerformed(evt);
            }
        });

        button_Genio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Genio.setText("Gênio - Adivinhe um número");
        button_Genio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_GenioActionPerformed(evt);
            }
        });

        button_Close.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Close.setText("Fechar Aplicação");
        button_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CloseActionPerformed(evt);
            }
        });

        button_Triangulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Triangulo.setText("Tipo de Triângulo");
        button_Triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_SubTitulo)
                    .addComponent(label_Titulo)
                    .addComponent(button_Delta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_For, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Vetor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Genio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_SubTitulo)
                .addGap(18, 18, 18)
                .addComponent(button_Genio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_Delta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_For, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_Vetor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_DeltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeltaActionPerformed
        CalculoDelta delta = new CalculoDelta();
        delta.setVisible(true);
    }//GEN-LAST:event_button_DeltaActionPerformed

    private void button_ForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ForActionPerformed
        ContadorFor cont = new ContadorFor();
        cont.setVisible(true);
    }//GEN-LAST:event_button_ForActionPerformed

    private void button_VetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_VetorActionPerformed
        VetorEditor vet = new VetorEditor();
        vet.setVisible(true);
    }//GEN-LAST:event_button_VetorActionPerformed

    private void button_GenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_GenioActionPerformed
        Genio genio = new Genio();
        genio.setVisible(true);
    }//GEN-LAST:event_button_GenioActionPerformed

    private void button_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CloseActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar essa aplicação?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (resposta == 0)  dispose();
    }//GEN-LAST:event_button_CloseActionPerformed

    private void button_TrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TrianguloActionPerformed
        TiposDeTriangulos triangulo = new TiposDeTriangulos();
        triangulo.setVisible(true);
    }//GEN-LAST:event_button_TrianguloActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Close;
    private javax.swing.JButton button_Delta;
    private javax.swing.JButton button_For;
    private javax.swing.JButton button_Genio;
    private javax.swing.JButton button_Triangulo;
    private javax.swing.JButton button_Vetor;
    private javax.swing.JLabel label_SubTitulo;
    private javax.swing.JLabel label_Titulo;
    // End of variables declaration//GEN-END:variables
}