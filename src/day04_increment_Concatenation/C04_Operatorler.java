package day04_increment_Concatenation;

public class C04_Operatorler {
    public static void main(String[] args) {


        int a= 10 ;
        int b= 15 ;
        boolean c;

        System.out.println(c=a*15==b*10); //true

        System.out.println(c); // true

        System.out.println(!true); //false
        System.out.println(!(a<b)); // false


        c= a<=b   ;


        /*

           int a = 10;

         hem 3'e hem de 5'e bölünebilen sayılar
         a%3==0 && a%5==0

         3'e veya 5'e bölünebilen sayılar
         a%3==0  || a%5==0

         0'dan buyuk ve 100'den kucuk sayılar
         0<a<100 matematikte 3'lü karsılastırma mumkundur
                 ancak Java 3'lü karsılastırma yapmaz
                 2'li karsılastırmalar yapıp
                 mantıksal operatorlerle bırbırıne baglamalısınız.

                 0<a && a<100 Java'da boyle yazılır

                 0'dan kucuk veya 100'den buyuk sayılar
                 a<0 || a>100

                 bir ücgenin 3 kenarı a,b,c uzunluklarındadır
                 bu ucgenın eskenar oldugunu kontrol etmek isterseniz
                   a==b  &&  b==c seklinde yazarız

         */

    }
}
