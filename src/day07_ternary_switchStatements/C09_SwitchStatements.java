package day07_ternary_switchStatements;

public class C09_SwitchStatements {
    public static void main(String[] args) {
        // Kullanıcıdan gün numarasını alıp
        // gün ismini yazdırın


        int gunNo=5;

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gün numarası");

        }

    }
}
