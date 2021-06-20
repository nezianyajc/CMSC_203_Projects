import java.util.Scanner;

public class WiFiDiagnosis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userName, userInput;
        int issueNumber = 0;

        System.out.println("WiFi Diagnosis is Working!");
        // Basic test
        System.out.println(" Please enter your name ");
        // Prompt to personalize the program
        userName = s.next();
        

        System.out.print(" Are you having trouble with your WiFi " + userName + " ?");
        userInput = s.next();
        userInput = userInput.toLowerCase();
    
        if(userInput.contains("no")) {
            System.out.println(" You're done. The WiFi is working");

        } else if(userInput.contains("yes")){
            System.out.println("Please enter the number 1");
            issueNumber = s.nextInt();
            while(issueNumber != 0) {
                switch (issueNumber) {
                case 0:
                System.out.println(" You're done. The WiFi is working");
                break;

                case 1: 
                System.out.println("Reboot the computer and try again");
                System.out.println("Did that fix the problem? If the problem is fixed enter 0 if not enter 2");
                issueNumber = s.nextInt();
                break;

                case 2: 
                System.out.println("Reboot the router and try to connect");
                System.out.println("Did that fix the problem? If the problem is fixed enter 0 if not enter 3");
                issueNumber = s.nextInt();
                break;

                case 3: 
                System.out.println("Reboot the router and try to connect");
                System.out.println("Did that fix the problem? If the problem is fixed enter 0 if not enter 4");
                issueNumber = s.nextInt();
                break;
                }

            }
               

        }

        
      
    }
}