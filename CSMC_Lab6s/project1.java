import java.util.Scanner;

class Person {
    private String name, address, telephone;

    public Person() {
        this.name = "";
        this.address = "";
        this.telephone = "";
    }

    public void setName(String a) {
        this.name = a;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setTelephone(String a) {
        this.telephone = a;
    }

    public String getTelephone() {
        return telephone;
    }

    public static void main(String[] args) {

        Customer customer = new Customer();
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name of customer:");
        String name = obj.nextLine();
        customer.setName(name);
        System.out.print("Enter address of customer:");
        String address = obj.nextLine();
        customer.setName(address);
        System.out.print("Enter Phone number of customer: ");
        String tele = obj.nextLine();
        customer.setTelephone(tele);
        System.out.print("Enter customer number: ");
        String cus = obj.nextLine();
        customer.setCusNum(cus);
        System.out.print("Enter yes/no -- does the customer want to recieve mail?: ");
        String mailing = obj.nextLine();
        customer.setMail(Boolean.parseBoolean(mailing));
        System.out.println("Customer: ");
        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getTelephone());
        System.out.println("Customer Number: " + customer.getcustomer());
        System.out.println("Receive Mail?: " + customer.checkMail());

    }
}

class Customer extends Person {
    String customerNumber;
    boolean mail;

    public Customer() {
        super();
        this.customerNumber = "";
        this.mail = false;
    }

    public String getcustomer() {
        return customerNumber;
    }

    public void setCusNum(String a) {
        this.customerNumber = a;
    }

    public boolean checkMail() {
        return mail;
    }

    public void setMail(boolean s) {
        this.mail = s;
    }

}