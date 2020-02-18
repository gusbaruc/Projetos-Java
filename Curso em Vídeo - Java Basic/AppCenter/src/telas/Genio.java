package telas;

import java.util.Random;

public class Genio extends javax.swing.JDialog {

    public Genio() {
        initComponents();
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        //O Java é compatível com HTML.
        //Usando o HTML a quebra de linha é feita automaticamente, como vemos no balão. 
        label_Frase.setText("<html>Olá, eu sou o Gênio. Já que você me acordou gostaria de jogar um jogo BEM LEGAL?!<html>");
        spinner_1.setVisible(false);
        button_2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Genio = new javax.swing.JLabel();
        label_Balao = new javax.swing.JLabel();
        button_1 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        label_Frase = new javax.swing.JLabel();
        button_Close = new javax.swing.JButton();
        spinner_1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gênio - Adivinhe um Número");
        setResizable(false);

        label_Genio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio_Pose1.png"))); // NOI18N

        label_Balao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio_Balloon.png"))); // NOI18N

        button_1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        button_1.setText("Vamos lá!");
        button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1ActionPerformed(evt);
            }
        });

        button_2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        button_2.setText("Vamos lá!");
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });

        label_Frase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Frase.setText("Frase");

        button_Close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Close.setText("Fechar");
        button_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CloseActionPerformed(evt);
            }
        });

        spinner_1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        spinner_1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Balao)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(label_Frase, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(spinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(label_Genio)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Balao)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(label_Frase, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(spinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(label_Genio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1ActionPerformed
        //Alterando o ícone e fala do Gênio.
        label_Genio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio_Pose2.png"))); //<strong> deixa a palavra ou frase em Negrito.
        label_Frase.setText("<html>Então vamos lá. Eu estou pensando em um número entre <strong>1 e 5</strong>, você consegue adivinhar qual número é esse?<html>");
        
        //Obs: Para definir um limite de números para o Spinner, devemos editálo em Propriedades -> model.
        spinner_1.setVisible(true);                                            
        
        //Tornando o botão 1 invisível e o botão 2 visível.
        button_1.setVisible(false);
        button_2.setVisible(true);
    }//GEN-LAST:event_button_1ActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
        //Criando objeto randômico.
        Random numero = new Random();

        //Gerando numero de 1 á 5 e armazenando o numero do Spinner.
        int gerador = numero.nextInt(5)+1;
        int escolhido = Integer.parseInt(spinner_1.getValue().toString());
        
        //Estrutura condicional caso o usuário erre ou acerte.
        if(gerador == escolhido) {
            label_Genio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio_True.png")));
            label_Frase.setText("<html> <strong> <font size = 5> Você acertou!! </font> </strong> Vamos jogar mais uma vez? <html>");
                                                //Tamanhos de fontes no HTML vão de 1 á 7
        } else {
            label_Genio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio_False.png")));
            label_Frase.setText("<html>Parece você errou, eu estava pensando no número <html>" + gerador + "<html>. Vamos tentar denovo?<html>");
        }
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_button_CloseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Genio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_1;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_Close;
    private javax.swing.JLabel label_Balao;
    private javax.swing.JLabel label_Frase;
    private javax.swing.JLabel label_Genio;
    private javax.swing.JSpinner spinner_1;
    // End of variables declaration//GEN-END:variables
}