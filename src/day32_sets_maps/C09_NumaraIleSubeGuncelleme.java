package day32_sets_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {

        // Numarası verilen öğrencinin şube ismini
        // verilen şube yapan bir method oluşturun.

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,104,"M");
        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,101,"L");

        System.out.println(ogrenciMap);

    }
}
