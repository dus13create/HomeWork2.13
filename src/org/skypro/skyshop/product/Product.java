package org.skypro.skyshop.product;

public class Product {
    private final String name; // Название продукта
    private final int price; // Цена продукта

    // Конструктор класса Product
    public Product(String name, int price) {
        this.name = name; // Инициализируем поле name
        this.price = price; // Инициализируем поле price
    }

    // Метод для получения названия продукта
    public String getName() {
        return this.name; // Возвращаем название продукта
    }

    // Метод для получения цены продукта
    public int getPrice() {

        return this.price; // Возвращаем цену продукта
}
}



