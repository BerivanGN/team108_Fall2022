package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {
    public static void main(String[] args) {

        // Map'teki soyisimleri büyük harfe çeviren bir metod oluşturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);
        MapMethodDepo.tumListeYazdir(ogrenciMap);

        // 11. sınıfları yazdıralım

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");
    }
}
