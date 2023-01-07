package day08_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1= "Java";

        String str2= "Java";

        String str3= new String("Java");

        String str4= "Ja";

        String str5= str4.concat("va");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str5);

        /*
        == string için beklediğimiz sonuçları vermeyebilir
           çünkü hem metnin değerini hem de objenin referansını karşılaştırır.
           bunu ileride anlatacağız...
           Java'da string objelerin metinlerinin aynı olup olmadığını kontrol etmek için
           == yerine "equals" metodu kullanılmalıdır.
         */

        System.out.println("===============");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str5)); // true
    }
}
