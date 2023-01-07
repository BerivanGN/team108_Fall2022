package day19_arrayList_forEachLoop;

public class Toyota {

    String marka = "Toyota";
    String model = "Model belirtilmemiş";
    int yil ;
    int km ;
    String renk ;
    // default constructor şuna benzer:

    public Toyota(){
        System.out.println("Toyota class'ındaki constructor çalıştı");

    }
    /*
      Bir kod bloğunun constructor olup olmadığını anlamak için 2 şeye bakmalıyız

       1- Constructor class ismi ile aynı isimde olmalıdır
          dolayısıyla constructors isimeri büyük harfle başlar

       2- Constructor'un return type'ı (void falan) olmaz.
       ( void Toyota(){}>>> bu metod olur constructor olmaz)

     */

    /*
           Java'da her class obje üretmek üzere oluşturulur

           bir obje oluşturulup ilk değer ataması yapılabilmesi için de
           MUTLAKA constructor çalışmalıdır.

           Java'da her class'da mutlaka CONSTRUCTOR bulunur

           Her class'da cunstrutor oluşturmamıza gerek kalmaması için
           java her class'a otomatik olarak default constructor koyar.

           default constructor GÖRÜNMEZ
           default constructor parametresi olmayan
           ve body'sinde hiç kod bulunmayan bir constructor'dur.

           Bir class'da gözlerimizle bir constructor görmüyorsak
           o class'da default constructor vardır.

           Eğer kullanıcılar tarafından gözle görünür bir constructor oluşturulursa
           Java default constructor'u siler.
           Yani gözlerimizle bir constructor görüyorsak
           o class'ta default constructor yoktur.
     */

}
