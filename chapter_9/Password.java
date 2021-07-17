
public class Password {
    
    
    public static boolean authT(String password) {
        boolean upCase, lowCase, dig;
        upCase = false;
        lowCase = false;
        dig = false;                          
        if(password.length() >= 6) {
            for(int i = 0; i < password.length(); i++){
                if(Character.isLetterOrDigit(password.charAt(i)) == true ){
                    dig = true;
                } 

                if(Character.isUpperCase(password.charAt(i)) == true ){
                    upCase = true;
                } 

                if(Character.isLowerCase(password.charAt(i)) == true ){
                    lowCase = true;
                }

                if((dig && upCase && lowCase) == true){
                    System.out.println("Valid Password");
                    return true;
                } 

                if(dig == false || upCase == false || lowCase == false) {
                    System.out.println("Invalid password");
                    return false;
                }
            }
        } else if(!(password.length() >= 6)) {
            System.out.println("Invalid Password");
        }
        return true;
    }
}

