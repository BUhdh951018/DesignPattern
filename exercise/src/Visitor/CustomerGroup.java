package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/22 7:05 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer : customers)
            customer.accept(visitor);
    }

    void addCustomer(Customer customer){
        customers.add(customer);
    }
}
