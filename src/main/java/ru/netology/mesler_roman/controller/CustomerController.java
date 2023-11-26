package ru.netology.mesler_roman.controller;


import org.springframework.web.bind.annotation.*;
import ru.netology.mesler_roman.controller.dto.CustomerDTO;
import ru.netology.mesler_roman.controller.dto.CustomersGetResponse;
import ru.netology.mesler_roman.domain.Customer;
import ru.netology.mesler_roman.service.CustomerService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/customers/")
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public CustomersGetResponse getCustomers(){
        List<Customer> customers = customerService.getCustomers();
        List<CustomerDTO> customerDTOS = customers.stream()
                .map(customer -> new CustomerDTO(customer.getId(), customer.getName()))
                .collect(Collectors.toList());
        return new CustomersGetResponse(customerDTOS);
    }

    @GetMapping("{id}")
    public CustomerDTO getCustomer(@PathVariable("id") int id){
        Customer customer = customerService.getCustomer(id);
        return new CustomerDTO(customer.getId(), customer.getName());
    }
    @PostMapping
    public CustomerDTO addCustomer(int id, String name){
        customerService.addUser(id, name);
        Customer customer = customerService.getCustomer(id);
        return new CustomerDTO(customer.getId(),customer.getName());
    }
}
