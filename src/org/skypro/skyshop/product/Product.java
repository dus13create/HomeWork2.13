package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;

    // Конструктор с проверкой названия
    public Product(String name) {
        // Проверка: название не должно быть null или "пустым" (включая пробелы)
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название продукта не может быть пустым или состоять только из пробелов");
        }
        this.name = name;
    }

    // Геттер имени
    public String getName() {
        return name;
    }

    // Абстрактный метод для получения цены товара
    public abstract int getPrice();

    // Метод для проверки, является ли товар специальным
    public abstract boolean isSpecial();

    // Стандартный формат вывода информации о товаре
    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }
}



