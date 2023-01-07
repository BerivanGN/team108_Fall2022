package day24_StringBuilder;

public class C04_AccessModifier {

    String str;
    // Access modifier'i gözlerimizle göremiyorsak
    // default access modifier var demektir

    // Bu class'ta default constructor var.
    // str'ın değeri null'dır. ( default değer)
    // str'ın Access modifier'i default access modifier'dir


    public static void main(String[] args) {

        D obj1= new D();
        System.out.println(obj1.isimDefault); // Furkan
        obj1.defaultStaticOlmayanMethod();
        // Default access modifier'li static olmayan method çalıştı

        // Başka class'lardaki class üyelerine erişimde
        // access modifier ve static keyword dikkate alınmalıdır.
        // static class üyelerini obje üzerinden kullanmaya gerek yoktur.
        // illaki obje üzerinden kullanmak isterseniz
        // class üyesinin ismini yazmanız gerekir.

        System.out.println(obj1.isimDefaultStatic); // objeye bağlı olduğu için sarı oldu // sevilay
        System.out.println(D.isimDefaultStatic);// sevilay

        D.isimDefaultStatic="Mehmet";

        obj1.defaultStaticMethod();
        D.defaultStaticMethod();


    }
}
