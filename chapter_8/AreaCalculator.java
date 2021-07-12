import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner obj = new Scanner(System.in);

        System.out.println(
                "Enter radius to calculate circle area: Enter width to calculate rectangle area: Enter length to calculate rectangle area: Enter base radius to calculate cylinder area: Enter height to calculate cylinder area: ");

        System.out.print("Enter radius to calculate circle area: 2.0");
        Double radius = obj.nextDouble();

        System.out.print("Enter width to calculate rectangle area: 3.5");
        Double width = obj.nextDouble();

        System.out.print("Enter length to calculate rectangle area: 4.0");
        Double length = obj.nextDouble();

        System.out.print("Enter base radius to calculate cylinder area 8.0");
        Double baseRadius = obj.nextDouble();

        System.out.print("Enter height to calculate cylinder area 5.7");
        Double height = obj.nextDouble();

        System.out.println("The area of the circle is " + Area.getArea(radius));
        System.out.println("The area of the rectangle is " + Area.getArea(width, length));
        System.out.println("The area of the cylinder is " + Area.getArea(height, radius));

    }
}