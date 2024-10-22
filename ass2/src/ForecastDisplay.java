public class ForecastDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast: Conditions are likely to "
                + (pressure > 1000 ? "improve." : "deteriorate."));
    }
}
