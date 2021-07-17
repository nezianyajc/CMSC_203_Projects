
public class Password {
    
    
    public static boolean authT(String password) {
        boolean upCase, lowCase, dig;
        upCase = false;
        lowCase = false;
        dig = false;                          
        if(password.length() >= 6) {
            for(int i = 0; i < password.length(); i++){
                if(Character.isLetterOrDigit(password.charAt(i)) == true ){
                    System.out.println("Condition met");
                    dig = true;
                } else {
                    System.out.println("Invalid Password 1");
                }

                if(Character.isUpperCase(password.charAt(i)) == true ){
                    System.out.println("Condition2 met");
                    upCase = true;
                } else {
                    System.out.println("Invalid Password 2");
                }

                if(Character.isLowerCase(password.charAt(i)) == true ){
                    System.out.println("Condition3 met");
                    lowCase = true;
                } else {
                    System.out.println("Invalid Password 3");
                }

                if((dig && upCase && lowCase) == true){
                    System.out.println("Valid Password");
                    return true;
                } else if((dig || upCase || lowCase) == false) {
                    System.out.println("Invalid Password final pass");
                    return false;
                }
            }
        } else if(!(password.length() >= 6)) {
            System.out.println("Invalid Password");
        }
        return true;
    }
}

