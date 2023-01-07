package day08_stringManipulation;

public class C07_subString {
    public static void main(String[] args) {

        String str= "java ogren, isi kap";

        System.out.println(str.length());// karakter sayısı : 19

        // Metnin tam ortasındaki karakter nedir?

        System.out.println(str.charAt(str.length()/2)); // n

        //son karakteri yazdırın

        System.out.println(str.charAt(str.length()-1)); //p

        //Bir karakteri değil de virilen string'in içerdiği bir metin parçasını elde etmek istersek;
        // ornegin "ogren" kelimesini yazdıralım

        System.out.println(str.substring(5, 9)); // ogre yazdırır
        // substring(baslangıç,bitiş) metodunda
        // başlangıç olarak yazılan index dahil
        // bitiş olarak yazılan index hariç(exclusive)'dir !!!!!!!!!!!!!!!!!!
        System.out.println(str.substring(5, 10)); // ogren yazdırır

        // str'den "java" kelimesini yazdıralım.

        System.out.println(str.substring(0,4)); // java

        // str'den "kap" yazdıralım

        System.out.println(str.substring(16,19)); // kap
        System.out.println(str.substring(16)); // kap
        System.out.println(str.substring(str.length()-3)); // kap

        // substring kullanarak sadece j harfini yazdırın.
        System.out.println(str.substring(0)); // java ogren, isi kap
        System.out.println(str.substring(0,1)); // j

        // substring kullanarak 9. index'teki harfi büyük olarak yazdırın.
        System.out.println(str.substring(9,10).toUpperCase()); // N
        System.out.println(str.charAt(9)); // n
        System.out.println(str.toUpperCase().charAt(9)); // N
        // charAt() kullanmak yerine substring kullanmak daha avantajlı olabilir
        //çünkü substring kullanınca ifade hala string oldugundan
        //metod kullanmaya devam edebiriz.

        System.out.println(str.substring(5,5)); // bir şey yazdırmaz. (hiçlik yazdırır yani konsolda boş bir satır oluşur)
        System.out.println("===========");

        // System.out.println(str.substring(4,3)); // hata verir 4'ten basşlayıp 3 ile bitiremez (StringIndexOutOfBoundsException)

        // System.out.println(str.substring(25,28)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()));// bir şey yazdırmaz.( boş satır verir yine)
        //System.out.println(str.charAt(str.length())); // charAt() de hata verir
        //System.out.println(str.substring(str.length()+1)); // +1 fazlada substring de hata verir
        System.out.println("===========");
    }
}
