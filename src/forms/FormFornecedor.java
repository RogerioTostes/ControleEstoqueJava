/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Fornecedor;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Rogério e Octavio
 */
public class FormFornecedor extends javax.swing.JFrame {

    public Fornecedor fornecedor = null;

    /**
     * Creates new form FormCliente
     */
    public FormFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstadoCivil = new javax.swing.ButtonGroup();
        lbCpf = new javax.swing.JLabel();
        tfCnpj = new javax.swing.JFormattedTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        abas = new javax.swing.JTabbedPane();
        PainelDados = new javax.swing.JPanel();
        lbTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JFormattedTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbEmail1 = new javax.swing.JLabel();
        tfInsc = new javax.swing.JTextField();
        painelEndereço = new javax.swing.JPanel();
        tfLogradouro = new javax.swing.JTextField();
        lbLogradouro = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lbCep = new javax.swing.JLabel();
        tfCep = new javax.swing.JFormattedTextField();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCpf.setText("CNPJ");
        getContentPane().add(lbCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        try {
            tfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCnpjActionPerformed(evt);
            }
        });
        getContentPane().add(tfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));

        lbNome.setText("Nome Completo:");
        getContentPane().add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 330, -1));

        lbTelefone.setText("Telefone:");

        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbEmail.setText("Email:");

        lbEmail1.setText("Incs.Mun");

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDadosLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail1)
                    .addComponent(tfInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTelefone)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(229, 229, 229))
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lbEmail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfInsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        abas.addTab("Dados Pessoais", PainelDados);

        painelEndereço.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelEndereço.add(tfLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 519, -1));

        lbLogradouro.setText("Logradouro");
        painelEndereço.add(lbLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lbComplemento.setText("Complemento");
        painelEndereço.add(lbComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        painelEndereço.add(tfComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 263, -1));

        lbCidade.setText("Cidade");
        painelEndereço.add(lbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));
        painelEndereço.add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 193, -1));

        lbEstado.setText("Estado");
        painelEndereço.add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minas Gerais", "Rio de Janeiro", "São Paulo" }));
        painelEndereço.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 133, -1));

        lbCep.setText("CEP");
        painelEndereço.add(lbCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        painelEndereço.add(tfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 132, -1));

        abas.addTab("Endereço Completo", painelEndereço);

        getContentPane().add(abas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/lorry_add.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 40));

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/pencil.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 100, 40));

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/arrow_refresh.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 40));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/door_out.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 100, 40));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/magnifier.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 110, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCnpjActionPerformed


    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        // Criar o objeto e preenche-lo
        Fornecedor fornecedor = new Fornecedor();

        // Pegar os dados da tela
        fornecedor.setCnpj(tfCnpj.getText());
        fornecedor.setNome(tfNome.getText());
        fornecedor.setTelefone(tfTelefone.getText());
        fornecedor.setEmail(tfEmail.getText());
        fornecedor.setInsc(tfInsc.getText());

        fornecedor.getEndereco().setLogradouro(tfLogradouro.getText());
        fornecedor.getEndereco().setComplemento(tfComplemento.getText());
        fornecedor.getEndereco().setCidade(tfCidade.getText());
        fornecedor.getEndereco().setEstado(cbEstado.getSelectedItem().toString());
        fornecedor.getEndereco().setCep(tfCep.getText());

        // Salvar na base de dados
        FormPricipal.daoFornecedor.adicionarFornecedor(fornecedor);
        JOptionPane.showMessageDialog(null, "Forncedor cadastrado com sucesso", "Cadastro de Forncedores", JOptionPane.INFORMATION_MESSAGE);

        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void limpar() {

        tfCnpj.setText("");
        tfNome.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
        tfInsc.setText("");

        abas.setSelectedIndex(0);

        tfLogradouro.setText("");
        tfComplemento.setText("");
        tfCidade.setText("");
        cbEstado.setSelectedIndex(-1);
        tfCep.setText("");

        tfCnpj.requestFocus();

    }

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        String cnpj = tfCnpj.getText();
        Fornecedor fornecedor = FormPricipal.daoFornecedor.buscarFornecedor(cnpj);
        
          if(fornecedor != null){
        tfNome.setText(fornecedor.getNome());
        tfTelefone.setText(fornecedor.getTelefone());
        tfEmail.setText(fornecedor.getEmail());
        tfInsc.setText(fornecedor.getInsc());
        // setar o estado civil nos campos radio
        //     JRadioButton radio;
        //   Enumeration en = bgEstadoCivil.getElements();
        //    while (en.hasMoreElements()) {
        //        radio = (JRadioButton) en.nextElement();
        //        if (radio.getText().equals(fornecedor.getEstadoCivil())) {
        //           radio.setSelected(true);
        //        }
        //    }

        tfLogradouro.setText(fornecedor.getEndereco().getLogradouro());
        tfComplemento.setText(fornecedor.getEndereco().getComplemento());
        tfCidade.setText(fornecedor.getEndereco().getCidade());
        // setar cep no combobox
        for (int i = 0; i < cbEstado.getItemCount(); i++) {
            if (cbEstado.getItemAt(i).equals(fornecedor.getEndereco().getEstado())) {
                cbEstado.setSelectedItem(i);
            }
        }
        tfCep.setText(fornecedor.getEndereco().getCep());
           btAtualizar.setEnabled(true);
          }
          
          else{
               JOptionPane.showMessageDialog(null, "Fornecedor não encontrado", "Atenção", JOptionPane.ERROR_MESSAGE);
              
          }

    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
        // Criar o objeto e preenche-lo
        Fornecedor fornecedor = new Fornecedor();

        // Pegar os dados da tela
        fornecedor.setCnpj(tfCnpj.getText());
        fornecedor.setNome(tfNome.getText());
        fornecedor.setTelefone(tfTelefone.getText());
        fornecedor.setEmail(tfEmail.getText());
        fornecedor.setInsc(tfInsc.getText());

        fornecedor.getEndereco().setLogradouro(tfLogradouro.getText());
        fornecedor.getEndereco().setComplemento(tfComplemento.getText());
        fornecedor.getEndereco().setCidade(tfCidade.getText());
        fornecedor.getEndereco().setEstado(cbEstado.getSelectedItem().toString());
        fornecedor.getEndereco().setCep(tfCep.getText());

        // Salvar na base de dados
        FormPricipal.daoFornecedor.alterarFornecedor(fornecedor);
        JOptionPane.showMessageDialog(null, "Forncedor alterado com sucesso", "Cadastro de Forncedores", JOptionPane.INFORMATION_MESSAGE);

        limpar();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelDados;
    private javax.swing.JTabbedPane abas;
    private javax.swing.ButtonGroup bgEstadoCivil;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmail1;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel painelEndereço;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JFormattedTextField tfCnpj;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfInsc;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
