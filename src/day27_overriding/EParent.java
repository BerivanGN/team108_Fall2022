package day27_overriding;

public class EParent extends DGrandParent{
    @Override
    protected void method1() {
        System.out.println("P method1");

        // @Override notasyonu overridden method ile overriding methodu ilişkilendirir
        // eğer overridden method'da bu ilişkiyi bozacak bir değişiklik yapılırsa
        // @Override CTE verir.
    }

      protected void method2(){
        System.out.println("P method2");
    }

    private void method3(){
        System.out.println("P method3");
    }
}
