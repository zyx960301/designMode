package obseverPattern_gcz.domain;

import obseverPattern_gcz.display.DisplayElement;
import obseverPattern_gcz.observer.Observer;
import obseverPattern_gcz.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
        private float temperature;
        private Subject weatherData;

        public ForecastDisplay(Subject weatherData) {
            this.weatherData = weatherData;
//            weatherData.registerObserver(this);
        }

        public void display() {
            System.out.println("Current condintions" + temperature );

        }

        public void update(float temperature, float humidity, float pressure) {
            this.temperature = temperature;
            display();
        }

}
