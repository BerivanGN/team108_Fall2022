package day11_forLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {

        //input olarak verilen bir tam sayının
        //asal sayı olup oladığını yazdırın

        int input=29;
        String sonuc="Sayı asal";

        for (int i = 2; i < input; i++) {

            if (input%i==0){
                sonuc="sayı asal değil";
                break;
                // Java bir for loop'un içerisinde break görürse
                // o loop'u bitirir
            }
        }

        System.out.println(sonuc);
    }
}
