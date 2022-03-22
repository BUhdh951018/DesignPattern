package Template;

/**
 * Name: Donghang He
 * Date: 2022/3/22 6:50 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("---------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
