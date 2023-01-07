package day15_scope_arrays;

import day14_doWhileLoop_scope.Hastane;

public class C01_Hastane {

    static String hastaneismi="Yıldız Hastanesi";  // staticler genel olanlardır
    static String hastaneAdres="Çankaya/Ankara";

    String personelIsmi;                        // instencesler(static olmayanlar) özel olanlardır
    String personelAdresi;
    String personelTel;


    public static void main(String[] args) {
        /*
          eğer tüm method'lardan kullanılabilecek veriable'ler oluşturmak isterseniz
          bu veriableleri (class veriable)

          Class Level'da oluşturulacak veriableler için 2 ihtimal vardır
          1- Static veriable (class veriable)
          2- instance (static olmayan) veriable (obje veriable)

          Kural 1- static veriable'ler tüm objeler için tek bir değer alır
                   instance veriable'ler her obje için java tarafından çoğaltılır

          Kural 2- Class level veriable'lere değer atamasak da kullanabiliriz
                   biz değer atamasak bile java class level veriable'lere değerler atar
                   non-primitive'ler >>>> null(String)
                   sayısal primitive >>>> 0
                   char >>>>>>>>>>>>>>>>> hiçlik ""
                   boolean >>>>>>>>>>>>>> false

          Kural 3- static olan methodlardan static olmayan veriable ve method'lara direkt ulaşılmaz
                   instance veriable ve static olmayan methodları static alanlarda kullanmak isterseniz
                   obje üzerinden kullanabilirsiniz.

          Kural 4- class'da oluşturulan veriableler ilk değer atamasını yapar
                   yani bir obje ilk oluşturulduğunda otomatik olarak instance veriable'a atanan değeri alır
                   değer atanmamışsa default   değerleri alır
                   obje oluşturulduktan sonra

          Kural 5- static veriableler tüm objeler için ortaktır.
                   static veriable'lere tüm class'tan direkt ulaşılabilir
                   static veriablenin değeri değişirse tüm


         */

        C01_Hastane per1= new C01_Hastane();

        System.out.println(per1.personelIsmi); // null
        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.personelTel); // null

        // personelIsmi (kural 3 geçerli direkt ulasılamaz)(per1. ile başlarız)

        per1.personelIsmi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel= "+491712342323";

        C01_Hastane per2=new C01_Hastane();
        System.out.println(per2.personelIsmi); // null

        per1.personelIsmi="Yusuf";
        System.out.println(per2.personelIsmi); // null ( per 1'i değiştirmen per 2'yi etkilemez)
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi);
        System.out.println(per1.personelIsmi);

        System.out.println(hastaneismi); // static metoda direkt ulaştı // Yıldız hastanesi

        System.out.println(per1.hastaneismi); // Yıldız hastanesi

        per2.hastaneismi="Java Hastanesi";

        System.out.println(hastaneismi); // Java Hastanesi
        System.out.println(per1.hastaneismi); // Java Hastanesi
        System.out.println(per2.hastaneismi); // Java Hastanesi


    }

    public static void method1(){
        System.out.println(hastaneAdres);
    }

    public void method2(){
        System.out.println(hastaneismi);
    }
}
