package com.mycompany.akillisehirsistemi.models.vehicle;

public abstract class Vehicle {
    protected String plaka;
    protected String tip;
    protected String marka;
    protected String renk;
    protected int yakitSevyesi;
    protected char konum;
    protected int enerjiTuketimi;

    public Vehicle(String plaka, String marka, String tip, String renk) {
        this.plaka = plaka;
        this.marka = marka;
        this.tip = tip;
        this.renk = renk;
    }

    public abstract boolean yakit_Kontrol();

    public abstract String depoKapasitesi();

    public String getPlaka() {
        return plaka;
    }

    public String getTip() {
        return tip;
    }

    public String getMarka() {
        return marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
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
    

    /*
     * public static String konum_Yap () {
     * int sayi = (int)(Math.random() * 4);
     * String konum;
     * switch(sayi){
     * case 0 : konum = "A"; return konum;
     * case 1 : konum = "B"; return konum;
     * case 2 : konum = "C"; return konum;
     * case 3 : konum = "D"; return konum;
     * default:return "";
     * }
     * }
     */

    public void setYakitSevyesi(int yakitSevyesi) {
        this.yakitSevyesi = yakitSevyesi;
    }
}
