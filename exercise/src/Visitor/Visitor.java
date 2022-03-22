package Visitor;

/**
 * Name: Donghang He
 * Date: 2022/3/22 7:01 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public interface Visitor {
    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
