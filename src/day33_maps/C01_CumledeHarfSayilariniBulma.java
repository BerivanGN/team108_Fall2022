package day33_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayilariniBulma {
    public static void main(String[] args) {

        // verilen bir cümlede kullanılan her bir harfi
        // ve kaçar kez kullanıldığını yazdırın

        // örnek : Java candır
        // output : J=1, a=3, v=1, c=1, n=1, d=1, ı=1, r=1

        String cumle= "Java candır";

        // öncelikle boşluğu ve noktalama işaretlerini yok edelim

        cumle=cumle.replaceAll("\\W",""); // Javacandır

        String[] cumleArr=cumle.split("");// [J, a, v, a, c, a, n, d, ı, r]

        Map<String,Integer> kullanimSayilariMap= new TreeMap<>();


        for (int i = 0; i < cumleArr.length; i++) {

            // her bir elementi ele alıp
            // Map'te key olarak yoksa value=1 olarak ekleriz.
            // Map'te key olarak varsa value 1 arttırılmalı

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){

                kullanimSayilariMap.put(cumleArr[i],1);
            }else {
                int eskiValue=kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }

        }
        System.out.println(kullanimSayilariMap); //{J=1, a=3, c=1, d=1, n=1, r=1, v=1}




    }
}
