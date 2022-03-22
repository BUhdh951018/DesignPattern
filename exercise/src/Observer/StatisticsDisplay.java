package Observer;

/**
 * Name: Donghang He
 * Date: 2022/3/22 5:12 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class StatisticsDisplay implements Observer{

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public void update(double temp, double humidity, double pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
