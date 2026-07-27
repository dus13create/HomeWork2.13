package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 100; // Константа для фиксированной цены

    public FixPriceProduct(String name) {
        super(name);
    }

    // Возвращает фиксированную цену
    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    // Этот товар считается специальным
    @Override
    public boolean isSpecial() {
        return true;
    }

    // Переопределенный вывод для фиксированной цены
    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + FIXED_PRICE;
    }
}
