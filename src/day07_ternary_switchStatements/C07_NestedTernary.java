package day07_ternary_switchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayi= -1666 ;
        //System.out.println(sayi>0 ? "sayi pozitif" : "sayi pozitif değil"); olması gereken buydu..ama komplex istemis

        System.out.println(sayi>0 ? (sayi%2==0 ? "çift sayı" : "tek sayı" ) :
                (-100>=sayi && sayi>=-999 ? "3 basamaklı" : "3 basamaklı degil"));
         //23  tek sayı yazdırır
         //122 çift sayı yazdırır
         // -997 3 basamaklı yazdırır
         // -1222 3 basamaklı degil yazdırır

    }
}
