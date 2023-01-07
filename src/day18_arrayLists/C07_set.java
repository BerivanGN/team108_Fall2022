package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {

        // Java'da birçok yapıda get ve set method'ları bulunur
        // get method'ları bilgiyi bize getirirken
        // set method'ları bilgiyi update(güncellemek/değiştirmek) eder.

        List<String > harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler); // [A, Z, T]

        // 2. index'e F elemanını ekleyin
        // add method'u var olan listeden herhangi bir elementi değiştirmeden
        // istediğimiz elementi ekler kalanları kaydırır.

        harfler.add(2,"F");
        System.out.println(harfler); // [A, Z, F, T]


        harfler.set(2,"M"); // F'yi M yapar.
        System.out.println(harfler); // [A, Z, M, T]

        // set method'u var olan elemntin değerini silip yenisini yazar
        // yani var olan elementi günceller eleman sayısını arttırmaz.

    }

}
