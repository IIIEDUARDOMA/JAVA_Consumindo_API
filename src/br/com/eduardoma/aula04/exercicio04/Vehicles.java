package br.com.eduardoma.aula04.exercicio04;

public class Vehicles {
    private String brands;
    private String model;
    private int productionYear;
    private double price;

    public Vehicles(String brands, String model, int productionYear, double price) {
        this.brands = brands;
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
    }

    public String getBrands() {
        return brands;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getPrice() {
        return price;
    }

}
