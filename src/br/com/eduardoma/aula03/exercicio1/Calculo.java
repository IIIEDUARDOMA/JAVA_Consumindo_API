package br.com.eduardoma.aula03.exercicio1;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = read.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = read.nextInt();

        try {
            int response = n1 / n2;
            System.out.println("O valor da divisão é = " + response);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível fazer essa operação!");
        }

    }
}