package day11_forLoops;

public class C07_TerseCevirme {
    public static void main(String[] args) {

        // Kullanıcıdan bir String isteyin ve strringi tersine çevirip kaydedin.

        String str="Java öğrenmek için çok çalışmak lazım";

        String terstenStr="";

        for (int i = str.length()-1; i>=0; i--) {

           terstenStr += str.substring(i,i+1);

        }
        System.out.println("Girilen cümlenin tersten yazılışı : " + terstenStr);

    }
}
