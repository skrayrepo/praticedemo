package optionalclass;

import dao.CustomerDAO;
import dao.CustomerEmptyDAO;
import pojo.Card;
import pojo.Customer;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainOptionalClass {
    public static void main(String[] args) {
        List<Customer> custList = CustomerEmptyDAO.getCustomerList();
        custList.forEach(System.out::println);
        System.out.println("----------------Sorted---------------------");
        List<Customer> sortedCustList = custList.stream()
                .sorted((c1,c2)->c1.getCustomerName().compareToIgnoreCase(c2.getCustomerName()))
                .collect(Collectors.toList());
        sortedCustList.forEach(System.out::println);

        System.out.println("---------------Filter:Filter credit points and getting the result----------------------");
        List cardFilterList =
                custList.stream()
                        .filter(customer->customer.getCreditPoints()!=null && customer.getCreditPoints()>=50)
                        //.map(customer->customer.getCard())
                        .collect(Collectors.toList());
        cardFilterList.forEach(System.out::println);





        //System.out.println(anyCustomer);


    }
}
