package stream.methods;

import dao.CustomerEmptyDAO;
import pojo.Customer;

import java.util.List;
import java.util.function.Supplier;

public class TestGetFirstMethod {

    public static void main(String[] args) {
        List<Customer> custList = CustomerEmptyDAO.getCustomerList();
        custList.forEach(System.out::println);

        System.out.println("----------------findFirst:Getting first object from the list(Optional CLass return)---------------------");
        //For reference
        Supplier<Customer> supplier = new Supplier<Customer>() {
            @Override
            public Customer get() {
                return new Customer("test",200,30,null);
            }
        };

        Customer firstCustomer =
                custList.stream()
                        //.filter(customer->customer.getCustomerCode() == 300)
                        //.filter(customer->customer.getCustomerCode() == 300)
                        .findFirst()
                        .orElse(new Customer("test",200,30,null));//Return object
        //.orElseGet(()->new Customer("test",200,30,null));//return Supplier
        System.out.println(firstCustomer);

    }
}
