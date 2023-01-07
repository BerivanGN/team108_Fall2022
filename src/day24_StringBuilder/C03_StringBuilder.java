package day24_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");

        StringBuilder sb2= new StringBuilder("Java");
        String str= "Java";

        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false
        // StringBuilder metin eşitliği sorgulamak için equals kullanmaz
        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3= new StringBuilder("Hava");
        System.out.println(sb1.compareTo(sb3)); // 2

        sb3= new StringBuilder("Tava");
        System.out.println(sb1.compareTo(sb3)); // -10 ( sb1'e göre ne kadar ileride veya geride old.bakar)

        sb3=new StringBuilder("Jaka");
        System.out.println(sb1.compareTo(sb3)); // 11 ( v ile k arasında 11 harf fark var)

        sb3=new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3)); // -1

        sb3=new StringBuilder("Java Candır");
        System.out.println(sb1.compareTo(sb3)); // -7 (fazla olan karakter sayısını verir)

        // System.out.println(sb1==str); // Data türleri farklı karşılaştırma yapmaz. CTE verir.

        System.out.println(sb1.equals(str)); // false
        // System.out.println(sb1.compareTo(str)); compareTo StringBuilder ister içine farklı data türü kabul etmez.



    }
}
