package day11_forLoops;

public class C09_NestedLoop {
    public static void main(String[] args) {
        //input olarak verilen kenar uzunluklarına göre
        //aşağıdaki şekli çizdirin

        int kisaKenar=5;
        int uzunKenar=8;

        /*
            * * * * * * * *  // bir satırı nasıl yazdıracağımızı inner loop ile belirleriz
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
         Satırda yaptığımız işlemi kaç kere tekrar edeceğimizi ise outer loop (ilk loop)(dış loop) belirler

         */


        for (int i = 1; i <=kisaKenar; i++) {
            for (int j = 1; j <=uzunKenar; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // satır ile işlemimiz bittiğinde alt satıra gemesi için
        }
    }
}
