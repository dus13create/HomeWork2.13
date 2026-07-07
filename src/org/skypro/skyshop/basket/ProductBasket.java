package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products;
    private int productCount;

    public ProductBasket() {
        products = new Product[5];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < productCount; i++) {
            totalCost += products[i].getPrice();
        }
        return totalCost;
    }

    // Метод для подсчета количества специальных товаров в корзине
    public int countSpecialProducts() {
        int count = 0;
        for (int i = 0; i < productCount; i++) {
            if (products[i].isSpecial()) {
                count++;
            }
        }
        return count;
    }

    // Метод для печати содержимого корзины
    public void printBasketContents() {
        if (productCount == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].toString());
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + countSpecialProducts());


    }
}