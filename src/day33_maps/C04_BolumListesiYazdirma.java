package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    public static void main(String[] args) {

        // Verilen bölümdeki öğrencilerin
        // No, isim, soyisim ve sınıflarını yazdıran bir metod oluşturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"MF");
    }
}
