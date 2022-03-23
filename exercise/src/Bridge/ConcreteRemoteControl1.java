package Bridge;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:29 下午
 * Description:
 */
public class ConcreteRemoteControl1 extends RemoteControl{
    public ConcreteRemoteControl1(Tv tv) {
        super(tv);
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void tuneChannel() {
        tv.tuneChannel();
    }
}
