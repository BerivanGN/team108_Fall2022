package day30_interfaces_iterator;

import day29_final_abstractClasses.FChild;

public class M01_ChildOfInterface implements I01_interface,I02_interface {

    // Bir class başka bir class'ı extends keyword ile parent edinebilir
    // Ancak birden fazla class'ı parent edinemez.
    // Interface'ler için böyle bir sınırlama yoktur
    // Bir class istediği kadar interface'i implement edebilir.

    public static void main(String[] args) {

        System.out.println(I01_interface.SAYI2);
        // I01_interface.sayi=25;
        // Cannot assign a value to final variable 'sayi'

        // Interface'de oluşturulan static veya default olarak işaretlenen method'ların farkı
        // static olana interfaceIsmi.staticMethodIsmi şeklinde ulaşılabilirken
        // default olana child class'tan oluşturulan obje üzerinden erişilebilir.
        I01_interface.method34();

        M01_ChildOfInterface obj=new M01_ChildOfInterface();
        obj.method44();
    }

    // Eğer birden fazla Interface implement edildiğinde
    // aynı isimde metodlar faklı interface'lerde varsa
    // return type'a bakalır.
    // return type aynı ise sorun olmaz çünkü ikisini de implement edebiliriz.
    // Ancak return type'ları farklı ise birini tercih ettiğimizde diğeri CTE verir.
    // Bu durumda parent interface'lere müdahale etmek mümkünse müdahale edilebilir
    // veya bu interface'lerden birini implement etmekten vazgeçebiliriz.
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
