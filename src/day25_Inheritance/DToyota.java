package day25_Inheritance;

public class DToyota extends CCar{

    DToyota(){
        System.out.println("Parametresiz Toyota Constructor'u çalıştı");
    }
    DToyota(String Param1){
        System.out.println("Parametreli Toyota constructor'u çalıştı");
    }

    String marka="Toyota";
    String uretimYeri="Toyota farklı ülkelerde üretilir";
}
