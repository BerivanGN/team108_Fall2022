package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedException {
    public static void main(String[] args) {

        // metin txt dosyasındaki yazıları yazdıralım

        /*
            Eğer birden fazla catch cümlesi varsa ve exception'lar arasında
            parent-child ilişkisi varsa

            1 - ikisini de yazmak istiyorsak önce child exception sonra parent yazılmalıdır.
                aksi takdirde parent üstte olursa tüm exceptionları yakalayacağından
                child exception'u yazmak anlamsız olur.

            2 - ikisini yazmak istemezsek sadece parent exception yeterli olacaktır
                çünkü parent daha kapsayıcıdır ve daha çok exception'u yakalar.

         */

        try {
            FileInputStream fis= new FileInputStream("src/day28_exceptions/metin.txt");
            int k = 0;
            while ((k=fis.read()) !=(-1)){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
