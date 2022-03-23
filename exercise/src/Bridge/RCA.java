package Bridge;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:26 下午
 * Description:
 */
public class RCA extends Tv{
    @Override
    public void on() {
        System.out.println("RCA.on");
    }

    @Override
    public void off() {
        System.out.println("RCA.off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("RCA.tuneChannel");
    }
}
