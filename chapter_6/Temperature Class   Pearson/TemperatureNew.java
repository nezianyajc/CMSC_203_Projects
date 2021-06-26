import java.util.Scanner;

public class TemperatureNew {

    private double inp = 0;

    public static void main(String[] args) {

        Scanner tempObj = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit Temperature: ");
        double inp = tempObj.nextDouble();

        Temperature temp = new Temperature(inp);
        temp.setFahrenheit(inp);

        System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
        System.out.println("The temperature in Celsius is " + temp.getCelsius());
        System.out.println("The temperature in Kelvin is " + temp.getKelvin());

    }

}