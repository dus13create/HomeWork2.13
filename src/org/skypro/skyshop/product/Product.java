package org.skypro.skyshop.product;

public abstract class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод для получения цены товара
    public abstract int getPrice();

    // Метод для проверки, является ли товар специальным
    public boolean isSpecial() {
        return false;
    }

    // Стандартный формат вывода информации о товаре
    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }
}



