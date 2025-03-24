package com.mycompany.akillisehirsistemi.controllers;

import com.mycompany.akillisehirsistemi.models.user.Admin;
import com.mycompany.akillisehirsistemi.models.vehicle.Vehicle;
import java.util.ArrayList;

public class TrafficManagement {
    public ArrayList<Vehicle> araclarListesi;

    private static TrafficManagement instance;

    // Private constructor
    private TrafficManagement() {
        araclarListesi = new ArrayList<>();
    }

    // Singleton Instance Getter
    public static TrafficManagement getInstance() {
        if (instance == null) {
            instance = new TrafficManagement();
        }
        return instance;
    }

    // Araclarin Konum ve Durum Bilgilerini Izler
    public String araclarKonumDurumBilgisi() {
        String mesaj = "";
        for (Vehicle vehicle : araclarListesi) {
            if (vehicle.yakit_Kontrol()) {
                if (vehicle.getTip().equals("Elektrikli Otomobil")) {
                    mesaj += vehicle.getPlaka() + " plakali " + vehicle.getTip() + " ve " + vehicle.getKonum() +
                            " konumunda bulunmaktadir\nSarj sevyesı dusuk\nsarj Sevyesi : " + vehicle.getYakitSevyesi();
                } else {
                    mesaj += vehicle.getPlaka() + "plakali " + vehicle.getTip() + " ve " + vehicle.getKonum() +
                            "konumunda bulunmaktadir\nYakit sevyesı dusuk\nYakit Sevyesi : "
                            + vehicle.getYakitSevyesi();
                }
            } else {
                if (vehicle.getTip().equals("Elektrikli Otomobil")) {
                    mesaj += vehicle.getPlaka() + "plakali " + vehicle.getTip() + " ve " + vehicle.getKonum() +
                            "konumunda bulunmaktadir\nSarj sevyesı iyi\nsarj Sevyesi : " + vehicle.getYakitSevyesi();
                } else {
                    mesaj += vehicle.getPlaka() + "plakali " + vehicle.getTip() + " ve " + vehicle.getKonum() +
                            "konumunda bulunmaktadir\nYakit sevyesı iyi\nYakit Sevyesi : " + vehicle.getYakitSevyesi();
                }
            }
        }
        return mesaj;
    }

    // Sehirde Trafik Yogunlugu (varsa) Bilgisi Verir
    public String trafikYogunluguRaporBilgisi() {
        int konumA = 0, konumB = 0, konumC = 0, konumD = 0;
        for (Vehicle arac : araclarListesi) {
            switch (arac.getKonum()) {
                case 'A':
                    konumA++;
                    break;
                case 'B':
                    konumB++;
                    break;
                case 'C':
                    konumC++;
                    break;
                case 'D':
                    konumD++;
                    break;
            }
        }

        String uyari = "";
        String adminUyari = "";
        if (konumA < 15 && konumB < 15 && konumC < 15 && konumD < 15) {
            uyari += "Sehirde trafik sikisikligi yoktur ..";
        }
        if (konumA > 15) {
            uyari += "A bolgesinde kalabalik var\nTrafikte sikisan araba sayisi : " + konumA;
            adminUyari = "A bolgesinde kalabalik var";
            Admin.getInstance().uyarilarListesi.add(adminUyari);
            // System.out.println("A bolgelerinde kalabalik var");
        }
        if (konumB > 15) {
            uyari += "\nB bolgesinde kalabalik var\nTrafikte sikisan araba sayisi : " + konumB;
            adminUyari = "B bolgesinde kalabalik var";
            Admin.getInstance().uyarilarListesi.add(adminUyari);
            // System.out.println("B bolgelerinde kalabalik var");
        }
        if (konumC > 15) {
            uyari += "\nC bolgesinde kalabalik var\nTrafikte sikisan araba sayisi : " + konumC;
            adminUyari = "C bolgesinde kalabalik var";
            Admin.getInstance().uyarilarListesi.add(adminUyari);
            // System.out.println("D bolgelerinde kalabalik var");
        }
        if (konumD > 15) {
            uyari += "\nD bolgesinde kalabalik var\nTrafikte sikisan araba sayisi : " + konumD;
            adminUyari = "D bolgesinde kalabalik var";
            Admin.getInstance().uyarilarListesi.add(adminUyari);
            // System.out.println("D bolgelerinde kalabalik var");
        }
        return uyari;
    }
}
