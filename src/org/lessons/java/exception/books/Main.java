package org.lessons.java.exception.books;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti libri vuoi aggiungere?");
        int booksNumber = Integer.parseInt(scanner.nextLine());
        Book[] books = new Book[booksNumber];

        int i = 0;
        while (i < booksNumber) {
            System.out.println("Titolo del libro numero " + (i + 1) + ": ");
            String title = scanner.nextLine();
            System.out.println("Numero di pagine: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Autore: ");
            String author = scanner.nextLine();
            System.out.println("Editore: ");
            String editor = scanner.nextLine();
            try {
            books[i] = new Book(title, pages,author, editor);
            i++; }
            catch(EmptyStringException e) {
                System.out.println(e);
            }
            catch (MustHavePagesException e) {
                System.out.println(e);
            }

        }
        System.out.println(Arrays.toString(books));
    }
}
