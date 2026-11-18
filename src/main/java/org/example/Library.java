package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> livros = new ArrayList<>();

    public void cadastrarLivro(String titulo, String nomeEditora, String pais) {
        Publisher editora = PublisherFactory.getPublisher(nomeEditora, pais);
        Book livro = new Book(titulo, editora);
        livros.add(livro);
    }

    public List<String> obterLivros() {
        List<String> saida = new ArrayList<String>();
        for (Book livro : this.livros) {
            saida.add(livro.obterLivro());
        }
        return saida;
    }

}
