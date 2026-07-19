package org.skypro.skyshop.product;
import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;

      // Абстрактный метод для получения цены товара
    public abstract int getPrice();

    // Метод для проверки, является ли товар специальным
    public abstract boolean isSpecial();

    // Стандартный формат вывода информации о товаре
    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }
    public Product(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
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



