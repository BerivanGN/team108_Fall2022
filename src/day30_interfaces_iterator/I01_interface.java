package day30_interfaces_iterator;

public interface I01_interface {

    // Interface'lerde tüm metotlar public ve abstract'tır. (yazılsada yazılmasa da olur.)
    // Interface'lerde tüm veriableler public,static ve final'dir.(yazılsada yazılmasa da olur)
    // final olduğundan sonradan değer atamak mümkün olmaz oluştururken değer ATANMALIDIR.
    //public int sayi2;



    int SAYI1=10;
    public static final String okulIsmi="Yıldız koleji";
    public int SAYI2=20;


    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    void method5();

    /*
      Bir interface'ye sonradan bir metot eklemek istediğimizde o interface'yi daha önce
      implement eden tüm class'lar yeni eklenen metot'u implement etmek zorunda olur.

      Java'ya yapılan talepler sonucunda
      Java8 ile birlikte bu konuda bir istisna getirilmiştir.
      Eğer sonradan eklenen metodun tüm eski class'lar tarafından implement edilme mecburiyeti
      olmasın isteniyorsa yeni oluşturulan metod'a
      DEFAULT veya STATİC keyword ekleyip
      body{} de oluşturulursa
      o zaman bu metod'un child class'lar tarafından
      implement edilme mecburiyeti olmaz.
     */

    public default void method44(){
        System.out.println("Interface'deki default olarak işaretlenen metod çalıştı.");
    }

    public static void method34(){
        System.out.println("Interface'deki static olarak işaretlenen metod çalıştı.");
    }
}
