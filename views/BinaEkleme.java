/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.akillisehirsistemi.views;

import com.mycompany.akillisehirsistemi.controllers.EnergyManagement;
import com.mycompany.akillisehirsistemi.models.building.Building;
import com.mycompany.akillisehirsistemi.models.user.Admin;
import javax.swing.JOptionPane;

/**
 *
 * @author EMD
 */
public class BinaEkleme extends javax.swing.JFrame {

    Building building;

    private boolean containsNumber(String input) {
        // Herhangi bir rakam içeriyorsa true döner
        return input.matches(".*\\d.*");
    }

    /**
     * Creates new form BinaEkleme
     */
    public BinaEkleme() {
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
        int buttonWidth = binaEkle.getPreferredSize().width;
        int buttonX = (frameWidth - buttonWidth) / 2; // Yatay ortalama
        binaEkle.setBounds(buttonX, binaEkle.getY(), buttonWidth, binaEkle.getHeight());

        // Butonu yatay olarak ortala
        int buttonWidth1 = jButton1.getPreferredSize().width;
        int buttonX1 = (frameWidth - buttonWidth1) / 2; // Yatay ortalama
        jButton1.setBounds(buttonX1, jButton1.getY(), buttonWidth1, jButton1.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tipList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        katText = new javax.swing.JTextField();
        binaEkle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        renkText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numaraText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varlikEklemeSayfasinaDonus(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bina Ekleme Islemleri");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Bina Tipini Seciniz");

        tipList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Akilli Bina", " ", "Geleneksel Bina" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tipList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tipList);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Bina Kat Sayisini Giriniz");

        katText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                katTextActionPerformed(evt);
            }
        });

        binaEkle.setText("Ekle");
        binaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaEkle(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Bina Rengini Giriniz");

        renkText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Bina Numarasini Giriniz");

        numaraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numaraTextActionPerformed(evt);
            }
        });

        jLabel7.setText("(Bina numarasi assagidaki formatta olmasidir)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("\" binaTipi-numarasi \" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(renkText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                    .addComponent(numaraText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(katText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(binaEkle)
                                .addComponent(jButton1)))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(katText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(renkText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(numaraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(binaEkle)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varlikEklemeSayfasinaDonus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varlikEklemeSayfasinaDonus
        // TODO add your handling code here:
        VarlikEkleme varlikEkleme = new VarlikEkleme();
        varlikEkleme.setLocationRelativeTo(null);
        varlikEkleme.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_varlikEklemeSayfasinaDonus

    private void katTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_katTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_katTextActionPerformed

    private void binaEkle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaEkle
        // TODO add your handling code here:
        try {
            Admin admin = Admin.getInstance();
            String tip = tipList.getSelectedValue();
            String katTextValue = katText.getText();
            String renkTextValue = renkText.getText();
            String numaraTextValue = numaraText.getText();
            boolean bol = true;

            for (Building building : EnergyManagement.getInstance().binalarListesi) {
                if (numaraTextValue.equals(building.getBinaNumarasi())) {
                    bol = false;
                }
            }

            int selectedIndex = this.tipList.getSelectedIndex();
            if (selectedIndex == -1) {  // Eğer seçim yapılmamışsa
                JOptionPane.showMessageDialog(null, "Lütfen bir bina tipi seçin!", "Eksik Seçim", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            if (this.tipList.getSelectedValue().isEmpty() || this.tipList.getSelectedIndex() == 1) {  // Eğer seçim yapılmamışsa
                JOptionPane.showMessageDialog(null, "Lütfen bir bina tipi seçin!", "Boş Seçim", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            if (katTextValue.isEmpty()) {  // Eğer kat sayısı boşsa
                JOptionPane.showMessageDialog(null, "Kat sayısını girin!", "Eksik Bilgi", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            // Kat sayısını integer'a dönüştürme
            int katSayisi = Integer.parseInt(katTextValue);

            if (katSayisi <= 0) {  // Eğer kat sayısı sıfır veya negatifse
                JOptionPane.showMessageDialog(null, "Kat Sayısı Negatif veya Sıfır Olamaz", "Yanlış Giriş", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            if (renkTextValue.isEmpty()) {  // Eğer renkTextValue boşsa
                JOptionPane.showMessageDialog(null, "Lütfen bir renk girin!", "Eksik Bilgi", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            if (containsNumber(renkTextValue)) {  // Eğer renkTextValue boşsa
                JOptionPane.showMessageDialog(null, "Renk alanı sayı içermemelidir!", "Geçersiz Renk", JOptionPane.ERROR_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            if (!renkTextValue.matches("[a-zA-ZçÇğĞıİöÖşŞüÜ ]+")) {  // Eğer renkTextValue yalnızca harflerden oluşmuyorsa
                JOptionPane.showMessageDialog(null, "Renk sadece harflerden oluşmalıdır!", "Geçersiz Giriş", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            if (numaraTextValue.isEmpty()) {  // Eğer numaraTextValue boşsa
                JOptionPane.showMessageDialog(null, "Lütfen bina numarasını girin!", "Eksik Bilgi", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            // Numara format kontrolü
            if (!numaraTextValue.matches("[a-zA-ZçÇğĞıİöÖşŞüÜ]+-\\d+")) {  // Format: binaTipi-binaNumarası
                JOptionPane.showMessageDialog(null, "Bina numarası geçerli bir formatta olmalıdır! Örnek: AkilliBina-3904", "Geçersiz Giriş", JOptionPane.WARNING_MESSAGE);
                return;  // Fonksiyonu sonlandır
            }

            if (!bol) {
                JOptionPane.showMessageDialog(null, "Bu Bina Numarasina Sahip Bir Bina Vardir", "Benzerlik Hatasi", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                // Bina ekleme işlemi
                admin.binaEkleme(numaraTextValue, katSayisi, tip, renkTextValue);

                // Başarı mesajı
                JOptionPane.showMessageDialog(null, tip + " başarıyla eklendi :)");

                VarlikEkleme varlikEkleme = new VarlikEkleme();
                varlikEkleme.setLocationRelativeTo(null);
                varlikEkleme.setVisible(true);
                setVisible(false);
            }

        } catch (NumberFormatException e) {
            // Kat sayısı geçerli bir sayı değilse hata mesajı
            JOptionPane.showMessageDialog(null, "Kat sayısı bir sayı olmalıdır!", "Hata", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Diğer tüm hatalar için genel hata mesajı
            JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_binaEkle

    private void renkTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renkTextActionPerformed

    private void numaraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numaraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numaraTextActionPerformed

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
            java.util.logging.Logger.getLogger(BinaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binaEkle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField katText;
    private javax.swing.JTextField numaraText;
    private javax.swing.JTextField renkText;
    private javax.swing.JList<String> tipList;
    // End of variables declaration//GEN-END:variables
}
