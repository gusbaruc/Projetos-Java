package janelas;
//F3 faz busca de palavras.
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_PoupexSimples = new javax.swing.JButton();
        button_LoginAdm = new javax.swing.JButton();
        button_GravidadePlanetaria = new javax.swing.JButton();
        button_Triangulo = new javax.swing.JButton();
        button_Jokenpo = new javax.swing.JButton();
        button_ConversorDeMedidas = new javax.swing.JButton();
        button_CadCliente = new javax.swing.JButton();
        button_FecharAplic = new javax.swing.JButton();
        label_Mensagem1 = new javax.swing.JLabel();
        label_Mensagem2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRINCIPAL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(700, 350));

        button_PoupexSimples.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_PoupexSimples.setText("POUPEX SIMPLES");
        button_PoupexSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PoupexSimplesActionPerformed(evt);
            }
        });

        button_LoginAdm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_LoginAdm.setText("LOGIN ADMINISTRATIVO");
        button_LoginAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LoginAdmActionPerformed(evt);
            }
        });

        button_GravidadePlanetaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_GravidadePlanetaria.setText("GRAVIDADE PLANETÁRIA");
        button_GravidadePlanetaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_GravidadePlanetariaActionPerformed(evt);
            }
        });

        button_Triangulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Triangulo.setText("TRIÂNGULO");
        button_Triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TrianguloActionPerformed(evt);
            }
        });

        button_Jokenpo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_Jokenpo.setText("JOKENPÔ");
        button_Jokenpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_JokenpoActionPerformed(evt);
            }
        });

        button_ConversorDeMedidas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_ConversorDeMedidas.setText("CONVERSOR DE MEDIDAS");
        button_ConversorDeMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ConversorDeMedidasActionPerformed(evt);
            }
        });

        button_CadCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_CadCliente.setText("CADASTRO DE CLIENTE");
        button_CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CadClienteActionPerformed(evt);
            }
        });

        button_FecharAplic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button_FecharAplic.setText("FECHAR APLICAÇÃO");
        button_FecharAplic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_FecharAplicActionPerformed(evt);
            }
        });

        label_Mensagem1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Mensagem1.setText("Central de Aplicativos");

        label_Mensagem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Mensagem2.setText("Projeto - Professor Almir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_FecharAplic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_LoginAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_CadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Jokenpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_GravidadePlanetaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Triangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_PoupexSimples, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(button_ConversorDeMedidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Mensagem1)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(label_Mensagem2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Mensagem1)
                .addGap(4, 4, 4)
                .addComponent(label_Mensagem2)
                .addGap(18, 18, 18)
                .addComponent(button_PoupexSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(button_Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(button_GravidadePlanetaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(button_Jokenpo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(button_ConversorDeMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(button_CadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(button_LoginAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(button_FecharAplic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_PoupexSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PoupexSimplesActionPerformed
        //Criação do objeto "poupex" para conectar esse botão a classe PoupexSimples.
        //"setVisible" chama classe PoupexSimples.
        PoupexSimples janela = new PoupexSimples();
        janela.setVisible(true);
    }//GEN-LAST:event_button_PoupexSimplesActionPerformed

    private void button_TrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TrianguloActionPerformed
        Triangulo janela = new Triangulo();
        janela.setVisible(true);
    }//GEN-LAST:event_button_TrianguloActionPerformed

    private void button_GravidadePlanetariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_GravidadePlanetariaActionPerformed
        GravidadePlanetaria janela = new GravidadePlanetaria();
        janela.setVisible(true);
    }//GEN-LAST:event_button_GravidadePlanetariaActionPerformed

    private void button_JokenpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_JokenpoActionPerformed
        Jokenpo janela = new Jokenpo();
        janela.setVisible(true);
    }//GEN-LAST:event_button_JokenpoActionPerformed

    private void button_ConversorDeMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ConversorDeMedidasActionPerformed
        ConversorDeMedidas janela = new ConversorDeMedidas();
        janela.setVisible(true);
    }//GEN-LAST:event_button_ConversorDeMedidasActionPerformed

    private void button_CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CadClienteActionPerformed
        CadastroDeClientes janela = new CadastroDeClientes();
        janela.setVisible(true);
    }//GEN-LAST:event_button_CadClienteActionPerformed

    private void button_LoginAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LoginAdmActionPerformed
        LoginAdm janela = new LoginAdm();
        janela.setVisible(true);
    }//GEN-LAST:event_button_LoginAdmActionPerformed

    private void button_FecharAplicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FecharAplicActionPerformed
        //Comando para criar uma janela de cancelamento de saída. Onde "tem certeza..." é o conteúdo que aparecerá na tela, "Atenção!" é o título da janela e "Yes_No" são os botões.
        //O if é para executar o comando de saida caso ele digite Yes(0) ou No(1).
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar essa aplicação?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (resposta == 0)  System.exit(0);
    }//GEN-LAST:event_button_FecharAplicActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_CadCliente;
    private javax.swing.JButton button_ConversorDeMedidas;
    private javax.swing.JButton button_FecharAplic;
    private javax.swing.JButton button_GravidadePlanetaria;
    private javax.swing.JButton button_Jokenpo;
    private javax.swing.JButton button_LoginAdm;
    private javax.swing.JButton button_PoupexSimples;
    private javax.swing.JButton button_Triangulo;
    private javax.swing.JLabel label_Mensagem1;
    private javax.swing.JLabel label_Mensagem2;
    // End of variables declaration//GEN-END:variables
}