package com.example.accessingdatajpa;

import java.util.List;

// This line brings in another special toolset provided by Spring
import org.springframework.data.repository.CrudRepository;

//By extending CrudRepository, CustomerRepository inherits several methods for
// working with Customer persistence, including methods for saving, deleting, and finding Customer entities.

// This is like a recipe book for managing customers.
// It uses the tools from CrudRepository to do this.
public interface CustomerRepository extends CrudRepository<Customer, Long> {


    // This is a method to find customers by their last name.
    // It's like saying, "Hey, recipe book, give me a list of customers with this last name."
    List<Customer> findByLastName(String lastName);

    // This method finds a customer by their unique ID.
    // It's like saying, "Hey, recipe book, give me the customer with this ID."

    Customer findById(long id);
}