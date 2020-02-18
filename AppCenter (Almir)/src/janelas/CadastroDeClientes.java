package janelas;

import javax.swing.JOptionPane;

public class CadastroDeClientes extends javax.swing.JDialog {

    public CadastroDeClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Nome = new javax.swing.JLabel();
        text_Nome = new javax.swing.JTextField();
        label_End = new javax.swing.JLabel();
        text_End = new javax.swing.JTextField();
        label_Idade = new javax.swing.JLabel();
        text_Idade = new javax.swing.JTextField();
        label_Tel = new javax.swing.JLabel();
        text_Tel = new javax.swing.JTextField();
        label_Email = new javax.swing.JLabel();
        text_Email = new javax.swing.JTextField();
        button_Cadastro = new javax.swing.JButton();
        button_Cancelar = new javax.swing.JButton();
        label_Obrig1 = new javax.swing.JLabel();
        label_Obrig2 = new javax.swing.JLabel();
        label_Obrig3 = new javax.swing.JLabel();
        label_Obrig4 = new javax.swing.JLabel();
        label_Obrig5 = new javax.swing.JLabel();
        label_Obrig6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setModal(true);

        label_Nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Nome.setText("NOME:");

        label_End.setText("ENDEREÇO:");

        label_Idade.setText("IDADE:");

        label_Tel.setText("TELEFONE:");

        label_Email.setText("E-MAIL:");

        button_Cadastro.setText("CADASTRAR");
        button_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CadastroActionPerformed(evt);
            }
        });

        button_Cancelar.setText("CANCELAR");
        button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelarActionPerformed(evt);
            }
        });

        label_Obrig1.setForeground(new java.awt.Color(255, 0, 0));
        label_Obrig1.setText("*");

        label_Obrig2.setForeground(new java.awt.Color(255, 0, 0));
        label_Obrig2.setText("*");

        label_Obrig3.setForeground(new java.awt.Color(255, 0, 0));
        label_Obrig3.setText("*");

        label_Obrig4.setForeground(new java.awt.Color(255, 0, 0));
        label_Obrig4.setText("*");

        label_Obrig5.setForeground(new java.awt.Color(255, 0, 0));
        label_Obrig5.setText("*");

        label_Obrig6.setForeground(new java.awt.Color(255, 0, 0));
        label_Obrig6.setText("* Campos obrigatóros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_Email)
                    .addComponent(text_Nome)
                    .addComponent(text_End)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_Tel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_Cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(button_Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Nome)
                                .addGap(0, 0, 0)
                                .addComponent(label_Obrig1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_End)
                                .addGap(0, 0, 0)
                                .addComponent(label_Obrig2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Email)
                                .addGap(0, 0, 0)
                                .addComponent(label_Obrig5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Idade)
                                .addGap(0, 0, 0)
                                .addComponent(label_Obrig3)
                                .addGap(112, 112, 112)
                                .addComponent(label_Tel)
                                .addGap(0, 0, 0)
                                .addComponent(label_Obrig4))
                            .addComponent(label_Obrig6))
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Nome)
                    .addComponent(label_Obrig1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_End)
                        .addGap(0, 0, 0)
                        .addComponent(text_End, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Obrig2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Idade)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_Tel)
                        .addComponent(label_Obrig4))
                    .addComponent(label_Obrig3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Email)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Obrig5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Obrig6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CadastroActionPerformed
       //Verificando se todos os campos foram preenchidos.
        if (text_Nome.getText().isEmpty() || text_End.getText().isEmpty() || text_Idade.getText().isEmpty() || text_Tel.getText().isEmpty() || text_Email.getText().isEmpty())
           JOptionPane.showConfirmDialog(null, "Todos os campos devem ser preenchidos.", "Advertência", JOptionPane.CLOSED_OPTION);
       else
           JOptionPane.showConfirmDialog(null, "Dados cadastrados com sucesso!", "Parabéns", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_button_CadastroActionPerformed

    private void button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelarActionPerformed
        JOptionPane.showConfirmDialog(null, "Preenchimento cancelado pelo usuário!", "Cancelamento", JOptionPane.CLOSED_OPTION);
        
        //Pergunta sobre o fechamento da aplicação.
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar essa aplicação?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (resposta == 0)  dispose();
    }//GEN-LAST:event_button_CancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cadastro;
    private javax.swing.JButton button_Cancelar;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_End;
    private javax.swing.JLabel label_Idade;
    private javax.swing.JLabel label_Nome;
    private javax.swing.JLabel label_Obrig1;
    private javax.swing.JLabel label_Obrig2;
    private javax.swing.JLabel label_Obrig3;
    private javax.swing.JLabel label_Obrig4;
    private javax.swing.JLabel label_Obrig5;
    private javax.swing.JLabel label_Obrig6;
    private javax.swing.JLabel label_Tel;
    private javax.swing.JTextField text_Email;
    private javax.swing.JTextField text_End;
    private javax.swing.JTextField text_Idade;
    private javax.swing.JTextField text_Nome;
    private javax.swing.JTextField text_Tel;
    // End of variables declaration//GEN-END:variables
}