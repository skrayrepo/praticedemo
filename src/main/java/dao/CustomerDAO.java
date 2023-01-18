package dao;

import pojo.Card;
import pojo.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDAO {
    public static List<Customer> getCustomerList(){
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Santosh",100,20,
                Arrays.asList(new Card(344223455667l,"Santosh Ray"))));
        customerList.add(new Customer("Tapaswini",103,70,
                Arrays.asList(new Card(34556778899l,"Tapaswini Ray"))));
        customerList.add(new Customer("Sragvi",101,40,
                Arrays.asList(new Card(35445532877l,"Sragvi Ray"))));
        customerList.add(new Customer("Ashok",102,30,
                Arrays.asList(new Card(3877555523l,"Ashok Samantray"))));
        customerList.add(new Customer("Rinku",104,50,
                Arrays.asList(new Card(5664434555l,"Rinku Pattnaik"))));
        return customerList;
    }

}
