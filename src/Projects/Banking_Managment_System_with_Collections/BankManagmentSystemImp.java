package Projects.Banking_Managment_System_with_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BankManagmentSystemImp implements BankingManagmentSystem {
    // Map<String, List<BankAccountHolder>> customerDataMap = new HashMap<>();
    Map<String, List<BankAccountHolder>> customerDataMap;

    BankManagmentSystemImp(Map<String, List<BankAccountHolder>> customerDataMap) {
        this.customerDataMap = customerDataMap;
    }

    @Override
    public void addCustomerType(String type) {
        customerDataMap.putIfAbsent(type, new ArrayList<>());
    }

    @Override
    public void addAccountHolder(String type, BankAccountHolder holder) {
        if (!customerDataMap.containsKey(type)) {
            System.out.println("customer type is not in the list. so, please add first");
            return;
        }
        customerDataMap.get(type).add(holder);
    }

    @Override
    public void displayAll() {
        System.out.println(customerDataMap);
    }
}