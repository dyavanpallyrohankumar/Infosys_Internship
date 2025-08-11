package remaning;

class Customer {
    int Customerid;
    String CustomerName;
    long Customernumber;
    String address;

    Customer(int Customerid, String CustomerName, long Customernumber, String address) {
        this.Customerid = Customerid;
        this.CustomerName = CustomerName;
        this.Customernumber = Customernumber;
        this.address = address;
        displayCustomerDetails();
    }

    Customer() {
        System.out.println("didnt pass any arguements");
    }

    void displayCustomerDetails() {
        System.out.println("the name of the customer is " + CustomerName + " consist id is " + Customerid);
        System.out.println("the details are \n Mobile no: " + Customernumber + " the address is " + address);
    }

    void updateCustomerDetails(String CustomerName, int Customerid, long Customernumber, String address) {
        this.CustomerName = CustomerName;
        this.Customerid = Customerid;
        this.Customernumber = Customernumber;
        this.address = address;
    }

    void paybills() {
    }

    @Override
    public String toString() {
        return "Customer [Customerid=" + Customerid + ", CustomerName=" + CustomerName + ", Customernumber="
                + Customernumber + ", address=" + address + "]";
    }
}

//// exe part

public class CustomerShop {
    public static void main(String[] args) {
        Customer obj1 = new Customer(324876, "Rohankumar", 8919999232L, "korutla");
        Customer obj2 = new Customer();
        // obj1.updateCustomerDetails();
        // obj2.updateCustomerDetails("johns", 4876, 7416787689L, "hyd");
        System.out.println("the new updated details are " + obj1);
        System.out.println("the new updated details are " + obj2);
    }
}