package com.example.oopjavadetails;

public interface Training {
    //Arayüzün amacı sınıfın nasıl davranacağını belirtmektir
    public boolean getTraining();

    public default boolean getTrainingbody(){

        System.out.println("No training");
        return false;

    }


}


