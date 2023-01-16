package oops.interfaceclass;

public class TestInterfaceImpl extends TestClass implements TestInterface1{

    @Override
    public void getMessage() {

    }

    @Override
    public void show() {
        TestInterface1.super.show();
    }

}
