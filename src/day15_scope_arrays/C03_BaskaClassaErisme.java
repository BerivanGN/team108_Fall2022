package day15_scope_arrays;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {

        /*
            java OOP konsept çerçevesinde başka class'lardaki class üyelerini (veriable/metos) kullanabiliriz
            başka class'daki herhangi bir class uyesine erişmek istediğimizde
            static keyword önemli bir rol oynar

            static olarak işaretlenen class uyelerine
            classIsmi.staticUyeIsmi şeklinde ulaşabiliriz.

            static olmayan class üyelerine erişebilmek için obje oluşturmamız gerekir.

            Java runtime program'dır. Basınca çalışır
            çalıştığı sürece yapılan işlemleri kalıcı olarak tutar
            çalışma bittiğinde her şey yok olur.

         */

        System.out.println(C01_Hastane.hastaneAdres); // Çankaya/Ankara
        C01_Hastane.method1(); // Çankaya/Ankara
        System.out.println(C01_Hastane.hastaneismi); // Yıldız Hastanesi

        C01_Hastane per1=new C01_Hastane(); // java C01'e gider oradan instance'lerin kopyasını alır
                                            // satic'leri de class'a bağlar

        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.hastaneismi); // Yıldız Hastanesi

        per1.personelIsmi="Belkıs";
        per1.personelAdresi="İstanbul";
        per1.hastaneAdres="Üsküdar";

        System.out.println(per1.personelIsmi); // Belkıs
        System.out.println(per1.personelAdresi); // İstanbul
        System.out.println(per1.personelTel); // null
        System.out.println(per1.hastaneismi); // Yıldız Hastanesi
        System.out.println(per1.hastaneAdres); // Üsküdar


    }
}
