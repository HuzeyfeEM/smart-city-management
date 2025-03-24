package com.mycompany.akillisehirsistemi.models.vehicle;

import com.mycompany.akillisehirsistemi.controllers.TrafficManagement;
import com.mycompany.akillisehirsistemi.models.interfaces.Araclar_Methods;

public class Otobus extends Vehicle implements Araclar_Methods {
    protected static int otobusSayisi;

    public Otobus(String plaka, String marka, String tip, String renk) {
        super(plaka, marka, tip, renk);
        yakitSevyesi = (int) (Math.random() * 101);
        konum = (char) ('A' + Math.random() * 4);
        enerjiTuketimi = (int) (Math.random() * 101);
        otobusSayisi++;
        TrafficManagement.getInstance().araclarListesi.add(this);
    }

    @Override
    public String depoKapasitesi() {
        return "120 LT";
    }

    @Override
    public boolean yakit_Kontrol() {
        boolean durum;
        if (yakitSevyesi < 20) {
            durum = true;
            System.out.println("Yakitiniz Bitmak Uzere\nYakit istasiyona yonlendiriliyor...");
        } else {
            durum = false;
            System.out.println("Yakit seviyesi yuksek :)");
        }
        return durum;
    }

    @Override
    public void yakit_Istasyonuna_Yonlendir() {
        yakitSevyesi += 100;
        System.out.println("Yakit dolduruluyor...\nYakit basariyla dolduruldu" + "\nYakit Seviyesi : " + yakitSevyesi);
    }

    @Override
    public int toplam_Arac_Sayisi() {
        return otobusSayisi;
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
}
