package day07_ternary_switchStatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {
        // Kullanıcıdan gün numarasını alın
        // hafta içi veya hafta sonu oldugunu yazdırın

        int gunNo=6;

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecersiz gün numarası");

        }

    }
}
