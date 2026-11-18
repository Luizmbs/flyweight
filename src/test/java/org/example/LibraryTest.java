package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void deveRetornarLivros() {
        Library library = new Library();
        library.cadastrarLivro("Padrões de Projeto", "Editora Alfa", "Brasil");
        library.cadastrarLivro("Clean Code", "Editora Alfa", "Brasil");
        library.cadastrarLivro("O Programador Pragmático", "Editora Alfa", "Brasil");
        library.cadastrarLivro("Refatoração", "Editora Beta", "Brasil");

        List<String> saida = Arrays.asList(
                "Book{titulo='Padrões de Projeto', editora='Editora Alfa', pais='Brasil'}",
                "Book{titulo='Clean Code', editora='Editora Alfa', pais='Brasil'}",
                "Book{titulo='O Programador Pragmático', editora='Editora Alfa', pais='Brasil'}",
                "Book{titulo='Refatoração', editora='Editora Beta', pais='Brasil'}");

        assertEquals(saida, library.obterLivros());
    }

    @Test
    void deveRetornarTotalPublishers() {
        Library library = new Library();
        library.cadastrarLivro("Padrões de Projeto", "Editora Alfa", "Brasil");
        library.cadastrarLivro("Clean Code", "Editora Alfa", "Brasil");
        library.cadastrarLivro("O Programador Pragmático", "Editora Alfa", "Brasil");
        library.cadastrarLivro("Refatoração", "Editora Beta", "Brasil");

        assertEquals(2, PublisherFactory.getTotalPublishers());
    }

}
