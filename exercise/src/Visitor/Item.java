package Visitor;

/**
 * Name: Donghang He
 * Date: 2022/3/22 7:14 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Item implements Element{

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
