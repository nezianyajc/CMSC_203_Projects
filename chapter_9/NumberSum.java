import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class NumberSum {

    public static int sumList(String input) {

        int sum2;
        StringTokenizer sToken = new StringTokenizer(input, ",");
        String[] numbers = input.split(",");
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            sum2 = Integer.parseInt(sToken.nextToken());
            myList.add(sum2);
        }
        int myListT = myList.stream().mapToInt(Integer::intValue).sum();
        // System.out.println(myListT);
        return myListT;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input;

        System.out.print("Enter numbers separated by commas:");
        input = obj.nextLine();
        System.out.print(sumList(input));
    }
}