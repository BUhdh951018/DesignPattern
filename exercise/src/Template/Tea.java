package Template;

/**
 * Name: Donghang He
 * Date: 2022/3/22 6:49 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
