package day10_stringManipulations;

public class C08_Forloop {
    public static void main(String[] args) {
        //1 ile 1000 arasındaki sayıları (sınırlar dahil) yan yana yazdırın
        //yazdırma işlemi bittiğinde
        // "tüm bu sayıların toplamı= " deyip sayıların toplamını yazdırın

        int sayilarinToplami=0;

        for (int i = 78; i <=378 ; i++){
            System.out.print(i + " ");
            //sayilarinToplami=sayilarinToplami+i;
            sayilarinToplami += i;
        }

        System.out.println("");
        System.out.println("Tüm bu sayıların toplamı = " + sayilarinToplami);
        //78'den 378'e kadar olan sayılar toplandı



    }
}
