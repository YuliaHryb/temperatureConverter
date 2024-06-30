public class ConvertKelvin implements BaseTempConverter{

    public double ConvertedTemperature(double basicCelsius) {
        return basicCelsius + 273.15;
    }
}
