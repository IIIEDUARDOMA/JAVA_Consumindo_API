package br.com.eduardoma.aula05.desafioviacep;

public class CepInvalidoExeption extends RuntimeException{
    public final String mensagem;

    public CepInvalidoExeption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
