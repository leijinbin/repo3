package org.zktr;

public class OrderDetails {
    private int oId;
    private Product product;
    private int count;
    private double price;

    public OrderDetails() {
    }

    public OrderDetails(int oId, Product product, int count, double price) {
        this.oId = oId;
        this.product = product;
        this.count = count;
        this.price = price;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
