package com.company;

import com.company.Guitar.Acoustic;
import com.company.Guitar.Electric;
import com.company.Guitar.Guitar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Guitar> myGuitars = new ArrayList();
        for (int i = 1; i < 4; i++) {
            Electric myElGuitar = new Electric("brand" + i, "model" + i, 1999 + i, "pickups");
            myGuitars.add(myElGuitar);
            Acoustic myAcGuitar = new Acoustic("brand" + i, "model" + i, 2005 + i);
            myGuitars.add(myAcGuitar);
        }

        for (Guitar guitar : myGuitars) {
            System.out.print(guitar.getYear() + " | ");
            System.out.print(guitar.getBrand() + " | ");
            System.out.print(guitar.getModel() + " | ");
            guitar.makeSound();
        }
    }
}
