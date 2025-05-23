package Sesiunea17.valueVsReferenceType.ex2;

public class MainRefTest {

    public static void main(String[] args) {
        RefTest ref=new RefTest();
        System.out.println(ref.name);

        RefTest ref2=new RefTest();
        System.out.println(ref2);

        if (ref == ref2) {
            System.out.println("ref == ref2");
        } else {
            System.out.println("ref == ref2");
        }
    }
}
