package janelas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorDeMedidas extends javax.swing.JDialog {

    public ConversorDeMedidas() {
        initComponents();
        //Inicialização da classe SoNumeros para o JTextField.
        text_Distancia1.setDocument(new SoNumeros());
        text_Massa1.setDocument(new SoNumeros());
        text_Volume1.setDocument(new SoNumeros());
        text_Vel1.setDocument(new SoNumeros());
        text_Temp1.setDocument(new SoNumeros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Distancia = new javax.swing.JLabel();
        label_Massa = new javax.swing.JLabel();
        label_Temp = new javax.swing.JLabel();
        label_Vel = new javax.swing.JLabel();
        label_F = new javax.swing.JLabel();
        label_Polegadas = new javax.swing.JLabel();
        label_C = new javax.swing.JLabel();
        label_Km = new javax.swing.JLabel();
        label_galoes = new javax.swing.JLabel();
        label_MporS = new javax.swing.JLabel();
        label_Metros = new javax.swing.JLabel();
        label_Litros = new javax.swing.JLabel();
        label_Quilos = new javax.swing.JLabel();
        label_Libras = new javax.swing.JLabel();
        label_Volume = new javax.swing.JLabel();
        button_Convert1 = new javax.swing.JButton();
        button_Convert2 = new javax.swing.JButton();
        button_Convert3 = new javax.swing.JButton();
        button_Convert4 = new javax.swing.JButton();
        button_Convert5 = new javax.swing.JButton();
        text_Distancia1 = new javax.swing.JTextField();
        text_Massa1 = new javax.swing.JTextField();
        text_Volume1 = new javax.swing.JTextField();
        text_Vel1 = new javax.swing.JTextField();
        text_Temp1 = new javax.swing.JTextField();
        text_Distancia2 = new javax.swing.JTextField();
        text_Massa2 = new javax.swing.JTextField();
        text_Volume2 = new javax.swing.JTextField();
        text_Vel2 = new javax.swing.JTextField();
        text_Temp2 = new javax.swing.JTextField();
        label_Equivale1 = new javax.swing.JLabel();
        label_Equivale2 = new javax.swing.JLabel();
        label_Equivale3 = new javax.swing.JLabel();
        label_Equivale4 = new javax.swing.JLabel();
        label_Equivale5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de Medidas");
        setModal(true);

        label_Distancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Distancia.setText("Distância:");

        label_Massa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Massa.setText("Massa:");

        label_Temp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Temp.setText("Temperatura:");

        label_Vel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Vel.setText("Velocidade:");

        label_F.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_F.setText("° F");

        label_Polegadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Polegadas.setText("polegadas");

        label_C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_C.setText("° C");

        label_Km.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Km.setText("km/h");

        label_galoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_galoes.setText("galões");

        label_MporS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_MporS.setText("m/s");

        label_Metros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Metros.setText("metros");

        label_Litros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Litros.setText("litros");

        label_Quilos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Quilos.setText("quilogramas");

        label_Libras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Libras.setText("libras");

        label_Volume.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Volume.setText("Volume:");

        button_Convert1.setText("Converter");
        button_Convert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Convert1ActionPerformed(evt);
            }
        });

        button_Convert2.setText("Converter");
        button_Convert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Convert2ActionPerformed(evt);
            }
        });

        button_Convert3.setText("Converter");
        button_Convert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Convert3ActionPerformed(evt);
            }
        });

        button_Convert4.setText("Converter");
        button_Convert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Convert4ActionPerformed(evt);
            }
        });

        button_Convert5.setText("Converter");
        button_Convert5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Convert5ActionPerformed(evt);
            }
        });

        text_Distancia2.setEditable(false);

        text_Massa2.setEditable(false);

        text_Volume2.setEditable(false);

        text_Vel2.setEditable(false);

        text_Temp2.setEditable(false);

        label_Equivale1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Equivale1.setText("equivale á");

        label_Equivale2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Equivale2.setText("equivale á");

        label_Equivale3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Equivale3.setText("equivale á");

        label_Equivale4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Equivale4.setText("equivale á");

        label_Equivale5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Equivale5.setText("equivale á");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Distancia)
                    .addComponent(label_Massa)
                    .addComponent(label_Volume)
                    .addComponent(label_Vel)
                    .addComponent(label_Temp))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_Massa1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(text_Distancia1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(text_Vel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(text_Volume1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_Temp1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Metros)
                    .addComponent(label_Litros)
                    .addComponent(label_Quilos)
                    .addComponent(label_Km)
                    .addComponent(label_C))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Equivale1)
                    .addComponent(label_Equivale5)
                    .addComponent(label_Equivale4)
                    .addComponent(label_Equivale3)
                    .addComponent(label_Equivale2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_Volume2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_galoes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_Distancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_Polegadas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_Massa2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_Libras))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(text_Temp2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(text_Vel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_MporS)
                                    .addComponent(label_F))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Convert3)
                            .addComponent(button_Convert2)
                            .addComponent(button_Convert1)
                            .addComponent(button_Convert4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_Convert5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_Distancia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Distancia)
                        .addComponent(text_Distancia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Polegadas)
                        .addComponent(label_Equivale1)
                        .addComponent(label_Metros))
                    .addComponent(button_Convert1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_Massa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Massa)
                        .addComponent(text_Massa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Libras)
                        .addComponent(label_Quilos)
                        .addComponent(label_Equivale2))
                    .addComponent(button_Convert2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_Volume1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Volume)
                        .addComponent(text_Volume2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_galoes)
                        .addComponent(label_Litros)
                        .addComponent(label_Equivale3))
                    .addComponent(button_Convert3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_Vel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Vel)
                        .addComponent(text_Vel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_MporS)
                        .addComponent(label_Km)
                        .addComponent(label_Equivale4))
                    .addComponent(button_Convert4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_Temp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Temp)
                        .addComponent(text_Temp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_F)
                        .addComponent(label_C)
                        .addComponent(label_Equivale5))
                    .addComponent(button_Convert5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Objeto para formatação do Double.
    DecimalFormat deci = new DecimalFormat("0.00");
    
    private void button_Convert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Convert1ActionPerformed
        //Confirmar se todos os dados foram inseridos.
        if(text_Distancia1.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "É necessário inserir o valor de metros para realizar a conversão.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double metros = Double.parseDouble(text_Distancia1.getText()); 
            double polegadas = 39.3701, conversao = 0;
        
            //Calculo e impressão do resultado.
            conversao = metros * polegadas;
            text_Distancia2.setText(String.valueOf(deci.format(conversao)));
        }
    }//GEN-LAST:event_button_Convert1ActionPerformed

    private void button_Convert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Convert2ActionPerformed
        //Confirmar se todos os dados foram inseridos.
        if(text_Massa1.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "É necessário inserir o valor de quilogramas para realizar a conversão.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double quilo = Double.parseDouble(text_Massa1.getText());
            double libras = 2.20462, conversao = 0;
        
            //Calculo e impressão do resultado.
            conversao = quilo * libras;
            text_Massa2.setText(String.valueOf(deci.format(conversao)));
        }
    }//GEN-LAST:event_button_Convert2ActionPerformed

    private void button_Convert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Convert3ActionPerformed
        //Confirmar se todos os dados foram inseridos.
        if(text_Volume1.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "É necessário inserir o valor de litros para realizar a conversão.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double litros = Double.parseDouble(text_Volume1.getText());
            double galoes = 0.264172, conversao = 0;
        
            //Calculo e impressão do resultado.
            conversao = litros * galoes;
            text_Volume2.setText(String.valueOf(deci.format(conversao)));
        }
    }//GEN-LAST:event_button_Convert3ActionPerformed

    private void button_Convert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Convert4ActionPerformed
        //Confirmar se todos os dados foram inseridos.
        if(text_Vel1.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "É necessário inserir o valor de km/h para realizar a conversão.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double km_h = Double.parseDouble(text_Vel1.getText());
            double m_s = 0.277778, conversao = 0;
        
            //Calculo e impressão do resultado.
            conversao = km_h * m_s;
            text_Vel2.setText(String.valueOf(deci.format(conversao)));
        }
    }//GEN-LAST:event_button_Convert4ActionPerformed

    private void button_Convert5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Convert5ActionPerformed
        //Confirmar se todos os dados foram inseridos.
        if(text_Temp1.getText().isEmpty())
            JOptionPane.showConfirmDialog(null, "É necessário inserir o valor de °C para realizar a conversão.", "Atenção!", JOptionPane.CLOSED_OPTION);
        else{
            //Criando variável para receber o valor do JTextField em tipo Double.
            double grausC = Double.parseDouble(text_Temp1.getText());
            double grausF = 33.8, conversao = 0;
        
            //Calculo e impressão do resultado.
            conversao = grausC * grausF;
            text_Temp2.setText(String.valueOf(deci.format(conversao)));
        }
    }//GEN-LAST:event_button_Convert5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorDeMedidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Convert1;
    private javax.swing.JButton button_Convert2;
    private javax.swing.JButton button_Convert3;
    private javax.swing.JButton button_Convert4;
    private javax.swing.JButton button_Convert5;
    private javax.swing.JLabel label_C;
    private javax.swing.JLabel label_Distancia;
    private javax.swing.JLabel label_Equivale1;
    private javax.swing.JLabel label_Equivale2;
    private javax.swing.JLabel label_Equivale3;
    private javax.swing.JLabel label_Equivale4;
    private javax.swing.JLabel label_Equivale5;
    private javax.swing.JLabel label_F;
    private javax.swing.JLabel label_Km;
    private javax.swing.JLabel label_Libras;
    private javax.swing.JLabel label_Litros;
    private javax.swing.JLabel label_Massa;
    private javax.swing.JLabel label_Metros;
    private javax.swing.JLabel label_MporS;
    private javax.swing.JLabel label_Polegadas;
    private javax.swing.JLabel label_Quilos;
    private javax.swing.JLabel label_Temp;
    private javax.swing.JLabel label_Vel;
    private javax.swing.JLabel label_Volume;
    private javax.swing.JLabel label_galoes;
    private javax.swing.JTextField text_Distancia1;
    private javax.swing.JTextField text_Distancia2;
    private javax.swing.JTextField text_Massa1;
    private javax.swing.JTextField text_Massa2;
    private javax.swing.JTextField text_Temp1;
    private javax.swing.JTextField text_Temp2;
    private javax.swing.JTextField text_Vel1;
    private javax.swing.JTextField text_Vel2;
    private javax.swing.JTextField text_Volume1;
    private javax.swing.JTextField text_Volume2;
    // End of variables declaration//GEN-END:variables
}