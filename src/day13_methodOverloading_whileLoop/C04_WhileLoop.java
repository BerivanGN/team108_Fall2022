package day13_methodOverloading_whileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // 2 basamaklı sayılardan 7 ile bölünebilenleri yazdırın

        for (int i = 10; i <100; i++) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // aynı soruyu whileloop ile yapalım

        int sayi=10;

        while (sayi<100){
            if (sayi%7==0){
                System.out.print(sayi+ " ");
            }
            sayi++;
        }
        //for loop ile yapılacak bir olayı while loop ile yazmak zahmetli ve risklidir.

    }
}
