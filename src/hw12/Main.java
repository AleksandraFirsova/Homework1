package hw12;

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Wilkie", "Collins");
        Author secondAuthor = new Author("Bram", "Stoker");

        Book firstBook = new Book("The Moonstone", firstAuthor, 1865);
        Book secondBook = new Book("Dracula", secondAuthor, 1897);

        System.out.println("Название книги: " + firstBook.getName() + ", автор: " + firstAuthor.getFirstName() + " " + firstAuthor.getLastName() + ", год издания: " + firstBook.getYear());
        System.out.println("Название книги: " + secondBook.getName() + ", автор: " + secondAuthor.getFirstName() + " " + secondAuthor.getLastName() + ", год издания: " + secondBook.getYear());

        firstBook.setYear(1866);

        System.out.println("Измененный год издания: " + firstBook.getYear());
    }
}
