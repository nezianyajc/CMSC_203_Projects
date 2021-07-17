
import java.util.Scanner;

public class DisplayTwo {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter password");
        String passCode = input.nextLine();
        Password.authT(passCode);
        
    }

}