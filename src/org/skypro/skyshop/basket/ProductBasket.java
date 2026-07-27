package org.skypro.skyshop.basket;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private List<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Удаление всех продуктов с заданным именем. Возвращает список удалённых продуктов
    public List<Product> removeProductsByName(String name) {
        List<Product> removed = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getName().equals(name)) {
                removed.add(p);
                iterator.remove();
            }
        }
        return removed;
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