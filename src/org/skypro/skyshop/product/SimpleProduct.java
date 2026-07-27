package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private final int price; // Цена товара

    public SimpleProduct(String name, int price) {
        super(name);
        // Проверка: цена должна быть строго больше 0
        if (price <= 0) {
            throw new IllegalArgumentException("Цена продукта должна быть больше 0");
        }
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public boolean isSpecial() {
        return false;
    }
}
