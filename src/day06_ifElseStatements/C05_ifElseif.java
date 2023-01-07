package day06_ifElseStatements;

import java.util.Scanner;

public class C05_ifElseif {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("gecersiz not");

        } else if (not>=85) {
            System.out.println("Notunuz AA");

        } else if (not>=65) {
            System.out.println("Notunuz BB");

        } else if (not>=50) {
            System.out.println("Notunuz CC");

        }else {
            System.out.println("Notunuz DD kaldınız");
        }

    }
}
