package obseverPattern_gcz;
import obseverPattern_gcz.domain.*;

public class WeatherStationNew {
    public static void main(String[] args) {
        WeatherDataNew weatherDataNew = new WeatherDataNew();
        CurrentConditionsDisplayNew currentConditionsDisplayNew = new CurrentConditionsDisplayNew(weatherDataNew);
        weatherDataNew.setMeasurements(12,123,233f);
        weatherDataNew.setMeasurements(11,3,323f);
        weatherDataNew.setMeasurements(2,1,223f);
    }
}
