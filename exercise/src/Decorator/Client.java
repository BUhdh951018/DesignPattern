package Decorator;

/**
 * Name: Donghang He
 * Date: 2022/3/22 9:17 下午
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlond();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}
