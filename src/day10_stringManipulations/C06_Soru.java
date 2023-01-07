package day10_stringManipulations;

public class C06_Soru {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        String sifre="abc1453";

        /*
        Bu soruda şartları bağımsı if cümlesi ile yapmak
        veya if-else cümlesi ile yapmak mümkündür.

        -Eğer if-else ile yaparsak ilk hatada hatayı yazdırır
         geriye kalanlara bakmaz ( her şart için terkrar bakar)
         avantajı ise eğer hata yoksa otomatik olarak başarılı şekilde oluştuğunu diyebilir.

         -Bağımsız if cümlelerinde tüm hataları bir kerede söyleyebiliriz
          ancak bağımsız if cümleleri kodun geriye kalanı ile ilgilenmediğinden
          başarılı şifre oluşturulduğunu bizim ayrı mekanizma ile kontrol etmemiz gerekir
         */

        /*
           Sonuçta başarılı şifre oluşturuldu demek için bir kontrol mekanizması oluşturmamız gerekir
           ya her adımda arttıracağımız bir sayaç yapıp en son 4 oldu ise başarılı deriz
           ya da başta verdiğimiz değer olumsuz bir durum olduğunda arttırılır,
           en sonda kontrol edip eğer baştaki değeri hala koruyorsa başarılı olmuştur diyebiliriz
         */


       int flag=0;

        //  - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            //ilk harf küçük değilse hatayı yazdır
            //sifre.charAt(0)<'a' || sifre.charAt(0)>'z' bu sekilde de olurdu
            System.out.println("ilk harf küçük harf olmalı");
            flag++; // bir ceza puanı aldı
        }
        //  - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            //son karakter rakam değilse rapor yazdır
            System.out.println("son karakter rakam olmalı");
            flag++;
        }
        //  - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            flag++;
        }
        //  - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalı");
            flag++;
        }
        if(flag==0){
            System.out.println("Şifreniz başarıyla kaydedildi");
        }

    }
}
