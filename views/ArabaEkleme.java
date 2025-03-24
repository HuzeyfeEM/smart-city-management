/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.akillisehirsistemi.views;

import com.mycompany.akillisehirsistemi.models.user.Admin;
import com.mycompany.akillisehirsistemi.models.vehicle.Vehicle;
import com.mycompany.akillisehirsistemi.controllers.TrafficManagement;
import javax.swing.JOptionPane;

/**
 *
 * @author EMD
 */
public class ArabaEkleme extends javax.swing.JFrame {

    /**
     * Creates new form ArabaEkleme
     */
    public ArabaEkleme() {
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

        // Butonu yatay olarak ortala
        int buttonWidth1 = btn1.getPreferredSize().width;
        int buttonX1 = (frameWidth - buttonWidth1) / 2; // Yatay ortalama
        btn1.setBounds(buttonX1, btn1.getY(), buttonWidth1, btn1.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tipList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        plakaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        renkText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        markaText = new javax.swing.JTextField();
        btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setText("Geri");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarlikEklemeSayfsinaDonus(evt);
            }
        });

        tipList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Elektrikli Otomobil", " ", "Otomobil", " ", "Motosiklet", " ", "Otobus" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tipList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tipList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Araba Ekleme Islemleri");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Arac Tipi Seciniz");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Plaka Giriniz");

        plakaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plakaTextText(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Markayi Giriniz");

        renkText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkTextText(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Rengi Giriniz");

        markaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markaTextText(evt);
            }
        });

        btn.setText("Ekle");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arabaEkleme(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn)
                    .addComponent(btn1))
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(plakaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(renkText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markaText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(plakaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(renkText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(markaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VarlikEklemeSayfsinaDonus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarlikEklemeSayfsinaDonus
        // TODO add your handling code here:
        VarlikEkleme varlikEkleme = new VarlikEkleme();
        varlikEkleme.setLocationRelativeTo(null);
        varlikEkleme.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_VarlikEklemeSayfsinaDonus

    private void plakaTextText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plakaTextText
        // TODO add your handling code here:
    }//GEN-LAST:event_plakaTextText

    private void arabaEkleme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arabaEkleme
        // Admin instance'ı al
        Admin admin = Admin.getInstance();

        // Kullanıcıdan alınan değerler
        String plaka = plakaText.getText();
        String renk = renkText.getText();
        String marka = markaText.getText();
        String tip = tipList.getSelectedValue();

        // Tipin seçilip seçilmediğini kontrol et
        int selectedIndex = this.tipList.getSelectedIndex();
        boolean bol = selectedIndex != -1;

        try {
            boolean check = false;
            for (Vehicle vehicle : TrafficManagement.getInstance().araclarListesi) {
                if (vehicle.getPlaka().equals(plaka)) {
                    check = true;
                    break;
                }
            }
            // Boşluk ve geçersiz girişleri kontrol et
            if (plaka.isEmpty() || marka.isEmpty() || renk.isEmpty() || !bol || this.tipList.getSelectedIndex() == 1 || this.tipList.getSelectedIndex() == 3 || this.tipList.getSelectedIndex() == 5) {
                if (!bol) {
                    // Eğer tip seçilmediyse
                    JOptionPane.showMessageDialog(null, "Lütfen bir araba tipi seçin!", "Eksik Seçim", JOptionPane.WARNING_MESSAGE);
                    return;
                } else if (this.tipList.getSelectedValue().isEmpty() || this.tipList.getSelectedIndex() == 1 || this.tipList.getSelectedIndex() == 3 || this.tipList.getSelectedIndex() == 5) {
                    // Plaka boşsa
                    JOptionPane.showMessageDialog(null, "Lütfen Gecerli Bir Araba Tipi Seciniz!", "Bos Secim", JOptionPane.WARNING_MESSAGE);
                    return;
                } else if (plaka.isEmpty()) {
                    // Plaka boşsa
                    JOptionPane.showMessageDialog(null, "Lütfen plaka bilgisini girin!", "Eksik Bilgi", JOptionPane.WARNING_MESSAGE);
                    return;
                } else if (renk.isEmpty()) {
                    // Renk boşsa
                    JOptionPane.showMessageDialog(null, "Lütfen renk bilgisini girin!", "Eksik Bilgi", JOptionPane.WARNING_MESSAGE);
                    return;
                } else if (marka.isEmpty()) {
                    // Marka boşsa
                    JOptionPane.showMessageDialog(null, "Lütfen marka bilgisini girin!", "Eksik Bilgi", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } else if (containsNumber(renk)) {
                // Renk alanında sayı girilmişse
                JOptionPane.showMessageDialog(null, "Renk alanı sayı içermemelidir!", "Geçersiz Renk", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (check) {
                //Plakanin baska araba tarafindan kullanilmissa
                JOptionPane.showMessageDialog(null, "Lütfen Kullanılmayan Bir Plaka girin!", "Mevcut Plaka Kullanım Hatası", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                // Eğer tüm alanlar doğruysa, araba ekleme işlemi yapılır
                admin.arabaEkleme(plaka, marka, tip, renk);
                JOptionPane.showMessageDialog(null, tip + " başarıyla eklendi :)");
                VarlikEkleme varlikEkleme = new VarlikEkleme();
                varlikEkleme.setLocationRelativeTo(null);
                varlikEkleme.setVisible(true);
                setVisible(false);
            }
        } catch (Exception e) {
            // Genel hata yakalama
            JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    // Renk alanının sayı içerip içermediğini kontrol eden yardımcı metod
    private boolean containsNumber(String str) {
        return str.matches(".*\\d.*");
    }//GEN-LAST:event_arabaEkleme

    private void renkTextText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkTextText
        // TODO add your handling code here:
    }//GEN-LAST:event_renkTextText

    private void markaTextText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markaTextText
        // TODO add your handling code here:
    }//GEN-LAST:event_markaTextText

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
            java.util.logging.Logger.getLogger(ArabaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArabaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArabaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArabaEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArabaEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField markaText;
    private javax.swing.JTextField plakaText;
    private javax.swing.JTextField renkText;
    private javax.swing.JList<String> tipList;
    // End of variables declaration//GEN-END:variables
}
