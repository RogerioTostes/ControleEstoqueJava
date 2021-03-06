/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Usuario;

/**
 *
 * @author Rogério e Octavio
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public FormLogin() {
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

        lbLogin = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        btEfetuar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        tfSenha = new javax.swing.JPasswordField();
        lbMensagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Processo de Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(51, 51, 255));
        lbLogin.setText("Digite o seu login");
        getContentPane().add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        lbSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(51, 51, 255));
        lbSenha.setText("Digite sua senha");
        getContentPane().add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, -1));

        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });
        getContentPane().add(tfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 250, 30));

        btEfetuar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEfetuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/accept.png"))); // NOI18N
        btEfetuar.setText("Efetuar");
        btEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEfetuarActionPerformed(evt);
            }
        });
        getContentPane().add(btEfetuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 40));

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, 40));

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/door_out.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btSairMouseMoved(evt);
            }
        });
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btSairMouseReleased(evt);
            }
        });
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 120, 40));

        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        tfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSenhaKeyReleased(evt);
            }
        });
        getContentPane().add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 250, 30));

        lbMensagem.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/key.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensProjeto/user_suit.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        setSize(new java.awt.Dimension(448, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEfetuarActionPerformed
        // TODO add your handling code here:
        String matricula = tfLogin.getText();
        String senha = tfSenha.getText();
        
        Usuario user = new Usuario();
        
        if(user.validarMatricula(matricula))
        {
            
            if(user.validarSenha(senha))
            {
                
                if(user.efetuarLogin(matricula, senha))
                {
                   // lbMensagem.setText("Login Efetuado com sucesso!");
                    new FormPricipal().setVisible(true);
                    this.dispose();
                }
                else
                {
                    lbMensagem.setText("Login Incorreto!");
                }
                    
            }
            else
            {
                    lbMensagem.setText("Matricula/Senha incorreto!");
            }
        }
        else
        {
            lbMensagem.setText("Matricula/Senha incorreto!");
        }
        
    }//GEN-LAST:event_btEfetuarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        tfLogin.setText("");
        tfSenha.setText("");
        lbMensagem.setText("");
        
        tfLogin.requestFocus();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();// metodo para fechar a janela
    }//GEN-LAST:event_btSairActionPerformed

    private void btSairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMouseMoved

    private void btSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairMouseReleased

    private void tfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSenhaKeyReleased
        // TODO add your handling code here:
//        if(tfSenha.getText() != null){
//            evt.setKeyChar('#13');
//        }
    }//GEN-LAST:event_tfSenhaKeyReleased

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEfetuar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables

    private void mouseExit(int EXIT_ON_CLOSE, int WIDTH, int WIDTH0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
