public class Area {

    public static double getArea(double radius) {
        return Math.PI * Math.pow((radius), 2);
    }

    public static double getArea(double width, double length) {
        return length * width;
    }

    public static double getArea(double pi, double height, double radius) {
        return pi * radius * radius * height;
    }

}