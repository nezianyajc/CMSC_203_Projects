
public class PasswordVerifier{
    
    
    public static boolean authT(String password) {
        boolean upCase, lowCase, dig, fin;
        upCase = false;
        lowCase = false;
        dig = false;
        fin = false;                          
        if(password.length() >= 6) {
            for(int i = 0; i < password.length(); i++){
                if(Character.isLetterOrDigit(password.charAt(i)) == true ){
                    dig = true;
                } 
                if(Character.isDigit(password.charAt(i)) == true ){
                    fin = true;
                } 

                if(Character.isUpperCase(password.charAt(i)) == true ){
                    upCase = true;
                } 

                if(Character.isLowerCase(password.charAt(i)) == true ){
                    lowCase = true;
                }

            }

            if((dig && upCase && lowCase && fin) == true){
                System.out.println("Valid Password");
                return true;
            } 

            if(dig == false || upCase == false || lowCase == false || fin == false) {
                System.out.println("Invalid password ");
                return false;
            }
        } else if(!(password.length() >= 6)) {
            System.out.println("Invalid Password");
        }
        return false;
    }
}

