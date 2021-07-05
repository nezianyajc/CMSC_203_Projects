import java.util.ArrayList;

public class projectTwo {

    public static void main(String[] args) {
        String getArrayList;
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Hello");
        testList.add("world");
        testList.add("goodbye");
        getArrayList = f(testList);
        System.out.println("The first character of each string " + getArrayList);

    }

    public static String f(ArrayList<String> testList) {
        String hwg = "";
        for (String test : testList) {
            hwg = hwg + test.charAt(0);
        }
        return hwg;
    }
}