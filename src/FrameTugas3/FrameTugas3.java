/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameTugas3;

import javax.swing.JOptionPane;

/**
 *
 * @author J
 */
public class FrameTugas3 extends javax.swing.JFrame {

    String temp ="";
    Double tinggi, berat, hasil;
    
    /**
     * Creates new form FrameTugas3
     */
    public FrameTugas3() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Berat = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Laki = new javax.swing.JRadioButton();
        Perempuan = new javax.swing.JRadioButton();
        Keluar = new javax.swing.JButton();
        Hitung = new javax.swing.JButton();
        CobaLagi = new javax.swing.JButton();
        Ideal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Diagnosa2 = new javax.swing.JTextField();
        Diagnosa1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("cm");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 120, 20, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 20, 170, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 90, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tinggi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 90, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 120, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 210, 110, 20);
        getContentPane().add(Berat);
        Berat.setBounds(150, 160, 40, 30);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(150, 80, 160, 30);

        Tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinggiActionPerformed(evt);
            }
        });
        getContentPane().add(Tinggi);
        Tinggi.setBounds(150, 120, 40, 30);

        buttonGroup1.add(Laki);
        Laki.setText("Laki -laki");
        Laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LakiActionPerformed(evt);
            }
        });
        getContentPane().add(Laki);
        Laki.setBounds(240, 210, 93, 23);

        buttonGroup1.add(Perempuan);
        Perempuan.setText("Perempuan");
        Perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerempuanActionPerformed(evt);
            }
        });
        getContentPane().add(Perempuan);
        Perempuan.setBounds(150, 210, 79, 23);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(270, 250, 90, 30);

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(50, 250, 90, 30);

        CobaLagi.setText("Coba Lagi");
        CobaLagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobaLagiActionPerformed(evt);
            }
        });
        getContentPane().add(CobaLagi);
        CobaLagi.setBounds(160, 250, 90, 30);

        Ideal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdealActionPerformed(evt);
            }
        });
        getContentPane().add(Ideal);
        Ideal.setBounds(270, 300, 40, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Berat Badan Ideal Anda adalah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 300, 220, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 160, 20, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 360, 210, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("kg");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 300, 20, 30);

        Diagnosa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagnosa2ActionPerformed(evt);
            }
        });
        getContentPane().add(Diagnosa2);
        Diagnosa2.setBounds(50, 450, 310, 30);

        Diagnosa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagnosa1ActionPerformed(evt);
            }
        });
        getContentPane().add(Diagnosa1);
        Diagnosa1.setBounds(50, 400, 310, 30);

        setBounds(0, 0, 416, 551);
    }// </editor-fold>//GEN-END:initComponents

    private void TinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinggiActionPerformed

    private void LakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LakiActionPerformed

    private void PerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerempuanActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        if (Nama.getText().equals("")||Berat.getText().equals("")
                ||Tinggi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak Isian Harus Di Isi Semua");
        }else if(Laki.isSelected()||Perempuan.isSelected()){
            try{
                Proses();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Masukkan ada yang salah");
            }
    }//GEN-LAST:event_HitungActionPerformed
        else {
            JOptionPane.showMessageDialog(null, "Radio Button Harus Dipilih");
        }
    }
    private void IdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdealActionPerformed

    private void Diagnosa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagnosa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Diagnosa2ActionPerformed

    private void Diagnosa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagnosa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Diagnosa1ActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:r
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void CobaLagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobaLagiActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        Tinggi.setText("");
        Berat.setText("");
        buttonGroup1.clearSelection();
        Ideal.setText("");
        Diagnosa1.setText("");
        Diagnosa2.setText("");
    }//GEN-LAST:event_CobaLagiActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTugas3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton CobaLagi;
    private javax.swing.JTextField Diagnosa1;
    private javax.swing.JTextField Diagnosa2;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Ideal;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton Laki;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JTextField Tinggi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        //To change body of generated methods, choose Tools | Templates.
        tinggi = Double.parseDouble(Tinggi.getText());
        berat = Double.parseDouble(Berat.getText());
        
        if (Perempuan.isSelected()){
            hasil = (tinggi - 100) * 1;
    }else if (Laki.isSelected()){
        hasil = (tinggi - 104) * 1;
        }
        temp = Double.toString(hasil.intValue());
        
        if (hasil < berat)
        {
            Ideal.setText(temp);
            Diagnosa1.setText("Maaf "+Nama.getText()+" , Sepertinya anda Overweight");
            Diagnosa2.setText("Banyaklah olahraga dan hindari makanan berkolestrol");
        } else if (hasil > berat)
        {
            Ideal.setText(temp);
            Diagnosa1.setText("Maaf "+Nama.getText()+" , Sepertinya anda Underweight");
            Diagnosa2.setText("Banyaklah Mengkonsumsi makanan berkabohidrat");
        } else
        {
            Ideal.setText(temp);
            Diagnosa1.setText("Selamat "+Nama.getText()+" , Berat Badan Anda Sudah Ideal");
            Diagnosa2.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
        }
    }
}
