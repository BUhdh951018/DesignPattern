package Template;

/**
 * Name: Donghang He
 * Date: 2022/3/22 6:49 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
