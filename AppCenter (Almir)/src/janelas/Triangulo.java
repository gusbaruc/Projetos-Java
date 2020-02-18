package janelas;

import javax.swing.JOptionPane;

public class Triangulo extends javax.swing.JDialog {

    public Triangulo() {
        initComponents();
        //Inicialização da classe SoNumeros para cada JTextField.
        text_Lado1.setDocument(new SoNumeros());
        text_Lado2.setDocument(new SoNumeros());
        text_Lado3.setDocument(new SoNumeros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Lado1 = new javax.swing.JLabel();
        label_Lado2 = new javax.swing.JLabel();
        label_Lado3 = new javax.swing.JLabel();
        button_Verificar = new javax.swing.JButton();
        text_Lado1 = new javax.swing.JTextField();
        text_Lado2 = new javax.swing.JTextField();
        text_Lado3 = new javax.swing.JTextField();
        label_TipoTri = new javax.swing.JLabel();
        text_TipoTri = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Triângulo");
        setLocation(new java.awt.Point(720, 330));
        setModal(true);

        label_Lado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Lado1.setText("PRIMEIRO LADO:");

        label_Lado2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Lado2.setText("SEGUNDO LADO:");

        label_Lado3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Lado3.setText("TERCEIRO LADO:");

        button_Verificar.setText("VERIFICAR");
        button_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_VerificarActionPerformed(evt);
            }
        });

        label_TipoTri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_TipoTri.setText("TIPO DE TRIÂNGULO:");

        text_TipoTri.setEditable(false);
        text_TipoTri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text_TipoTri.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_Lado1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(text_Lado1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_Lado2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(text_Lado2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_Lado3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(text_Lado3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(button_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(label_TipoTri, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(text_TipoTri, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_Lado1)
                .addGap(1, 1, 1)
                .addComponent(text_Lado1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Lado2)
                .addGap(1, 1, 1)
                .addComponent(text_Lado2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Lado3)
                .addGap(0, 0, 0)
                .addComponent(text_Lado3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(label_TipoTri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_TipoTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_VerificarActionPerformed
        //Confirmar se todos os dados foram inseridos.
        if(text_Lado1.getText().isEmpty() || text_Lado2.getText().isEmpty() || text_Lado3.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "É necessário inserir todos os lados do triângulo para definição de seu tipo.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double primeiro = Double.parseDouble(text_Lado1.getText());
            double segundo = Double.parseDouble(text_Lado2.getText());
            double terceiro = Double.parseDouble(text_Lado3.getText());
            
            //Definição do tipo do triângulo de acordo com os dados inseridos.
            if (primeiro == segundo && segundo == terceiro)
                text_TipoTri.setText("EQUILÁTERO");
            else if (primeiro != segundo && segundo != terceiro && primeiro != terceiro)
                text_TipoTri.setText("ESCALÊNO");
            else
                text_TipoTri.setText("ISÓSCELES");
        }
    }//GEN-LAST:event_button_VerificarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Verificar;
    private javax.swing.JLabel label_Lado1;
    private javax.swing.JLabel label_Lado2;
    private javax.swing.JLabel label_Lado3;
    private javax.swing.JLabel label_TipoTri;
    private javax.swing.JTextField text_Lado1;
    private javax.swing.JTextField text_Lado2;
    private javax.swing.JTextField text_Lado3;
    private javax.swing.JTextField text_TipoTri;
    // End of variables declaration//GEN-END:variables
}