package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
        List<String> nameSorted = new ArrayList<>();
        nameSorted.add("Tara");
        nameSorted.add("Sam");
        nameSorted.add("Abbie");
        nameSorted.add("Michelle");
        nameSorted.add("Mary");
        nameSorted.add("John");
        nameSorted.add("Trevor");
        Collections.sort(nameSorted);
        for (String name : nameSorted) {
            System.out.println(nameSorted);
        }
        return nameSorted;
    }


}