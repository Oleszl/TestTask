package org.example.factory;

import org.example.model.RealProduct;
import org.example.model.VirtualProduct;

import java.time.LocalDate;

public final class ProductFactory {
    private ProductFactory() {
    }

    public static RealProduct createRealProduct(String name, double price, int size, int weight) {
        return new RealProduct(name, price, size, weight);
    }

    public static VirtualProduct createVirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        return new VirtualProduct(name, price, code, expirationDate);
    }
}
