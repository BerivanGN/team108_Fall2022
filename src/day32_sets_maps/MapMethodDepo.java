package day32_sets_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    // bize ogrenciMap döndüren bir method oluşturun

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayşe-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Can-10-H-MF");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;


    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1 - tüm value bir collection olarak kaydedelim
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayşe-Can-10-H-MF, Sevgi-Can-10-H-MF, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        Collection<String> valuesCollections= ogrenciMap.values();

        // 2 - for each kullanarak her bir value'yu ele alalım Ali-Can-11-H-MF
        // 3 - -'yi kullanarak split yapalım [Ali, Can, 11, H, MF]
        // 4- split yaptığımız array'dan isim bilgisini alalım 0.index
        // 5- eğer value'den aldığımız isim aranan isim ile aynı ise
        //     true döndürüp for each 'i bitirelim
        // 6- for-each bittiğinde true olmadıysa

        for (String  eachValue:valuesCollections
             ) {
            String[] valueArr= eachValue.split("-");
            String valuedekiIsim= valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }
        }

        return false;

        }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {

        // 1 Map'deki value'leri bir collection olarak kaydedelim
        //   [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayşe-Can-10-H-MF, Sevgi-Can-10-H-MF, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        Collection<String> ogrenciValueCollection=ogrenciMap.values();

        //listenin ilk satırı olarak başlıkları yazdıralım
        System.out.println("Isim Soyisim Sınıf Şube");


        // 2 - for each ile her bir value bilgisini  ele alalım Ali-Can_11_h_MF
        // 3 - value'yi - ile split yapıp bir array elde edelim [Ali, Can, 11, H, MF]
        // 4 - array'in 1. index'indeki soyisme bakıp aranan soyisimn ile aynı ise
        // isim, soyisim, sınıf ve şube bilgilerini yazdıralım.

        for (String eachValue:ogrenciValueCollection
             ) {
            String[] valueArr= eachValue.split("-");
            String valueSoyisim=valueArr[1];
              if(valueSoyisim.equalsIgnoreCase(soyisim))     {
                  System.out.println(valueArr[0] + " " +
                          valueArr[1] + " " +
                          valueArr[2] + " " +
                          valueArr[3]);
              }
        }

    }


    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection=ogrenciMap.values();

        System.out.println("Isim Soyisim");

        for (String eachValue:valueCollection
             ) {
            String[] valueArr= eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)){

                System.out.println(valueArr[0] + "  " + valueArr[1]);
            }

        }

    }

    public static Map<Integer,String> numaraIleSubeDegistirme(Map<Integer,String> ogrenciMap, int okulNo,String yeniSubeIsmi){



        // 1 - Okul numrasını biliyoruz, direkt öğrenci value'ye ulaşabiliriz.

    String ogrenciValue= ogrenciMap.get(okulNo);

    String[] valueArr= ogrenciValue.split("-");

    // 2 - şube ismini güncelleyelim

        valueArr[3]=yeniSubeIsmi;

    // 3 - Arraydeki güncel bilgileri yeniden value formatında bir String yapalım

        String yeniValue= valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" +
                           valueArr[3] + "-" + valueArr[4];

    // 4 - ogrenci no yani key ile yeni value'yi map'e ekleyelim

        ogrenciMap.put(okulNo,yeniValue);

        return ogrenciMap;

}
}

