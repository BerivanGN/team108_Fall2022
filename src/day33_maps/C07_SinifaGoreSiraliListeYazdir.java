package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    public static void main(String[] args) {

        // tüm öğrenci listesini
        // sınıf şube isim soyisim no şeklinde
        // doğal sıralı olarak
        // yazdıran bir metod oluşturun.

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeYazdir(ogrenciMap);

        /*
        sınıf şube isim  soyisim  no
        ==========================
        10    H    Ayşe   Can     104
        10    H    Sevgi  Can     105
        10    K    Veli   Cem     102
        11    H    Ali    Can     101
        11    K    Ali    Cem     103
        11    K    Sevgi  Can     106

         */



    }
}
