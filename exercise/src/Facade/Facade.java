package Facade;

/**
 * Name: Donghang He
 * Date: 2022/3/22 9:27 下午
 * Description:
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
