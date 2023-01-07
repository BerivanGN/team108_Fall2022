package day03_dataCastıng_Matematikselislemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candır";

        /* int primitive oldugundan hazır metotları yoktur
        string ise non-primitive oldugu icin hazır metotlara sahiptir.

        int,char,boolean gibi primite veriable türlerinde hazır metot kullanmak için
        Java İnteger, Character, Boolean gibi wrapper class'lar olusturmustur.

        bunlar primitive lerle aynı degeri alabilir
        ama extradan metotları vardır.

         */

        Integer sayi2=20;
        /*
           islemlerimizi yaparken string olarak tanimlanmıs
           ancak matematiksel icerik barındıran veriableler ile karsılasabiliriz
           bu durumda veriableleri sayıya cevırme ıhtıyacımız olabılır.

           eger sayıya cevırmek istedigimiz metinlerde harf veya sayı olmayan
           baska karakter varsa Java hata verir.
         */

        String str2="123";
        String str3="354";
        System.out.println(str2+str3);

        int str2int=Integer.parseInt(str2);
        int str3int=Integer.parseInt(str3);

        System.out.println(str2int+str3int);  // 477

        System.out.println(Integer.MAX_VALUE);
        System.out.println((Integer.MIN_VALUE));
        System.out.println(Short.MAX_VALUE); // 32767

        char krk1='$';

        System.out.println(Character.isDigit(krk1)); //false
        System.out.println(Character.isLetter(krk1)); //false
        System.out.println(Character.isAlphabetic(krk1)); //false

        short sayi3=4;
        int sayi5=sayi3;

        //Wrapper class'larda casting olmaz

        short sayi6=45;
                //Integer sayi7=(Integer)sayi6...olmaz





    }
}
