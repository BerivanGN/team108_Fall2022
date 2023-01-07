package day24_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java");
        System.out.println(sb.capacity()); // 20 (boş 16 idi 4 ekledi)
        System.out.println(sb.length()); // 4 içindeki karakterlerin sayısını yazar

        sb.trimToSize();
        // Atama yapmadığımız halde bu değişiklik kalıcı olur mu?
        // StringBuilder mutable olduğundan metod'larla yapılan değişiklikler kalıcı olur.

        System.out.println(sb.capacity()); // 4

        sb.toString().toUpperCase();
        System.out.println(sb); // Java
        // StringBuilder'i String'e çevirirseniz veya String döndürecek metodlar kullanırsanız
        // String'in immutable özelliği devreye girer ve yapılan değişiklikler kalıcı olmaz.

        // sb=sb.toString().toUpperCase();// Bir taraf StringBuilder diğeri String
        // nonPrimitive data türlerinde farklı data türünden atama yapamazsınız

        // Short sayı1=20;
        // Integer sayı2=sayı1; >>>> kabul etmez 2 data türü farklı..

        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2); // JAVA

        sb=sb2;
        System.out.println(sb); // JAVA

        sb.setCharAt(0,'H');
        System.out.println(sb); // HAVA

        System.out.println(sb.substring(2,3)); // V
        System.out.println(sb); // HAVA

        System.out.println(sb.reverse()); // AVAH (Terse çevirir) (kalıcıdır)
        System.out.println(sb); // AVAH

        sb.insert(1,"H ");
        System.out.println(sb); // AH VAH

        String uzunMetin=" ETMEK YOK ÇALIŞMAK VAR";

        sb.insert(6,uzunMetin,0,10);
        System.out.println(sb); // AH VAH ETMEK YOK

        System.out.println(sb.indexOf("A", 3)); // 4
        System.out.println(sb.indexOf("VAH")); // 3

        System.out.println(sb.lastIndexOf("VAH")); // 3
        System.out.println(sb.lastIndexOf("E", 9)); // 7

        System.out.println(sb.replace(0, 12, "Sorun")); // Sorun YOK

        System.out.println(sb.delete(5, sb.length())); // Başlangıç index'i dahil Bitiş dahil değil
        // Sorun


    }
}
