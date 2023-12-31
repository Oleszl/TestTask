package org.example.model;


import java.time.LocalDate;

public class VirtualProduct extends Product {
    private final String code;
    private final LocalDate expirationDate;

    public VirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        super(name, price);
        this.code = code;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "VirtualProduct{" +
               super.toString() +
               ", code=" + code +
               ", expirationDate=" + expirationDate +
               '}';
    }
}
