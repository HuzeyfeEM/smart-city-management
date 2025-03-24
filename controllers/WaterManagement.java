package com.mycompany.akillisehirsistemi.controllers;

import com.mycompany.akillisehirsistemi.models.enerjySource.SuKaynagi;
import com.mycompany.akillisehirsistemi.models.user.Admin;
import com.mycompany.akillisehirsistemi.models.user.Citizen;

import java.util.ArrayList;

public class WaterManagement {

    public ArrayList<SuKaynagi> suDepolariListesi;

    private static WaterManagement instance;

    // Private constructor
    private WaterManagement() {
        suDepolariListesi = new ArrayList<>();
    }

    // Singleton Instance Getter
    public static WaterManagement getInstance() {
        if (instance == null) {
            instance = new WaterManagement();
        }
        return instance;
    }

    public String suRezervDurumu() {
        String mesaj = "";
        String adminMesaj = "";
        int uretim = 0;
        int tuketim = 0;
        int rezerv = 0;
        for (SuKaynagi sukaynagi : suDepolariListesi) {
            uretim += sukaynagi.getGunlukUretim();
        }
        for (Citizen citizen : Citizen.getInstance().vatandaslarListesi) {
            tuketim += citizen.getGunlukSuTuketimi();
        }
        rezerv = uretim - tuketim;
        if (rezerv < 1000) {
            mesaj = "Rezerv seviyesi bir depo kapasitesinden dusuktur\nRezerv Sevyesi : " + rezerv
                    + "\nAdmine uyari gonderiliyor";
            adminMesaj = "Rezerv seviyesi dusuk-Rezerv Sevyesi : " + rezerv + " LT";
            // admine uyari gonderilecek
            Admin.getInstance().uyarilarListesi.add(adminMesaj);
        } else {
            mesaj = "Rezerv seviyeleri dusuk sinirindan yuksektir\nRezerv Sevyesi : " + rezerv + " LT";
        }
        return mesaj;
    }

    public String suTuketimDurumu() {
        String mesaj = "";
        String adminMesaj = "";
        int rezerv = 0;
        int tuketim = 0;
        int tuketimDurumu = 0;
        for (SuKaynagi sukaynagi : suDepolariListesi) {
            rezerv += sukaynagi.getGunlukUretim();
        }
        for (Citizen citizen : Citizen.getInstance().vatandaslarListesi) {
            tuketim += citizen.getGunlukSuTuketimi();
        }
        tuketimDurumu = rezerv - tuketim;
        if (rezerv < tuketim) {
            mesaj = "Su tuketimi, su rezerv seviyelerini asmistir\nAdmine uyear Gonderiliyor..";
            adminMesaj = "Su tuketimi, rezerv seviyelerini asmistir";
            Admin.getInstance().uyarilarListesi.add(adminMesaj);
        } else if (tuketimDurumu < 1000) {
            mesaj = "Asiri su tuketimi nedeniyle butun su depolari bosalmistir\nRezerv miktari bir depo kapasitesinden dusuktur\nAdmine uyari gonderiliyor";
            adminMesaj = "Su rezerv miktari dusuktur";
            Admin.getInstance().uyarilarListesi.add(adminMesaj);
        } else {
            mesaj = "Tuketim durumu normal savyesinde\nRezerv sevyesi yuksektir";
        }

        return mesaj;
    }
}
