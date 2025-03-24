package com.mycompany.akillisehirsistemi.controllers;

import com.mycompany.akillisehirsistemi.models.user.Admin;
import com.mycompany.akillisehirsistemi.models.building.Building;
import com.mycompany.akillisehirsistemi.models.building.AkilliBina;
import com.mycompany.akillisehirsistemi.models.building.GelenekselBina;
import com.mycompany.akillisehirsistemi.models.enerjySource.EnergySource;
import com.mycompany.akillisehirsistemi.models.vehicle.ElektrikliOtomobil;
import com.mycompany.akillisehirsistemi.models.vehicle.Motosiklet;
import com.mycompany.akillisehirsistemi.models.vehicle.Otobus;
import com.mycompany.akillisehirsistemi.models.vehicle.Otomobil;
import com.mycompany.akillisehirsistemi.models.vehicle.Vehicle;
import com.mycompany.akillisehirsistemi.models.enerjySource.FosilYakitKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.GunesKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.NukleerKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.RuzgarKaynagi;
import java.util.ArrayList;

public class EnergyManagement {

    public ArrayList<Building> binalarListesi;
    public ArrayList<EnergySource> kaynaklarListesi;

    private static EnergyManagement instance;

    // Private constructor
    private EnergyManagement() {
        binalarListesi = new ArrayList<>();
        kaynaklarListesi = new ArrayList<>();
    }

    // Singleton Instance Getter
    public static EnergyManagement getInstance() {
        if (instance == null) {
            instance = new EnergyManagement();
        }
        return instance;
    }

    private static final FosilYakitKaynagi fosilYakitKaynagi = new FosilYakitKaynagi(0, "Fosil Yakit Kaynagi", 0,
            "FosilKaynagi-1334");
    private static final GunesKaynagi gunesKaynagi = new GunesKaynagi(0, "Gunes Kaynagi", 0, "GunesKaynagi-2935");
    private static final NukleerKaynagi nukleerKaynagi = new NukleerKaynagi(0, "Nukleer Kaynagi", 0,
            "NukleerKaynagi-4384");
    private static final RuzgarKaynagi ruzgarKaynagi = new RuzgarKaynagi(0, "Ruzgar Kaynagi", 0, "RuzgarKaynagi-4738");

    private static final ElektrikliOtomobil elektrikliOtomobil = new ElektrikliOtomobil("", "", "Elektrikli Otomobil", "");

    Otobus otobus;
    Otomobil otomobil;
    Motosiklet motosiklet;

    AkilliBina akilliBina;
    GelenekselBina gelenekselBina;

    FosilYakitKaynagi fosilYakitKaynagi1;

    public FosilYakitKaynagi getFosilYakitKaynagi() {
        return fosilYakitKaynagi;
    }

    public GunesKaynagi getGunesKaynagi() {
        return gunesKaynagi;
    }

    public NukleerKaynagi getNukleerKaynagi() {
        return nukleerKaynagi;
    }

    public RuzgarKaynagi getRuzgarKaynagi() {
        return ruzgarKaynagi;
    }

    public ElektrikliOtomobil getElektrikliOtomobil() {
        return elektrikliOtomobil;
    }

