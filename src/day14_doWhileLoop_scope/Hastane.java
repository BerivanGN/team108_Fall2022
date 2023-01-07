package day14_doWhileLoop_scope;

public class Hastane {

    static String hastaneismi="Yıldız Hastanesi";  // staticler genel olanlardır
    static String hastaneAdres="Çankaya/Ankara";

    String personelIsmi;                        // instencesler(static olmayanlar) özel olanlardır
    String getPersonelAdresi;
    String getPersonelTel;

    public static void main(String[] args) {

        Hastane p1=new Hastane();
        p1.personelIsmi="Kemal";

        Hastane p3=new Hastane();
        p3.getPersonelTel="3121232323";


    }
}
