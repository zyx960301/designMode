package obseverPattern_gcz.domain;

import obseverPattern_gcz.display.DisplayElement;
import obseverPattern_gcz.observer.Observer;
import obseverPattern_gcz.subject.Subject;

public class StaticDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StaticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current condintions" + temperature + "F degrees and "+humidity + "% humidity"+ pressure+ "pressure");

    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
