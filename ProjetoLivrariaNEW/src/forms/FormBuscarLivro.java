/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Livro;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiago Oliveira
 */
public class FormBuscarLivro extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
        public FormBuscarLivro() {
        initComponents();
        
        this.modelo = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCodigo = new javax.swing.JTextField();
        btBuscarLivro = new javax.swing.JButton();
        cbBuscarTodos = new javax.swing.JCheckBox();
        lbCodigo = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btExclur = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Livros em Acervo");

        btBuscarLivro.setText("Buscar Livro");
        btBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLivroActionPerformed(evt);
            }
        });

        cbBuscarTodos.setText("Buscar todos");
        cbBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarTodosActionPerformed(evt);
            }
        });

        lbCodigo.setText("Código");

        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btExclur.setText("Excluir");
        btExclur.setEnabled(false);
        btExclur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExclurActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Título", "Fornecedor", "Qtde", "Valor Unitário", "Data de Publicação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCodigo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(btBuscarLivro)
                                    .addGap(60, 60, 60)
                                    .addComponent(cbBuscarTodos)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEditar)
                                .addGap(109, 109, 109)
                                .addComponent(btExclur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSair)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarLivro)
                    .addComponent(cbBuscarTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btSair)
                    .addComponent(btExclur))
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(784, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLivroActionPerformed
        // TODO add your handling code here:
        limparTabela();
        
        if(cbBuscarTodos.isSelected()){ // buscar todos os livros
            
            List<Livro> lista = FormPricipal.daoLivro.todosLivros();
            for(Livro l: lista){
                incluirLivro(l);
            }
        }
        else{ // buscar um so
            
            if(tfCodigo.getText().trim().length() != 0){
                
                int codigo = Integer.parseInt(tfCodigo.getText());
                Livro livro = FormPricipal.daoLivro.buscarLivro(Integer.toString(codigo));
                if(livro != null){
                    incluirLivro(livro);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Livro nao encontrado", "Atencao", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Prencher o codigo", "Atencao", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_btBuscarLivroActionPerformed

    private void cbBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarTodosActionPerformed
        // TODO add your handling code here:
        if(cbBuscarTodos.isSelected()){
            tfCodigo.setEnabled(false);
        }
        else{
            tfCodigo.setEnabled(true);
            tfCodigo.requestFocus();
            tfCodigo.setText("");
        }
    }//GEN-LAST:event_cbBuscarTodosActionPerformed

    
    
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btExclurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExclurActionPerformed
        // TODO add your handling code here:
        
        Livro livro = getLivro();
        FormPricipal.daoLivro.removerLivro(livro.getCodigo());
        
        modelo.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_btExclurActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        Livro livro = getLivro();
        
        FormLivros frm = new FormLivros();
        frm.setVisible(true);
        frm.livro = livro;
        this.dispose();
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        btEditar.setEnabled(true);
        btExclur.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void limparTabela(){
        for (int i = jTable1.getRowCount() - 1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void incluirLivro(Livro livro){
        modelo.addRow(new Object[]{livro.getCodigo(), livro.getTitulo(), livro.getEditora(), livro.getEstoque(),
            livro.getValor(), livro.getDataPublicacao()});
        
    }
    
    private Livro getLivro(){
        Livro livro = new Livro();
        int linha = jTable1.getSelectedRow();
        
        livro.setCodigo((String) modelo.getValueAt(linha, 0));
        livro.setTitulo((String) modelo.getValueAt(linha, 1));
        livro.setEditora((String) modelo.getValueAt(linha, 2));
        livro.setEstoque((Integer) modelo.getValueAt(linha, 3));
        livro.setValor((Float) modelo.getValueAt(linha, 4));
        livro.setDataPublicacao((String) modelo.getValueAt(linha, 5));
        
        return livro;
    }
    
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
            java.util.logging.Logger.getLogger(FormBuscarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarLivro;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExclur;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox cbBuscarTodos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables
}
