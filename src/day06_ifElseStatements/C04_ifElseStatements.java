package day06_ifElseStatements;

import java.util.Scanner;

public class C04_ifElseStatements {
    public static void main(String[] args) {
        //Soru4- Kulllanıcıdan bir karakter girmesini isteyin,
        //

        Scanner scan= new Scanner(System.in);
        System.out.println("bir harf giriniz");

        char girilenHarf=scan.next().charAt(0);

        if (girilenHarf>='A' && girilenHarf<='Z'){
            System.out.println("Girilen harf buyuk harf");
        }else {
            System.out.println("Girilen harf buyuk harf degıl");
        }


    }
}
