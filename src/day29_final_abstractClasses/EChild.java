package day29_final_abstractClasses;

public class EChild extends DParent {
    @Override
    public void method1() {
        System.out.println("Parent class'daki mecburi override edilecek metod1'i override ettik");
    }

    @Override
    public void method2() {
        System.out.println("Parent class'daki mecburi override edilecek metod2'i override ettik");
    }

    /*
    Klasik inheritance ile parent/child ilişkisi oluşturduğumuzda
    parent class'taki tüm özellikleri otomatik olarak kazanırız.
    Ancak metodları override etme mecburiyeti yoktur.
    İster override edip kendimize özelleştiririz
    istersek de parent class'daki haliyle kullanırız
     */

    public static void main(String[] args) {
        //DParent obj1 = new DParent();
        // DParent' is abstract; cannot be instantiated
        // Abstract class'ların constructor'ları vardır ama obje ÜRETEMEZ.

        EChild chld1=new EChild();
        chld1.method1(); // Parent class'daki mecburi override edilecek metod1'i override ettik
        chld1.method2(); // Parent class'daki mecburi override edilecek metod2'i override ettik
        chld1.method3(); // Parent class'taki metod3 çalıştı

        DParent chld2=new EChild();
        chld2.method1(); // Parent class'daki mecburi override edilecek metod1'i override ettik
        chld2.method2(); // Parent class'daki mecburi override edilecek metod2'i override ettik
        chld2.method3(); // Parent class'taki metod3 çalıştı


    }
}
