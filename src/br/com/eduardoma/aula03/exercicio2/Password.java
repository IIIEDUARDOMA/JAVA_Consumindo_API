package br.com.eduardoma.aula03.exercicio2;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) throws SenhaInvalidaExeption {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira uma senha com no mínimo 8 caracteres: ");
        String password = read.nextLine();

        if (password.length() >= 8){
            System.out.println("Senha cadastrada com sucesso!");
        } else {
            throw new SenhaInvalidaExeption("Senha inválida! A senha não atende aos requisitos solicitados.");
        }

    }
}
