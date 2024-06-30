public class ConvertFahrenheit implements BaseTempConverter{

    public double ConvertedTemperature(double basicCelsius) {
        return (basicCelsius * 9/5) + 32;
    }
}
