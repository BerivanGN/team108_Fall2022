package day03_dataCastıng_Matematikselislemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
        Eger genıs kapasiteli bir data turunden dar kapasiteli bir data türüne castıng yapmak ısterseniz
        java otomatik olarak gerceklestırmez,
        sizden sorumluluk almanızı bekler
        islemin gerceklesmesi icin cast yapmak istediginiz degerin onune
        (donusturmek ıstedıgınız data turu) yazılmalıdır.



         */

        double dbl= 23.5;

        int sayi= (int)dbl;
        System.out.println(sayi); //23

        byte byt= (byte) sayi;
        System.out.println(byt);

        sayi=130;
        byt=(byte)sayi; // int daha kapsamlı oldugu ıcın otomatık atama yapmaz bizdenmudahele ister.

        System.out.println(byt); //-126

        sayi=256;
        byt=(byte)sayi; // int daha kapsamlı oldugu ıcın otomatık atama yapmaz bizdenmudahele ister.

        System.out.println("int 256'nin byte hali"+byt); //0







    }
}
