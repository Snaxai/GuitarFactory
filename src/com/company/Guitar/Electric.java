package com.company.Guitar;

public class Electric extends Guitar {
    private String pickups;

    public Electric(String brand, String model, int year, String pickups) {
        super(brand, model, year);
        this.pickups = pickups;
    }

    @Override
    public void makeSound() {
        System.out.println("Electric sound");
    }

    public String getPickups() {
        return pickups;
    }
}
