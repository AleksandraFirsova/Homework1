package basics.ticket5;

import basics.ticket5.Author;

public class Book {
    String nameBook;
    Author fullName;

    public Book(String nameBook, Author fullName) {
        this.nameBook = nameBook;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "\"" + nameBook + "\" " + fullName;
    }
}
