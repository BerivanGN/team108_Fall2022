package day09_stringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        // kullanıcıdan aldığımız ilk cünle "cok" ile baslayan ilk kelimeyi yazdırın.
        //cümlede çok kelimesi geçmiyorsa "cumlede cok ile baslayan kelime yok" yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String girilenCumle=scan.nextLine();


        // Sınavlarımızda coktan seçmeli sorular kullanıyoruz
        // Java'yı cok seviyoruz
        // bu kadar cok'lu seçenek olur mu ?

        if (!girilenCumle.contains("cok")){
            System.out.println("cümlede cok ile baslayan kelime yok");
        }else {
            int cokIndexi=girilenCumle.indexOf("cok");
            int boslukIndexi=girilenCumle.indexOf(" ", cokIndexi+1);


            System.out.println(girilenCumle.substring(cokIndexi, boslukIndexi));
        }

    }
}
