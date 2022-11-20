package basics.ticket5;

import basics.ticket5.Author;
import basics.ticket5.Book;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("name book1", new Author("Aleksander", "Sergeevich", "Pushkin"));
        books[1] = new Book("name book2", new Author("Aleksander2", "Sergeevich2", "Pushkin2"));
        books[2] = new Book("name book3", new Author("Aleksander3", "Sergeevich3", "Pushkin3"));

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }
}
