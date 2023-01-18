package stream.methods;

import dao.CustomerEmptyDAO;
import pojo.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestMaxMinMethod {
    public static void main(String[] args) {
        List<Customer> custList = CustomerEmptyDAO.getCustomerList();
        custList.forEach(System.out::println);

        Customer maXCreditPoints =
                custList.stream()
                        .filter(customer->customer.getCreditPoints() != null)
                .max(Comparator.comparing(customer -> customer.getCreditPoints()))
                .orElse(null);
        System.out.println(maXCreditPoints.getCreditPoints());

        List<Integer> list = Arrays.asList(20,10,40,30,90);
        Integer max = list.stream()
                .max(Comparator.comparing(e->e.intValue()))
                .orElse(null);
        System.out.println(max);

        Integer min = list.stream()
                .filter(e->e.intValue()==80)
                .min(Comparator.comparing(e->e.intValue()))
                .orElse(new Integer(10));
        System.out.println(min);
    }
}
