package day09_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {
        String str= "Javayi iyi ogrenmek icin cok calısmam lazim cok.";

        // ilk a'nın index'ini yazdıralım
        System.out.println(str.indexOf("a"));// 1

        //son a'nın index'ini yazdıralım
        System.out.println(str.lastIndexOf("a")); //39 (a'nın en son bulunduğu indexi yazar)

        System.out.println(str.lastIndexOf("a", 15));//3 (15. indexi son kabul edip ondan önceki son a'yı buldurur)

        // verilen str'da cok kelimesinin kullanımını kontrol edip
        //- cok kelimesi kullanılmamış
        //- bir kere kullanılmış
        //- birden fazla kullanılmış
        // sonuçlarından uygun olanı yazdırın
        // Javayi iyi ogrenmek icin cok calısmam lazim cok.

        int ilkCokIndexi= str.indexOf("cok");
        int sonCokIndexi= str.lastIndexOf("cok");


        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanılmamış");
        } else if (ilkCokIndexi==sonCokIndexi) {
            System.out.println("cok kelimesi bir kere kullanılmış");

        }else {
            System.out.println("cok kelimesi birden fazla kullanılmış");
        }


    }
}
