package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
public class App {
    public  static void main(String[] args) {
        Product apple = new Product("Яблоко", 50);
        Product banana = new Product("Банан", 30);
        Product orange = new Product("Апельсин", 40);
        Product grape = new Product("Виноград", 70);
        Product pear = new Product("Груша", 60);
        Product watermelon = new Product("Арбуз", 90);
        ProductBasket basket = new ProductBasket();
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(orange);
        basket.addProduct(grape);
        basket.addProduct(pear);
        basket.addProduct(watermelon);
        System.out.println("Содержимое корзины:");
        basket.printBasketContents();
        System.out.println("Общая стоимость корзины: " + basket.getTotalCost());
        System.out.println("Корзина содержит яблоко: " + basket.containsProduct("Яблоко"));
        System.out.println("Корзина содержит ананас: " + basket.containsProduct("Ананас"));
        basket.clearBasket();
        System.out.println("Корзина очищена.");
        basket.printBasketContents();
        System.out.println("Общая стоимость пустой корзины: " + basket.getTotalCost());
        System.out.println("Корзина содержит яблоко: " + basket.containsProduct("Яблоко"));
    }
}

