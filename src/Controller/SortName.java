package Controller;

import Model.Customer;

import java.util.Comparator;

public class SortName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getNameCustomer().compareTo(o2.getNameCustomer());
    }
}
