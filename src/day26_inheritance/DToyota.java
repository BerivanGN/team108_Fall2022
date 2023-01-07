package day26_inheritance;

public class DToyota {
    /*
       Bir objenin data türü, constructor olarak kullanılan class
       veya o class'ın parent class'ları olabilir.

       Data türü olarak parent class seçilmesindeki amaç
       child class'tan oluşturulan objenin parent class'ın tüm child clas'larının
       taşıdığı ortak özellikleri vurgulamktır.
       (Personel toplantısına katılan Doktor Kemak gibi...O artık tüm personel adına konuşur.)

       Data türü ile constructor farklı olduğunda
       veriableler ile metod'lar farklı davranırlar.

       Veriable'lerin alacağı değeri bulmak için
       aramaya data türü olan class'tan başlarız
       o class'ta yoksa parent'larına bakarız
       ve ilk bulduğumuz değeri atama yaparız.

       Data türü olan class veya parent'larında bulunamazsa CTE olut.

     */

    String marka="Toyota";
    String model="Model belirtilmedi";
    String motor="Motor belirtilmedi";
    String yakit="Yakıt belirtilmedi";
}
