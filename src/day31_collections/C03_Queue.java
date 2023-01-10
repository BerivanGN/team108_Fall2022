package day31_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> harfler = new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);// [H, K, B, K]

        // 1.index'e F ekleyelim
        // Queue özelliğinden dolayı ekleme sona olmalı araya ekleme olmaz.

        System.out.println(harfler.remove()); // H (silinen harfi getirir.)
        System.out.println(harfler);// [K, B, K]
        System.out.println(harfler.remove("K")); // True (silindi)
        System.out.println(harfler);// [B, K]

        System.out.println(harfler.element()); // B (baştaki elementi verir silmez)
                                               // ama Que boşsa exception verir.

        System.out.println(harfler);// [B, K]

        System.out.println(harfler.peek()); // B (baştaki elementi verir silmez)
                                            // ama Que boşsa null verir.

        Queue<String> karakterler = new LinkedList<>();
        // System.out.println(karakterler.element()); // exception NoSuchElementException
        System.out.println(karakterler.peek()); // null

        System.out.println(harfler.poll()); // B (hem baştakini yazdırır hem sildirir)
        System.out.println(harfler);// [K]

       // System.out.println(karakterler.remove());// exception NoSuchElementException
        System.out.println(karakterler.poll()); // null

        harfler.offer("C");
        System.out.println(harfler);// [K, C]
        // add ile offer arasındaki fark offer varsa kapasiteyi kontrol eder.
        // kapasite uygunsa ekler
        // add ise kapasiteye bakmaksızın direkt ekler.

    }
}
