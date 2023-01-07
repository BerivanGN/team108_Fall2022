package day08_stringManipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her gecen gün daha da guzellesiyor, degil mi?";

        // sondan 3. karakteri yazdırın
        System.out.println(str.charAt(str.length()-3)); // m
        System.out.println(str.length()); // 50 karakterli bir string

        //rastgele bir karakterini yazdırmak için

        Random rnd= new Random(); //rnd degeri için 0 ile 1 arasında rastgele bir deger olusturur
        int index= rnd.nextInt(str.length()); // str.lengt()ten küçük rastgele bir int üretir
        System.out.println(str.charAt(index)); // herhangi bir sey gelebilir :)) a, j g,?, d ü...vb.
    }
}
