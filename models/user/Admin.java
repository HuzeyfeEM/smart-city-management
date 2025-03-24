package com.mycompany.akillisehirsistemi.models.user;

import com.mycompany.akillisehirsistemi.controllers.EnergyManagement;
import com.mycompany.akillisehirsistemi.controllers.TrafficManagement;
import com.mycompany.akillisehirsistemi.controllers.WaterManagement;

import com.mycompany.akillisehirsistemi.models.vehicle.ElektrikliOtomobil;
import com.mycompany.akillisehirsistemi.models.vehicle.Otomobil;
import com.mycompany.akillisehirsistemi.models.vehicle.Motosiklet;
import com.mycompany.akillisehirsistemi.models.vehicle.Otobus;

import com.mycompany.akillisehirsistemi.models.building.GelenekselBina;
import com.mycompany.akillisehirsistemi.models.building.AkilliBina;

import com.mycompany.akillisehirsistemi.models.enerjySource.FosilYakitKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.GunesKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.NukleerKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.RuzgarKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.SuKaynagi;

import java.util.ArrayList;

public class Admin {

    String name = "ff";
    int adminNo = 11;

    public int getAdminNo() {
        return adminNo;
    }

    public String getName() {
        return name;
    }

    EnergyManagement energyManagement;
    TrafficManagement trafficManagement;
    WaterManagement waterManagement;

    public ArrayList<String> uyarilarListesi;

    private static Admin instance;

    // Private constructor
    private Admin() {
        uyarilarListesi = new ArrayList<>();
    }

    // Singleton Instance Getter
    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }

    public boolean giris_Yap(String name, int adminNO) {
        if (this.name.equals(name) && this.adminNo == adminNO) {
            return true;
        }
        return false;
    }

    //Varlik ekleme
    public void arabaEkleme(String plaka, String marka, String tip, String renk) {
        if (tip.equals("Elektrikli Otomobil")) {
            new ElektrikliOtomobil(plaka, marka, tip, renk);
        } else if (tip.equals("Otomobil")) {
            new Otomobil(plaka, marka, tip, renk);
        } else if (tip.equals("Motosiklet")) {
            new Motosiklet(plaka, marka, tip, renk);
        } else if (tip.equals("Otobus")) {
            new Otobus(plaka, marka, tip, renk);
        }
    }

    public void binaEkleme(String binaNumarasi, int katSayisi, String tip, String renk) {
        if (tip.equals("Akilli Bina")) {
            new AkilliBina(binaNumarasi, katSayisi, tip, renk);
        } else if (tip.equals("Geleneksel Bina")) {
            new GelenekselBina(binaNumarasi, katSayisi, tip, renk);
        }
    }

    public void enerjiKaynagiEkleme(int gunlukUratim, String tip, int kapasite, String kaynakSayisi) {
        if (tip.equals("Fosil Yakit Kaynagi")) {
            new FosilYakitKaynagi(gunlukUratim, tip, kapasite, kaynakSayisi);
        } else if (tip.equals("Gunes Kaynagi")) {
            new GunesKaynagi(gunlukUratim, tip, kapasite, kaynakSayisi);
        } else if (tip.equals("Nukleer Kaynagi ")) {
            new NukleerKaynagi(gunlukUratim, tip, kapasite, kaynakSayisi);
        } else if (tip.equals("Ruzgar Kaynagi")) {
            new RuzgarKaynagi(gunlukUratim, tip, kapasite, kaynakSayisi);
        } else if (tip.equals("Su Kaynagi")) {
            new SuKaynagi(gunlukUratim, tip, kapasite, kaynakSayisi);
        }
    }

//    //Varlik guncelleme
//    public void arabaGuncelleme (String plaka , String marka , String tip) {
//        
//    }
//    public void binaGuncelleme (int katSayisi , String tip) {
//        
//    }
//    public void enerjiGuncelleme (int gunlukUratim , String tip , int kapasite) {
//        
//    }
//    
//    //Hizmet izleme
//    public void suDurumuIzleme () {
//        waterManagement.suRezervDurumu();
//    }
//    public void trafikDurumuIzle () {
//        trafficManagement.araclarKonumDurumBilgisi();
//    }
//    public void enerjyDurumuEzle () {
//        energyManagement.enerjiUretimDurumu();
//    }
//    
//    //Hizmet raporu alma
//    public void suRaporuGetir () {
//        waterManagement.suTuketimDurumu();
//    }
//    public void trafikRaporuGetir () {
//        trafficManagement.trafikYogunluguRaporBilgisi();
//    }
//    public void enerjiRaporuGetir () {
//        energyManagement.enerjiUratimiTuketimiKarsilastir();
//    }
//    
//    //Sistemden gelen uyarilari izlemek ve sorunu cozmek
//    public void sistemdenGelenUyarilariCozme () {
//        for(String string : uyarilarListesi){
//            //devamini getir
//        }
//    }
}
