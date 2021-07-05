public class projectOne {

    public static void showVals(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                System.out.println(array[i]);
            }

        }
    }

    public static void main(String[] args) {
        int numsA, numsB;
        numsA = 3;
        numsB = 12;
        int[] arrayA = { 1, 5, 10, 2, 4, -3, 6 };
        int[] arrayB = { 10, 12, 15, 24 };

        showVals(arrayA, 3);
        showVals(arrayB, 12);

    }
}