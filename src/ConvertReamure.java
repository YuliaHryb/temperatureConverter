public class ConvertReamure implements BaseTempConverter{
    @Override
    public double ConvertedTemperature(double basicCelsius) {
        return basicCelsius * 0.8;
    }
}
