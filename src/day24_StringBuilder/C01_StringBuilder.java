package day24_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        // Kapasitesi 16 olan boş bir StringBuilder oluşturur.
        System.out.println(sb1); // Boş bir satır yazdırır.
        System.out.println(sb1.capacity()); // 16

        StringBuilder sb2=new StringBuilder(11);
        System.out.println(sb2); // Boş bir satır yazdırır.
        System.out.println(sb2.capacity()); // 11

        StringBuilder sb3=new StringBuilder("Java Candır");
        System.out.println(sb3); // Java candır
        System.out.println(sb3.capacity()); // 27

        sb2.append("Java");
        System.out.println(sb2); // Java
        System.out.println(sb2.capacity()); // 11

        sb2.append(" Candır");
        System.out.println(sb2); // Java Candır
        System.out.println(sb2.capacity()); // 11

        sb2.append(".");
        System.out.println(sb2); // Java Candır.
        System.out.println(sb2.capacity()); // 24 (kapasite 11 i aştığı için değiştirdi)(2*11+2=24)



    }
}
