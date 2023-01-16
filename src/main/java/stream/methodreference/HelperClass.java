package stream.methodreference;

public class HelperClass implements HelperInterface{

    public boolean getSum(Integer a,Integer b){
        if(a.intValue() > b.intValue()) {
            return true;
        }
        return false;
    }
}
