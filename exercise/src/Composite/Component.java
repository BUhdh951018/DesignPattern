package Composite;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:55 下午
 * Description:
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void remove(Component component);
}
