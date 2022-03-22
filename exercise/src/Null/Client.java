package Null;

/**
 * Name: Donghang He
 * Date: 2022/3/22 7:52 下午
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        AbstractOperation abstractOperation = func(-1);
        abstractOperation.request();
    }

    public static AbstractOperation func(int para) {
        return para < 0 ? new NullOperation() : new RealOperation();
    }
}
