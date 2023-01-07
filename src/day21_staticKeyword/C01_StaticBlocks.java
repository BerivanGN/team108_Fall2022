package day21_staticKeyword;

public class C01_StaticBlocks {
    C01_StaticBlocks(){
        System.out.println("Constructor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalışmaya başladı");
    }
    static {
        // Static block'lar class'daki tüm yapılardan hatta main method'dan bile önce çalışır.
        // Static block'ta istediğimiz bir veriable'a başlangıç değerinin atanması
        // kullanıcıdan yetki sorgulaması gibi işlemler yapılabilir
        // main method çalışmadan önce yapılması gereken işlem olduğunda kullanılır.
        // Method'ların ve static block'ların sıralaması Java açısından önemli değildir
        // Ancak birden fazla static block varsa kendi aralarında önce üstteki çalışır.

        System.out.println("Yukarıdaki static blok çalıştı");
        // statik'in sout'u main'den önce çalışır
    }
    static {
        System.out.println("Alttaki static block çalıştı");
    }

}
