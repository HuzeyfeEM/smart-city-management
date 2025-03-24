package com.mycompany.akillisehirsistemi.models.user;

import com.mycompany.akillisehirsistemi.controllers.TrafficManagement;
import com.mycompany.akillisehirsistemi.controllers.EnergyManagement;
import com.mycompany.akillisehirsistemi.controllers.WaterManagement;

import java.util.ArrayList;

public class Citizen {

    public ArrayList<Citizen> vatandaslarListesi;

    private int kimlikNo = 11;
    private String name = "ff";
    private String sifre = "f1";
    protected int gunlukSuTuketimi = (int) (Math.random() * 101);

    private static Citizen instance;

    // Private constructor
    private Citizen() {
        vatandaslarListesi = new ArrayList<>();
    }

    // Singleton Instance Getter
    public static Citizen getInstance() {
        if (instance == null) {
            instance = new Citizen();
        }
        return instance;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public String getName() {
        return name;
    }

    public String getSifre() {
        return sifre;
    }

    public int getGunlukSuTuketimi() {
        return gunlukSuTuketimi;
    }

    public boolean giris_Yap(String name, String sifre) {
        boolean bol = true;
        if (this.name.equals(name) && this.sifre.equals(sifre)) {
            bol = true;
        } else {
            bol = false;
        }
        return bol;
    }

    public String trafikDurumuSorgula() {
        String mesaj = "";
        mesaj = TrafficManagement.getInstance().trafikYogunluguRaporBilgisi();
        return mesaj;
    }

    public String enerjiUrtimTuketimRaporuGor() {
        String mesaj = "";
        mesaj = EnergyManagement.getInstance().enerjiUratimiTuketimiKarsilastir();
        return mesaj;
    }

    public String suRezervleriniTakipEt() {
        String mesaj = "";
        mesaj = WaterManagement.getInstance().suRezervDurumu();
        return mesaj;
    }

    public String suTuketimRaporuGor() {
        String mesaj = "";
        mesaj = WaterManagement.getInstance().suTuketimDurumu();
        return mesaj;
    }

}
