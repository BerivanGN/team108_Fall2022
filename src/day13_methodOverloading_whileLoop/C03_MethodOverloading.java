package day13_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3); // 2 double sayı toplamı :11.7
        toplama('a','b'); // int ve double toplamı :195.0

        // ilk olarak %100 uyumlu parametreler arar
        // eğer %100 uyumlu yoksa çalışabilecek metod var mı diye kontrol eder
        // Çalışacak metod 1'den fazla olursa minimum casting yaparak kullanabileceğini tercih eder.

        toplama(8.4,6); //2 double sayı toplamı :14.4
    }

    public static void toplama(int sayi2,double sayi1){
        System.out.println("int ve double toplamı :" + (sayi1+sayi2));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayı toplamı :" + (sayi1+sayi2));
    }
}
