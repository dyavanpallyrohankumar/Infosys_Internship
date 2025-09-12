package Projects.Banking_Managment_System_with_Collections;

public class BankAccountHolder {
    private String name;
    private String accountnumber;

    BankAccountHolder(String name, String accountnumber) {
        this.name = name;
        this.accountnumber = accountnumber;
    }

    @Override
    public String toString() {
        return "BankAccountHolder [name=" + name + ", accountnumber=" + accountnumber + "]";
    }
}