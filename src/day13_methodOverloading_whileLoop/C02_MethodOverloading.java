package day13_methodOverloading_whileLoop;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        String str = "Java cok güzel";

        System.out.println(str.substring(5));
        System.out.println(str.substring(3, 5));

        // eğer seçtiğimiz isimde birden fazla method varsa buna overlooading denir
        // ve aynı isimdeki metodlardan hangisinin çalışacağına argüment/parametre uyumu karar verir.

        toplama(5,6); // 11
        toplama(5,3,1); // 9

        /*
           java aynı class içerisinde aynı isim
           ve aynı data türünden parametre sayısı ile iki metod oluşturmanıza izin vermez

           1-) ismini değiştirebiliriz ancak bu durumda overloading olmaz
               overloading aynı isimde ama farklı işleve sahip metodlar oluşturmak demektir
           2-) parametre ismini değiştirebiliriz
           3-) aynı sayıda parametre yazıpparametrelerin data türünü değiştirebiliriz
               veya farklı data türündeki parametrelerin yerini değiştirebiliriz
         */

        toplama(6,6); // 2 tam sayının toplamı 12
        toplama(4.5,5); // double ve int toplamı :9.5
        toplama(4.5,6.7); // 2 double sayı toplamı :11.2
    }

    public static void toplama(int sayi1, int sayi2){
        System.out.println("2 tam sayının toplamı :" + (sayi1+sayi2));
    }

    // public static void toplama(int a, int b); aynı isim ve parametrede kabul etmez...
    public static void toplama(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 tam sayının toplamı :" + (sayi1+sayi2+sayi3));
    }

    public static void toplama(double sayi1, int sayi2){
        System.out.println("double ve int toplamı :" + (sayi1+sayi2));
    }

    public static void toplama(int sayi2,double sayi1){
        System.out.println("int ve double toplamı :" + (sayi1+sayi2));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayı toplamı :" + (sayi1+sayi2));
    }
}
