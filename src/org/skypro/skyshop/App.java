package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.search.SearchEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import org.skypro.skyshop.search.Searchable;

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
                // Создаём корзину и добавляем продукты
                ProductBasket basket = new ProductBasket();
        basket.addProduct(new SimpleProduct("Яблоко", 50));
        basket.addProduct(new SimpleProduct("Банан", 30));
        basket.addProduct(new SimpleProduct("Шоколад ", 60));
                System.out.println("Корзина до удаления:");
                basket.printBasketContents();


                // Создаем статьи
                Article article1 = new Article("Польза яблок", "Яблоки богаты витаминами и железом.");
                Article article2 = new Article("Шоколад и настроение", "Шоколад улучшает настроение.");

                // Создаем поисковую систему и добавляем товары и статьи
                SearchEngine engine = new SearchEngine();
                engine.add(new SimpleProduct("Яблоко", 50));
                engine.add(new SimpleProduct("Банан ", 30));
                engine.add(new SimpleProduct("Шоколад", 60));
                engine.add(article1);
                engine.add(article2);

                // Поиск
                System.out.println("Поиск по слову 'Яблоко':");
                List<Searchable> searchResults = engine.search("Яблоко");
                for (Searchable s : searchResults) {
                    System.out.println(s.getStringRepresentation());
                }
                System.out.println("---");
                System.out.println("Поиск по слову 'Шоколад':");
                List<Searchable> chocoResults = engine.search("Шоколад");
                for (Searchable s : chocoResults) {
                    System.out.println(s.getStringRepresentation());
                }
                // Сценарий №1: удаляем существующий продукт
                System.out.println("Удаляем 'Яблоко':");
                List<Product> removed = basket.removeProductsByName("Яблоко");
                if (removed.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    System.out.println("Удалено:");
                    for (Product p : removed) {
                        System.out.println(p);
                    }
                }
                System.out.println("Корзина после удаления:");
                basket.printBasketContents();
                // Сценарий №2: удаляем несуществующий продукт
                System.out.println("Пробуем удалить несуществующий продукт 'Киви':");
        List<Product> removed2 = basket.removeProductsByName("Киви");
                if (removed2.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    System.out.println("Удалено:");
                    for (Product p : removed2) {
                        System.out.println(p);
                    }
                }
                basket.printBasketContents();

            }

        }





