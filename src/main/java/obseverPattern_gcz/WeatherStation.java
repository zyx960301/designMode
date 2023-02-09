package obseverPattern_gcz;

import obseverPattern_gcz.domain.CurrentConditionsDisplay;
import obseverPattern_gcz.domain.ForecastDisplay;
import obseverPattern_gcz.domain.StaticDisplay;
import obseverPattern_gcz.domain.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);
        weatherData.setMeasurements(23,45,30.45f);
        weatherData.setMeasurements(20,32,10.45f);
        weatherData.setMeasurements(24,46,35.45f);
    }
}
