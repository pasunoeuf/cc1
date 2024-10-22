public class StatisticsDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics Display: Avg Temp: " + temperature + "°C, Avg Humidity: "
                + humidity + "%, Avg Pressure: " + pressure + " hPa");
    }
}
