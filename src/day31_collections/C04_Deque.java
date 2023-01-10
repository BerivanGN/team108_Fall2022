package day31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {

        // Deque double ended queue demektir
        // iki yönlü kuyruk
        // Bu iki yönlü yapısından dolayı pek çok metot'un firs() ve last() versiyonu vardır.


        Deque<String> harfler = new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler);// [J, L]

        harfler.addFirst("B");
        System.out.println(harfler);// [B, J, L]

        System.out.println(harfler.removeFirst());// B
        System.out.println(harfler); // [J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler); ;// [A, J, L, A, K]

        // sona doğru olan A'yı silin
        System.out.println(harfler.removeLastOccurrence("A")); // True
        System.out.println(harfler); // [A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T")); // False (o harf yok)

        LinkedList<String> karakterler = new LinkedList<>();
        karakterler.push("A");// addFirst() ile aynı işlemi yapar.
        karakterler.push("B");
        karakterler.push("C");
        System.out.println(karakterler);// [C, B, A]

        System.out.println(karakterler.clone());// [C, B, A]

        LinkedList<String> kopyaKarakterler= (LinkedList<String>) karakterler.clone();
        System.out.println(kopyaKarakterler);// [C, B, A]


    }
}
