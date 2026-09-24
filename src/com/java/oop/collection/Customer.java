package com.java.oop.collection;

import java.util.Objects;

public class Customer implements  Comparable<Customer> {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String membership;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(phone, customer.phone) && Objects.equals(membership, customer.membership);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone, membership);
    }

    @Override
    public int compareTo(Customer o) {
        //return this.id - o.id; ascending order
        //return o.id - this.id;
        return this.name.compareTo(o.name);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", membership='" + membership + '\'' +
                '}';
    }

}
