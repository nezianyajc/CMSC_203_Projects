import java.util.Scanner;

public class Reverse {

    public static void revStr(String stri) {
        String newStr = "";
        int l = stri.length();

        for (int i = (l - 1); i >= 0; i--) {
            newStr = newStr + stri.substring(i, i + 1);
        }
        System.out.println(newStr);
    }

}
