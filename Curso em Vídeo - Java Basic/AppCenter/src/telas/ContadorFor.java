package telas;

import javax.swing.DefaultListModel;

public class ContadorFor extends javax.swing.JDialog {

    public ContadorFor() {
        initComponents();
        setModalityType(ModalityType.APPLICATION_MODAL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_M3 = new javax.swing.JLabel();
        label_Fim = new javax.swing.JLabel();
        label_Ini = new javax.swing.JLabel();
        label_Pass = new javax.swing.JLabel();
        button_Cont = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_1 = new javax.swing.JList<>();
        slider_Ini = new javax.swing.JSlider();
        slider_Fim = new javax.swing.JSlider();
        slider_Pass = new javax.swing.JSlider();
        label_M1 = new javax.swing.JLabel();
        label_M2 = new javax.swing.JLabel();
        button_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contador For");
        setResizable(false);

        label_M3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_M3.setText("Passo");

        label_Fim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Fim.setText("10");

        label_Ini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Ini.setText("0");

        label_Pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Pass.setText("1");

        button_Cont.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        button_Cont.setText("Contar");
        button_Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ContActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(list_1);

        slider_Ini.setMaximum(20);
        slider_Ini.setValue(0);
        slider_Ini.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_IniStateChanged(evt);
            }
        });

        slider_Fim.setMaximum(20);
        slider_Fim.setValue(10);
        slider_Fim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_FimStateChanged(evt);
            }
        });

        slider_Pass.setMaximum(10);
        slider_Pass.setMinimum(1);
        slider_Pass.setValue(1);
        slider_Pass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_PassStateChanged(evt);
            }
        });

        label_M1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_M1.setText("Início");

        label_M2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_M2.setText("Fim");

        button_Close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Close.setText("Fechar");
        button_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_M1)
                                    .addComponent(label_M2))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(slider_Ini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slider_Fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_M3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(slider_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Fim)
                            .addComponent(label_Ini)
                            .addComponent(label_Pass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(button_Cont, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_M1)
                                    .addComponent(slider_Ini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_Ini)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Fim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label_M2)
                                    .addGap(26, 26, 26))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(slider_Fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_M3)
                            .addComponent(slider_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Pass))
                        .addGap(35, 35, 35)
                        .addComponent(button_Cont, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ContActionPerformed
        //Criando variáveis
        int ini = slider_Ini.getValue();
        int fim = slider_Fim.getValue();
        int pass = slider_Pass.getValue();

        //Criando objeto para acessar o JList
        DefaultListModel lista = new DefaultListModel();

        //Estrutura condicional para definição de contagem crescente ou decrescente
        if (ini <= fim) {
            for(int i = ini; i <= fim; i += pass) {
                lista.addElement(i);
            }
        } else
            for(int i = ini; i >= fim; i -= pass) {
                lista.addElement(i);
            }

        //Passando os elementos para a lista
        list_1.setModel(lista);
    }//GEN-LAST:event_button_ContActionPerformed

    private void slider_IniStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_IniStateChanged
        //O método StateChanged faz uma ação sempre que o Slider sofre alteração.
        label_Ini.setText(Integer.toString(slider_Ini.getValue()));
    }//GEN-LAST:event_slider_IniStateChanged

    private void slider_FimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_FimStateChanged
        label_Fim.setText(Integer.toString(slider_Fim.getValue()));
    }//GEN-LAST:event_slider_FimStateChanged

    private void slider_PassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_PassStateChanged
        label_Pass.setText(Integer.toString(slider_Pass.getValue()));
    }//GEN-LAST:event_slider_PassStateChanged

    private void button_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CloseActionPerformed
        dispose();
    }//GEN-LAST:event_button_CloseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorFor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Close;
    private javax.swing.JButton button_Cont;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Fim;
    private javax.swing.JLabel label_Ini;
    private javax.swing.JLabel label_M1;
    private javax.swing.JLabel label_M2;
    private javax.swing.JLabel label_M3;
    private javax.swing.JLabel label_Pass;
    private javax.swing.JList<String> list_1;
    private javax.swing.JSlider slider_Fim;
    private javax.swing.JSlider slider_Ini;
    private javax.swing.JSlider slider_Pass;
    // End of variables declaration//GEN-END:variables
}