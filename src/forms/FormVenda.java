/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Fornecedor;
import classes.Item;
import classes.Peça;
import classes.Venda;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Gerim
 */
public class FormVenda extends javax.swing.JFrame {
    private Venda venda = null;
    private Fornecedor fornecedor = null;
    private Peça peça = null;
    
    private float soma = 0;
    
    DefaultTableModel modelo = null;
    
    /**
     * Creates new form FormVenda
     */
    public FormVenda() {
        initComponents();
        venda = new Venda();
        modelo = (DefaultTableModel)jTable1.getModel();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNroVenda = new javax.swing.JLabel();
        lbDataVenda = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btBuscarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btConfirmaCliente = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btBuscarItem = new javax.swing.JButton();
        tfCodLivro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbEditora = new javax.swing.JLabel();
        lbValorUnitario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        btIncluirLivro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btRemoverItem = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        btFecharVenda = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Venda N°:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 16, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Data da Venda:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 16, -1, -1));

        lbNroVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNroVenda.setForeground(new java.awt.Color(0, 204, 51));
        jPanel1.add(lbNroVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 14, -1, -1));

        lbDataVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDataVenda.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(lbDataVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 14, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 11, 600, 60));

        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 103, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CPF:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 71, -1, -1));

        btBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscarCliente.png"))); // NOI18N
        btBuscarCliente.setText("Buscar");
        btBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 92, -1, -1));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nome do Cliente:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Endereço Completo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 14, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Telefone:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 14, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Email:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 14, -1, -1));

        btConfirmaCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btConfirmaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icConfirmarCliente.png"))); // NOI18N
        btConfirmaCliente.setText("Confirmar");
        btConfirmaCliente.setEnabled(false);
        btConfirmaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmaClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btConfirmaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 15, -1, -1));

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 102, 0));
        jPanel2.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 39, -1, -1));

        lbEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(lbEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 39, -1, -1));

        lbTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(lbTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 39, -1, -1));

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 39, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 883, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Dados do Cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, -1, -1));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Código do Livro:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        btBuscarItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btBuscarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscarItem.png"))); // NOI18N
        btBuscarItem.setText("Buscar Item");
        btBuscarItem.setEnabled(false);
        btBuscarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarItemActionPerformed(evt);
            }
        });
        jPanel3.add(btBuscarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 22, -1, -1));
        jPanel3.add(tfCodLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 34, 89, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Título:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 14, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Editora:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 14, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Valor unitário:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 14, -1, -1));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 33, -1, -1));

        lbEditora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(lbEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 37, -1, -1));

        lbValorUnitario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbValorUnitario.setForeground(new java.awt.Color(0, 153, 255));
        jPanel3.add(lbValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 34, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, 883, 80));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Livros a Escolher:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Quantidade:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 382, -1, -1));
        getContentPane().add(tfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 412, 68, -1));

        btIncluirLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icIncluirItem.png"))); // NOI18N
        btIncluirLivro.setText("Incluir");
        btIncluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btIncluirLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 402, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(70);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(1).setMinWidth(400);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(400);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 454, 710, 91));

        btRemoverItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icRemoverItem.png"))); // NOI18N
        btRemoverItem.setText("Remover Item");
        btRemoverItem.setEnabled(false);
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });
        getContentPane().add(btRemoverItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 504, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Valor Total:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 553, -1, -1));

        lbTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbTotal.setText("R$ 00,00");
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 551, -1, -1));

        btFecharVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btFecharVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icFecharVenda.png"))); // NOI18N
        btFecharVenda.setText("Fechar Venda");
        btFecharVenda.setEnabled(false);
        btFecharVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btFecharVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 594, -1, -1));

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 594, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 594, -1, 41));

        setSize(new java.awt.Dimension(960, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lbNroVenda.setText(Integer.toString(FormPricipal.daoVenda.Proximo()));
        lbDataVenda.setText(venda.getData());        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        fornecedor = FormPricipal.daoFornecedor.buscarFornecedor(tfCpf.getText());
        if(fornecedor != null)
        {
            lbNome.setText(fornecedor.getNome());
            lbEndereco.setText(fornecedor.getEndereco().getLogradouro());
            lbTelefone.setText(fornecedor.getEmail());
            lbEmail.setText(fornecedor.getEmail());
            
            btConfirmaCliente.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            tfCpf.requestFocus();
            
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_btBuscarClienteActionPerformed

    private void btBuscarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarItemActionPerformed
        peça = FormPricipal.daoPeça.buscarPeça(tfCodLivro.getText());
        if(peça != null)
        {
            lbTitulo.setText(peça.getTitulo());
            lbEditora.setText(peça.getEditora());
            lbValorUnitario.setText(Float.toString(peça.getValor()));
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Livro não encontrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            tfCodLivro.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarItemActionPerformed

    private void btConfirmaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmaClienteActionPerformed
        venda.setCliente(fornecedor);
        btConfirmaCliente.setEnabled(false);
        btBuscarItem.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btConfirmaClienteActionPerformed

    private void btIncluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirLivroActionPerformed
        int quantidade = Integer.parseInt(tfQuantidade.getText());
        if(quantidade >0)
        {
            Item it = new Item(peça);
            it.setQuantidade(quantidade);
            it.calcularValorItem();
            
            venda.adicionarItem(it);
            modelo.addRow(new Object[]{peça.getCodigo(),peça.getTitulo(),quantidade,peça.getValor(),it.getValorItem()});
            soma += it.getValorItem();
            lbTotal.setText("R$ "+ Float.toString(soma));
            
            btFecharVenda.setEnabled(true);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Quantidade Inválida!\nFavor preencher valor maior que zero!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            tfQuantidade.requestFocus();
        }
    }//GEN-LAST:event_btIncluirLivroActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        int linha = jTable1.getSelectedRow();
        int codigo = (Integer)modelo.getValueAt(linha, 0);
        float valor = (Float)modelo.getValueAt(linha, 4);
        
        soma -= valor;
        
        lbTotal.setText(Float.toString(soma));
        
        venda.removeItem(codigo);
        modelo.removeRow(linha);
        
    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
//        JOptionPane.showConfirmDialog(null, "Deseja cancelar a venda?", "Confirmação", JOptionPane.YES_NO_OPTION);
        int op = JOptionPane.showConfirmDialog(null, "Deseja cancelar a venda?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(op==JOptionPane.YES_OPTION)
        {
        venda = new Venda();
        //venda.setNumero(venda.getNumero()-1);
        lbNroVenda.setText(Integer.toString(FormPricipal.daoVenda.Proximo()));
        lbDataVenda.setText(venda.getData());
        
        btConfirmaCliente.setEnabled(true);
        limparVenda();
        
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btFecharVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharVendaActionPerformed
//        JOptionPane.showConfirmDialog(null, "Deseja Finalizar a venda?", "Confirmação", JOptionPane.QUESTION_MESSAGE);
        int op = JOptionPane.showConfirmDialog(null, "Deseja Finalizar a venda?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(op==JOptionPane.YES_OPTION)
        {
//            venda.setValorTotal(soma);
              venda.calcularTotal();
              venda.setNumero(FormPricipal.daoVenda.Proximo());
              FormPricipal.daoVenda.inserirVenda(venda);
              
              JOptionPane.showMessageDialog(null, "Venda Efetuada com sucesso.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
              
              venda = new Venda();
              limparVenda();
              btConfirmaCliente.setEnabled(true);
        }
    }//GEN-LAST:event_btFecharVendaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void limparTabela()
    {
        for (int i = jTable1.getRowCount() - 1; i >= 0; --i)
        {
                modelo.removeRow(i);
        }
    }
    
    private void limparVenda()
    {
        tfCpf.setText("");
        tfCodLivro.setText("");
        tfQuantidade.setText("");
        lbEditora.setText("");
        lbEmail.setText("");
        lbEndereco.setText("");
        lbNome.setText("");
        lbTelefone.setText("");
        lbTitulo.setText("");
        lbTotal.setText("");
        lbValorUnitario.setText("");
        limparTabela();
    }
    
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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btBuscarItem;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmaCliente;
    private javax.swing.JButton btFecharVenda;
    private javax.swing.JButton btIncluirLivro;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbDataVenda;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNroVenda;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbValorUnitario;
    private javax.swing.JTextField tfCodLivro;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables
}
