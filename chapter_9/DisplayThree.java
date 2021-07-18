import java.util.Scanner;

public class DisplayThree {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input;

        System.out.print("Enter numbers separated by commas:");
        input = obj.nextLine();
        NumberSum.sumList(input);
    }
}