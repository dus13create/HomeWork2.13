package org.skypro.skyshop.basket;
import java.util.*;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Map<String, List<Product>> products;

    public ProductBasket() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.computeIfAbsent(product.getName(), k -> new ArrayList<>()).add(product);
    }

    public List<Product> removeProductsByName(String name) {
        List<Product> removed = products.remove(name);
        return removed != null ? removed : new ArrayList<>();
    }
    public int getTotalCost() {
        int totalCost = 0;
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }

    public int countSpecialProducts() {
        int count = 0;
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                if (product.isSpecial()) {
                    count++;
                }
            }
        }
        return count;
    }





    public void printBasketContents() {
        if (products.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + countSpecialProducts());
    }
}