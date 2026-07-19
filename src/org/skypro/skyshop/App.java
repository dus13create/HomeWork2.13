package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.search.SearchEngine;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        try {
            Product wrongName = new SimpleProduct("   ", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            Product zeroPrice = new SimpleProduct("Товар", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            Product wrongDiscount = new DiscountedProduct("Товар", 100, 110);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // Создаем товары
        Product apple = new SimpleProduct("Яблоко", 50);
        Product choco = new DiscountedProduct("Шоколад", 200, 25);
        Product magazine = new FixPriceProduct("Журнал");

        // Создаем статьи
        Article article1 = new Article("Польза яблок", "Яблоки богаты витаминами и железом.");
        Article article2 = new Article("Шоколад и настроение", "Шоколад улучшает настроение.");

        // Создаем поисковую систему и добавляем товары и статьи
        SearchEngine engine = new SearchEngine(10);
        engine.add(apple);
        engine.add(choco);
        engine.add(magazine);
        engine.add(article1);
        engine.add(article2);

        // Поиск
        System.out.println("Поиск по слову 'Яблоко':");
        for (var s : engine.search("Яблоко")) {
            if (s != null) System.out.println(s.getStringRepresentation());
        }
        System.out.println("---");
        System.out.println("Поиск по слову 'Шоколад':");
        for (var s : engine.search("Шоколад")) {
            if (s != null) System.out.println(s.getStringRepresentation());
        }
    }

}


