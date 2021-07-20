
public class Property {

    private String propertyName, city, owner;
    private double rentalAmount;
    private Plot plot;
    private Property[] properties;
    private final int MAX_PROPERTY = 5;

    public Property(String nam, String cit, double rent, String own, int x, int y, int width, int depth) {
        this.propertyName = nam;
        this.city = cit;
        this.owner = own;
        this.rentalAmount = rent;
        this.plot = new Plot(x, y, width, depth);
    }

    public Property() {
        propertyName = "";
        city = "";
        rentalAmount = 0;
        owner = "";
        this.plot = new Plot(0, 0, 1, 1);
    }

    public Property(Property p) {
        this.propertyName = p.propertyName;
        this.city = p.city;
        this.owner = p.owner;
        this.rentalAmount = p.rentalAmount;
        this.plot = p.plot;
    }

    public Property(String nam, String cit, double rent, String own) {
        this.propertyName = nam;
        this.city = cit;
        this.owner = own;
        this.rentalAmount = rent;
    }

    public Plot getPlot() {
        return plot;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getCity() {
        return city;
    }

    public String getOwner() {
        return owner;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(double rent) {
        this.rentalAmount = rent;
    }

    public void setPlot(int x, int y, int width, int depth) {
        this.plot = new Plot(x, y, width, depth);
    }

    public void setName(String nam) {
        this.propertyName = nam;
    }

    public void setCity(String cit) {
        this.city = cit;
    }

    public void setOwner(String own) {
        this.owner = own;
    }

    public String toString() {
        String str = "Name of property" + propertyName + "n" + "Location: " + city + "\n" + "Property Owner" + owner
                + "\n" + "Rent cost" + rentalAmount;
        return str;
    }

}
