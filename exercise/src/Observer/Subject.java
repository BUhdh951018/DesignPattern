package Observer;

/**
 * Name: Donghang He
 * Date: 2022/3/22 5:10 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
