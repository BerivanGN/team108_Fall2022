package day31_collections;

import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {

        // Set index yapısını desteklemez

        Set<String> ogrenciler = new TreeSet<>();

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler); // [Ayten, Esra, Furkan]

        ogrenciler.add("Ahmet");
        ogrenciler.add("Berivan");

        System.out.println(ogrenciler); // [Ahmet, Ayten, Berivan, Esra, Furkan]

        ogrenciler.add("Furkan");
        // eski furkan'ı silip yenisini yazar
        System.out.println(ogrenciler); // [Ahmet, Ayten, Berivan, Esra, Furkan]


    }
}
