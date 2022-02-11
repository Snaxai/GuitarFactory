package com.company;

import com.company.Guitar.Acoustic;
import com.company.Guitar.Electric;
import com.company.Guitar.Guitar;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Guitar> myGuitars = new ArrayList();

    public static void main(String[] args) {
        addSomeGuitars();
        printDetailsForAllGuitars();

    }

    public static void addSomeGuitars() {
        for (int i = 1; i < 4; i++) {
            Electric myElGuitar = new Electric("brand" + i, "model" + i, 1999 + i, "pickup stuff");
            myGuitars.add(myElGuitar);
            Acoustic myAcGuitar = new Acoustic("brand" + i, "model" + i, 2005 + i);
            myGuitars.add(myAcGuitar);
        }
    }

    public static void printDetailsForAllGuitars() {
        for (Guitar guitar : myGuitars) {
            guitar.printDetails();
            guitar.makeSound();
        }
    }
}
