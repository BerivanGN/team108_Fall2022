package day19_arrayList_forEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C06_forEachLoopSoru {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        String cumle="Java ogrenmek cok guzel";
        String harf= "e";

        String[] cumleArr=cumle.split("");
        // [J, a, v, a,  , o, g, r, e, n, m, e, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;

        for (String eachHarf:cumleArr
             ) {
            if (eachHarf.equals(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Harf cümlede kullanılmamıştır");
        }else {
            System.out.println(harf+ ", cümlede " + sayac + " defa kullanılmış");
        }

    }
}
