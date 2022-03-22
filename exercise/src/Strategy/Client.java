package Strategy;

/**
 * Name: Donghang He
 * Date: 2022/3/22 6:37 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
