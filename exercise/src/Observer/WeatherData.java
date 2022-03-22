package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/22 5:11 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class WeatherData implements Subject{
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }
}
