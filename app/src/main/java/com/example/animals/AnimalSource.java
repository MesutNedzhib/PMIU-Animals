package com.example.animals;

import java.util.ArrayList;

public class AnimalSource {
    public static ArrayList<Animal> generateItemsList(){
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        animalArrayList.add(new Animal("Lion",R.drawable.lion));
        animalArrayList.add(new Animal("Antelope",R.drawable.antelope));
        animalArrayList.add(new Animal("Dog",R.drawable.dog));
        animalArrayList.add(new Animal("Elephant",R.drawable.elephant));
        animalArrayList.add(new Animal("Wolf",R.drawable.wolf));

        return animalArrayList;
    }
}
