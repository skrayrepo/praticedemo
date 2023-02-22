package stream.methods;

import dao.CustomerDAO;
import dao.CustomerEmptyDAO;
import pojo.Card;
import pojo.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMapAndFlatMapMethod {
    public static void main(String[] args) {
        List<Customer> custList = CustomerDAO.getCustomerList();
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

        System.out.println("----------------Sorted ---------------------");
        List<Customer> sortedCustList = custList.stream()
                .sorted((c1,c2)->c1.getCustomerName().compareToIgnoreCase(c2.getCustomerName()))
                .collect(Collectors.toList());
        sortedCustList.forEach(System.out::println);

        System.out.println("----------------Sorted and Get only Customer Names---------------------");
        List<String> sortedCustNames = custList.stream()
                .sorted((c1,c2)->c1.getCustomerName().compareToIgnoreCase(c2.getCustomerName()))
                .map(customer -> customer.getCustomerName())
                .collect(Collectors.toList());
        sortedCustNames.forEach(System.out::println);

        System.out.println("---------------Filter:Filter credit points and getting the result----------------------");
        List cardFilterList =
                custList.stream()
                        .filter(customer->customer.getCreditPoints()!=null && customer.getCreditPoints()>=50)
                        //.map(customer->customer.getCard())
                        .collect(Collectors.toList());
        cardFilterList.forEach(System.out::println);

        System.out.println("********** Remove duplicate charecters from each strings");
        String[] uniqueArray = {"hello","sallow"};
        List<String> result = Stream.of(uniqueArray).map(s->s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        result.stream().forEach(System.out::print);
        System.out.println("");
        System.out.println("*******Handing two separate list using flatMap*************");
        List<Integer> intArr1 = Arrays.asList(1,2,3);
        List<Integer> intArr2 = Arrays.asList(4,5);
        List<List<Integer>> list322 = intArr1.stream()
                .flatMap(i->intArr2.stream().map(j->Arrays.asList(i,j)))
                .collect(Collectors.toList());
        list322.stream().forEach(System.out::println);

    }
}
