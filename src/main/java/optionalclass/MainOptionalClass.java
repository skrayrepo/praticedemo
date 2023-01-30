package optionalclass;

import dao.CustomerDAO;
import dao.CustomerEmptyDAO;
import pojo.Card;
import pojo.Customer;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainOptionalClass {
    public static void main(String[] args) {
        List<Customer> custList = CustomerEmptyDAO.getCustomerList();
        custList.forEach(System.out::println);
        List<Card> card = OptionalHelperClass.getCardInfo(104);
        Optional.ofNullable(card)
                .ifPresent(c->System.out.println(c));

        Long phoneNumber = OptionalHelperClass.getPhone(104);
        System.out.println(phoneNumber);
       /* Card card1 = card.stream()
                .filter(c->c.get)
                .findAny().orElse(null);
        System.out.println(card1);*/
    }
}
