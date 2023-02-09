package obseverPattern_gcz.domain;

import obseverPattern_gcz.observer.Observer;
import java.util.Observable;

public class WeatherDataNew extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements( float temperature,float humidity,float pressure){
        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
