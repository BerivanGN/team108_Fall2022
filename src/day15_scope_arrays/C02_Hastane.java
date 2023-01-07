package day15_scope_arrays;

public class C02_Hastane {
    static String hastaneismi="Yıldız Hastanesi";  // staticler genel olanlardır
    static String hastaneAdres="Çankaya/Ankara";

    String personelIsmi="Personel";            // instence'ler(static olmayanlar) özel olanlardır
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {

        C02_Hastane per1=new C02_Hastane();

        C02_Hastane per2=new C02_Hastane();

        per1.personelIsmi="Harun";
        per2.personelAdresi="ÇAnkaya";

        per1.hastaneismi="Java Hastanesi";

        System.out.println(per1.personelTel); // Telefon
        System.out.println(per1.personelIsmi); // Harun
        System.out.println(per2.personelIsmi); // Personel
        System.out.println(per2.personelAdresi); // Çankaya

        System.out.println(per1.hastaneismi); // Java Hastanesi
        System.out.println(per2.hastaneismi); // Java Hastanesi
        System.out.println(hastaneismi); // Java Hastanesi

        per1.personelIsmi="Mehmet"; // yazdırırsak artık harun değil mehmet olur

        System.out.println(per1.personelIsmi); // Mehmet
        System.out.println(per2.personelIsmi); // personel


    }

}
