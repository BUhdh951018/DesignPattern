package Decorator;

/**
 * Name: Donghang He
 * Date: 2022/3/22 9:19 下午
 * Description:
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
