package day20_constructor;

import day19_arrayList_forEachLoop.Toyota;

public class C01_Constructor {
    public static void main(String[] args) {

        Car car1=new Car();
        Toyota toyota=new Toyota();

        System.out.println(car1);
        // Car{marka='Marka belirtilmemiş', model='Model belirtilmemiş', yil=1900, km=0, renk='Renk seçilmedi'}

        System.out.println(toyota); // day19_arrayList_forEachLoop.Toyota@327471b5
        // Toyota bir obje olduğundan özelliklerini direkt YAZDIRAMAYIZ,referansı yazdırır

        // bir class'tan oluşturulan objelerin belirli özelliklerini kolayca yazdırabilmek için
        // o class'ta istenen özellikleri kapsayan bir to.string() metodu oluşturulabilir

        /*
          to.string() metod'undaki yazılanları istediğimiz şekil ve formata uygulayabiliriz.
         */

        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="Siyah";

        System.out.println(car1);
        /*
              Car{marka='Audi'
            , model='A4'
            , yil=2020
            , km=20000
            , renk='Siyah'}
         */



    }
}
