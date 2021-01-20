package com.example.springangular.entity;

import javax.persistence.*;

/**
 * @author heshan_c on 1/20/2021
 */
@Entity
@Table(name = "EmployeeList")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false,length = 50)
    private String firstName;

    @Column(name = "last_name",nullable = false,length = 50)
    private String lastName;

    @Column(name = "email_id",nullable = false,unique = false,length = 25)
    private String emailId;

    @Column(name = "city",nullable = false,length = 50)
    private String city;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String emailId, String city) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