    public String enerjiUratimiTuketimiKarsilastir() {
        String mesaj = "";

        // Araclardaki enerji tuketimi
        int elektrikTuketimi = 0;
        int yakitTuketimi = 0;
        for (Vehicle vehicle : TrafficManagement.getInstance().araclarListesi) {
            if (vehicle.getTip().equals(EnergyManagement.getInstance().getElektrikliOtomobil().getTip())) {
                elektrikTuketimi += vehicle.getEnerjiTuketimi();
            } else {
                yakitTuketimi += vehicle.getEnerjiTuketimi();
            }
        }
        mesaj += "Elektrikli araclardaki elektrik tuketimi : " + elektrikTuketimi + " kW"
                + "\nDiger araclardaki yakit tuketimi : " + yakitTuketimi + " LT";

        // Binalardaki enerji tukeitmi
        int elektrikTuketimi1 = 0;
        int yakitTuketimi1 = 0;        
        for (Building building : binalarListesi) {
            elektrikTuketimi1 += building.getElektrikTuketimi();
            yakitTuketimi1 += building.getYakitTuketimi();
        }
        mesaj += "\nBinalardaki Elektrik Tuketimi : " + elektrikTuketimi1 + " kW"
                + "\nBinalardaki Yakit Tuketimi : " + yakitTuketimi1 + " LT";

        int toplamElektrikTuketimi = elektrikTuketimi + elektrikTuketimi1;
        int toplamYakitTuketimi = yakitTuketimi + yakitTuketimi1;

        int elektrikUretimi = 0;
        int yakitUretimi = 0;
        for (EnergySource energySource : kaynaklarListesi) {
            if (energySource.getTip().equals(EnergyManagement.getInstance().getFosilYakitKaynagi().getTip())) {
                yakitUretimi += energySource.getGunlukUretim();
            } else {
                elektrikUretimi += energySource.getGunlukUretim();
            }
        }
        mesaj += "\nElektrik Uretim : " + elektrikUretimi + " kW" + "\nYakit Uretimi : " + yakitUretimi + " LT";

        String adminMesaj = "";
        if (elektrikUretimi > toplamElektrikTuketimi) {
            mesaj += "\nElektrik Tuketimi, Uratimi Asmamistir";
        } else if (elektrikUretimi < toplamElektrikTuketimi) {
            mesaj += "\nElektrik Tuketimi, Uretimi Asmistir\nAdmine uyari Gonderiliyor..";
            adminMesaj = "Elektrik Tuketimi, Uretimi Asmistir";
            Admin.getInstance().uyarilarListesi.add(adminMesaj);

        }
        if (yakitUretimi > toplamYakitTuketimi) {
            mesaj += "\nYakit Tuketimi, Uratimi Asmamistir";
        } else if (yakitUretimi < toplamYakitTuketimi) {
            mesaj += "\nYakit Tuketimi, Uretimi Asmistir\nAdmine uyari Gonderiliyor..";
            adminMesaj = "Yakit Tuketimi, Uretimi Asmistir";
            Admin.getInstance().uyarilarListesi.add(adminMesaj);
        }

        return mesaj;
    }

    public String enerjiUretimDurumu() {
        String mesaj = "";
        int fosiluretim = 0;
        int gunesUratim = 0;
        int nukleerUretim = 0;
        int ruzgarUretim = 0;
        for (EnergySource energySource : kaynaklarListesi) {
            if (energySource.getTip().equals(EnergyManagement.getInstance().getFosilYakitKaynagi().getTip())) {
                fosiluretim += energySource.getGunlukUretim();
            } else if (energySource.getTip().equals(EnergyManagement.getInstance().getGunesKaynagi().getTip())) {
                gunesUratim += energySource.getGunlukUretim();
            } else if (energySource.getTip().equals(EnergyManagement.getInstance().getNukleerKaynagi().getTip())) {
                nukleerUretim += energySource.getGunlukUretim();
            } else if (energySource.getTip().equals(EnergyManagement.getInstance().getRuzgarKaynagi().getTip())) {
                ruzgarUretim += energySource.getGunlukUretim();
            }
            mesaj = "Fosil Yakit Kaynaklarinin Uretim Durumu : " + fosiluretim + "LT"
                    + "\nKaynak Sayisi : "
                    + EnergyManagement.getInstance().getFosilYakitKaynagi().toplam_Kaynak_Sayisi()
                    + "\nGunes Kaynagindan Uretilen Elektrik : " + gunesUratim + "kW"
                    + "\nKaynak Sayisi : " + EnergyManagement.getInstance().getGunesKaynagi().toplam_Kaynak_Sayisi()
                    + "\nNukleer Kaynaklarinin Uretim Durumu :  " + nukleerUretim + "kW"
                    + "\nKaynak Sayisi ; " + EnergyManagement.getInstance().getNukleerKaynagi().toplam_Kaynak_Sayisi()
                    + "\nRuzgar Kaynaklarinin Uretim Durumu : " + ruzgarUretim + "kW"
                    + "\nKaynak Sayisi : " + EnergyManagement.getInstance().getRuzgarKaynagi().toplam_Kaynak_Sayisi();
        }
        return mesaj;
    }

}
