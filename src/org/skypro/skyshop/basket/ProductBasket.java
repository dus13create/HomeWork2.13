package org.skypro.skyshop.basket;
import java.util.ArrayList;
import java.util.List;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private List<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public int countSpecialProducts() {
        int count = 0;
        for (Product product : products) {
            if (product.isSpecial()) {
                count++;
            }
        }
        return count;
    }

    public void printBasketContents() {
        if (products.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + countSpecialProducts());
    }
}