package org.zktr;

public class Product {
    private int proid;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int proid, String name, double price) {
        this.proid = proid;
        this.name = name;
        this.price = price;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
