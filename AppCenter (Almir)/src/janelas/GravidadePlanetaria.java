package janelas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class GravidadePlanetaria extends javax.swing.JDialog {

    public GravidadePlanetaria() {
        initComponents();
        //Inicialização da classe SoNumeros para o JTextField.
        text_PesoTerra.setDocument(new SoNumeros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        radio_Jupiter = new javax.swing.JRadioButton();
        radio_Saturno = new javax.swing.JRadioButton();
        radio_Urano = new javax.swing.JRadioButton();
        radio_Venus = new javax.swing.JRadioButton();
        radio_Marte = new javax.swing.JRadioButton();
        radio_Mercurio = new javax.swing.JRadioButton();
        label_Mensagem2 = new javax.swing.JLabel();
        label_Mensagem1 = new javax.swing.JLabel();
        button_Calcular = new javax.swing.JButton();
        text_PesoTerra = new javax.swing.JTextField();
        icon_Mercurio = new javax.swing.JLabel();
        icon_Venus = new javax.swing.JLabel();
        icon_Jupiter = new javax.swing.JLabel();
        icon_Saturno = new javax.swing.JLabel();
        icon_Urano = new javax.swing.JLabel();
        icon_Marte = new javax.swing.JLabel();
        icon_Earth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gravidade Planetária");
        setLocation(new java.awt.Point(710, 400));
        setModal(true);

        grupo.add(radio_Jupiter);
        radio_Jupiter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_Jupiter.setText("Júpiter");

        grupo.add(radio_Saturno);
        radio_Saturno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_Saturno.setText("Saturno");

        grupo.add(radio_Urano);
        radio_Urano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_Urano.setText("Urano");

        grupo.add(radio_Venus);
        radio_Venus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_Venus.setText("Vênus");

        grupo.add(radio_Marte);
        radio_Marte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_Marte.setText("Marte");

        grupo.add(radio_Mercurio);
        radio_Mercurio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_Mercurio.setText("Mercúrio");

        label_Mensagem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Mensagem2.setText("Selecione um Planeta:");

        label_Mensagem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Mensagem1.setText("Seu peso no planeta Terra (kg):");

        button_Calcular.setText("Calcular Peso");
        button_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CalcularActionPerformed(evt);
            }
        });

        icon_Mercurio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mercury.png"))); // NOI18N

        icon_Venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Venus.png"))); // NOI18N

        icon_Jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Jupiter.png"))); // NOI18N

        icon_Saturno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Saturn.png"))); // NOI18N

        icon_Urano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Uranus.png"))); // NOI18N

        icon_Marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mars.png"))); // NOI18N

        icon_Earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Earth.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Mensagem2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(icon_Venus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio_Venus)
                                .addGap(29, 29, 29)
                                .addComponent(icon_Jupiter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio_Jupiter)
                                .addGap(18, 18, 18)
                                .addComponent(icon_Marte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio_Marte)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(icon_Mercurio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radio_Mercurio)
                            .addGap(18, 18, 18)
                            .addComponent(icon_Saturno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radio_Saturno)
                            .addGap(12, 12, 12)
                            .addComponent(icon_Urano)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radio_Urano)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon_Earth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Mensagem1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_PesoTerra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(icon_Earth))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(label_Mensagem1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_PesoTerra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addComponent(label_Mensagem2)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(icon_Venus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(radio_Venus))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radio_Jupiter)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(icon_Marte))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radio_Marte)
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(icon_Jupiter)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(icon_Mercurio))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(radio_Mercurio))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(radio_Saturno))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(icon_Urano)
                                .addComponent(icon_Saturno))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(radio_Urano)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CalcularActionPerformed
        //Confirmar se o peso foi inserido.
        if(text_PesoTerra.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "Insira o seu peso.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double peso = Double.parseDouble(text_PesoTerra.getText());
            double conta = 0, planetMercurio = 0.37, planetMarte = 0.38, planetVenus = 0.88, planetUrano = 1.17, planetSaturno = 1.15, planetJupiter = 2.64;
            
            //Objeto para formatação do Double.
            DecimalFormat deci = new DecimalFormat("0.00");
            
            //Confirmar se o planeta foi inserido.
            if(!(radio_Mercurio.isSelected() || radio_Venus.isSelected() || radio_Jupiter.isSelected() || radio_Saturno.isSelected() || radio_Urano.isSelected() || radio_Marte.isSelected()))
                //isSelected é um método que informa se o botão Radio foi selecionado.    
                JOptionPane.showConfirmDialog(null, "Selecione um dos planetas para realizar a conversão.", "Atenção!", JOptionPane.CLOSED_OPTION);
            else{
                //Verificando qual planeta foi inserido, realizando conta e imprimindo resultado.
                if(radio_Mercurio.isSelected()){
                    conta = (peso/10)*planetMercurio;
                    JOptionPane.showMessageDialog(null, "O seu peso em Mercúrio é: " + deci.format(conta) + " Kg", "Informação de Peso", JOptionPane.CLOSED_OPTION);
                }
                if(radio_Venus.isSelected()){
                    conta = (peso/10)*planetVenus;
                    JOptionPane.showMessageDialog(null, "O seu peso em Vênus é: " + deci.format(conta) + " Kg", "Informação de Peso", JOptionPane.CLOSED_OPTION);
                }
                if(radio_Jupiter.isSelected()){
                    conta = (peso/10)*planetJupiter;
                    JOptionPane.showMessageDialog(null, "O seu peso em Júpiter é: " + deci.format(conta) + " Kg", "Informação de Peso", JOptionPane.CLOSED_OPTION);
                }
                if(radio_Saturno.isSelected()){
                    conta = (peso/10)*planetSaturno;
                    JOptionPane.showMessageDialog(null, "O seu peso em Saturno é: " + deci.format(conta) + " Kg", "Informação de Peso", JOptionPane.CLOSED_OPTION);
                }
                if(radio_Urano.isSelected()){
                    conta = (peso/10)*planetUrano;
                    JOptionPane.showMessageDialog(null, "O seu peso em Urano é: " + deci.format(conta) + " Kg", "Informação de Peso", JOptionPane.CLOSED_OPTION);
                }
                if(radio_Marte.isSelected()){
                    conta = (peso/10)*planetMarte;
                    JOptionPane.showMessageDialog(null, "O seu peso em Marte é: " + deci.format(conta) + " Kg", "Informação de Peso", JOptionPane.CLOSED_OPTION);
                }
            }       
        }
    }//GEN-LAST:event_button_CalcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GravidadePlanetaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Calcular;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel icon_Earth;
    private javax.swing.JLabel icon_Jupiter;
    private javax.swing.JLabel icon_Marte;
    private javax.swing.JLabel icon_Mercurio;
    private javax.swing.JLabel icon_Saturno;
    private javax.swing.JLabel icon_Urano;
    private javax.swing.JLabel icon_Venus;
    private javax.swing.JLabel label_Mensagem1;
    private javax.swing.JLabel label_Mensagem2;
    private javax.swing.JRadioButton radio_Jupiter;
    private javax.swing.JRadioButton radio_Marte;
    private javax.swing.JRadioButton radio_Mercurio;
    private javax.swing.JRadioButton radio_Saturno;
    private javax.swing.JRadioButton radio_Urano;
    private javax.swing.JRadioButton radio_Venus;
    private javax.swing.JTextField text_PesoTerra;
    // End of variables declaration//GEN-END:variables
}