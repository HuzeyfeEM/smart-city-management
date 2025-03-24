package com.mycompany.akillisehirsistemi.models.enerjySource;

import com.mycompany.akillisehirsistemi.controllers.EnergyManagement;
import com.mycompany.akillisehirsistemi.models.interfaces.Kaynaklar_Methods;

public class GunesKaynagi extends EnergySource implements Kaynaklar_Methods {
    protected static int kaynakSayisi;

    public GunesKaynagi(int gunlukUretim, String tip, int kapasite, String kaynakNumarasi) {
        super(gunlukUretim, tip, kapasite, kaynakNumarasi);
        kaynakSayisi++;
        EnergyManagement.getInstance().kaynaklarListesi.add(this);
    }

    @Override
    public int toplam_Kaynak_Sayisi() {
        return kaynakSayisi;
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

    public void setGunlukUretim(int gunlukUretim) {
        this.gunlukUretim = gunlukUretim;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

}
