public class WeatherData {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();


        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();


        station.addObserver(currentDisplay);
        station.addObserver(statsDisplay);
        station.addObserver(forecastDisplay);


        System.out.println("First update:");
        station.setWeatherData(25.5f, 65.0f, 1013.0f);

        System.out.println("\nSecond update:");
        station.setWeatherData(22.3f, 70.0f, 1005.0f);
    }
}
