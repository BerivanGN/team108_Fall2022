package day23_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kaç tane string argüment yazılırsa yazılsın
        // argümentlein en uzun olanını yazdıran bir metod oluşturun.
        // Not: en uzun kelime olarak birden fazla kelime varsa ilkini yazdırın.

        enUzunuYazdir("Ilyas","Berivan","Murat"); // Berivan
        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer"); // Mehmet

    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunKelime=kelimeler[0];

        for (String eachKelime:kelimeler
             ) {
            if (eachKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);
    }
}
