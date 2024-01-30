package br.com.eduardoma.aula05.desafioviacep;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, CepInvalidoExeption {
        Scanner read = new Scanner(System.in);
        String search = "";

        List<Cep> list= new ArrayList<>();

       Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create ();

        while (!search.equalsIgnoreCase("sair")) {
            try{
                System.out.println("Digite o CEP que deseja buscar ou sair para encerrar: ");
                search = read.nextLine();


                String url = "https://viacep.com.br/ws/" + search.replace("-", "") + "/json/";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                if (search.equalsIgnoreCase("sair")) {
                    break;
                }
                String json = response.body();

                CepRCD CepRCD = new Gson().fromJson(json, CepRCD.class);
                Cep cep = new Cep(CepRCD);

                list.add(cep);

            } catch(IOException | JsonSyntaxException | InterruptedException e) {
                throw new RuntimeException("Cep inválido!");
            }

        }
        FileWriter file = new FileWriter("cep.json");
        file.write(gson.toJson(list));
        file.close();

        System.out.println("Buscas finalizadas!");
    }
}
