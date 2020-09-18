package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[]{new Book("Война и мир", 1300),
                new Book("Белая гвардия", 350),
                new Book("Мастер и маргарита", 300),
                new Book("Clean code", 200)};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCountPages() + " стр.");
        }
        Book tmpB = books[0];
        books[0] = books[3];
        books[3] = tmpB;
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCountPages() + " стр.");
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName() == "Clean code") {
                System.out.println(books[i].getName() + " - " + books[i].getCountPages() + " стр.");
                break;
            }
        }

    }
}
