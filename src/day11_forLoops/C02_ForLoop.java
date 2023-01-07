package day11_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen bir string'de
        // index'i tek sayı olanları küçük harfle
        //index'i çift sayı olanları büyük harfler yazdırın
        //örnek: Java output: JaVa

        String input= "Java candır, Selenyum heyecandır";

        for (int i = 0; i < input.length(); i++) {

            System.out.print(i%2==0  // index çift mi ?
                               ? input.substring(i, i+1).toUpperCase() // index çift ise
                               : input.substring(i, i+1).toLowerCase() // index tek ise
                               );
        }

    }
}
