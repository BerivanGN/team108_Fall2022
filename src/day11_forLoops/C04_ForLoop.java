package day11_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {

        // Eğer şart i'nin hiçbir değeri için true olmuyorsa

        // input olarak verilen sayıdan 1'e kadar tüm sayıları yazdırın

        int input=23; // eger kullanıcının pozitif ve negatif değer gireceğini öngörüp
        
        if (input>1) {
            for (int i = input; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }else {
            for (int i = input; i <= 1; i++) {
                System.out.print(i + " ");
            }
        }
        // Eğer şart i'nin tüm değerleri için doğru oluyorsa
        //teknik olarak sonsuz loop oluşur.
        //bilgisayarımız sonsuza kadar çalışmaz, ram dolar veya int'in sınırlarına ulaşır
        // ama teknik olarak loop denir.
         /*
         for (int i = 1; i < 0; i++) {
            System.out.println(i + " "); //sakın yazdırma :D durmaz yoksa
        */
        
        // İnput olarak verilen sayıdan 100'e kadar tüm tam sayıları yazdırın

        input = 10;
        System.out.println("");
        for (int i = input; i <=100; i++) {
            System.out.println(i+ " ");
        }


            

    }
}
