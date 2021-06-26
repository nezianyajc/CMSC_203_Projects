public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int nModel, String nMake) {
        yearModel = nModel;
        make = nMake;
        speed = 0;

    }

    public int accYearModel() {
        return yearModel;
    }

    public String accMake() {
        return make;
    }

    public int accSpeed() {
        return speed;
    }

    public void accelerate() {
        speed = speed + 5;
    }

    public void brake() {
        speed = speed - 5;
    }
}