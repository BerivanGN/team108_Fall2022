package day35_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        // Verilen bir linkedList'te istenen 2 index'teki
        // elementlerin yerlerini değiştirin.

        LinkedList<String> isimler = new LinkedList<>();

        isimler.add("Said");
        isimler.add("Hüseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Humeyra");

        System.out.println(isimler); // [Said, Hüseyin, Hasan, Sevilay, Humeyra]

        // Hasan ile humeyra'nın yerlerini değiştirelim.
        // Büyük bir listede index bilmeden yapalım.

        String ilkIsim="Hasan";
        String ikinciIsim="Humeyra";

        String temp="";

        temp=ilkIsim;

        int ilkIsimIndex=isimler.indexOf(ilkIsim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkIsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler); // [Said, Hüseyin, Humeyra, Sevilay, Hasan]

    }
}
