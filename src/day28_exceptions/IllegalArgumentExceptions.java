package day28_exceptions;

import java.util.Scanner;

public class IllegalArgumentExceptions {
    public static void main(String[] args) {

        // Kullanıcıdan yaşını girmesini isteyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException("hata");
            }else {
                System.out.println("Yaşınız kaydedildi.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
