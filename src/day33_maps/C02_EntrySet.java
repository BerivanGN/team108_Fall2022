package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        // Tüm öğrencileri 101= "Ali-Can-11-H-MF" şeklinde yazdırın

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayşe-Can-10-H-MF, 105=Sevgi-Can-10-H-MF, 106=Sevgi-Can-10-K-MF}
        
        // önce öğrenci numaralarını elde edelim
        
        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();// [101, 102, 103, 104, 105, 106]

        System.out.println("No    öğrenci bilgileri");
        System.out.println("=======================");

        for (Integer eachKey:ogrenciNoSeti
             ) {
            System.out.println(eachKey + "=" + ogrenciMap.get(eachKey));
        }

        /*
          Aslında bizden istenen map'in içindeki elementler
          Java map'teki elementleri key-value ikilisi olarak birlikte alabilmemiz için
          ENTRY class'ı oluşturmuştur.

          entry'ler de map ile aynı data yapısına sahip olmalıdır.
          örneğin öğrenci map'ini düşünürsek entry'ler :

          Entry<Integer,String>
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySet = ogrenciMap.entrySet();

        System.out.println("No    öğrenci bilgileri");
        System.out.println("=======================");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
             ) {
            System.out.println(eachEntry);
        }
    }
}
