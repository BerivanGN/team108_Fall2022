package day10_stringManipulations;

import java.util.Scanner;

public class C09_Forloop {
    public static void main(String[] args) {

        // kullanıcıdan başlangıç ve bitiş değerlerini alıp
        // bu sınırlar dahil olarak bu sayılar arasında 5'in katı olan sayıları yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Başlangıç değerini giriniz");
        int baslangic= scan.nextInt();

        System.out.println("Bitiş değerini giriniz");
        int bitis= scan.nextInt();
        for (int i= baslangic; i<=bitis; i++){
            if (i%5==0){
                System.out.print(i + " ");
            }
        }


    }
}
