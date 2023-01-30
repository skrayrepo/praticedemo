package optionalclass;

import dao.CustomerDAO;
import dao.CustomerEmptyDAO;
import pojo.Address;
import pojo.Card;
import pojo.Customer;

import java.util.List;
import java.util.Optional;

public class OptionalHelperClass {
    public static List<Card> getCardInfo(Integer customerCode){
        List<Customer> list = CustomerEmptyDAO.getCustomerList();
        Optional card = null;
        for(Customer cust:list){
            if(cust.getCustomerCode().equals(customerCode)){
                card = Optional.ofNullable(cust.getCard());
                if(card.isPresent()){
                    return cust.getCard();
                }
            }
        }
        return null;
    }

    public static Long getPhone(Integer customerCode){
        List<Customer> list = CustomerEmptyDAO.getCustomerList();
        Long phoneNumber = 000000l;
        for(Customer customer:list){
            if(customer.getCustomerCode().equals(customerCode)){
                Optional<Address> addr = Optional.ofNullable(customer.getAddress());
                 phoneNumber = addr.map(a->a.getPhoneNumer())
                        .orElse(1111111l);
            }
        }
        return phoneNumber;
    }
}
