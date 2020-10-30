package org.zktr;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date date;
    private String orStatus;
    private double price;
    private Person person;
    private List<OrderDetails> details;

    public Order() {
    }

    public Order(int id, Date date, String orStatus, double price, Person person, List details) {
        this.id = id;
        this.date = date;
        this.orStatus = orStatus;
        this.price = price;
        this.person = person;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrStatus() {
        return orStatus;
    }

    public void setOrStatus(String orStatus) {
        this.orStatus = orStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List getDetails() {
        return details;
    }

    public void setDetails(List details) {
        this.details = details;
    }
}
