package janelas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PoupexSimples extends javax.swing.JDialog {

    public PoupexSimples() {
        initComponents();
        //Inicialização da classe SoNumeros para cada JTextField.
        text_Aplicacao.setDocument(new SoNumeros());
        text_TaxJuros.setDocument(new SoNumeros());
        text_PeriodAplic.setDocument(new SoNumeros());
    }
    
    /* Para tornar a janela Modal(não permitindo acesso de outras janelas enquanto essa tiver aberta) é necessário tornar a classe em JDialog e ativar a caixinha do Modal nas propriedades da
    *  janela. E para fechar cada janela individualmente(Dispose_On_Close) ao invés de fechar todo o aplicativo, também é necessário transformar a classe em JDialog e colocar Dispose na opção 
    *  "defaultCloseOperation" em propriedades da janela.
    */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Aplicacao = new javax.swing.JLabel();
        label_TaxJuros = new javax.swing.JLabel();
        label_PeriodAplic = new javax.swing.JLabel();
        button_Calcular = new javax.swing.JButton();
        label_Rendimento = new javax.swing.JLabel();
        label_Montante = new javax.swing.JLabel();
        text_Aplicacao = new javax.swing.JTextField();
        text_TaxJuros = new javax.swing.JTextField();
        text_PeriodAplic = new javax.swing.JTextField();
        text_Rendimento = new javax.swing.JTextField();
        text_Montante = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Poupex Simples");
        setLocation(new java.awt.Point(720, 330));
        setModal(true);

        label_Aplicacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Aplicacao.setText("VALOR DA APLICAÇÃO (R$):");

        label_TaxJuros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_TaxJuros.setText("TAXA DE JUROS (% a.m):");

        label_PeriodAplic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_PeriodAplic.setText("PERÍODO DA APLICAÇÃO (em meses):");

        button_Calcular.setText("CALCULAR");
        button_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CalcularActionPerformed(evt);
            }
        });

        label_Rendimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Rendimento.setText("RENDIMENTO (R$):");

        label_Montante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Montante.setText("MONTANTE (R$):");

        text_Rendimento.setEditable(false);
        text_Rendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text_Rendimento.setFocusable(false);

        text_Montante.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Aplicacao)
                    .addComponent(text_Aplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_TaxJuros)
                    .addComponent(text_TaxJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_PeriodAplic)
                    .addComponent(text_PeriodAplic, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Rendimento)
                        .addGap(10, 10, 10)
                        .addComponent(text_Rendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Montante)
                        .addGap(27, 27, 27)
                        .addComponent(text_Montante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_Aplicacao)
                .addGap(1, 1, 1)
                .addComponent(text_Aplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_TaxJuros)
                .addGap(1, 1, 1)
                .addComponent(text_TaxJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_PeriodAplic)
                .addGap(0, 0, 0)
                .addComponent(text_PeriodAplic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(label_Rendimento))
                    .addComponent(text_Rendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(label_Montante))
                    .addComponent(text_Montante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CalcularActionPerformed
        //Confirmar se todos os dados foram inseridos.
        if(text_Aplicacao.getText().isEmpty() || text_TaxJuros.getText().isEmpty() || text_PeriodAplic.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "Para que o calculo seja realizado, todos os campos devem ser preenchidos.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double valor = Double.parseDouble(text_Aplicacao.getText());
            double txJuros = Double.parseDouble(text_TaxJuros.getText());
            double periodo = Double.parseDouble(text_PeriodAplic.getText());
            
            //Calculos
            txJuros = txJuros/100;
            double juros = valor * txJuros * periodo;
            double montant = juros + valor;
            
            //Objeto para formatação do Double.
            DecimalFormat deci = new DecimalFormat("0.00");
            
            //Imprimindo o resultado na caixa de forma formatada.
            text_Rendimento.setText(deci.format(juros));
            text_Montante.setText(deci.format(montant));
        }
    }//GEN-LAST:event_button_CalcularActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoupexSimples().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Calcular;
    private javax.swing.JLabel label_Aplicacao;
    private javax.swing.JLabel label_Montante;
    private javax.swing.JLabel label_PeriodAplic;
    private javax.swing.JLabel label_Rendimento;
    private javax.swing.JLabel label_TaxJuros;
    private javax.swing.JTextField text_Aplicacao;
    private javax.swing.JTextField text_Montante;
    private javax.swing.JTextField text_PeriodAplic;
    private javax.swing.JTextField text_Rendimento;
    private javax.swing.JTextField text_TaxJuros;
    // End of variables declaration//GEN-END:variables
}