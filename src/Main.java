import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
           Scanner userTemperature = new Scanner(System.in);
          System.out.println("Enter the temperature:");
        double temperature = userTemperature.nextDouble();
          System.out.println("You have entered " + temperature);
        //double temperature = 34.7;
        System.out.println("temperature in Celsius= "+ new ConvertCelsius().ConvertedTemperature(temperature));
        System.out.println("temperature in Kelvin = " + new ConvertKelvin().ConvertedTemperature(temperature));
        System.out.println("temperature in Fahrenheit = " + new ConvertFahrenheit().ConvertedTemperature(temperature));
        System.out.println("temperature in Reamure = " + new ConvertReamure().ConvertedTemperature(temperature));
    }
}