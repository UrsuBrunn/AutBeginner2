package OOP.Sesiunea17.Static.ex2;

public class InitializerBlockTest {

    private String name="Ana";
    static{
        System.out.println("setting field");
//        name="Test";
    }
    public InitializerBlockTest() {
        name="Maria";
        System.out.println("setting cosntructor");
    }
    public static void main(String[] args) {
        InitializerBlockTest test = new InitializerBlockTest();
        System.out.println(test.name);
    }
}
