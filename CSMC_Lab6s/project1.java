import java.util.Scanner;

import javax.xml.namespace.QName;

class Person {
    private String name, address, telephone;

    public Person() {
        this.name = "";
        this.address = "";
        this.telephone = "";
    }

    public void setName(String name) {
        this.name = name;
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
        customer.setAddress(address);
        System.out.print("Enter Phone number of customer: ");
        String tele = obj.nextLine();
        customer.setTelephone(tele);
        System.out.print("Enter customer number: ");
        String cus = obj.nextLine();
        customer.setCusNum(cus);
        System.out.print("Enter yes/no -- does the customer want to recieve mail?: ");
        String mailing = "";
        mailing = obj.nextLine();
        if (mailing.contains(("yes").toLowerCase())) {
            customer.setMail(true);
        } else if (mailing.contains("no")) {
            customer.setMail(false);
        }
        System.out.println("Customer: " + customer.getcustomer());
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

    public void setMail(boolean mail) {
        this.mail = mail;
    }

}