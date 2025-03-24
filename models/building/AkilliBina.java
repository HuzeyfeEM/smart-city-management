package com.mycompany.akillisehirsistemi.models.building;

import com.mycompany.akillisehirsistemi.controllers.EnergyManagement;
import com.mycompany.akillisehirsistemi.models.interfaces.Binalar_Methods;

public class AkilliBina extends Building implements Binalar_Methods {

    protected static int akilliBinaSayisi;
    protected boolean tasarrufModu;

    public AkilliBina(String binaNumarasi, int katSayisi, String tip, String renk) {
        super(binaNumarasi, katSayisi, tip, renk);
        akilliBinaSayisi++;
        elektrikTuketimi = (int) (Math.random() * 301);
        yakitTuketimi = (int) (Math.random() * 301);
        EnergyManagement.getInstance().binalarListesi.add(this);
    }

    public void tasarruf_Modunu_Etkinlestir() {
        if (elektrikTuketimi > 200 || yakitTuketimi > 200 || (elektrikTuketimi > 200 && yakitTuketimi > 200)) {
            tasarrufModu = true;
        } else {
            tasarrufModu = false;
        }
    }

    public void tasarruf_Modunu_Kapat() {
        if (elektrikTuketimi < 200 || yakitTuketimi < 200 || (elektrikTuketimi < 200 && yakitTuketimi < 200)) {
            tasarrufModu = false;
        } else {
            tasarrufModu = true;
        }
    }

    public int getElektrikTuketimi() {
        return elektrikTuketimi;
    }

    public int getYakitTuketimi() {
        return yakitTuketimi;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public String getTip() {
        return tip;
    }

    public String getRenk() {
        return renk;
    }

    public String getBinaNumarasi() {
        return binaNumarasi;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    @Override
    public int toplam_Bina_Sayisi() {
        return akilliBinaSayisi;
    }
}
