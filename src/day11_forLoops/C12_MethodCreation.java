package day11_forLoops;

public class C12_MethodCreation {
    public static void main(String[] args) {

        // 5'in faktöryelini hesaplayınız

        faktoryelyazdir(5);
        // kodun ilerleyen aşamalarında 7! lazım oldu

        faktoryelyazdir(7);
        // kodun ilerleyen aşamalarında 3! lazım oldu

         faktoryelyazdir(3);
         
         




    }

    public static void faktoryelyazdir(int i) {
        int carpim=1;
        for (int j = 1; j <=i; j++) {
            carpim*=j;

        }
        System.out.println(i + "! = "+ carpim);
    }
}
