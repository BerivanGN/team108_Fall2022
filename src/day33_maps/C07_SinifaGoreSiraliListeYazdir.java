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



    }
}
