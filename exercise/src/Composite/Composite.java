package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/22 8:55 下午
 * Description:
 */
public class Composite extends Component{

    private List<Component> child;

    public Composite(String name) {
        super(name);
        child = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++)
            System.out.print("--");
        System.out.println("Composite: " + name);
        for (Component component : child)
            component.print(level + 1);
    }

    @Override
    public void remove(Component component) {
        child.remove(component);
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }
}
