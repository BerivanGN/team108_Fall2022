package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {

        // Tüm öğrenci listesini
        // isim soyisim no sınıf şube bolum
        // şekinde sıralı olarak yazdıran bir metot oluşturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Berivan-Gökkaya-11-M-TM");

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);

        /*

       isim  soyisim no sınıf şube bolum
       ================================
       Ali     Can     101  11   H   MF
       Ali     Cem     103  11   K   TM
       Ayşe    Can     104  10   H   MF
       Berivan Gökkaya 110  11   M   TM
       Sevgi   Can     105  10   H   MF
       Sevgi   Can     106  11   K   TM
       Veli    Cem     102  10   K   TM

         */

    }
}
