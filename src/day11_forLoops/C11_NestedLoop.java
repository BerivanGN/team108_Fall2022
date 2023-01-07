package day11_forLoops;

public class C11_NestedLoop {
    public static void main(String[] args) {
        /*
        input değerine kadar her satırda * sayısını bir attırıp
        sonra azaltarak aşağıdaki şekli yazdırın

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

       ipucu: artış ve azalış kısımlarını 2 ayrı nested loop ile yapmalıyız
       */

       int input=4; //input arttıkça şekil büyür

       // artış kısmı için nested

        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // Azalış kısmı için nesdet loop

        for (int i = input-1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
