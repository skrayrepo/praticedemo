package pojo;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerName;
    private Integer customerCode;
    private Integer creditPoints;
    private List<Card> card = new ArrayList<>();

    public Customer(String customerName, Integer customerCode, Integer creditPoints, List<Card> card) {
        this.customerName = customerName;
        this.customerCode = customerCode;
        this.creditPoints = creditPoints;
        this.card = card;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Integer customerCode) {
        this.customerCode = customerCode;
    }

    public Integer getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(Integer creditPoints) {
        this.creditPoints = creditPoints;
    }

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerCode=" + customerCode +
                ", creditPoints=" + creditPoints +
                ", card=" + card +
                '}';
    }
}
