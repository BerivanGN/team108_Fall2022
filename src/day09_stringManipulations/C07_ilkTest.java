package day09_stringManipulations;

public class C07_ilkTest {
    public static void main(String[] args) {

        // Gittiğimiz web sayfasından aldığımız
        // String arama sonuçlarında
        //arama sayısının 50'den fazla oldugunu test edin

        String input="1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexResults=input.indexOf("results");
        String sonucSayisiString=input.substring(indexOf+3, indexResults-1);
        System.out.println(sonucSayisiString);

        //arama sayısının 50'den fazla oldugunu test edin
        int sonucSayisiInt=Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt>50){
            System.out.println("Nutella arama testi PASSED");
        }else {
            System.out.println("istenen kadar sonuç yok, Nutella arama testi FAILED");
        }

    }
}
