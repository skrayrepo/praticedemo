package genericclass;

public class MainClass {
    public static void main(String[] args) {
        EstimateGeneric<Integer> price = new EstimateGeneric<>(30);
        System.out.println(price);
        EstimateGeneric<String> messg = new EstimateGeneric<>("Welcome to Java");
        System.out.println(messg.getPriceInfo("Welcome to Generic"));
        System.out.println(messg);
        EstimateGeneric<Float> floatPrice = new EstimateGeneric<>(25.5f);
        System.out.println(floatPrice);

        EstimateGenericWildCard<Integer> obj =  new EstimateGenericWildCard<>(25);
        //EstimateGenericWildCard<String> obj  =new EstimateGenericWildCard<String>();// Can't take other data type of Number

        GenericInterface<Integer> obj1 = new ImplimentaionClass<>(23);
        System.out.println(obj1.getMessage());
        GenericInterface<Float> obj2 = new ImplimentaionClass<>(23.5f);
        System.out.println(obj2.getMessage());

        GenericMethodClass obj3 = new GenericMethodClass();
        obj3.getMessage(33);
        obj3.getMessage("Santosh");

    }



}
