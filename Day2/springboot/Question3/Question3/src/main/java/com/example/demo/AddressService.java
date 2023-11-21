package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 

public class AddressService {
    private List<Address> address=new ArrayList<>(Arrays.asList(new Address("1000", "Akhila", "Nellore", "India"),
            new Address("1001", "Alekhya", "Kavali", "India"), new Address("1002", "Madhu", "Athmakur", "India")));

 

    public Address getTopic(String id) {
         return address.stream().filter(t -> t.getZipCode().equals(id)).findFirst().get();
    }


}