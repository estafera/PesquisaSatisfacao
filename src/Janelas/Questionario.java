/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramon Honorio
 */
public class Questionario extends javax.swing.JFrame {

    private int cardAtual = 1;
            
    public Questionario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPergunta1 = new javax.swing.ButtonGroup();
        grupoPergunta2 = new javax.swing.ButtonGroup();
        painelPrincipal = new javax.swing.JPanel();
        painel1 = new javax.swing.JPanel();
        jltitulo = new javax.swing.JLabel();
        jlPergunta = new javax.swing.JLabel();
        rbPessimo = new javax.swing.JRadioButton();
        rbRuim = new javax.swing.JRadioButton();
        rbRegular = new javax.swing.JRadioButton();
        rbBom = new javax.swing.JRadioButton();
        painel2 = new javax.swing.JPanel();
        jltitulo1 = new javax.swing.JLabel();
        jlPergunta1 = new javax.swing.JLabel();
        rbPessimo1 = new javax.swing.JRadioButton();
        rbRuim1 = new javax.swing.JRadioButton();
        rbRegular1 = new javax.swing.JRadioButton();
        rbBom1 = new javax.swing.JRadioButton();
        painel3 = new javax.swing.JPanel();
        jltitulo2 = new javax.swing.JLabel();
        jlPergunta2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botaoAvancar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa de Satisfacao");
        setResizable(false);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        jltitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltitulo.setText("Questionário (1/2)");

        jlPergunta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPergunta.setText("Num âmbito geral, como você classificaria o nosso serviço?");

