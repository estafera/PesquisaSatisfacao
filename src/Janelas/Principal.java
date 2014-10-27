/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

/**
 *
 * @author Ramon Honorio
 */
public class Principal extends javax.swing.JFrame {
    Questionario quest;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        quest = new Questionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        btNovaPesquisa = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Olá, (nome do taxista)!");

        btNovaPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/nova pesquisa naos.png"))); // NOI18N
        btNovaPesquisa.setText("Nova pesquisa");
        btNovaPesquisa.setContentAreaFilled(false);
        btNovaPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovaPesquisa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/nova pesquisa rollover.png"))); // NOI18N
        btNovaPesquisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaPesquisaActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/logout.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setContentAreaFilled(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setIconTextGap(0);
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoes/logout rollover.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Titulo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Bem vindo ao sistema de pesquisa de satisfação Raikon.");

        Titulo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("O que deseja fazer?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btNovaPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(Titulo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(Titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovaPesquisa)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaPesquisaActionPerformed
        // TODO add your handling code here:
        quest.dispose();
        quest = new Questionario();
        quest.setVisible(true);
    }//GEN-LAST:event_btNovaPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton btNovaPesquisa;
    private javax.swing.JButton btSair;
    // End of variables declaration//GEN-END:variables
}