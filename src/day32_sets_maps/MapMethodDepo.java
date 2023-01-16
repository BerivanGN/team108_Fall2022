package day32_sets_maps;

import java.util.*;

public class MapMethodDepo {

    // bize ogrenciMap döndüren bir method oluşturun

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayşe-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Can-10-H-MF");
        ogrenciMap.put(106,"Sevgi-Can-11-K-TM");

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


    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

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

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        // Verilen sınıftaki öğrencilerin no,isim,soyisim,bölümlerini
        // bir liste olarak yazdıran bir metod oluşturun.

        System.out.println("No isim soyisim bölüm");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) { // 101=Ali-Can-11-H-MF

            // 1 - Entry'den value'yi alalım
            String entryValue= eachEntry.getValue(); // Ali-Can-11-H-MF

            // 2 - Bu value'yi parçalayalım ve bir array'e store edelim
            String[] valueArr=entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // sınıf bilgisini kontrol edip
            // istenen sınıf ile aynı ise istenen bilgileri yazdıralım
            if (valueArr[2].equalsIgnoreCase(sinif)){
                System.out.println(eachEntry.getKey() + " " +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4]);
            }

        }

    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {

        // Verilen bölümdeki öğrencilerin
        // No, isim, soyisim ve sınıflarını yazdıran bir metod oluşturun

        System.out.println("No isim soyisim sınıf");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            String entryValue=eachEntry.getValue();

            String[] entryValueArr=entryValue.split("-"); // [Ali, Can, 11, H, MF]

            if (entryValueArr[4].equalsIgnoreCase(bolum)){

                System.out.println(eachEntry.getKey() + " " +
                        entryValueArr[0] + " " +
                        entryValueArr[1] + " " +
                        entryValueArr[2]);
            }


        }

    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        // Map'teki soyisimleri büyük harfe çeviren bir metod oluşturun

        // 1 - entrySet oluşturalım
        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();

        // 2 - for each loop ile her bir entry'i elden geçirip soyisimleri büyük harf yapalım
        for (Map.Entry<Integer,String> eachEntry:entrySeti
        ) {

            // 3 - entry'den value'yi alalım
            String entryValue=eachEntry.getValue();

            // 4 - soyisim bilgisine ulaşmak için parçalayalım
            String[] entryValueArr=entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5 - soyismi büyük harf yapalım
            entryValueArr[1]=entryValueArr[1].toUpperCase(); // [Ali, CAN, 11, H, MF]

            // 6 - değişikliği yaptıktan sonra yeniden birleştirmeleri yapıp
            //     map'i update etmeliyiz.

            // 7 - setValue() kullanarak value'yu yeni haline update edelim

            eachEntry.setValue(entryValueArr[0]+"-"+
                               entryValueArr[1]+"-"+
                               entryValueArr[2]+"-"+
                               entryValueArr[3]+"-"+
                               entryValueArr[4]);
        }
        return ogrenciMap;
    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySet = ogrenciMap.entrySet();

        System.out.println("No    öğrenci bilgileri");
        System.out.println("=======================");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static Map<Integer, String> siniflariArttir(Map<Integer, String> ogrenciMap) {

        // map'te istediğimiz değişikliği yaptıktan sonra
        // map'i update etmenin en kolay yolu setEntry() metodudur.

        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) { // 101=Ali-Can-11-H-MF

            String entryValue=eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr = entryValue.split("-");

            int sinifInt=Integer.parseInt(entryValueArr[2]);

            if (sinifInt==12){
                entryValueArr[2]="Mezun";
            }else {
                entryValueArr[2]=sinifInt+1+"";
            }

            // sınıf bilgisini güncelledik
            // bu güncellemeyi map'e işlememiz lazım

            eachEntry.setValue(entryValueArr[0]+"-"+
                    entryValueArr[1]+"-"+
                    entryValueArr[2]+"-"+
                    entryValueArr[3]+"-"+
                    entryValueArr[4]);
        }
        return ogrenciMap;
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tüm öğrenci listesini
        // sınıf şube isim soyisim no şeklinde
        // doğal sıralı olarak
        // yazdıran bir metod oluşturun.

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti=new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue= eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr=entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // Entry'den istenen bilgileri alıp yeni bir String oluşturacagız
            // Stringleri sıralı olarak yazdıracağız

            String istenenFormattakiBilgi=entryValueArr[2]+" "+
                                          entryValueArr[3]+" "+
                                          entryValueArr[0]+" "+
                                          entryValueArr[1]+" "+
                                          eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);


        }
        System.out.println("sınıf şube isim soyisim no");
        System.out.println("==========================");
        for (String s : siraliOgrenciSeti) {
            System.out.println(s);
        }


    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        // Tüm öğrenci listesini
        // isim soyisim no sınıf şube bolum
        // şekinde sıralı olarak yazdıran bir metot oluşturun

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet = new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String value=eachEntry.getValue();

            String[] valueArr=value.split("-");

            String istenenFormattakiBilgi=valueArr[0]+ " " +
                    valueArr[1]+ " " +
                    eachEntry.getKey()+ " " +
                    valueArr[2]+ " " +
                    valueArr[3]+ " " +
                    valueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);
        }
        // Sıralı seti yazdıralım

        System.out.println("isim  soyisim no sınıf şube bolum");
        System.out.println("=================================");

        for (String each : isimSoyisimSiraliSet) {
            // System.out.println(each);

            String[] duzenliYazdirArr=each.split(" ");

            String isim=duzenliYazdirArr[0];
            String soyisim=duzenliYazdirArr[1];
            String no=duzenliYazdirArr[2];
            String sinif=duzenliYazdirArr[3];
            String sube=duzenliYazdirArr[4];
            String bolum=duzenliYazdirArr[5];


            System.out.printf("%-7s %-7s %-3s  %2s   %s   %s%n", isim,soyisim,no,sinif,sube,bolum);
            // %'nin yanındaki numarayı en uzun olana göre belirliyoruz.
            // (isimde en uzun Berivan ona göre belirledik.)
            // sınırlandırmak isteseydik nokta koyardık
            // (%6.6s bu 6'ya göre sınırlandırırdı)

        }


    }
}

