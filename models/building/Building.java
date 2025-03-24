package com.mycompany.akillisehirsistemi.models.building;

public abstract class Building {

    protected String binaNumarasi;
    protected int elektrikTuketimi;
    protected int yakitTuketimi;
    protected int katSayisi;
    protected String tip;
    protected String renk;

    Building(String binaNumarasi, int katSayisi, String tip, String renk) {
        this.binaNumarasi = binaNumarasi;
        this.katSayisi = katSayisi;
        this.tip = tip;
        this.renk = renk;
    }

    public int getElektrikTuketimi() {
        return elektrikTuketimi;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public String getTip() {
        return tip;
    }

    public int getYakitTuketimi() {
        return yakitTuketimi;
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

}
