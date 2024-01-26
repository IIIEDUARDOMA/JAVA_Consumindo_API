package br.com.eduardoma.aula04.exercicio01;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        FileWriter file;

        {
            try {
                file = new FileWriter("arquivo.txt");
                file.write("Conteúdo a ser gravado no arquivo.");
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
