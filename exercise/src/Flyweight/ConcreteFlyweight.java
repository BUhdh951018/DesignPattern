package Flyweight;

/**
 * Name: Donghang He
 * Date: 2022/3/22 9:36 下午
 * Description:
 */
public class ConcreteFlyweight implements Flyweight{

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
