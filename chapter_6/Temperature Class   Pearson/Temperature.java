
public class Temperature {
    private double ftemp;

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
        ftemp = convert * (5.0 / 9.0);
        return ftemp;
    }

    public double getKelvin() {
        double convert = (ftemp - 32);
        ftemp = convert * (5.0 / 9.0) + 273;
        return ftemp;
    }

}