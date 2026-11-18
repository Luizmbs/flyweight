package org.example;

import java.util.HashMap;
import java.util.Map;

public class PublisherFactory {
    private static Map<String, Publisher> editoras = new HashMap<>();

    public static Publisher getPublisher(String nome, String pais) {
        Publisher editora = editoras.get(nome);
        if (editora == null) {
            editora = new Publisher(nome, pais);
            editoras.put(nome, editora);
        }
        return editora;
    }

    public static int getTotalPublishers() {
        return editoras.size();
    }

}
