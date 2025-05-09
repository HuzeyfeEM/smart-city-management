package com.mycompany.akillisehirsistemi;

import com.mycompany.akillisehirsistemi.models.vehicle.Otomobil;
import com.mycompany.akillisehirsistemi.models.vehicle.Otobus;
import com.mycompany.akillisehirsistemi.models.vehicle.Motosiklet;
import com.mycompany.akillisehirsistemi.models.vehicle.ElektrikliOtomobil;

import com.mycompany.akillisehirsistemi.models.building.AkilliBina;
import com.mycompany.akillisehirsistemi.models.building.GelenekselBina;

import com.mycompany.akillisehirsistemi.models.enerjySource.FosilYakitKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.GunesKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.NukleerKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.RuzgarKaynagi;
import com.mycompany.akillisehirsistemi.models.enerjySource.SuKaynagi;


import com.mycompany.akillisehirsistemi.views.Home;

public class AkilliSehirSistemi {
    static {
        //Enerji Kaynaklari
        new FosilYakitKaynagi(5000, "Fosil Yakit Kaynagi", 10000, "FosilKaynagi-3939");
        new GunesKaynagi(5000, "Gunes Kaynagi", 10000, "GunesKaynagi-3797");
        new NukleerKaynagi(5000, "Nukleer Kaynagi", 10000, "NukleerKaynagi-8384");
        new RuzgarKaynagi(5000, "Ruzgar Kaynagi", 10000, "RuzgarKaynagi-7564");
        new SuKaynagi(5000, "Su Kaynagi", 10000, "SuKaynagi-7584");
        new FosilYakitKaynagi(5000, "Fosil Yakit Kaynagi", 10000, "FosilKaynagi-7556");
        new GunesKaynagi(5000, "Gunes Kaynagi", 10000, "GunesKaynagi-7568");
        new NukleerKaynagi(5000, "Nukleer Kaynagi", 10000, "NukleerKaynagi-3574");
        new RuzgarKaynagi(5000, "Ruzgar Kaynagi", 10000, "RuzgarKaynagi-0677");
        new SuKaynagi(5000, "Su Kaynagi", 10000, "SuKaynagi-2543");
        new FosilYakitKaynagi(5000, "Fosil Yakit Kaynagi", 10000, "FosilKaynagi-7467");
        new GunesKaynagi(5000, "Gunes Kaynagi", 10000, "GunesKaynagi-8656");
        new NukleerKaynagi(5000, "Nukleer Kaynagi", 10000, "NukleerKaynagi-3545");
        new RuzgarKaynagi(5000, "Ruzgar Kaynagi", 10000, "RuzgarKaynagi-3334");
        new SuKaynagi(5000, "Su Kaynagi", 10000, "SuKaynagi-6667");
        
        //Binalar
        new AkilliBina("AkilliBina-346" , 12, "Akilli Bina" , "Kirmizi");
        new GelenekselBina("GelenekselBina-346" , 8, "Geleneksel Bina" , "Kirmizi");
        new AkilliBina("AkilliBina-5674" , 6, "Akilli Bina" , "Kirmizi");
        new GelenekselBina("GelenekselBina-256" , 3, "Geleneksel Bina" , "Siyah");
        new AkilliBina("AkilliBina-456" , 7, "Akilli Bina" , "Kirmizi");
        new GelenekselBina("GelenekselBina-573" , 3, "Geleneksel Bina" , "Beyaz");
        new AkilliBina("AkilliBina-3457" , 12, "Akilli Bina" , "Kirmizi");
        new GelenekselBina("GelenekselBina-457" , 34, "Geleneksel Bina" , "Mor");
        new AkilliBina("AkilliBina-754" , 27, "Akilli Bina" , "Yesil");
        new GelenekselBina("GelenekselBina-4537" , 4, "Geleneksel Bina" , "Mavi");
        new AkilliBina("AkilliBina-547" , 3, "Akilli Bina" , "Kahverengi");
        new GelenekselBina("GelenekselBina-4537" , 3, "Geleneksel Bina" , "Kirmizi");
        new AkilliBina("AkilliBina-875" , 12, "Akilli Bina" , "Bordo");
        new GelenekselBina("GelenekselBina-2545" , 14, "Geleneksel Bina" , "Kirmizi");
        
        //Araclar
        new ElektrikliOtomobil("45-IM-700", "Porsche", "Elektrikli Otomobil", "Turuncu");
        new Otomobil("45-IM-701", "Porsche", "Otomobil", "Turuncu");
        new Otobus("45-IM-702", "Porsche", "Otobus", "Turuncu");
        new Motosiklet("45-IM-703", "Porsche", "Motosiklet", "Turuncu");
        new ElektrikliOtomobil("46-JN-800", "Ford", "Elektrikli Otomobil", "Mor");
        new Otomobil("46-JN-801", "Ford", "Otomobil", "Mor");
        new Otobus("46-JN-802", "Ford", "Otobus", "Mor");
        new Motosiklet("46-JN-803", "Ford", "Motosiklet", "Mor");
        new ElektrikliOtomobil("47-KO-900", "Nissan", "Elektrikli Otomobil", "Beyaz");
        new Otomobil("47-KO-901", "Nissan", "Otomobil", "Beyaz");
        new Otobus("47-KO-902", "Nissan", "Otobus", "Beyaz");
        new Motosiklet("47-KO-903", "Nissan", "Motosiklet", "Beyaz");
        new ElektrikliOtomobil("48-LP-1000", "Honda", "Elektrikli Otomobil", "Gri");
        new Otomobil("48-LP-1001", "Honda", "Otomobil", "Gri");
        new Otobus("48-LP-1002", "Honda", "Otobus", "Gri");
        new Motosiklet("48-LP-1003", "Honda", "Motosiklet", "Gri");
        new ElektrikliOtomobil("49-MQ-1100", "Hyundai", "Elektrikli Otomobil", "Pembe");
        new Otomobil("49-MQ-1101", "Hyundai", "Otomobil", "Pembe");
        new Otobus("49-MQ-1102", "Hyundai", "Otobus", "Pembe");
        new Motosiklet("49-MQ-1103", "Hyundai", "Motosiklet", "Pembe");
        new ElektrikliOtomobil("40-DH-200", "Tesla", "Elektrikli Otomobil", "Sarı");
        new Otomobil("40-DH-201", "Tesla", "Otomobil", "Sarı");
        new Otobus("40-DH-202", "Tesla", "Otobus", "Sarı");
        new Motosiklet("40-DH-203", "Tesla", "Motosiklet", "Sarı");
        new ElektrikliOtomobil("41-EI-300", "Volkswagen", "Elektrikli Otomobil", "Yeşil");
        new Otomobil("41-EI-301", "Volkswagen", "Otomobil", "Yeşil");
        new Otobus("41-EI-302", "Volkswagen", "Otobus", "Yeşil");
        new Motosiklet("41-EI-303", "Volkswagen", "Motosiklet", "Yeşil");
        new ElektrikliOtomobil("42-FJ-400", "BMW", "Elektrikli Otomobil", "Beyaz");
        new Otomobil("42-FJ-401", "BMW", "Otomobil", "Beyaz");
        new Otobus("42-FJ-402", "BMW", "Otobus", "Beyaz");
        new Motosiklet("42-FJ-403", "BMW", "Motosiklet", "Beyaz");
        new ElektrikliOtomobil("43-GK-500", "Audi", "Elektrikli Otomobil", "Kırmızı");
        new Otomobil("43-GK-501", "Audi", "Otomobil", "Kırmızı");
        new Otobus("43-GK-502", "Audi", "Otobus", "Kırmızı");
        new Motosiklet("43-GK-503", "Audi", "Motosiklet", "Kırmızı");
        new ElektrikliOtomobil("44-HL-600", "Mercedes", "Elektrikli Otomobil", "Mavi");
        new Otomobil("44-HL-601", "Mercedes", "Otomobil", "Mavi");
        new Otobus("44-HL-602", "Mercedes", "Otobus", "Mavi");
        new Motosiklet("44-HL-603", "Mercedes", "Motosiklet", "Mavi");
        new ElektrikliOtomobil("50-OP-1200", "Audi", "Elektrikli Otomobil", "Mavi");
        new Otomobil("50-OP-1201", "Audi", "Otomobil", "Mavi");
        new Otobus("50-OP-1202", "Audi", "Otobus", "Mavi");
        new Motosiklet("50-OP-1203", "Audi", "Motosiklet", "Mavi");
        new ElektrikliOtomobil("51-PQ-1300", "BMW", "Elektrikli Otomobil", "Sarı");
        new Otomobil("51-PQ-1301", "BMW", "Otomobil", "Sarı");
        new Otobus("51-PQ-1302", "BMW", "Otobus", "Sarı");
        new Motosiklet("51-PQ-1303", "BMW", "Motosiklet", "Sarı");
        new ElektrikliOtomobil("52-QR-1400", "Toyota", "Elektrikli Otomobil", "Kırmızı");
        new Otomobil("52-QR-1401", "Toyota", "Otomobil", "Kırmızı");
        new Otobus("52-QR-1402", "Toyota", "Otobus", "Kırmızı");
        new Motosiklet("52-QR-1403", "Toyota", "Motosiklet", "Kırmızı");
        new ElektrikliOtomobil("53-RS-1500", "Volkswagen", "Elektrikli Otomobil", "Yeşil");
        new Otomobil("53-RS-1501", "Volkswagen", "Otomobil", "Yeşil");
        new Otobus("53-RS-1502", "Volkswagen", "Otobus", "Yeşil");
        new Motosiklet("53-RS-1503", "Volkswagen", "Motosiklet", "Yeşil");
        new ElektrikliOtomobil("54-ST-1600", "Hyundai", "Elektrikli Otomobil", "Lacivert");
        new Otomobil("54-ST-1601", "Hyundai", "Otomobil", "Lacivert");
        new Otobus("54-ST-1602", "Hyundai", "Otobus", "Lacivert");
        new Motosiklet("54-ST-1603", "Hyundai", "Motosiklet", "Lacivert");
        new ElektrikliOtomobil("55-TU-1700", "Kia", "Elektrikli Otomobil", "Turuncu");
        new Otomobil("55-TU-1701", "Kia", "Otomobil", "Turuncu");
        new Otobus("55-TU-1702", "Kia", "Otobus", "Turuncu");
        new Motosiklet("55-TU-1703", "Kia", "Motosiklet", "Turuncu");
        new ElektrikliOtomobil("56-UV-1800", "Mazda", "Elektrikli Otomobil", "Gümüş");
        new Otomobil("56-UV-1801", "Mazda", "Otomobil", "Gümüş");
        new Otobus("56-UV-1802", "Mazda", "Otobus", "Gümüş");
        new Motosiklet("56-UV-1803", "Mazda", "Motosiklet", "Gümüş");
        new ElektrikliOtomobil("57-VW-1900", "Nissan", "Elektrikli Otomobil", "Beyaz");
        new Otomobil("57-VW-1901", "Nissan", "Otomobil", "Beyaz");
        new Otobus("57-VW-1902", "Nissan", "Otobus", "Beyaz");
        new Motosiklet("57-VW-1903", "Nissan", "Motosiklet", "Beyaz");
        new ElektrikliOtomobil("58-XW-2000", "Ford", "Elektrikli Otomobil", "Gri");
        new Otomobil("58-XW-2001", "Ford", "Otomobil", "Gri");
        new Otobus("58-XW-2002", "Ford", "Otobus", "Gri");
        new Motosiklet("58-XW-2003", "Ford", "Motosiklet", "Gri");
        new ElektrikliOtomobil("59-YX-2100", "Mercedes", "Elektrikli Otomobil", "Beyaz");
        new Otomobil("59-YX-2101", "Mercedes", "Otomobil", "Beyaz");
        new Otobus("59-YX-2102", "Mercedes", "Otobus", "Beyaz");
        new Motosiklet("59-YX-2103", "Mercedes", "Motosiklet", "Beyaz");
        new ElektrikliOtomobil("60-ZY-2200", "BMW", "Elektrikli Otomobil", "Pembe");
        new Otomobil("60-ZY-2201", "BMW", "Otomobil", "Pembe");
        new Otobus("60-ZY-2202", "BMW", "Otobus", "Pembe");
        new Motosiklet("60-ZY-2203", "BMW", "Motosiklet", "Pembe");
        new ElektrikliOtomobil("61-AZ-2300", "Toyota", "Elektrikli Otomobil", "Sarı");
        new Otomobil("61-AZ-2301", "Toyota", "Otomobil", "Sarı");
        new Otobus("61-AZ-2302", "Toyota", "Otobus", "Sarı");
        new Motosiklet("61-AZ-2303", "Toyota", "Motosiklet", "Sarı");
        new ElektrikliOtomobil("62-BD-2400", "Tesla", "Elektrikli Otomobil", "Kırmızı");
        new Otomobil("62-BD-2401", "Tesla", "Otomobil", "Kırmızı");
        new Otobus("62-BD-2402", "Tesla", "Otobus", "Kırmızı");
        new Motosiklet("62-BD-2403", "Tesla", "Motosiklet", "Kırmızı");
        new ElektrikliOtomobil("63-CE-2500", "Hyundai", "Elektrikli Otomobil", "Mavi");
        new Otomobil("63-CE-2501", "Hyundai", "Otomobil", "Mavi");
        new Otobus("63-CE-2502", "Hyundai", "Otobus", "Mavi");
        new Motosiklet("63-CE-2503", "Hyundai", "Motosiklet", "Mavi");
        new ElektrikliOtomobil("64-DF-2600", "Mazda", "Elektrikli Otomobil", "Yeşil");
        new Otomobil("64-DF-2601", "Mazda", "Otomobil", "Yeşil");
        new Otobus("64-DF-2602", "Mazda", "Otobus", "Yeşil");
        new Motosiklet("64-DF-2603", "Mazda", "Motosiklet", "Yeşil");
        new ElektrikliOtomobil("65-EG-2700", "Kia", "Elektrikli Otomobil", "Pembe");
        new Otomobil("65-EG-2701", "Kia", "Otomobil", "Pembe");
        new Otobus("65-EG-2702", "Kia", "Otobus", "Pembe");
        new Motosiklet("65-EG-2703", "Kia", "Motosiklet", "Pembe");
        new ElektrikliOtomobil("66-FH-2800", "Volkswagen", "Elektrikli Otomobil", "Gümüş");
        new Otomobil("66-FH-2801", "Volkswagen", "Otomobil", "Gümüş");
        new Otobus("66-FH-2802", "Volkswagen", "Otobus", "Gümüş");
        new Motosiklet("66-FH-2803", "Volkswagen", "Motosiklet", "Gümüş");
        new ElektrikliOtomobil("67-GI-2900", "Honda", "Elektrikli Otomobil", "Turuncu");
        new Otomobil("67-GI-2901", "Honda", "Otomobil", "Turuncu");
        new Otobus("67-GI-2902", "Honda", "Otobus", "Turuncu");
        new Motosiklet("67-GI-2903", "Honda", "Motosiklet", "Turuncu");
        new ElektrikliOtomobil("68-HJ-3000", "Ford", "Elektrikli Otomobil", "Beyaz");
        new Otomobil("68-HJ-3001", "Ford", "Otomobil", "Beyaz");
        new Otobus("68-HJ-3002", "Ford", "Otobus", "Beyaz");
        new Motosiklet("68-HJ-3003", "Ford", "Motosiklet", "Beyaz");
        new ElektrikliOtomobil("69-IJ-3100", "Nissan", "Elektrikli Otomobil", "Kırmızı");
        new Otomobil("69-IJ-3101", "Nissan", "Otomobil", "Kırmızı");
        new Otobus("69-IJ-3102", "Nissan", "Otobus", "Kırmızı");
        new Motosiklet("69-IJ-3103", "Nissan", "Motosiklet", "Kırmızı");
        new ElektrikliOtomobil("70-JK-3200", "Porsche", "Elektrikli Otomobil", "Lacivert");
        new Otomobil("70-JK-3201", "Porsche", "Otomobil", "Lacivert");
        new Otobus("70-JK-3202", "Porsche", "Otobus", "Lacivert");
        new Motosiklet("70-JK-3203", "Porsche", "Motosiklet", "Lacivert");
        new ElektrikliOtomobil("71-KL-3300", "BMW", "Elektrikli Otomobil", "Yeşil");
        new Otomobil("71-KL-3301", "BMW", "Otomobil", "Yeşil");
        new Otobus("71-KL-3302", "BMW", "Otobus", "Yeşil");
        new Motosiklet("71-KL-3303", "BMW", "Motosiklet", "Yeşil");
        new ElektrikliOtomobil("72-LM-3400", "Audi", "Elektrikli Otomobil", "Beyaz");
        new Otomobil("72-LM-3401", "Audi", "Otomobil", "Beyaz");
        new Otobus("72-LM-3402", "Audi", "Otobus", "Beyaz");
        new Motosiklet("72-LM-3403", "Audi", "Motosiklet", "Beyaz");
        new ElektrikliOtomobil("73-MN-3500", "Tesla", "Elektrikli Otomobil", "Sarı");
        new Otomobil("73-MN-3501", "Tesla", "Otomobil", "Sarı");
        new Otobus("73-MN-3502", "Tesla", "Otobus", "Sarı");
        new Motosiklet("73-MN-3503", "Tesla", "Motosiklet", "Sarı");
        new ElektrikliOtomobil("74-NO-3600", "Mazda", "Elektrikli Otomobil", "Turuncu");
        new Otomobil("74-NO-3601", "Mazda", "Otomobil", "Turuncu");
        new Otobus("74-NO-3602", "Mazda", "Otobus", "Turuncu");
        new Motosiklet("74-NO-3603", "Mazda", "Motosiklet", "Turuncu");
        new ElektrikliOtomobil("75-OP-3700", "Hyundai", "Elektrikli Otomobil", "Kırmızı");
        new Otomobil("75-OP-3701", "Hyundai", "Otomobil", "Kırmızı");
        new Otobus("75-OP-3702", "Hyundai", "Otobus", "Kırmızı");
        new Motosiklet("75-OP-3703", "Hyundai", "Motosiklet", "Kırmızı");
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }
}
