/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import static java.lang.Double.valueOf;

/**
 *
 * @author Luan
 */
public class Telainicial extends javax.swing.JFrame {
    double valor1, valor2 , resultado = 0;
    /**
     * Creates new form Telainicial
     */
    public Telainicial() {
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

        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnresultado = new javax.swing.JButton();
        btnsubtracao = new javax.swing.JButton();
        btnsoma = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        txttela = new javax.swing.JTextField();
        btnmultiplicacao = new javax.swing.JButton();
        btndivisao = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnce = new javax.swing.JButton();
        lbltela = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(100, 180, 73, 31);

        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(200, 180, 73, 31);

        btn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(300, 180, 73, 31);

        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(100, 230, 73, 31);

        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(200, 230, 73, 31);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(100, 280, 73, 31);

        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(200, 280, 73, 31);

        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(300, 280, 73, 31);

        btnresultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnresultado.setText("=");
        btnresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnresultado);
        btnresultado.setBounds(450, 320, 130, 60);

        btnsubtracao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnsubtracao.setText("-");
        btnsubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubtracao);
        btnsubtracao.setBounds(450, 250, 60, 60);

        btnsoma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnsoma.setText("+");
        btnsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsoma);
        btnsoma.setBounds(450, 180, 60, 60);

        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(300, 230, 73, 31);

        txttela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txttela);
        txttela.setBounds(100, 60, 500, 60);

        btnmultiplicacao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnmultiplicacao.setText("*");
        btnmultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiplicacao);
        btnmultiplicacao.setBounds(520, 180, 60, 60);

        btndivisao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btndivisao.setText("/");
        btndivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(btndivisao);
        btndivisao.setBounds(520, 250, 60, 60);

        btn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(100, 320, 79, 31);

        btnce.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnce.setText("CE");
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });
        getContentPane().add(btnce);
        btnce.setBounds(200, 320, 79, 31);

        lbltela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lbltela);
        lbltela.setBounds(144, 24, 440, 30);

        lblBackground.setBackground(new java.awt.Color(204, 204, 204));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 840, 470);

        setSize(new java.awt.Dimension(763, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        
        txttela.setText(txttela.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txttela.setText(txttela.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
      txttela.setText(txttela.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txttela.setText(txttela.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txttela.setText(txttela.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txttela.setText(txttela.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txttela.setText(txttela.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txttela.setText(txttela.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txttela.setText(txttela.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txttela.setText(txttela.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsomaActionPerformed
        boolean controle = true;
        
            valor1 = Double.parseDouble(txttela.getText());
           
            lbltela.setText(lbltela.getText()+valor1);
            resultado = resultado+ valor1;
            lbltela.setText(lbltela.getText() + "+");
            txttela.setText("");
           
    }//GEN-LAST:event_btnsomaActionPerformed

    private void btnmultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacaoActionPerformed
        txttela.setText(txttela.getText() + "*");
    }//GEN-LAST:event_btnmultiplicacaoActionPerformed

    private void btnsubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubtracaoActionPerformed
        txttela.setText(txttela.getText() + "-");
    }//GEN-LAST:event_btnsubtracaoActionPerformed

    private void btndivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisaoActionPerformed
        txttela.setText(txttela.getText() + "/");
    }//GEN-LAST:event_btndivisaoActionPerformed

    private void btnresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultadoActionPerformed
        lbltela.setText(toString(resultado));
        //txttela.setText(txttela.getText() + "=");
    }//GEN-LAST:event_btnresultadoActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
        txttela.setText("");
        lbltela.setText("");
    }//GEN-LAST:event_btnceActionPerformed

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
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telainicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnce;
    private javax.swing.JButton btndivisao;
    private javax.swing.JButton btnmultiplicacao;
    private javax.swing.JButton btnresultado;
    private javax.swing.JButton btnsoma;
    private javax.swing.JButton btnsubtracao;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lbltela;
    private javax.swing.JTextField txttela;
    // End of variables declaration//GEN-END:variables

    private String toString(double resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
