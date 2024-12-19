package com.example.oopjavadetails;

public class Kopek extends Animal implements Training {
    public Kopek() {

    }

    public Kopek(String name, String eyeColor, String fur) {
        super(name, eyeColor, fur);
    }

    @Override
    public boolean getTraining() {
        System.out.println("Dogs can be trained");
        return true;
    }
}


