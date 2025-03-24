
package com.mycompany.akillisehirsistemi.models.enerjySource;

public abstract class EnergySource {
    protected int gunlukUretim;
    protected String tip;
    protected int kapasite;
    protected String kaynakNumarasi;

    public EnergySource(int gunlukUretim, String tip, int kapasite, String kaynakNumarasi) {
        this.kaynakNumarasi = kaynakNumarasi;
        this.gunlukUretim = gunlukUretim;
        this.tip = tip;
        this.kapasite = kapasite;
    }

    public int getGunlukUretim() {
        return gunlukUretim;
    }

    public int getKapasite() {
        return kapasite;
    }

    public String getTip() {
        return tip;
    }

    public String getKaynakNumarasi() {
        return kaynakNumarasi;
    }

    public void setGunlukUretim(int gunlukUretim) {
        this.gunlukUretim = gunlukUretim;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

}
