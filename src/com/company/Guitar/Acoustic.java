package com.company.Guitar;

public class Acoustic extends Guitar {
    public Acoustic(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void makeSound() {
        System.out.println("Acoustic sound");
    }
}
