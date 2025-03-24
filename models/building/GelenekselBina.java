package com.mycompany.akillisehirsistemi.models.building;

import com.mycompany.akillisehirsistemi.controllers.EnergyManagement;
import com.mycompany.akillisehirsistemi.models.interfaces.Binalar_Methods;

public class GelenekselBina extends Building implements Binalar_Methods {

    protected static int gelenekselBinaSayisi;

    public GelenekselBina(String binaNumarasi, int katSayisi, String tip, String renk) {
        super(binaNumarasi, katSayisi, tip, renk);
        elektrikTuketimi = (int) (Math.random() * 301);
        yakitTuketimi = (int) (Math.random() * 301);
        gelenekselBinaSayisi++;
        EnergyManagement.getInstance().binalarListesi.add(this);
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
        return gelenekselBinaSayisi;
    }

}
