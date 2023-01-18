package stream.methods;

import dao.CustomerEmptyDAO;
import pojo.Card;
import pojo.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class TestMapAndFlatMapMethod {
    public static void main(String[] args) {
        List<Customer> custList = CustomerEmptyDAO.getCustomerList();
        custList.forEach(System.out::println);

        System.out.println("----------------Mapping:Getting list of cards---------------------");
        List cardMapList =
                custList.stream()
                        .filter(customer -> customer.getCard() != null)
                        .map(customer->customer.getCard())
                        .collect(Collectors.toList());
        cardMapList.forEach(System.out::println);


        System.out.println("----------------Flat Mapping:Getting list of cards---------------------");
        List cardFlatMapList =
                custList.stream()
                .filter(customer -> customer.getCard() != null)
                .flatMap(customer-> customer.getCard().stream()
                        .filter(card->card.getCardHolderName().equalsIgnoreCase("Santosh Ray")))
                .collect(Collectors.toList());
        cardFlatMapList.forEach(System.out::println);

        custList.stream()
                .filter(customer -> customer.getCard() != null)
                    .flatMap(customer -> customer.getCard().stream().filter(card->card.getCardHolderName().equalsIgnoreCase("Santosh Ray")))
                .forEach(System.out::println);

                //.forEach(System.out::println);



        for(Customer cust:custList){
            if(cust.getCard() != null) {
                for (Card card : cust.getCard()) {
                    if (card.getCardHolderName().equalsIgnoreCase("Santosh Ray")) {
                        System.out.println(cust);
                    }
                }
            }
        }

    }
}
