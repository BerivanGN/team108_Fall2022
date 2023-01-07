package day23_dateTime_varargs;

public class C09 {
    public static void main(String[] args) {

        new C09().C09(1,"Java");

        C09 obj=new C09();
        obj.C09(2,"Java","Guzeldir");

    }

    private void C09(int a, String... b) {
        System.out.println(b[b.length-a]+ " ");
    }
}
