package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/22 7:01 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Customer implements Element{

    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
