import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the numbers seperated by comma");
        String input = obj.nextLine();
        String[] str = input.split(",");

        int sum = 0;

        for (int i = 0; i < str.length; i++)

            sum += Integer.parseInt(str[i]);

        System.out.println("Sum of numbers " + input + " is " + sum);

    }

}