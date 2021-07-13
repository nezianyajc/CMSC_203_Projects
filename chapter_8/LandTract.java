import java.util.Scanner;

public class LandTract {
    private int length;
    private int width;

    public int area() {
        return length * width;
    }

    public boolean equals(LandTract land) {
        if (length == land.length && width == land.width) {
            return true;
        } else if (length == land.width && width == land.length) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "LandTract with length " + length + ", width " + width;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        LandTract land1 = new LandTract();
        LandTract land2 = new LandTract();

        System.out.print("Enter length of first land tract:");
        land1.length = obj.nextInt();
        System.out.print("Enter width of first land tract:");
        land1.width = obj.nextInt();
        System.out.print("Enter length of Second land tract:");
        land2.length = obj.nextInt();
        System.out.print("Enter width of Second land tract:");
        land2.width = obj.nextInt();
        System.out.println(land1.toString() + " and area " + land1.area());
        System.out.println(land2.toString() + " and area " + land2.area());
        System.out.println(land1.equals(land2) ? "The two tracks have same size" : "two tracks have different size");
    }

}
