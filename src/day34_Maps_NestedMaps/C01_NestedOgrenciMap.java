package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedOgrenciMap {
    public static void main(String[] args) {

        Map<Integer,Map<String,String >> ogrenciMap = new HashMap<>();


        Map<String ,String>ogrenci101 = new HashMap<>();
        ogrenci101.put("Isim","Ali");
        ogrenci101.put("Soyisim","Can");
        ogrenci101.put("Sınıf","11");
        ogrenci101.put("Şube","H");
        ogrenci101.put("Bölüm","MF");


        Map<String ,String>ogrenci102 = new HashMap<>();
        ogrenci102.put("Isim","Veli");
        ogrenci102.put("Soyisim","Cem");
        ogrenci102.put("Sınıf","10");
        ogrenci102.put("Şube","K");
        ogrenci102.put("Bölüm","TM");

        Map<String ,String>ogrenci103 = new HashMap<>();
        ogrenci103.put("Isim","Ali");
        ogrenci103.put("Soyisim","Cem");
        ogrenci103.put("Sınıf","11");
        ogrenci103.put("Şube","K");
        ogrenci103.put("Bölüm","TM");

        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap);

      /*
        {101={Soyisim=Can, Şube=H, Bölüm=MF, Sınıf=11, Isim=Ali},
         102={Soyisim=Cem, Şube=K, Bölüm=TM, Sınıf=10, Isim=Veli},
         103={Soyisim=Cem, Şube=K, Bölüm=TM, Sınıf=11, Isim=Ali}}
      */

        // 101 numaralı öğrencinin ismini yazdıralım

        System.out.println(ogrenciMap.get(101).get("Isim")); // Ali

        // 102 numaralı öğrencinin sınıf bigisini yazdırın

        System.out.println(ogrenciMap.get(102).get("Sınıf")); // 10

        // 103 numaralı öğrencinin sınıfını 12 yapalım

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti= ogrenciMap.entrySet();

        for (Map.Entry<Integer,Map<String,String >> eachOgrenciEntry:ogrenciEntrySeti
             ) {
            // 103={Soyisim=Cem, Şube=K, Bölüm=TM, Sınıf=11, Isim=Ali}
            // once öğrenci value'sini kaydetmeliyiz.

            if (eachOgrenciEntry.getKey()==103){

                Map<String, String> eachOgrenciValueMap= eachOgrenciEntry.getValue();
                // {Soyisim=Cem, Şube=K, Bölüm=TM, Sınıf=11, Isim=Ali}

                eachOgrenciValueMap.put("Sınıf","12");
                eachOgrenciEntry.setValue(eachOgrenciValueMap);
            }



        }
        System.out.println(ogrenciMap);


    }
}
