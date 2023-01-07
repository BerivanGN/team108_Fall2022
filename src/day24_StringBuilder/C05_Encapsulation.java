package day24_StringBuilder;

public class C05_Encapsulation {
    public static void main(String[] args) {

        /*
           Access modifiers bir class üyesine erişimi sınırlandırırken
           görme yetkisi(read) ve değiştirme yetkisi(write) ayırt edemez.

           Ama gerçek hayatta bu ihtiyaç vardır.
           Bazı class üyelerinin readable olması istenirken
           Bazı class üyelerinin writeable olması istenir.
           ve bazı class üyeleri için iki yetki de istenir.

           Java bu yetkilendirme işlemini Encapsulation ile çözmüştür.

           Sadece yazma yetkisi için setter()
           sadece okuma yetkisi için getter()

           Kodlarımızın daha anlaşılır bir şekilde atama ve yazma işlemlerini yapması için de
           getter() ve setter() method'ları birlikte kullanılabilir
           Bazı developer'lar böyle yapmayı tercih eder.

         */

        EncapsuleClass obj1=new EncapsuleClass();
        // System.out.println(obj1.satis); private oldugundan görünmez

        obj1.setSatis(100);
        obj1.setSatis(200);
        obj1.setSatis(300);

       // System.out.println(obj1.getToplamSatis());// 600
        // satışa değer girebiliyoruz ama toplamı değiştiremiyoruz (atama yapaöıyoruz)



    }
}
