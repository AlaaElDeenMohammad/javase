package org.example;

import java.util.Collections;
import java.util.List;

public class BookService {
    public List<Book> getBooksSorted(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books,(book1,book2) -> book2.getName().compareTo(book1.getName()));
        return books;
    }
}
