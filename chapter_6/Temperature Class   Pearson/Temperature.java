
public class Temperature {
    private double ftemp = 0;

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public double getCelsius() {
        double convert = (ftemp - 32);
        return (5.0 / 9.0) * convert;

    }

    public double getKelvin() {
        return getCelsius() + 273;

    }

}