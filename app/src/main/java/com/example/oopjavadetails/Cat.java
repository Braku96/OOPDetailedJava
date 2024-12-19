package com.example.oopjavadetails;

public class Cat implements Training {
    String name;
    String EyeColor;
    String fur;

    public static String TurIsmi = "Maine Coon";

    public Cat(){


    }
    public Cat(String name,String EyeColor,String fur){
        this.name = name;
        this.EyeColor = EyeColor;
        this.fur = fur;
    }

    public static void meowStaticCat(){
        System.out.println("My kind : " + TurIsmi);


    }
    public void meowCat(){
        System.out.println("Meow meow : " + this.name + "My kind : " + TurIsmi);
    }

    @Override
    public boolean getTraining() {
        System.out.println("Cats cant be trained");
        return false;
    }
}
