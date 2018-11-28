/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Fornecedor;
import classes.Peça;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerim
 */
public class FormPeças extends javax.swing.JFrame {

    public Peça peça = null;
    private Fornecedor fornecedor = null;

    public FormPeças() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCodigo = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        boxFornecedor = new javax.swing.JComboBox<>();
        lbFornecedor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        tfQuantidade = new javax.swing.JTextField();
        tfDataCadastro = new javax.swing.JFormattedTextField();
        lbValor = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livros (Acervo)");
        setMinimumSize(new java.awt.Dimension(90, 70));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, -1));
        getContentPane().add(tfDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 310, -1));

        lbCodigo.setText("Código");
        getContentPane().add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lbTitulo.setText("Descrição");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        boxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peças Aguiar", "SP Peças", "Auto Peças" }));
        boxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(boxFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, -1));

        lbFornecedor.setText("Fornecedor");
        getContentPane().add(lbFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        getContentPane().add(tfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, -1));
        getContentPane().add(tfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 150, -1));

        try {
            tfDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 150, -1));

        lbValor.setText("Valor Unitário");
        getContentPane().add(lbValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lbQuantidade.setText("Quantidade em estoque");
        getContentPane().add(lbQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        lbData.setText("Cadastrado em");
        getContentPane().add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/door_out.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btSair.setMaximumSize(new java.awt.Dimension(90, 70));
        btSair.setMinimumSize(new java.awt.Dimension(90, 70));
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCancelar.setMaximumSize(new java.awt.Dimension(90, 70));
        btCancelar.setMinimumSize(new java.awt.Dimension(90, 70));
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/pencil.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btAtualizar.setMaximumSize(new java.awt.Dimension(90, 70));
        btAtualizar.setMinimumSize(new java.awt.Dimension(90, 70));
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/wrench.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCadastrar.setMaximumSize(new java.awt.Dimension(90, 70));
        btCadastrar.setMinimumSize(new java.awt.Dimension(90, 70));
        btCadastrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desabilitado.png"))); // NOI18N
        btCadastrar.setVerifyInputWhenFocusTarget(false);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCadastrar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btCadastrarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, -1));

        setSize(new java.awt.Dimension(687, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cadastrarLivro() {
        Peça peça = null;
        for (int i = 1; i < 31; i++) {

            peça = new Peça();
            peça.setCodigo(Integer.toString(1000 + i));
            peça.setDescricao("Descrição Peça " + i);
            peça.setFornecedor("Fornecedor" + i + 10);
            peça.setEstoque((int) (Math.random() * 10) + 10 * i);
            peça.setValor((50 % i) + (i * 10));
            peça.setDataCadastro(i + "/08/" + 1990 + i);

            FormPricipal.daoPeça.adicionarPeça(peça);

        }
    }

    private void limpar() {

        tfCodigo.setText("");
        tfDescricao.setText("");
        boxFornecedor.setSelectedIndex(-1);
        tfValor.setText("");
        tfQuantidade.setText("");
        tfDataCadastro.setText("");
    }

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        if (peça != null) {

            btAtualizar.setEnabled(true);
            tfCodigo.setEnabled(false);

            tfCodigo.setText(peça.getCodigo());
            tfDescricao.setText(peça.getDescricao());

            for (int i = 0; i < boxFornecedor.getItemCount(); i++) {
                if (boxFornecedor.getItemAt(i).equals(peça.getFornecedor())) {
                    boxFornecedor.setSelectedItem(i);
                }
            }

            tfValor.setText(Float.toString(peça.getValor()));
            tfQuantidade.setText(Integer.toString(peça.getEstoque()));
            tfDataCadastro.setText(peça.getDataCadastro());
        } else {

            btAtualizar.setEnabled(false);
            tfCodigo.setEnabled(true);
        }
        
        
        
        String nome = null;
         List<Fornecedor> listaForn = null;
        Arraylist listaforn = new Arraylist();
        listaForn = FormPricipal.daoFornecedor.todosFornecedores();
   
        for (Fornecedor q : listaForn) {
            boxFornecedor.addItem(q.getNome());
        }

    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

        Peça peça = new Peça();

        peça.setCodigo(tfCodigo.getText());
        peça.setDescricao(tfDescricao.getText());
        peça.setFornecedor(boxFornecedor.getSelectedItem().toString());
        peça.setValor(Float.parseFloat(tfValor.getText()));
        peça.setEstoque(Integer.parseInt(tfQuantidade.getText()));
        peça.setDataCadastro(tfDataCadastro.getText());

        FormPricipal.daoPeça.alterarPeça(peça);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void boxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFornecedorActionPerformed
       
    }//GEN-LAST:event_boxFornecedorActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        /* int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar várias Peças?", "Cadastrar Peça", JOptionPane.YES_NO_OPTION);

        if(opcao == JOptionPane.YES_OPTION){
            cadastrarLivro();
            JOptionPane.showMessageDialog(null, "Peças cadastrados com sucesso", "Alerta de cadastro", JOptionPane.INFORMATION_MESSAGE);

        }

        Peça peça = new Peça();
        int cont = 0;

        this.peça.setCodigo(tfCodigo.getText());
        this.peça.setDescricao(tfDescricao.getText());
        this.peça.setFornecedor(boxFronecedor.getSelectedItem().toString());
        this.peça.setValor(Float.parseFloat(tfValor.getText()));
        this.peça.setEstoque(Integer.parseInt(tfQuantidade.getText()));
        this.peça.setDataCadastro(tfDataCadastro.getText());

        FormPricipal.daoPeça.adicionarPeça(this.peça);
        JOptionPane.showMessageDialog(null, "Peça Cadastrado!" , "Cadastro de Peças", JOptionPane.INFORMATION_MESSAGE);
        limpar(); */
        Peça peca = new Peça();
        int cont = 0;
        peca.setCodigo(tfCodigo.getText());
        peca.setDescricao(tfDescricao.getText());
        peca.setFornecedor(boxFornecedor.getSelectedItem().toString());
        peca.setValor(Float.parseFloat(tfValor.getText()));
        peca.setEstoque(Integer.parseInt(tfQuantidade.getText()));
        peca.setDataCadastro(tfDataCadastro.getText());

        FormPricipal.daoPeça.adicionarPeça(peca);
        JOptionPane.showMessageDialog(null, "Livro Cadastrado!", "Cadastro de Livros", JOptionPane.INFORMATION_MESSAGE);
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCadastrarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btCadastrarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarAncestorAdded

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
            java.util.logging.Logger.getLogger(FormPeças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeças().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxFornecedor;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfDataCadastro;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
