public class Area {

    public static double area(double radius) {
        return Math.PI * (radius * radius);
    }

    public static double area(int width, int length) {
        return length * width;
    }

    public static double area(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String args[]) {
        area(2.0);
        area(3.5, 4.0);
        area(5, 8);
    }

}