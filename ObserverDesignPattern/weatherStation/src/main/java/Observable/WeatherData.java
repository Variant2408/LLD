package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private  float pressure;

    public WeatherData(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void registerObservers(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob: observers){
            ob.update(temperature,humidity,pressure);
        }
    }

    public void  setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObservers();
    }
}
