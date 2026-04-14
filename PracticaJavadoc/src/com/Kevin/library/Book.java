package com.Kevin.library;

/**
 * Representa un libro dentro del sistema de biblioteca.
 * Contiene información básica como título, autor y disponibilidad.
 *
 * @author Talos
 * @version 1.0
 * @since 2026
 */
public class Book {

    private String title;
    private String author;
    private boolean available;

    /**
     * Crea un nuevo libro con título y autor.
     *
     * @param title  Título del libro.
     * @param author Autor del libro.
     * @since 2026
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    /**
     * Indica si el libro está disponible para préstamo.
     *
     * @return true si está disponible, false si está prestado.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Marca el libro como prestado.
     *
     * @throws IllegalStateException si el libro ya estaba prestado.
     */
    public void borrow() throws IllegalStateException {
        if (!available) {
            throw new IllegalStateException("El libro ya está prestado.");
        }
        this.available = false;
    }

    /**
     * Marca el libro como devuelto.
     */
    public void returnBook() {
        this.available = true;
    }

    /**
     * Método obsoleto que devuelve el título del libro en mayúsculas.
     *
     * @return Título en mayúsculas.
     * @deprecated Usar getTitle() en su lugar.
     */
    @Deprecated
    public String getUppercaseTitle() {
        return title.toUpperCase();
    }

    /**
     * Obtiene el título del libro.
     *
     * @return Título del libro.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return Autor del libro.
     */
    public String getAuthor() {
        return author;
    }
}
