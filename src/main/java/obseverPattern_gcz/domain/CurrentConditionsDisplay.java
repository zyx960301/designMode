package obseverPattern_gcz.domain;

import obseverPattern_gcz.display.DisplayElement;
import obseverPattern_gcz.observer.Observer;
import obseverPattern_gcz.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current condintions" + temperature + "F degrees and "+humidity + "% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
}
