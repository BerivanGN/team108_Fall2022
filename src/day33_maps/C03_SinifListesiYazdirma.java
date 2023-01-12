package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {
    public static void main(String[] args) {

        // Verilen sınıftaki öğrencilerin no,isim,soyisim,bölümlerini
        // bir liste olarak yazdıran bir metod oluşturun.

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"10");


    }
}
