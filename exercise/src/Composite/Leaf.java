package Composite;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:55 下午
 * Description:
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++)
            System.out.print("--");
        System.out.println("left: " + name);
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }
}
