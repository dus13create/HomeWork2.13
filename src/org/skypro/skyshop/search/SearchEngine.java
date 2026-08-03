package org.skypro.skyshop.search;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.skypro.skyshop.search.Searchable;

public class SearchEngine {
    private final List<Searchable> items = new ArrayList<>();

    public void add(Searchable item) {
        items.add(item);
    }

    // Возвращаем все подходящие результаты в виде отсортированной карты
    public TreeMap<String, Searchable> search(String term) {
        TreeMap<String, Searchable> result = new TreeMap<>();
        for (Searchable item : items) {
            if (item.matches(term)) {
                result.put(item.getName(), item);
            }
        }
        return result;
    }
}