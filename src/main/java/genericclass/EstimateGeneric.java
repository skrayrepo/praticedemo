package genericclass;

public class EstimateGeneric<K> {
    K price;
    public EstimateGeneric(K price){
        this.price = price;
    }

    public K getPriceInfo(K message){
        //System.out.println("Input price of the item ");
        return message;
    }

    @Override
    public String toString() {
        return "EstimateGeneric{" +
                "price=" + price +
                '}';
    }
}
