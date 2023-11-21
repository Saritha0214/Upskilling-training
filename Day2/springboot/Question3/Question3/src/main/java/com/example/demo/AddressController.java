package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class AddressController {
    private AddressService addressService=new AddressService();

    @RequestMapping("/address/{id}")
    public Address getTopic(@PathVariable String id) {
        return (addressService).getTopic(id);
    }

 

}