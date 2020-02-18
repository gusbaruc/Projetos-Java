package janelas;

import javax.swing.JOptionPane;

public class LoginAdm extends javax.swing.JDialog {

    public LoginAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Usuario = new javax.swing.JLabel();
        text_Usuario = new javax.swing.JTextField();
        label_Senha = new javax.swing.JLabel();
        button_Ok = new javax.swing.JButton();
        button_Cancelar = new javax.swing.JButton();
        password_Senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Administrativo");
        setModal(true);

        label_Usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Usuario.setText("USUÁRIO:");

        label_Senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Senha.setText("SENHA:");

        button_Ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Ok.setText("OK");
        button_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_OkActionPerformed(evt);
            }
        });

        button_Cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Cancelar.setText("CANCELAR");
        button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelarActionPerformed(evt);
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
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Usuario)
                                    .addComponent(text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Senha)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(button_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(password_Senha)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void button_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_OkActionPerformed
        //Criando variável para definir login e senha.
        String login = "ADMINISTRADOR", password = "admxpto";
        
        //Verificando se o login e senha correspondem.
        if(text_Usuario.getText().equals(login)){
            if(password_Senha.getText().equals(password)){
                JOptionPane.showConfirmDialog(null, "Login efetuado com sucesso!", "Parabéns", JOptionPane.CLOSED_OPTION);
                dispose();
            }
            else
                JOptionPane.showConfirmDialog(null, "Senha incorreta!", "Advertência", JOptionPane.CLOSED_OPTION);
        }
        else
            JOptionPane.showConfirmDialog(null, "Nome de usuário inválido!", "Advertência", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_button_OkActionPerformed

    private void button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelarActionPerformed
        JOptionPane.showConfirmDialog(null, "Operação cancelada!", "Atenção", JOptionPane.CLOSED_OPTION);
        dispose();
    }//GEN-LAST:event_button_CancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancelar;
    private javax.swing.JButton button_Ok;
    private javax.swing.JLabel label_Senha;
    private javax.swing.JLabel label_Usuario;
    private javax.swing.JPasswordField password_Senha;
    private javax.swing.JTextField text_Usuario;
    // End of variables declaration//GEN-END:variables
}