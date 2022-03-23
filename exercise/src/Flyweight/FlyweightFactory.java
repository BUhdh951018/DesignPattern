package Flyweight;

import java.util.HashMap;

/**
 * Name: Donghang He
 * Date: 2022/3/22 9:36 下午
 * Description:
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }
}
