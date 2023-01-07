package day24_StringBuilder;

public class D {

    private String isim="Mustafa";
    String isimDefault="Furkan";
    static String isimDefaultStatic="Sevilay";

    public static void main(String[] args) {

       // System.out.println(isim); static olmadığından static main metod içinde direkt kullanılmaz.

        D obj1=new D();
        System.out.println(obj1.isim); // mustafa

        staticMethod(); // Deniz
        System.out.println(obj1.isim); // Mustafa
    }

    private void staticOlmayanMethod(){

        isim="Hüseyin";
        System.out.println(isim);
    }
    void defaultStaticOlmayanMethod(){
        System.out.println("Default access modifier'li static olmayan method çalıştı");
    }

    static void defaultStaticMethod(){
        System.out.println("Default access modifier'li static olan method çalıştı");
    }

    private static void staticMethod(){

        D obj1= new D();
        obj1.isim="Deniz";
        System.out.println(obj1.isim);
    }
}
