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
    // Метод поиска наиболее подходящего объекта по количеству совпадений
    public Searchable findBest(String search) throws BestResultNotFound {
        int maxCount = 0;
        Searchable best = null;
        for (int i = 0; i < count; i++) {
            String term = items[i].getSearchTerm();
            int occurrences = 0;
            int idx = 0;
            // Считаем количество вхождений
            while ((idx = term.indexOf(search, idx)) != -1) {
                occurrences++;
                idx += search.length();
            }
            // Если у этого объекта больше вхождений — запоминаем
            if (occurrences > maxCount) {
                maxCount = occurrences;
                best = items[i];
            }
        }
        // Если лучший не найден — бросаем исключение
        if (best == null) {
            throw new BestResultNotFound(search);
        }
        return best;
    }
}
