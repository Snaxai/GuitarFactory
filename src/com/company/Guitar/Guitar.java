package com.company.Guitar;

public abstract class Guitar implements Playable {
    protected String brand;
    protected String model;
    protected int year;

    public Guitar(String brand, String model, int year) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printDetails() {
        System.out.print(this.brand + " | ");
        System.out.print(this.model + " | ");
        System.out.print(this.year + " | ");
    }
}

