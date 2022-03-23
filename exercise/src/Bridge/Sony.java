package Bridge;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:24 下午
 * Description:
 */
public class Sony extends Tv{
    @Override
    public void on() {
        System.out.println("Sony.on");
    }

    @Override
    public void off() {
        System.out.println("Sony.off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony.tuneChannel");
    }
}
