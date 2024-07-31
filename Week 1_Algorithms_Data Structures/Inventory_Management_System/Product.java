package Inventory_Management_System;

public class Product {
    private String pId;
    private String pName;
    private int q;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.pId = productId;
        this.pName = productName;
        this.q = quantity;
        this.price = price;
    }

    public String getProductId() { return pId; }
    public String getProductName() { return pName; }
    public int getQuantity() { return q; }
    public double getPrice() { return price; }

    public void setQuantity(int quantity) { this.q = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product{" + "productId='" + pId + '\'' + ", productName='" + pName + '\'' + ", quantity=" + q + ", price=" + price + '}';
    }
}