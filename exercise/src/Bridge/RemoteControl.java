package Bridge;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:27 下午
 * Description:
 */
public abstract class RemoteControl {
    protected Tv tv;

    public RemoteControl(Tv tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
