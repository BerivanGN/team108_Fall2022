package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/day28_exceptions/metin.txt");

        /*
           Bazı kodları yazdığımızda java compile time sırasında
           o kodlarda exception riskini görür ve bizden bir çözüm bekler

           Özellikle dosya okuma ve yazma ile ilgili
           IO(input/output) işlemlerinde ya okuyamazsam ya yazamazsam diyerek
           bizden compile time'da çözüm ister.

           Bu durumda biz exceptionla karşılaşıldığında
           kod dursun diyorsak : metod satırına throws keyword kullanarak
                                 beklenilen exception(ları) deklare edebiliriz.
                                 Bu sadece olayın farkında olduğumuzu deklare eder
                                 exception fırlatmanın ve kodu durdurmanın önüne geçmez
           kod çalışmaya devam etsin : try-catch-(finally) bloğu kullanabiliriz.
         */


    }
}
