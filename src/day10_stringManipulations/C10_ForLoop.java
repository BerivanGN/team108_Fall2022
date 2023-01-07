package day10_stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen sayıdan başlayıp
        //yedişer yedişer arttırarak input olarak verilen bitiş sayısına kadar
        //-tüm sayıları
        //-kaç adet sayı olduğunu
        //-bu sayıların toplamının kaç olduğunu yazdırınız

        int inputBas = 340;
        int inputBit = 1563;

        int sayac=0;
        int toplam=0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.print(i + " ");
            sayac++;
            toplam+=i;
        }

        System.out.println("");
        System.out.println("Toplam" + sayac + " adet sayı var \nBu sayıların toplamı : " + toplam);


    }
}
