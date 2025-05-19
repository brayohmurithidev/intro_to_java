import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        //convert from Celcius to fahrenheit
        double temperature;
        Scanner input = new Scanner(System.in); //object for scanner class
        temperature = input.nextDouble();
        temperature = (temperature * 1.8) + 32;
        System.out.println("Temperature is " + temperature);
    }
}
