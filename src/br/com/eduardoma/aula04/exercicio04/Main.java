package br.com.eduardoma.aula04.exercicio04;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehicles> list = new ArrayList<>();

        Vehicles c1 = new Vehicles("Volvo", "XC70", 2016, 109950.00);
        Vehicles c2 = new Vehicles("Toyota", "Corolla Cross", 2021, 384900.00);
        Vehicles c3 = new Vehicles("Ford", "Fiesta", 2015, 46000.00);

        list.add(c1);
        list.add(c3);
        list.add(c2);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(list);

        System.out.println(json);
    }
}
