/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author u04127224290
 */
public class JFrmPrincipal extends javax.swing.JFrame {

  

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema de Compra e Venda");
        setExtendedState(MAXIMIZED_BOTH);
         JFrmLogim JFrmLogim = new JFrmLogim();
            JFrmLogim.dispose();
       
        
    }

  

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMmuSair = new javax.swing.JMenu();
        jMmuUsuarios = new javax.swing.JMenuItem();
        jMmuClientes = new javax.swing.JMenuItem();
        jMmuFornecedor = new javax.swing.JMenuItem();
        jMmuFuncionarios = new javax.swing.JMenuItem();
        jMmuAdm = new javax.swing.JMenuItem();
        jMmuProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMmuSairr = new javax.swing.JMenuItem();
        jMmuCompras_Vendas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMmuSair.setMnemonic('C');
        jMmuSair.setText("Cadastros");
        jMmuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuSairActionPerformed(evt);
            }
        });

        jMmuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMmuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jMmuUsuarios.setMnemonic('u');
        jMmuUsuarios.setText("Usuarios");
        jMmuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuUsuariosActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuUsuarios);

        jMmuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMmuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMmuClientes.setMnemonic('c');
        jMmuClientes.setText("Clientes");
        jMmuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuClientesActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuClientes);

        jMmuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMmuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3d_group.png"))); // NOI18N
        jMmuFornecedor.setMnemonic('F');
        jMmuFornecedor.setText("Fornecedor");
        jMmuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuFornecedorActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuFornecedor);

        jMmuFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMmuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/client_user.png"))); // NOI18N
        jMmuFuncionarios.setMnemonic('f');
        jMmuFuncionarios.setText("Funcionario");
        jMmuFuncionarios.setMaximumSize(new java.awt.Dimension(32667, 32767));
        jMmuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuFuncionariosActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuFuncionarios);

        jMmuAdm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMmuAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/task.png"))); // NOI18N
        jMmuAdm.setMnemonic('a');
        jMmuAdm.setText("Administrador");
        jMmuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuAdmActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuAdm);

        jMmuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMmuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        jMmuProduto.setMnemonic('p');
        jMmuProduto.setText("Produto");
        jMmuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuProdutoActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuProduto);
        jMmuSair.add(jSeparator1);

        jMmuSairr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMmuSairr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMmuSairr.setMnemonic('s');
        jMmuSairr.setText("Sair");
        jMmuSairr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuSairrActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuSairr);

        jMenuBar1.add(jMmuSair);

        jMmuCompras_Vendas.setMnemonic('m');
        jMmuCompras_Vendas.setText("Movimentos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/stats_pie_chart.png"))); // NOI18N
        jMenuItem1.setMnemonic('c');
        jMenuItem1.setText("Compras_Vendas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMmuCompras_Vendas.add(jMenuItem1);

        jMenuBar1.add(jMmuCompras_Vendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMmuSairrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuSairrActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMmuSairrActionPerformed

    private void jMmuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuSairActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMmuSairActionPerformed

    private void jMmuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuUsuariosActionPerformed
        // TODO add your handling code here:
         JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(this, true);
                jDlgUsuarios.setVisible(true);
                
    }//GEN-LAST:event_jMmuUsuariosActionPerformed

    private void jMmuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuFornecedorActionPerformed
        // TODO add your handling code here:
         JDlgFornecedor JDlgFornecedor = new JDlgFornecedor(this, true);
                JDlgFornecedor.setVisible(true);
    }//GEN-LAST:event_jMmuFornecedorActionPerformed

    private void jMmuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuProdutoActionPerformed

JDlgProdutos JDlgProdutos = new JDlgProdutos(this, true);
                JDlgProdutos.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMmuProdutoActionPerformed

    private void jMmuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuFuncionariosActionPerformed
      JDlgFuncionario JDlgFuncionario = new JDlgFuncionario(this, true);
                JDlgFuncionario.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMmuFuncionariosActionPerformed

    private void jMmuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuClientesActionPerformed
        // TODO add your handling code here:
         JDlgCliente JDlgCliente = new JDlgCliente(this, true);
                JDlgCliente.setVisible(true);
    }//GEN-LAST:event_jMmuClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMmuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuAdmActionPerformed
        // TODO add your handling code here:
         JDlgAdm JDlgAdm = new JDlgAdm(this, true);
                JDlgAdm.setVisible(true);
    }//GEN-LAST:event_jMmuAdmActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 JFrmLogim JFrmLogim = new JFrmLogim();
            JFrmLogim.setVisible(true) ;
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMmuAdm;
    private javax.swing.JMenuItem jMmuClientes;
    private javax.swing.JMenu jMmuCompras_Vendas;
    private javax.swing.JMenuItem jMmuFornecedor;
    private javax.swing.JMenuItem jMmuFuncionarios;
    private javax.swing.JMenuItem jMmuProduto;
    private javax.swing.JMenu jMmuSair;
    private javax.swing.JMenuItem jMmuSairr;
    private javax.swing.JMenuItem jMmuUsuarios;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
