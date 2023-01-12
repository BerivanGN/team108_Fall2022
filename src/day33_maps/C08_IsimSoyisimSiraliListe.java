package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {

        // Tüm öğrenci listesini
        // isim soyisim no sınıf şube bolum
        // şekinde sıralı olarak yazdıran bir metot oluşturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);

    }
}
