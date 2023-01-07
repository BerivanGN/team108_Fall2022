package day27_overriding;

public class FChild extends EParent{

    @Override
    protected void method1() {
        super.method1();
        // Eğer overriding metod ile birlikte overriden metod'da çalışsın istersek
        // overriding method içinden super.method1(); yazabiliriz.
    }

    @Override
    protected void method2() {
        super.method2();
    }

    public void method3(){
        System.out.println("Child method 3");
        // Parent class'ta aynı isimde method olmasına rağmen
        // override olarak görülmedi
        // sebep : parent'taki method3 Private access modifier'a sahip olduğundan
        // onu ayrı bir method olarak görür override olarak görmez.
    }
}
