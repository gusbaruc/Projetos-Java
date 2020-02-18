package telas;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VetorEditor extends javax.swing.JDialog {
/*  Criação dos componentes que serão usadas no decorrer do programa.
    Obs: para fazer a ligação etre a "lista" criada abaixo e o list_1
    temos que clicar no list_1 -> propriedades -> model -> custom code
    e adiciona "lista" a caixa do setModel.
*/  DefaultListModel lista = new DefaultListModel();
    
    //Definindo o tamanho do vetor de acordo com o numero digitado no JOptionPane.
    int vetor[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"))];
    int select = 0;

    //Criação método que limpar e imprimir o vetor.
    //Obs: é necessário limpar o vetor pois caso contrário sempre que
    //vc for fazer uma nova ordenação/adição/remoção ele vai ficar muliplicando o vetor.
    void ImprimeVetor() {
        lista.removeAllElements();
        for(int i = 0; i < vetor.length; i++) {
            lista.addElement(vetor[i]);
        }
    }
    
    public VetorEditor() {
        initComponents();
/*      O certo seria criar uma classe em formato JDialog e não JFrame.
        Mas como eu percebi isso só depois, eu troquei o javax.swing.JFrame (linha 7)
        Para JDialog e adicionei esse método que está abaixo:
*/      setModalityType(ModalityType.APPLICATION_MODAL);
        ImprimeVetor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_Ord = new javax.swing.JButton();
        button_Close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_1 = new javax.swing.JList<>();
        label_Select = new javax.swing.JLabel();
        label_M1 = new javax.swing.JLabel();
        spinner_1 = new javax.swing.JSpinner();
        button_Add = new javax.swing.JButton();
        button_Remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editor de Vetor");
        setResizable(false);

        button_Ord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Ord.setText("Ordenar");
        button_Ord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_OrdActionPerformed(evt);
            }
        });

        button_Close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Close.setText("FECHAR");
        button_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CloseActionPerformed(evt);
            }
        });

        list_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        list_1.setModel(lista);
        list_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list_1);

        label_Select.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Select.setText("[0]");

        label_M1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_M1.setText("Selecionado:     vetor");

        spinner_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        button_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Add.setText("Adicionar");
        button_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AddActionPerformed(evt);
            }
        });

        button_Remove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Remove.setText("Remover");
        button_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(spinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Remove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Ord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label_M1)
                        .addGap(2, 2, 2)
                        .addComponent(label_Select)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Ord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Select)
                            .addComponent(label_M1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_OrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_OrdActionPerformed
        //Ordenado vetor
        Arrays.sort(vetor);
        ImprimeVetor();
    }//GEN-LAST:event_button_OrdActionPerformed

    private void button_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_button_CloseActionPerformed

    private void list_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_1MouseClicked
        //Passa o valor selecionado do List_1 para a variável select.
        select = list_1.getSelectedIndex();
        
        //Passa o valor de select para o label_Select.
        label_Select.setText("[" + select + "]");
    }//GEN-LAST:event_list_1MouseClicked

    private void button_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AddActionPerformed
        //Definindo a posição selecionada do vetor de acordo com o valor inserido no Spinner.
        vetor[select] = (int) spinner_1.getValue();
        ImprimeVetor();
    }//GEN-LAST:event_button_AddActionPerformed

    private void button_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RemoveActionPerformed
        //Definindo a posição selecionada do vetor como 0.
        vetor[select] = 0;
        ImprimeVetor();
    }//GEN-LAST:event_button_RemoveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VetorEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Add;
    private javax.swing.JButton button_Close;
    private javax.swing.JButton button_Ord;
    private javax.swing.JButton button_Remove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_M1;
    private javax.swing.JLabel label_Select;
    private javax.swing.JList<String> list_1;
    private javax.swing.JSpinner spinner_1;
    // End of variables declaration//GEN-END:variables
}