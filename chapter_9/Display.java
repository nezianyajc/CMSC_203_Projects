import java.util.Scanner;

public class Display {
    Reverse spo = new Reverse();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter string:");
        String str = input.nextLine();
        Reverse.revStr(str);
    }

}