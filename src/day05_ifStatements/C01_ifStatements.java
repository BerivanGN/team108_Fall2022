package day05_ifStatements;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {


       //ögrenciden notunu rakam olarak alıp harf olarak yazdırın
        // 0-49,9999 DD
        // 50-64,999 CC
        // 65-84,999 BB
        // 85-100 AA

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (0<=not && not<50) {
            System.out.println("notunuz DD, maalesef kaldiniz");
        }

        if (50<=not && not<65) {
            System.out.println("Notunuz CC, tebrikler gectınız");
        }

        if (65<=not && not<85) {
            System.out.println("Notunuz BB");
        }

        if (85<=not && not<=100) {
            System.out.println("Tebrikler, notunuz AA");
        }



        }

    }

