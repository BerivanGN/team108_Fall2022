package day10_stringManipulations;

public class C05_Soru {
    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir cumle alin
        //  - cumlede ev geciyorsa, “home home sweet home” yazdirin
        //  - cumlede is geciyorsa, “calismak guzeldir”
        //  - ikisini de iceriyorsa “Hem ev lazim hem is”
        //  - hicbirini icermiyorsa “cok calisman lazim” yazdirin

        String str="Evden çalışıyorum, işe gitmeye gerek yok";

        String calisilacakStr=str.toLowerCase();

        if (calisilacakStr.contains("ev") && calisilacakStr.contains("iş")){
            System.out.println("Hem ev lazim hem iş");
        } else if (calisilacakStr.contains("iş")) {
            System.out.println("calismak guzeldir");
        } else if (calisilacakStr.contains("ev") ) {
            System.out.println("home home sweet home");
        }else {
            System.out.println("cok calisman lazim");
        }


    }
}
