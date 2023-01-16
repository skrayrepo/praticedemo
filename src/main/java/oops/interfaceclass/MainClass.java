package oops.interfaceclass;

public class MainClass {
    public static void main(String[] args) {
        TestInterface1 obj = new TestInterfaceImpl();
        obj.getMessage();
        obj.show();
        TestInterface1.calculate();
        /*TestInterface2 obj2 = new TestInterfaceImpl();
        obj2.getMessage()*/;
    }
}
