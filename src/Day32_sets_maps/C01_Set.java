package Day32_sets_maps;

import com.sun.javadoc.SeeTag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        Set<Object> karisikSet= new HashSet<>();

        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int[] arr= new int[3];

        karisikSet.add(arr);

        List<Object> karisikList= new ArrayList<>();

        karisikList.add("Hava");
        karisikList.add(44);

        karisikSet.add(karisikList);

        System.out.println(karisikList); // [Hava, 44]

        System.out.println(karisikSet); // [Java, S, false, 12, [I@58ceff1, [Hava, 44]]


    }
}
