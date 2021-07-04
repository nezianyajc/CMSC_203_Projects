import java.util.Scanner;

public class TemperatureNew {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit: ");
        double tempF = scanner.nextDouble();

        Temperature temp = new Temperature(tempF);

        System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
        System.out.println("The temperature in Celsius is " + temp.getCelsius());
        System.out.println("The temperature in Kelvin is " + temp.getKelvin());

    }

}