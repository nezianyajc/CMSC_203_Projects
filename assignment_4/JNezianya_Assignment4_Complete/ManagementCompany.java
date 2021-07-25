import javafx.scene.layout.Region;

public class ManagementCompany {

    private final int MAX_PROPERTY = 5;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    private Property[] properties;
    private String name, taxID;
    private double mgmtFee;
    private Plot plot;

    public ManagementCompany() {
        // TODO Auto-generated constructor stub
        this.name = "";
        this.taxID = "";
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];

    }

    public ManagementCompany(String name, String taxID, double mgmtFee) {
        properties = new Property[MAX_PROPERTY];
        this.name = name;
        this.taxID = taxID;
        this.mgmtFee = mgmtFee;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
    }

    // Second Company
    public ManagementCompany(ManagementCompany newCompany) {
        properties = new Property[MAX_PROPERTY];
        name = newCompany.name;
        taxID = newCompany.taxID;
        mgmtFee = newCompany.mgmtFee;
        plot = newCompany.plot;
    }

    public ManagementCompany(String name, String taxID, double mgmtFee, int x, int y, int width, int depth) {
        properties = new Property[MAX_PROPERTY];
        this.name = name;
        this.taxID = taxID;
        this.mgmtFee = mgmtFee;
        this.plot = new Plot(x, y, width, depth);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public void setMgmFee(double mgmtFee) {
        this.mgmtFee = mgmtFee;
    }

    public void setPlot(Plot plot) {
        this.plot = new Plot(plot);
    }

    public String getName() {
        return name;
    }

    public String getTaxID() {
        return taxID;
    }

    public double getMgmFee() {
        return mgmtFee;
    }

    public Plot getPlot() {
        return new Plot(plot);
    }

    public int getMAX_PROPERTY() {
        return MAX_PROPERTY;
    }

    public double maxRentProp() {

        Property house = new Property();

        double maxRent = 0; // track max rent

        for (int i = 0; i < properties.length; i++) {
            properties[i] = house;
            if (properties[0].getRentalAmount() < properties[i].getRentalAmount()) {
                maxRent = properties[i].getRentalAmount();
            }
        }
        return maxRent;
    }

    public double totalRent() {
        int total = 0; // track sum

        // property
        Property home = new Property();

        for (int i = 0; i < properties.length; i++) {
            properties[i] = home;
            total += properties[i].getRentalAmount();
        }
        return total;
    }

    public int addProperty(Property property) {

        // create a property array to hold each property

        Property home = new Property(property);

        int accum = 0;

        for (int i = 0; i < MAX_PROPERTY; i++) {

            properties[i] = property;

            if (property.equals(null)) {
                accum = -2;
            } else if (properties[0].getPlot().encompasses(properties[i].getPlot())) {
                accum = -3;

            } else if (properties[i].getPlot().overlaps(properties[0].getPlot())) {
                accum = -4;
            } else if (properties.length == MAX_PROPERTY) {
                accum = -1;
            } else if (!home.equals(null)) {
                properties[i] = home;
                accum = i;
            }
        }
        // record sum of properties entered
        return accum;
    }

    public int addProperty(String name, String city, double rent, String owner) {

        Property home = new Property(name, city, rent, owner);
        int accum = 0;

        for (int i = 0; i < properties.length; i++) {
            if (home.equals(null)) {
                accum = -2;
            } else if (properties[0].getPlot().encompasses(properties[i].getPlot())) {
                accum = -3;

            } else if (properties[i].getPlot().overlaps(properties[0].getPlot())) {
                accum = -4;
            } else if (properties.length == MAX_PROPERTY) {
                accum = -1;
            } else if (!properties[i].equals(null)) {
                properties[i] = home;
                accum = i;
            }
        }

        return accum;

    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {

        Property house = new Property(name, city, rent, owner, x, y, width, depth);

        int accum = 0;

        for (int i = 0; i < properties.length; i++) {
            if (house.equals(null)) {
                accum = -2;
            } else if (properties[0].getPlot().encompasses(properties[i].getPlot())) {
                accum = -3;

            } else if (properties[i].getPlot().overlaps(properties[0].getPlot())) {
                accum = -4;
            } else if (properties.length == MAX_PROPERTY) {
                accum = -1;
            } else if (!properties[i].equals(null)) {
                properties[i] = house;
                accum = i;
            }
        }

        return accum;
    }

    private String displayPropertyAtIndex(int i) {

        String str = properties[i].toString();
        return str;

    }

}
