/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo_28Mei2024;

/**
 *
 * @author AULIA SYFA
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    String angka;
    double total,angka1,angka2;
    int pilih;

    public Kalkulator() {
        initComponents();
          angka="";

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        btnSamadengan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnPersen = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnAngka7 = new javax.swing.JButton();
        btnAngka8 = new javax.swing.JButton();
        btnAngka9 = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnAngka4 = new javax.swing.JButton();
        btnAngka5 = new javax.swing.JButton();
        btnAngka6 = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnAngka1 = new javax.swing.JButton();
        btnAngka2 = new javax.swing.JButton();
        btnAngka3 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnAngka0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(display);
        display.setBounds(10, 10, 270, 50);

        btnSamadengan.setText("=");
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });
        getContentPane().add(btnSamadengan);
        btnSamadengan.setBounds(160, 340, 120, 40);

        btnHapus.setText("C");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(20, 70, 50, 40);

        btnPersen.setText("%");
        btnPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersenActionPerformed(evt);
            }
        });
        getContentPane().add(btnPersen);
        btnPersen.setBounds(90, 70, 50, 40);

        btnKoma.setText(".");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnKoma);
        btnKoma.setBounds(160, 70, 50, 40);

        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnBagi);
        btnBagi.setBounds(230, 70, 50, 40);

        btnAngka7.setText("7");
        btnAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka7);
        btnAngka7.setBounds(20, 140, 50, 40);

        btnAngka8.setText("8");
        btnAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka8);
        btnAngka8.setBounds(90, 140, 50, 40);

        btnAngka9.setText("9");
        btnAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka9);
        btnAngka9.setBounds(160, 140, 50, 40);

        btnKali.setText("*");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKali);
        btnKali.setBounds(230, 140, 50, 40);

        btnAngka4.setText("4");
        btnAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka4);
        btnAngka4.setBounds(20, 210, 50, 40);

        btnAngka5.setText("5");
        btnAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka5);
        btnAngka5.setBounds(90, 210, 50, 40);

        btnAngka6.setText("6");
        btnAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka6);
        btnAngka6.setBounds(160, 210, 50, 40);

        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKurang);
        btnKurang.setBounds(230, 210, 50, 40);

        btnAngka1.setText("1");
        btnAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka1);
        btnAngka1.setBounds(20, 270, 50, 40);

        btnAngka2.setText("2");
        btnAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka2);
        btnAngka2.setBounds(90, 270, 50, 40);

        btnAngka3.setText("3");
        btnAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka3);
        btnAngka3.setBounds(160, 270, 50, 40);

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah);
        btnTambah.setBounds(230, 270, 50, 40);

        btnAngka0.setText("0");
        btnAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka0);
        btnAngka0.setBounds(20, 340, 120, 40);

        setSize(new java.awt.Dimension(318, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersenActionPerformed
        // TODO add your handling code here:
      angka2=Double.parseDouble(angka);
        total=angka2/100;
        angka=Double.toString(total);
        display.setText(angka);
  
    }//GEN-LAST:event_btnPersenActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        // TODO add your handling code here:
        angka +=".";
        display.setText(angka);

    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        display.setText("");
        angka1=0;
        angka2=0;
        total=0;
        angka="";

    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("/");
        angka="";
        pilih=4;

    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("*");
        angka="";
        pilih=3;

    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnAngka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka9ActionPerformed
        // TODO add your handling code here:
         angka +="9";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka9ActionPerformed

    private void btnAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka8ActionPerformed
        // TODO add your handling code here:
        angka +="8";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka8ActionPerformed

    private void btnAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka7ActionPerformed
        // TODO add your handling code here:
         angka +="7";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka7ActionPerformed

    private void btnAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka4ActionPerformed
        // TODO add your handling code here:
         angka +="4";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka4ActionPerformed

    private void btnAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka5ActionPerformed
        // TODO add your handling code here:
        angka +="5";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka5ActionPerformed

    private void btnAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka6ActionPerformed
        // TODO add your handling code here:
        angka +="6";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka6ActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        // TODO add your handling code here:
          angka1=Double.parseDouble(angka);
        display.setText("-");
        angka="";
        pilih=2;

    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
         angka1=Double.parseDouble(angka);
        display.setText("+");
        angka="";
        pilih=1;

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka3ActionPerformed
        // TODO add your handling code here:
         angka +="3";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka3ActionPerformed

    private void btnAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka2ActionPerformed
        // TODO add your handling code here:
        angka +="2";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka2ActionPerformed

    private void btnAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka1ActionPerformed
        // TODO add your handling code here:
        angka +="1";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka1ActionPerformed

    private void btnAngka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka0ActionPerformed
        // TODO add your handling code here:
        angka +="0";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka0ActionPerformed

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        // TODO add your handling code here:
          switch(pilih){
                case 1:
                    angka2=Double.parseDouble(angka);
                    total=angka1+angka2;
                    angka=Double.toString(total);
                    display.setText(angka);
                    break;
                case 2:
                    angka2=Double.parseDouble(angka);
                    total=angka1-angka2;
                    angka=Double.toString(total);
                    display.setText(angka);
                    break;
                case 3:
                    angka2=Double.parseDouble(angka);
                    total=angka1*angka2;
                    angka=Double.toString(total);
                    display.setText(angka);
                    break;
                case 4:
                    angka2=Double.parseDouble(angka);
                    total=angka1/angka2;
                    angka=Double.toString(total);
                    display.setText(angka);
                    break;
        }

    }//GEN-LAST:event_btnSamadenganActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAngka0;
    private javax.swing.JButton btnAngka1;
    private javax.swing.JButton btnAngka2;
    private javax.swing.JButton btnAngka3;
    private javax.swing.JButton btnAngka4;
    private javax.swing.JButton btnAngka5;
    private javax.swing.JButton btnAngka6;
    private javax.swing.JButton btnAngka7;
    private javax.swing.JButton btnAngka8;
    private javax.swing.JButton btnAngka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnPersen;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}
