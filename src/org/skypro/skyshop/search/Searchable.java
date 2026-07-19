package org.skypro.skyshop.search;

public interface Searchable {
    // Поисковый термин
    String getSearchTerm();
    // Тип контента
    String getContentType();
    // Имя объекта
    String getName();
    // Строковое представление
    default String getStringRepresentation() {
        return getName() + " — " + getContentType();
    }
}
