package org.skypro.skyshop.search;
import java.util.ArrayList;
import java.util.List;
import org.skypro.skyshop.search.Searchable;

public class SearchEngine {
    private final List<Searchable> items = new ArrayList<>();

    public void add(Searchable item) {
        items.add(item);
    }
    // Возвращаем все подходящие результаты
    public List<Searchable> search(String term) {
        List<Searchable> result = new ArrayList<>();
        for (Searchable item : items) {
            if (item.getSearchTerm().contains(term)) {
                result.add(item);
            }
        }
        return result;
    }


}
