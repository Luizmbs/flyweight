package org.example;

public class Book {

    private String titulo;
    private Publisher editora;

    public Book(String titulo, Publisher editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    public String obterLivro() {
        return "Book{" +
                "titulo='" + this.titulo + '\'' +
                ", editora='" + editora.getNome() + '\'' +
                ", pais='" + editora.getPais() + '\'' +
                '}';
    }
}
