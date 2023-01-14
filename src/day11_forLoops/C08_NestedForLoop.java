package day11_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        //verilen input'a göre çarpım tablosu oluşturun.
        //java'da iç içe yapılara nested denir.
        //burada sadece farklı olan i'nin katsayısı olduğundan onun için de bir loop oluşturalım.

        int input = 4 ;
        /*
          1 2 3 4
          2 4 6 8
          3 6 9 12
          4 8 12 16 vb.
         */

        //1 2 3 4
        for (int i = 1 ; i <= 4 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // 2 4 6 8
        for (int i = 1; i <=4; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println("");
        // 3 6 9 12
        for (int i = 1; i <=4; i++) {
            System.out.print(3*i + " ");
        }
        System.out.println("");
        // 4 8 12 16
        for (int i = 1; i <=4; i++) {
            System.out.print(4*i + " ");
            }
        System.out.println(" ");

        // NEsted loop ile yapalım

        for (int i = 1; i <=4; i++) { // buna auter loop denir ve i'nin çarpılacağı sayıyı kontrol eder.(sütun)

            for (int j = 1; j <=4; j++) { // buna da inner loop denir ve önceki örnekteki i'yi kontrol eder.(satır)

                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }

    }
}
