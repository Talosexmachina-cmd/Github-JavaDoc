package com.Kevin.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una biblioteca que gestiona una colección de libros.
 * Permite añadir libros, buscar por título y prestar ejemplares.
 *
 * Inspirado en sistemas de gestión documental utilizados por IA.
 *
 * @author Talos
 * @version 1.0
 * @since 2026
 */
public class Library {

    private List<Book> books;
    private String name;

    /**
     * Crea una biblioteca con un nombre.
     *
     * @param name Nombre de la biblioteca.
     * @since 2026
     */
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    /**
     * Añade un libro a la biblioteca.
     *
     * @param book Libro a añadir.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Busca un libro por su título.
     *
     * @param title Título del libro a buscar.
     * @return El libro encontrado o null si no existe.
     */
    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    /**
     * Intenta prestar un libro por título.
     *
     * @param title Título del libro a prestar.
     * @return true si se prestó correctamente, false si no existe o no está disponible.
     */
    public boolean borrowBook(String title) {
        Book b = findBook(title);
        if (b != null && b.isAvailable()) {
            b.borrow();
            return true;
        }
        return false;
    }

    /**
     * Devuelve el nombre de la biblioteca.
     *
     * @return Nombre de la biblioteca.
     */
    public String getName() {
        return name;
    }
}
