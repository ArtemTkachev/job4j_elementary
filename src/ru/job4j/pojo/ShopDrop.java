package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            products[i] = null;
            if (i + 1 < products.length) {
                products[i] = products[i + 1];
            }
        }
        return products;
    }
}