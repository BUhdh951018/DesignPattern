package Adapter;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:09 下午
 * Description:
 */
public class TurkeyAdapter implements Duck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
