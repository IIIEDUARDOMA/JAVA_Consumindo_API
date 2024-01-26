package br.com.eduardoma.aula04.exercicio02e03;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        Title oPoderosoChefao = new Title("O Poderoso Chefão", "Francis Ford Coppola", "1972");
        Title piratasDoCaribe = new Title("Piratas do Caribe: A Maldição do Pérola Negra", "Gore Verbinski", "2003");
        Title johnWick = new Title("John Wick - De Volta ao Jogo", "Chad Stahelski", "2014");

        List<Title> list = new ArrayList<>();
        list.add(oPoderosoChefao);
        list.add(piratasDoCaribe);
        list.add(johnWick);

        try {
            FileWriter file = new FileWriter("filmes.json");
            file.write(gson.toJson(list));
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
