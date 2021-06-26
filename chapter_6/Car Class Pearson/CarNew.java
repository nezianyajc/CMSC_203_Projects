
public class CarNew {
    public static void main(String[] args) {
        Car car = new Car(1995, "Nissan Pickup");
        for (int ind = 0; ind < 5; ++ind) {
            car.accelerate();
            System.out.println("Speed of the car: " + car.accSpeed());
        }
        for (int ind = 0; ind < 5; ++ind) {
            car.brake();
            System.out.println(" breaking speed of the car: " + car.accSpeed());
        }
    }

}