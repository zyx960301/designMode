package obseverPattern_gcz.domain;

import obseverPattern_gcz.display.DisplayElement;

import java.util.Observable;
import java.util.Observer;
import obseverPattern_gcz.subject.Subject;

public class CurrentConditionsDisplayNew implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherDataNew;
    public CurrentConditionsDisplayNew(Observable weatherDataNew) {
        this.weatherDataNew = weatherDataNew;
        weatherDataNew.addObserver(this);
    }

    public void display() {
        System.out.println("Current condintions" + temperature + "F degrees and "+humidity + "% humidity" + "new new new");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataNew){
            WeatherDataNew weatherDataNew = (WeatherDataNew)o;
            this.temperature = weatherDataNew.getTemperature();
            this.humidity = weatherDataNew.getHumidity();
            display();
        }
    }

}
