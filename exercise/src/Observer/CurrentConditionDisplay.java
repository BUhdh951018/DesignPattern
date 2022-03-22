package Observer;

/**
 * Name: Donghang He
 * Date: 2022/3/22 5:21 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class CurrentConditionDisplay implements Observer{

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        System.out.println("CurrentConditionDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
