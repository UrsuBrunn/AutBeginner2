package Sesiunea17.StaticAccessModifier;

public class TestAccessModifiers {

    public static void main(String[] args) {
//        StaticAccessModifiers staticAccessModifiers = new StaticAccessModifiers();
//        System.out.println(staticAccessModifiers.name);
        StaticAccessModifiers.name = "New Endava";
        System.out.println(StaticAccessModifiers.name);
        StaticAccessModifiers.print();


        StaticAccessModifiers staticAccessModifiers2 = new StaticAccessModifiers();
        System.out.println(staticAccessModifiers2.name);
    }
}
