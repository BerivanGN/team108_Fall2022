package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArttirma {
    public static void main(String[] args) {

        // ogrenci map'teki tüm sınıf değerlerini 1 arttırın.
        // 12. sınıf varsa sınıf bilgisini mezun yapın.

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.siniflariArttir(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);

    }
}
