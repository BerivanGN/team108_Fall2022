package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String > harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z")); // true
        // Z'yi bulup siler ve görevi tamamladığı için true döner
        System.out.println(harfler); // [A, T]

        System.out.println(harfler.remove(0)); // A
        // 0. index'teki elementi siler ve görevi tamamlayıp silinen elementi bize döndürür
        System.out.println(harfler); //[T]

        List<String> yeniList=new ArrayList<>();
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler)); // true
        // harfler listesindeki tüm elementleri yeniList'ten siler
        // görevi tamamlarsa true, yoksa false döner

        System.out.println(yeniList); // [C, D]
        System.out.println(harfler);// [T]

    }
}
