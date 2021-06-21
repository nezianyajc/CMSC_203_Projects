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
            while(issueNumber >= 0) {
           
                switch (issueNumber) {   
                case 0:
                System.out.println(" You're done. The WiFi is working");
                issueNumber = -1;
                break;

                case 1: 
                System.out.println("Reboot the computer and try again");
                System.out.println("Did that fix the problem? Enter yes or no.");
                userInput = s.next();
                userInput = userInput.toLowerCase();
                if (userInput.contains("no")){
                    issueNumber = 2;
                } else if(userInput.contains("yes")) {
                    issueNumber = 0;
                }
          
                break;

                case 2: 
                System.out.println("Reboot the router and try to connect");
                System.out.println("Did that fix the problem? Enter yes or no.");
                userInput = s.next();
                userInput = userInput.toLowerCase();
                if (userInput.contains("no")){
                    issueNumber = 3;
                } else {
                    issueNumber = 0;
                }
                break;

                case 3: 
                System.out.println("Make sure the cables connecting to the router are firmly plugged in and power is getting to the router.");
                System.out.println("Did that fix the problem? Enter yes or no.");
                userInput = s.next();
                userInput = userInput.toLowerCase();
                if (userInput.contains("no")){
                    issueNumber = 4;
                } else {
                    issueNumber = 0;
                }
                break;


                case 4: 
                System.out.println("Move the computer closer to the router and try to connect.");
                System.out.println("Did that fix the problem? Enter yes or no.");
                userInput = s.next();
                userInput = userInput.toLowerCase();
                if (userInput.contains("no")){
                    issueNumber = 5;
                } else {
                    issueNumber = 0;
                }
                break;

                
                case 5: 
                if (issueNumber == 5) {
                System.out.println("Contact your ISP");
                issueNumber = -1;
                break;
                }
                break;
                
                }

            }

        }

        
      
    }
}