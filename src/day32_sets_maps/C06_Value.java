package day32_sets_maps;

import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {

        // mapOlustur method'u bize bir map döndürüyor
        // biz o class'daki map'i kullanmak istiyoruz ama
        // her seferinde o class'a gidip o map'i yeniden oluşturmamız işimize yaramaz

        // Bu class'da bir map oluşturmak istediğimizde
        // new HashMap<>() yazıyoruz
        // ancak bu bize boş bir map getiriyor
        // bu kodun yerine mapMethodDepo'dan ogrenciMapOlustur methodunu çalıştırırsak
        // bize dolu bir map getirir.
        // biz de onu içinde olduğumuz class'da oluşturduğumuz ogrenciMap'e atama yaparız

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);


        System.out.println(ogrenciMap.keySet());
        // [101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayşe-Can-10-H-MF, Sevgi-Can-10-H-MF, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]


        // verilen ismin ogrenciMap'de olup olmadığını kontrol edip
        // true veya false döndüren bir method oluşturun.

        boolean sonuc= MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");

        System.out.println(sonuc); // true

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Kemal"));// false
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Cem")); // false



    }
}
