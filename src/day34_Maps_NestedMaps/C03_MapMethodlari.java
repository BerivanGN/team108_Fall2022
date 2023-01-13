package day34_Maps_NestedMaps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value değerinin tamamı sorulursa true , bir parçası sorulursa false döner

        System.out.println(ogrenciMap.getOrDefault(103, "Öğrenci bulunamadı"));
        //Ali-Cem-11-K-TM

        System.out.println(ogrenciMap.get(123)); // null (o numaralı kişi yok)

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-MF

        ogrenciMap.put(103,"Ali-Cem-12-K-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-12-K-MF

        System.out.println(ogrenciMap.replace(123, "Ali-Cem-12-K-MF")); // null

        ogrenciMap.replace(103,"Ali-Cem-12-K-MF","Ali-Han-12-K-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-K-MF
        // kontrol eder eski valu verilen değer ile aynı ise yazılan yeni valu ile değiştirir
        // değil ise değiştirmez eskiyi yazar.




    }
}
