
public class Password {
    
    
    public static boolean authT(String password) {
        boolean smurf;
        if(password.length() >= 6) {
            // char newPass = password.toCharArray();
            for(int i = 0; i < password.length(); i++)
                if(Character.isLetterOrDigit(password.charAt(i)) && Character.isUpperCase(password.charAt(i)) && Character.isLowerCase(password.charAt(i)) == true) {
                    System.out.println("Valid Password");
                    return true;
                } else {
                    System.out.println("Invalid Pass 2");
                    return false;
                }
        } else if(!(password.length() >= 6)) {
            System.out.println("Invalid Password");
            return false;
        }

        return false;
    }   

}

