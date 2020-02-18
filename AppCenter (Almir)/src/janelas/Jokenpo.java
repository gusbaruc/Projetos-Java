package janelas;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jokenpo extends javax.swing.JDialog {

    public Jokenpo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotoes = new javax.swing.ButtonGroup();
        label_Titulo = new javax.swing.JLabel();
        radio_Pedra = new javax.swing.JRadioButton();
        radio_Papel = new javax.swing.JRadioButton();
        radio_Tesoura = new javax.swing.JRadioButton();
        label_Mensagem = new javax.swing.JLabel();
        icon_Pedra = new javax.swing.JLabel();
        icon_Papel = new javax.swing.JLabel();
        icon_Tesoura = new javax.swing.JLabel();
        button_Preparado = new javax.swing.JButton();
        label_MaquinaMensagem = new javax.swing.JLabel();
        label_EscolhaMaquina = new javax.swing.JLabel();
        label_RespostaMaquina = new javax.swing.JLabel();
        label_Placar = new javax.swing.JLabel();
        text_JogadorPont = new javax.swing.JTextField();
        label_Placar2 = new javax.swing.JLabel();
        text_MaquinaPont = new javax.swing.JTextField();
        label_Ganhando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jokenpô");
        setLocation(new java.awt.Point(550, 350));
        setModal(true);

        label_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_Titulo.setText("Vamos jogar Pedra - Papel - Tesoura?");

        grupoBotoes.add(radio_Pedra);
        radio_Pedra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radio_Pedra.setText("Pedra");

        grupoBotoes.add(radio_Papel);
        radio_Papel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radio_Papel.setText("Papel");

        grupoBotoes.add(radio_Tesoura);
        radio_Tesoura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radio_Tesoura.setText("Tesoura");

        label_Mensagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Mensagem.setText("Selecione a opção desejada e vamos descobrir quem é o melhor nesse jogo, eu ou você! :D");

        icon_Pedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rock.png"))); // NOI18N

        icon_Papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Paper.png"))); // NOI18N

        icon_Tesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Scissor.png"))); // NOI18N

        button_Preparado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_Preparado.setText("PREPARADO?!");
        button_Preparado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PreparadoActionPerformed(evt);
            }
        });

        label_MaquinaMensagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_MaquinaMensagem.setText("O que eu vou jogar vai ser...");

        label_EscolhaMaquina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        label_RespostaMaquina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label_Placar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Placar.setText("Placar:");

        text_JogadorPont.setEditable(false);
        text_JogadorPont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text_JogadorPont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_JogadorPont.setText("0");

        label_Placar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_Placar2.setText("á");

        text_MaquinaPont.setEditable(false);
        text_MaquinaPont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text_MaquinaPont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_MaquinaPont.setText("0");

        label_Ganhando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_MaquinaMensagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_EscolhaMaquina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_RespostaMaquina))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_Mensagem)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(icon_Pedra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radio_Pedra)
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(icon_Papel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radio_Papel)
                                                .addGap(75, 75, 75)
                                                .addComponent(icon_Tesoura)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radio_Tesoura))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(text_JogadorPont, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(label_Placar2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(text_MaquinaPont, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(button_Preparado))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label_Ganhando))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(label_Titulo)))
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(label_Placar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Mensagem)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_Tesoura)
                            .addComponent(radio_Pedra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon_Papel)
                            .addComponent(icon_Pedra)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icon_Tesoura))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(radio_Papel)))
                .addGap(18, 18, 18)
                .addComponent(button_Preparado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_MaquinaMensagem)
                    .addComponent(label_EscolhaMaquina)
                    .addComponent(label_RespostaMaquina))
                .addGap(18, 18, 18)
                .addComponent(label_Placar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_JogadorPont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_MaquinaPont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Placar2)
                    .addComponent(label_Ganhando))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Criação de variável para contagem da pontuação (Criada fora do botão para que seu valor nao fique rezetando para 0).
    int pontJogador = 0, pontMaquina = 0;
    
    private void button_PreparadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PreparadoActionPerformed
        //Atribuindo um valor para cada variável.
        int valor, paper = 0, rock = 1, scissor = 2;
        
        //Criando objeto randomico.
        Random gerador = new Random();
        
        //Caso o jogador não tenha selecionado nada.
        if(!(radio_Pedra.isSelected() || radio_Papel.isSelected() || radio_Tesoura.isSelected()))
            JOptionPane.showConfirmDialog(null, "Parece que você esqueceu de selecionar sua jogada.", "Opa!", JOptionPane.CLOSED_OPTION);
        
        //Caso pedra seja escolhido pelo usuário-----------------------------------------------------------------------------------------
        if(radio_Pedra.isSelected()){
            //gerando valor aleatório de 1 á 3 para a maquina.
            valor = gerador.nextInt(3);
            
            //Atribuição para cada escolha da máquina.
            if(valor == 0){  
                label_EscolhaMaquina.setText("Papel!");
                label_RespostaMaquina.setText("Eu ganhei, uhull! Mas não fique triste, podemos tentar denovo se você quiser :)");
                pontMaquina++;
                text_MaquinaPont.setText(String.valueOf(pontMaquina));
            }
            if(valor == 1){  
                label_EscolhaMaquina.setText("Pedra!");
                label_RespostaMaquina.setText("Ihh, empatou. Vamos denovo até alguém ganhar!");
            }
            if(valor == 2){  
                label_EscolhaMaquina.setText("Tesoura!");
                label_RespostaMaquina.setText("Ahh, eu perdi! Mas não tem problema, quem sabe na próxima eu ganho!");
                pontJogador++;
                text_JogadorPont.setText(String.valueOf(pontJogador));
            }
        }
        //Caso papel seja escolhido pelo usuário-----------------------------------------------------------------------------------------
        if(radio_Papel.isSelected()){
            //gerando valor aleatório de 1 á 3 para a maquina.
            valor = gerador.nextInt(3);
            
            //Atribuição para cada escolha da máquina.
            if(valor == 0){  
                label_EscolhaMaquina.setText("Papel!");
                label_RespostaMaquina.setText("Ihh, empatou. Vamos denovo até alguém ganhar!");
            }
            if(valor == 1){  
                label_EscolhaMaquina.setText("Pedra!");
                label_RespostaMaquina.setText("Ahh, eu perdi! Mas não tem problema, quem sabe na próxima eu ganho!");
                pontJogador++;
                text_JogadorPont.setText(String.valueOf(pontJogador));
            }
            if(valor == 2){  
                label_EscolhaMaquina.setText("Tesoura!");
                label_RespostaMaquina.setText("Eu ganhei, uhull! Mas não fique triste, podemos tentar denovo se você quiser :)");
                pontMaquina++;
                text_MaquinaPont.setText(String.valueOf(pontMaquina));
            }
        }
        //Caso tesoura seja escolhido pelo usuário-----------------------------------------------------------------------------------------
        if(radio_Tesoura.isSelected()){
            //gerando valor aleatório de 1 á 3 para a maquina.
            valor = gerador.nextInt(3);
            
            //Atribuição para cada escolha da máquina.
            if(valor == 0){  
                label_EscolhaMaquina.setText("Papel!");
                label_RespostaMaquina.setText("Ahh, eu perdi! Mas não tem problema, quem sabe na próxima eu ganho!");
                pontJogador++;
                text_JogadorPont.setText(String.valueOf(pontJogador));
            }
            if(valor == 1){  
                label_EscolhaMaquina.setText("Pedra!");
                label_RespostaMaquina.setText("Eu ganhei, uhull! Mas não fique triste, podemos tentar denovo se você quiser :)");
                pontMaquina++;
                text_MaquinaPont.setText(String.valueOf(pontMaquina));
            }
            if(valor == 2){  
                label_EscolhaMaquina.setText("Tesoura!");
                label_RespostaMaquina.setText("Ihh, empatou. Vamos denovo até alguém ganhar!");
            }
        }
        //Exibição de ganhador do placar.    
        if(pontJogador == pontMaquina)
            label_Ganhando.setText("");
        else if(pontJogador>pontMaquina)
            label_Ganhando.setText("Para mim!");
        else
            label_Ganhando.setText("Para a máquina! :(");
    }//GEN-LAST:event_button_PreparadoActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Preparado;
    private javax.swing.ButtonGroup grupoBotoes;
    private javax.swing.JLabel icon_Papel;
    private javax.swing.JLabel icon_Pedra;
    private javax.swing.JLabel icon_Tesoura;
    private javax.swing.JLabel label_EscolhaMaquina;
    private javax.swing.JLabel label_Ganhando;
    private javax.swing.JLabel label_MaquinaMensagem;
    private javax.swing.JLabel label_Mensagem;
    private javax.swing.JLabel label_Placar;
    private javax.swing.JLabel label_Placar2;
    private javax.swing.JLabel label_RespostaMaquina;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JRadioButton radio_Papel;
    private javax.swing.JRadioButton radio_Pedra;
    private javax.swing.JRadioButton radio_Tesoura;
    private javax.swing.JTextField text_JogadorPont;
    private javax.swing.JTextField text_MaquinaPont;
    // End of variables declaration//GEN-END:variables
}