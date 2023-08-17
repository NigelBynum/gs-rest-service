package com.example.accessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // blueprint for a specific type of object that we want to store in a database.
        // saving "Customer" class inside a database
public class Customer {

    @Id // Annotated with @Id so that JPA recognizes it as the object’s ID
    @GeneratedValue(strategy=GenerationType.AUTO)
    // @GeneratedValue assigns value to @Id
    //  like an automated system that ensures each customer gets a different ID
    //  without us having to manually come up with and set the IDs ourselves.

    // The strategy=GenerationType.AUTO part is like telling this automated system
    // how to come up with the unique IDs. It's saying, "Hey, computer, you figure
    // out the best way to generate these IDs automatically." It's like giving the computer
    // the freedom to choose the most suitable method for generating these IDs based on
    // The specific database system being used.

    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {} //"protected"  means only certain parts of the program
                            // can use or access it.

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // This method is overridden from the Object class to provide a customized string representation of the object.
    // It returns a formatted string containing the id, firstName, and lastName of the customer.

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    // These methods are public "getter" methods that allow other classes to access
    // the private fields of the Customer.
    // They provide a way to retrieve the id, firstName, and lastName of a customer.
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

