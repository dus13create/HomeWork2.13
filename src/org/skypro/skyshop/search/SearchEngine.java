package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] items;
    private int count = 0;

    public SearchEngine(int size) {
        items = new Searchable[size];
    }

    public void add(Searchable item) {
        if (count < items.length) {
            items[count++] = item;
        }
    }

    public Searchable[] search(String term) {
        Searchable[] result = new Searchable[5];
        int found = 0;
        for (int i = 0; i < count && found < 5; i++) {
            if (items[i].getSearchTerm().contains(term)) {
                result[found++] = items[i];
            }
        }
        return result;
    }
}
