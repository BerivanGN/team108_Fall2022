package day32_sets_maps;

import java.util.Map;

public class C07_SoyisimIleOgrenciArama {

    // Ogrenci map'te aradığımız soyisimdeki öğrencilerin
    // Isim,soyisimisınıf ve şube bilgilerini
    // bir tablo oluşturarak yazdıran bir method oluşturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Can");

    }
}
