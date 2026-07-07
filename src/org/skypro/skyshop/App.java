package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import  javax.swing.*;
import java.awt.*;
public class App {
    public  static void main(String[] args) {// Обычный товар
        Product apple = new SimpleProduct("Яблоко", 50);
        // Товар со скидкой
        Product choco = new DiscountedProduct("Шоколад", 200, 25);
        // Товар с фиксированной ценой
        Product magazine = new FixPriceProduct("Журнал");

        // Создаем корзину и добавляем товары
        ProductBasket basket = new ProductBasket();
        basket.addProduct(apple);
        basket.addProduct(choco);
        basket.addProduct(magazine);
        basket.printBasketContents(); // Демонстрация вывода корзины
    }
    }


