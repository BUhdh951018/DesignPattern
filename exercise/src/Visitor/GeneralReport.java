package Visitor;

/**
 * Name: Donghang He
 * Date: 2022/3/22 7:24 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class GeneralReport implements Visitor{

    private int customerNo;
    private int orderNo;
    private int itemNo;

    @Override
    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customerNo++;
    }

    @Override
    public void visit(Order order) {
        System.out.println(order.getName());
        orderNo++;
    }

    @Override
    public void visit(Item item) {
        System.out.println(item.getName());
        itemNo++;
    }

    public void displayResult() {
        System.out.println("Number of customers: " + customerNo);
        System.out.println("Number of orders: " + orderNo);
        System.out.println("Number of items: " + itemNo);
    }
}
