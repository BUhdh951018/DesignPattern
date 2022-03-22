package Template;

/**
 * Name: Donghang He
 * Date: 2022/3/22 6:47 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }
}
