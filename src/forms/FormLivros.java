/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Peça;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Oliveira
 */
public class FormLivros extends javax.swing.JFrame {

    public Peça peça = null;
    
    
    public FormLivros() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCodigo = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        boxFronecedor = new javax.swing.JComboBox<>();
        lbFornecedor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        tfQuantidade = new javax.swing.JTextField();
        tfDataPublicacao = new javax.swing.JFormattedTextField();
        lbValor = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livros (Acervo)");
        setMaximumSize(new java.awt.Dimension(90, 70));
        setMinimumSize(new java.awt.Dimension(90, 70));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, -1));
        getContentPane().add(tfTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 310, -1));

        lbCodigo.setText("Código");
        getContentPane().add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lbTitulo.setText("Título");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        boxFronecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Editora Vozes", "Editora Arqueiro", "Editora Rocco" }));
        boxFronecedor.setEnabled(false);
        getContentPane().add(boxFronecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, -1));

        lbFornecedor.setText("Fornecedor");
        getContentPane().add(lbFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(tfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 150, -1));
        getContentPane().add(tfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 150, -1));

        try {
            tfDataPublicacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfDataPublicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 150, -1));

        lbValor.setText("Valor Unitário");
        getContentPane().add(lbValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        lbQuantidade.setText("Quantidade em estoque");
        getContentPane().add(lbQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        lbData.setText("Data de Publicação");
        getContentPane().add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.setPreferredSize(new java.awt.Dimension(95, 75));

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/habilitado.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        jToolBar2.add(btCadastrar);

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icAtualizar.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAtualizar.setMaximumSize(new java.awt.Dimension(90, 70));
        btAtualizar.setMinimumSize(new java.awt.Dimension(90, 70));
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jToolBar2.add(btAtualizar);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMaximumSize(new java.awt.Dimension(1, 75));
        jToolBar2.add(jSeparator2);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMaximumSize(new java.awt.Dimension(90, 70));
        btCancelar.setMinimumSize(new java.awt.Dimension(90, 70));
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar2.add(btCancelar);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setMaximumSize(new java.awt.Dimension(1, 75));
        jToolBar2.add(jSeparator1);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMaximumSize(new java.awt.Dimension(90, 70));
        btSair.setMinimumSize(new java.awt.Dimension(90, 70));
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar2.add(btSair);

        getContentPane().add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 80));

        setSize(new java.awt.Dimension(687, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar vários livros?", "Cadastrar Livro", JOptionPane.YES_NO_OPTION);
        
        if(opcao == JOptionPane.YES_OPTION){
            cadastrarLivro();
            JOptionPane.showMessageDialog(null, "Livros cadastrados com sucesso", "Alerta de cadastro", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        Peça peça = new Peça();
        int cont = 0; 
        
        this.peça.setCodigo(tfCodigo.getText());
        this.peça.setTitulo(tfTitulo.getText());
        this.peça.setEditora(boxFronecedor.getSelectedItem().toString());
        this.peça.setValor(Float.parseFloat(tfValor.getText()));
        this.peça.setEstoque(Integer.parseInt(tfQuantidade.getText()));
        this.peça.setDataPublicacao(tfDataPublicacao.getText());
        
        FormPricipal.daoPeça.adicionarPeça(this.peça);
        JOptionPane.showMessageDialog(null, "Livro Cadastrado!" , "Cadastro de Livros", JOptionPane.INFORMATION_MESSAGE);
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    public void cadastrarLivro(){
        Peça peça = null;
        for(int i = 1; i < 31; i++){
            
            peça = new Peça();
            peça.setCodigo(Integer.toString(1000+i));
            peça.setTitulo("Livro com Titulo " + i);
            peça.setEditora("Editora" + i+10);
            peça.setEstoque((int) (Math.random() * 10) + 10 * i);
            peça.setValor((50%i) + (i*10));
            peça.setDataPublicacao(i+"/08/"+1990+i);
            
            FormPricipal.daoPeça.adicionarPeça(peça);
            
        }
    }
    
    private void limpar(){
    
        tfCodigo.setText("");
        tfTitulo.setText("");
        boxFronecedor.setSelectedIndex(-1);
        tfValor.setText("");
        tfQuantidade.setText("");
        tfDataPublicacao.setText("");
    }
    
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btCadastrarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarAncestorAdded

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        if(peça != null){
            
            btAtualizar.setEnabled(true);
            tfCodigo.setEnabled(false);
            
            tfCodigo.setText(peça.getCodigo());
            tfTitulo.setText(peça.getTitulo());
            
            for (int i = 0; i < boxFronecedor.getItemCount(); i++){
                if(boxFronecedor.getItemAt(i).equals(peça.getEditora())){
                boxFronecedor.setSelectedItem(i);
                }
            }
            
            tfValor.setText(Float.toString(peça.getValor()));
            tfQuantidade.setText(Integer.toString(peça.getEstoque()));
            tfDataPublicacao.setText(peça.getDataPublicacao());
        }
        else{
        
            btAtualizar.setEnabled(false);
            tfCodigo.setEnabled(true);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

        Peça peça = new Peça();
        
        peça.setCodigo(tfCodigo.getText());
        peça.setTitulo(tfTitulo.getText());
        peça.setEditora(boxFronecedor.getSelectedItem().toString());
        peça.setValor(Float.parseFloat(tfValor.getText()));
        peça.setEstoque(Integer.parseInt(tfQuantidade.getText()));
        peça.setDataPublicacao(tfDataPublicacao.getText());
        
        FormPricipal.daoPeça.alterarPeça(peça);
    }//GEN-LAST:event_btAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FormLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxFronecedor;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfDataPublicacao;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
