package Strategy;

/**
 * Name: Donghang He
 * Date: 2022/3/22 6:36 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Duck {

    private QuackBehavior quackBehavior;

    public void performQuack() {
        if (quackBehavior != null)
            quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
