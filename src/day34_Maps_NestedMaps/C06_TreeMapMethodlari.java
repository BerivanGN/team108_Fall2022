package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {
    public static void main(String[] args) {

        TreeMap<String,Integer> harfSayilariMap = new TreeMap<>();
        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap); // {A=10, C=15, D=3, K=5}

        System.out.println(harfSayilariMap.subMap("C", "F")); // {C=15, D=3}
        System.out.println(harfSayilariMap.subMap("C", "K")); // {C=15, D=3}
        // (ilki(C) dahil son istenen(K) hariç)
        System.out.println(harfSayilariMap.subMap("B", "K")); // {C=15, D=3}

        System.out.println(harfSayilariMap.descendingMap()); // {K=5, D=3, C=15, A=10}

        System.out.println(harfSayilariMap.lowerKey("E")); // D (E'den daha az olan D var)
        System.out.println(harfSayilariMap.lowerKey("D")); // C
        // lowerkey>>>(verilenden küçük olan en büyük değeri verir)

        System.out.println(harfSayilariMap.floorKey("E")); // D
        // floorkey>>>(verilene eşit veya küçük olan en büyük değeri verir)

        System.out.println(harfSayilariMap.floorKey("D")); // D

        System.out.println(harfSayilariMap.higherKey("D")); // K
        // higherKey>>>(verilenden büyük olan en küçük değeri verir)

        System.out.println(harfSayilariMap.ceilingKey("D"));// D
        // ceilingKey>>>(verilene eşit veya büyük olan en küçük değeri verir)

        System.out.println(harfSayilariMap); // {A=10, C=15, D=3, K=5}

        System.out.println(harfSayilariMap.headMap("D")); // {A=10, C=15}
        // girilen key'den başa doğru olanları verir

        System.out.println(harfSayilariMap.headMap("D", true)); // {A=10, C=15, D=3}
        // D'yi de dahil etmek için boolean bir ifade (true) yanına girmek lazım

        System.out.println(harfSayilariMap.tailMap("C")); // {C=15, D=3, K=5}
        // C'den başla kuyruga kadar git

        System.out.println(harfSayilariMap.tailMap("C", false)); // {D=3, K=5}
        // C'yi dahil etmemek için boolean bir ifade (false) yanına girmek lazım

        System.out.println(harfSayilariMap.pollFirstEntry()); // A=10
        // ilk harfi getirir ama siler de. Map'i bir daha yazdırdığımızda o harf olmaz
        System.out.println(harfSayilariMap); // {C=15, D=3, K=5}

        System.out.println(harfSayilariMap.pollLastEntry()); // K=5
        // son harfi getirir ama siler de. Map'i bir daha yazdırdığımızda o harf olmaz
        System.out.println(harfSayilariMap); // {C=15, D=3}



    }


}
