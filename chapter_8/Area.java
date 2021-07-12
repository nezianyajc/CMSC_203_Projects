public class Area {

    private static double p = Math.PI;

    public static double getArea(double radius) {
        return p * Math.pow((radius), 2);
    }

    public static double getArea(int width, int length) {
        double area;
        area = length * width;
        return area;
    }

    public static double getArea(double height, double radius) {
        return p * Math.pow((radius), 2) * height;
    }

}