package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
          Java pass by value kullanır
          Yani method'lar arasında gönderilen veriable'lerin
          kendileri değil value'leri diğer method'a yollanır.
         */

        int fiyat=100;
        // fiyat üzerinden %10 indirim yapıp indirimli fiyatı döndüren bir metod oluşturun.

        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90

        System.out.println(fiyat); // 100

        // Eğer indirimli fiyatın kalıcı olarak fiyatımızı değiştirmesini istersek
        // atama yaparız
        // fiyat=indirimYap10(fiyat); >>> şeklinde atama yaparız

    }

    public static int indirimYap10(int fiyat){

        fiyat=fiyat*90/100;

        return fiyat;
    }

}
