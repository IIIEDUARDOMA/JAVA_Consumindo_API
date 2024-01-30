package br.com.eduardoma.aula05.desafioviacep;

public class Cep {
    String cep;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;
    String ddd;

    public Cep(CepRCD cepRCD) {
        this.cep = cepRCD.cep();
        this.logradouro = cepRCD.logradouro();
        this.complemento = cepRCD.complemento();
        this.bairro = cepRCD.bairro();
        this.localidade = cepRCD.localidade();
        this.uf = cepRCD.uf();
        this.ddd = cepRCD.ddd();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
