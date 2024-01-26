package br.com.eduardoma.aula04.exercicio02e03;

public class Title {
    private String name;
    private String productor;
    private String year;

    public Title(String name, String productor, String year) {
        this.name = name;
        this.productor = productor;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public String getProductor() {
        return productor;
    }
    public String getYear() {
        return year;
    }

}
