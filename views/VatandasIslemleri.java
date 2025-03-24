/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.akillisehirsistemi.views;

import com.mycompany.akillisehirsistemi.controllers.EnergyManagement;
import com.mycompany.akillisehirsistemi.controllers.TrafficManagement;
import com.mycompany.akillisehirsistemi.controllers.WaterManagement;
import com.mycompany.akillisehirsistemi.models.user.Citizen;
import javax.swing.JOptionPane;

/**
 *
 * @author EMD
 */
public class VatandasIslemleri extends javax.swing.JFrame {

    /**
     * Creates new form VatandasIslemleri
     */
    public VatandasIslemleri() {
        initComponents();
        this.setLayout(null); // Layout'u devre dışı bırak

        // JLabel'in içeriğini ortala
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // JLabel'in kendisini ortala
        int frameWidth = this.getWidth();
        int labelWidth = jLabel1.getPreferredSize().width;
        int newX = (frameWidth - labelWidth) / 2;
        jLabel1.setBounds(newX, jLabel1.getY(), labelWidth, jLabel1.getHeight());
        
        // Butonu yatay olarak ortala
        int buttonWidth = btn.getPreferredSize().width;
        int buttonX = (frameWidth - buttonWidth) / 2; // Yatay ortalama
        btn.setBounds(buttonX, btn.getY(), buttonWidth, btn.getHeight());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Vatandas Islemleri Sayfasi");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                metot1(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Trafik Bilgisi Al");

        jButton2.setText("Devam");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trafikBikgisi(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enerji Uretim Tuketim Bilgisi");

        jButton3.setText("Devam");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enerjiBilgisi(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Su Rezerv Sevyelerini Izle");

        jButton4.setText("Devam");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suRezervBilgisi(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Su Tuketim Bilgisi Al");

        jButton5.setText("Devam");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suTuketimBilgisi(evt);
            }
        });

        btn.setText("Geri");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvatandasGirisSayfasinaDonus(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(btn)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trafikBikgisi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trafikBikgisi
        Citizen citizen = Citizen.getInstance();
        String mesaj = citizen.trafikDurumuSorgula();
        JOptionPane.showMessageDialog(null, mesaj, "Trafik Yogunlugu Bilgisi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_trafikBikgisi

    private void enerjiBilgisi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enerjiBilgisi
        // TODO add your handling code here:
        Citizen citizen = Citizen.getInstance();
        String mesaj = citizen.enerjiUrtimTuketimRaporuGor();
        JOptionPane.showMessageDialog(null, mesaj, "Enerji Uretim Tuketim Bilgisi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_enerjiBilgisi

    private void suRezervBilgisi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suRezervBilgisi
        // TODO add your handling code here:
        Citizen citizen = Citizen.getInstance();
        String mesaj = citizen.suRezervleriniTakipEt();
        JOptionPane.showMessageDialog(null, mesaj, "Su Rezerv Bilgisi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_suRezervBilgisi

    private void suTuketimBilgisi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suTuketimBilgisi
        // TODO add your handling code here:
        Citizen citizen = Citizen.getInstance();
        String mesaj = citizen.suTuketimRaporuGor();
        JOptionPane.showMessageDialog(null, mesaj, "Su Tuketim Bilgisi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_suTuketimBilgisi

    private void btnvatandasGirisSayfasinaDonus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvatandasGirisSayfasinaDonus
        // TODO add your handling code here:
        VatandasGiris vatandasGiris = new VatandasGiris();
        vatandasGiris.setLocationRelativeTo(null);
        vatandasGiris.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnvatandasGirisSayfasinaDonus

    private void metot1(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_metot1
        // TODO add your handling code here:

    }//GEN-LAST:event_metot1

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
            java.util.logging.Logger.getLogger(VatandasIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VatandasIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VatandasIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VatandasIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VatandasIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
