package day29_final_abstractClasses;

public class FChild extends DParent{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }


    /*
     Bugüne kadar oluşturduğumuz standart class'ları abstraction ile tanımlamak istediğimizde
     abstract olmayan class demek yerine consrement class denir.

     Eğer concrete bir class abstract bir class'ı parent edinirse
     java class deklerasyonunun altını kırmızı çizip
     parent abstract class'lardaki abstract metodları
     kendisine IMPLEMENT(uyarlama) yapmasını ister.
     */
}
