package day36_geneltekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {
    public static void main(String[] args) {

        // kullanıcıdan pozitif bir tam sayı alıp
        // o sayıdan 0'a kadar olan pozitif tam sayıları toplayalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı girin");
        int sayi= scan.nextInt();

        toplaForLoop(sayi);
        System.out.println(toplaRecursive(sayi));

    }

    private static int toplaRecursive(int sayi) {


        if (sayi>0){
            return sayi+toplaRecursive(sayi-1);
        }else {
            return sayi;
        }


    }

    private static void toplaForLoop(int sayi) {

        int toplam=0;

        for (int i = 0; i <=sayi; i++) {
            toplam+=i;
        }
        System.out.println("Toplam for loop ile : " + toplam);
    }
}
