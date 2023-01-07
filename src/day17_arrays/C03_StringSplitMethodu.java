package day17_arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "Java her geçen gün güzelleşiyor";

        // str'da kaç kelime var ?
        // split methodu istediğimiz Stringi istediğimiz ayraç kullanarak
        // parçalara ayırmamıza imkan verir.

        String [] spaceSplit=str.split(" ");

        System.out.println(Arrays.toString(spaceSplit)); //[Java, her, geçen, gün, güzelleşiyor]
        System.out.println("Verilen cümledeki kelime sayısı : " + spaceSplit.length); // 5

        System.out.println(Arrays.toString(str.split("e"))); //[Java h, r g, ç, n gün güz, ll, şiyor]

        System.out.println(Arrays.toString(str.split("gün"))); //[Java her geçen ,  güzelleşiyor]

        System.out.println(Arrays.toString(str.split("")));
        //[J, a, v, a,  , h, e, r,  , g, e, ç, e, n,  , g, ü, n,  , g, ü, z, e, l, l, e, ş, i, y, o, r]



    }
}
