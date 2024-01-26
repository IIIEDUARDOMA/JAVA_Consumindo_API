package br.com.eduardoma.aula03.exercicio2;

public class SenhaInvalidaExeption extends RuntimeException {

    public SenhaInvalidaExeption(String mensagem) {
        super(mensagem);
    }


}