        grupoPergunta1.add(rbPessimo);
        rbPessimo.setText("Péssimo");
        rbPessimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessimo_naos.png"))); // NOI18N
        rbPessimo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessimo_rollover.png"))); // NOI18N
        rbPessimo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessimo_selec.png"))); // NOI18N
        rbPessimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessimoActionPerformed(evt);
            }
        });

        grupoPergunta1.add(rbRuim);
        rbRuim.setText("Ruim");
        rbRuim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ruim_naos.png"))); // NOI18N
        rbRuim.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ruim_rollover.png"))); // NOI18N
        rbRuim.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ruim_selec.png"))); // NOI18N
        rbRuim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRuimActionPerformed(evt);
            }
        });

        grupoPergunta1.add(rbRegular);
        rbRegular.setText("Regular");
        rbRegular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/regular_naos.png"))); // NOI18N
        rbRegular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/regular_rollover.png"))); // NOI18N
        rbRegular.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/regular_selec.png"))); // NOI18N
        rbRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegularActionPerformed(evt);
            }
        });

        grupoPergunta1.add(rbBom);
        rbBom.setText("Bom");
        rbBom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bom_naos.png"))); // NOI18N
        rbBom.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bom_rollover.png"))); // NOI18N
        rbBom.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bom_selec.png"))); // NOI18N
        rbBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(rbPessimo)
                        .addGap(18, 18, 18)
                        .addComponent(rbRuim)
                        .addGap(18, 18, 18)
                        .addComponent(rbRegular)
                        .addGap(18, 18, 18)
                        .addComponent(rbBom)
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(jltitulo)
                .addGap(18, 18, 18)
                .addComponent(jlPergunta)
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRuim)
                    .addComponent(rbPessimo)
                    .addComponent(rbRegular)
                    .addComponent(rbBom))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPrincipal.add(painel1, "pergunta1");

        jltitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jltitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltitulo1.setText("Questionário (2/2)");

        jlPergunta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlPergunta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPergunta1.setText("Num âmbito geral, como você classificaria o nosso serviço?");

        grupoPergunta2.add(rbPessimo1);
        rbPessimo1.setText("Péssimo");
        rbPessimo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessimo_naos.png"))); // NOI18N
        rbPessimo1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessimo_rollover.png"))); // NOI18N
        rbPessimo1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessimo_selec.png"))); // NOI18N
        rbPessimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessimo1ActionPerformed(evt);
            }
        });

        grupoPergunta2.add(rbRuim1);
        rbRuim1.setText("Ruim");
        rbRuim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ruim_naos.png"))); // NOI18N
        rbRuim1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ruim_rollover.png"))); // NOI18N
        rbRuim1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ruim_selec.png"))); // NOI18N
        rbRuim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRuim1ActionPerformed(evt);
            }
        });

        grupoPergunta2.add(rbRegular1);
        rbRegular1.setText("Regular");
        rbRegular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/regular_naos.png"))); // NOI18N
        rbRegular1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/regular_rollover.png"))); // NOI18N
        rbRegular1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/regular_selec.png"))); // NOI18N
        rbRegular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegular1ActionPerformed(evt);
            }
        });

        grupoPergunta2.add(rbBom1);
        rbBom1.setText("Bom");
        rbBom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bom_naos.png"))); // NOI18N
        rbBom1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bom_rollover.png"))); // NOI18N
        rbBom1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bom_selec.png"))); // NOI18N
        rbBom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBom1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jltitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlPergunta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel2Layout.createSequentialGroup()
                .addComponent(rbPessimo1)
                .addGap(18, 18, 18)
                .addComponent(rbRuim1)
                .addGap(18, 18, 18)
                .addComponent(rbRegular1)
                .addGap(18, 18, 18)
                .addComponent(rbBom1)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addComponent(jltitulo1)
                .addGap(18, 18, 18)
                .addComponent(jlPergunta1)
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRuim1)
                    .addComponent(rbPessimo1)
                    .addComponent(rbRegular1)
                    .addComponent(rbBom1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        painelPrincipal.add(painel2, "pergunta2");

        jltitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jltitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltitulo2.setText("Sugestão");

        jlPergunta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlPergunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPergunta2.setText("<html>É muito importante pra nós você deixar alguma sugestão para que possamos melhorar ainda mais o nosso serviço. (Opcional)</html>");

        jTextArea1.setColumns(5);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jltitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
            .addGroup(painel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlPergunta2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addComponent(jltitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPergunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPrincipal.add(painel3, "sugestao");

        botaoAvancar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoAvancar.setText("Avançar >>");
        botaoAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAvancarActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoVoltar.setText("<< Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botaoVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAvancar)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAvancar)
                    .addComponent(botaoVoltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbRuimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRuimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRuimActionPerformed

    private void rbPessimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPessimoActionPerformed

    private void rbBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBomActionPerformed

    private void rbRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRegularActionPerformed

    private void rbPessimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessimo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPessimo1ActionPerformed

    private void rbRuim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRuim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRuim1ActionPerformed

    private void rbRegular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRegular1ActionPerformed

    private void rbBom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBom1ActionPerformed

    private void botaoAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAvancarActionPerformed
        cardAtual++;
        
        if(cardAtual==3)
            botaoAvancar.setText("Finalizar pesquisa");
        else if(cardAtual>3){
            JOptionPane.showMessageDialog(this, "Muito obrigado! :)", 
                    "Pesquisa finalizada", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
        CardLayout card = (CardLayout) painelPrincipal.getLayout();
        card.next(painelPrincipal);        
        
    }//GEN-LAST:event_botaoAvancarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        
        if(cardAtual>1){
            botaoAvancar.setText("Avançar >>");
            
            cardAtual--;
            CardLayout card = (CardLayout) painelPrincipal.getLayout();
            card.previous(painelPrincipal); 
        }
        
    }//GEN-LAST:event_botaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAvancar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.ButtonGroup grupoPergunta1;
    private javax.swing.ButtonGroup grupoPergunta2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlPergunta;
    private javax.swing.JLabel jlPergunta1;
    private javax.swing.JLabel jlPergunta2;
    private javax.swing.JLabel jltitulo;
    private javax.swing.JLabel jltitulo1;
    private javax.swing.JLabel jltitulo2;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JRadioButton rbBom;
    private javax.swing.JRadioButton rbBom1;
    private javax.swing.JRadioButton rbPessimo;
    private javax.swing.JRadioButton rbPessimo1;
    private javax.swing.JRadioButton rbRegular;
    private javax.swing.JRadioButton rbRegular1;
    private javax.swing.JRadioButton rbRuim;
    private javax.swing.JRadioButton rbRuim1;
    // End of variables declaration//GEN-END:variables
}
