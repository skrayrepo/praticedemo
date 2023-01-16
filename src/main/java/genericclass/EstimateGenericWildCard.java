package genericclass;

public class EstimateGenericWildCard<K extends Number> {
    K price;
    public EstimateGenericWildCard(K price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "EstimateGeneric{" +
                "price=" + price +
                '}';
    }
}
