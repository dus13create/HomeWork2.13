package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private final int basePrice; // Базовая цена товара
    private final int discountPercent; // Скидка в процентах

    public DiscountedProduct(String name, int basePrice, int discountPercent) {
        super(name);
        // Проверка базовой цены
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Базовая цена должна быть больше 0");
        }
        // Проверка процента скидки
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Процент скидки должен быть от 0 до 100 включительно");
        }
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    // Цена с учетом скидки
    @Override
    public int getPrice() {
        return basePrice * (100 - discountPercent) / 100;
    }

    // Этот товар считается специальным
    @Override
    public boolean isSpecial() {
        return true;
    }

    // Переопределенный вывод для товара со скидкой
    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discountPercent + "%)";
    }
}
