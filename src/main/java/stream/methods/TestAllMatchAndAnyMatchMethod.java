package stream.methods;

import dao.CustomerEmptyDAO;
import pojo.Customer;

import java.util.List;

public class TestAllMatchAndAnyMatchMethod {
    public static void main(String[] args) {
        List<Customer> custList = CustomerEmptyDAO.getCustomerList();
        custList.forEach(System.out::println);

        //Predicate parameters,returns boolean
        Boolean isAnyMatch = custList.stream()
                .anyMatch(customer -> customer.getCustomerName().startsWith("S"));
        System.out.println("isAnyMatch: "+isAnyMatch);

        Boolean isAllMatch = custList.stream()
                .allMatch(customer -> customer.getCustomerCode() >= 100);
        System.out.println("isAllMatch: "+isAllMatch);

        Boolean isNoneMatch = custList.stream()
                .noneMatch(customer -> customer.getCustomerCode() < 100);
        System.out.println("isNoneMatch:"+isNoneMatch);


    }
}
