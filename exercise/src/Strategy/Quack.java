package Strategy;

/**
 * Name: Donghang He
 * Date: 2022/3/22 6:28 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
