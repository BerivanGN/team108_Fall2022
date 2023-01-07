package day12_MethodCreation;

import day11_forLoops.C12_MethodCreation;

public class C01_Method {
    public static void main(String[] args) {

        // metod'lar bazen çok basit işlemleri bazen de komplex işlemleri yapabilir.
        // biz o işlemleri nasıl yapabiliriz diye düşünmek yerine hazır metodu kullanmayı tercih ederiz
        // bizden sonra kodu inceleyecek kişiler de hazır metod isimlerinden ne yapmak istediğimizi kolayca anlayabilirler
        // ayrıca kodu her yazdığımızda yapabileceğimiz muhtemel hatalardan kurtulmuş oluruz.

        String str="Java'da yolu yarıladık";

        str.isEmpty(); // boolean sonuç döndü ama kullanmadık

        //metodun döndürdüğü sonucu kullanmak isterseniz
        // ya yazdırırsınız
        System.out.println(str.isBlank()); // false

        // ya da dönen sonucu ileride kullanacaksak ileride atama yaparsınız.

        String buyukHarfliHali=str.toUpperCase();

        C12_MethodCreation.faktoryelyazdir(7);




    }

}
