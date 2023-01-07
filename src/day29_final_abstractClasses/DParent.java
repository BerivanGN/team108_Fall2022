package day29_final_abstractClasses;

public abstract class DParent {

    /* child class'ların tamamında metod1 ve metod2'nin mutlaka olmasını istiyoruz.

    Java paren class'taki istenen metodları child class'ların override etmek
    ZORUNDA KALMASI için abstract class'ını oluşturmuştur.

    Bir class'ı abstract yapmak istersek class deklerasyonuna abstract yazmak yeterlidir.

    Bir abstract class içinde child class'ların override etmesi
    MECBURİ olan metodlar olabileceği gibi MECBURİ OLMAYAN metodlar da olabilir.

    Child class'ların mutlaka override edileceği metodları da abstract yaparız.

    abstract yapılan tüm metodlar child class'ların tamamında override edileceğinden
    parent class'daki abstract metodların body'e ihtiyacı olmaz.
    Java da abstract metodların body'si olmasına izin vermez.

    Abstract class'larda abstract metodlar bulunduğu için
    Abstract class'lardan obje ÜRETİLEMEZ.

     */

    public abstract void method1();


    public abstract void method2();


    public void method3(){
        System.out.println("Parent class'taki metod3 çalıştı");

    }
}
