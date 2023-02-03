package dao;

import pojo.Address;
import pojo.Card;
import pojo.Customer;

import java.util.*;

public class CustomerEmptyDAO {
    public static List<Customer> getCustomerList(){
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Santosh",100,20,
                Arrays.asList(new Card(344223455667l,"HDFC Bank","Santosh Ray"),
                        new Card(87746553744l,"Citi Bank","Santosh Ray")),
                new Address("6144","PLRD","Bangalore","Karnataka",560061,9886400397l)));
        customerList.add(new Customer("Tapaswini",103,70,
                Arrays.asList(new Card(34556778899l,"Tapaswini Ray")),
                new Address("5122","CM","Bangalore","Karnataka",560061,98864003990l)));
        customerList.add(new Customer("Sragvi",101,null,
                Arrays.asList(new Card(35445532877l,"Sragvi Ray")),
                new Address("B103","CM","Bangalore","Karnataka",560061,98864003850l)));
        customerList.add(new Customer("Ashok",102,30,
                null,new Address("3442","SNN","Bangalore","Karnataka",560061,9886400321l)));
        customerList.add(new Customer("Rinku",104,50,
                Arrays.asList(new Card(5664434555l,"Rinku Pattnaik")),
                new Address("5332","PLRD","Bangalore","Karnataka",560061,null)));
        return customerList;
    }

    public static Map<Integer,Customer> getCustomerInfo(){
        Map<Integer,Customer> customerMap = new HashMap<>();
        customerMap.put(1,new Customer("Santosh",100,
                new Address("6144","PLRD","Bangalore","Karnataka",560061,9886400397l)));
        customerMap.put(5,new Customer("Tapaswini",103,
                new Address("5122","CM","Bangalore","Karnataka",560061,98864003990l)));
        customerMap.put(3,new Customer("Sragvi",101,
                new Address("B103","CM","Bangalore","Karnataka",560061,98864003850l)));
        customerMap.put(2,new Customer("Ashok",102,new Address("3442","SNN","Bangalore","Karnataka",560061,9886400321l)));
        customerMap.put(4,new Customer("Rinku",104,
                new Address("5332","PLRD","Bangalore","Karnataka",560061,null)));
        return customerMap;
    }
}
