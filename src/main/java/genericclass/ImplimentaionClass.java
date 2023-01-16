package genericclass;

public class ImplimentaionClass<K extends Number> implements GenericInterface<K>{
    //Generic Interface should be implemented to Generic class
    K value;

    ImplimentaionClass(K val){
        this.value = val;
    }

    @Override
    public K getMessage() {
        return value;
    }
}
