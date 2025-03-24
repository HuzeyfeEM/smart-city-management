package com.mycompany.akillisehirsistemi.models.vehicle;

import com.mycompany.akillisehirsistemi.controllers.TrafficManagement;
import com.mycompany.akillisehirsistemi.models.interfaces.Araclar_Methods;

public class ElektrikliOtomobil extends Vehicle implements Araclar_Methods {
    protected static int elektrikleOtomobilSayisi;

    public ElektrikliOtomobil(String plaka, String marka, String tip, String renk) {
        super(plaka, marka, tip, renk);
        yakitSevyesi = (int) (Math.random() * 101);
        konum = (char) ('A' + Math.random() * 4);
        enerjiTuketimi = (int) (Math.random() * 101);
        elektrikleOtomobilSayisi++;
        TrafficManagement.getInstance().araclarListesi.add(this);
    }

    @Override
    public String depoKapasitesi() {
        return "86 kWh";
    }

    @Override
    public boolean yakit_Kontrol() {
        boolean durum;
        if (yakitSevyesi < 20) {
            durum = true;
            System.out.println("Sarjiniz Bitmak Uzere\nSarj istasiyona yonlendiriliyor...");
        } else {
            durum = false;
            System.out.println("Sarj seviyesi yuksek :)");
        }
        return durum;
    }

    @Override
    public void yakit_Istasyonuna_Yonlendir() {
        yakitSevyesi += 70;
        System.out.println("Sarj dolduruluyor...\nSarj basariyla dolduruldu" + "\nSarj Seviyesi : " + yakitSevyesi);
    }

    @Override
    public int toplam_Arac_Sayisi() {
        return elektrikleOtomobilSayisi;
    }

    public String getPlaka() {
        return plaka;
    }

    public String getMarka() {
        return marka;
    }

    public int getYakitSevyesi() {
        return yakitSevyesi;
    }

    public char getKonum() {
        return konum;
    }

    public int getEnerjiTuketimi() {
        return enerjiTuketimi;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setKonum(char konum) {
        this.konum = konum;
    }
    
    public void setYakitSevyesi(int yakitSevyesi) {
        this.yakitSevyesi = yakitSevyesi;
    }
}
