package Adapter;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:09 下午
 * Description:
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
