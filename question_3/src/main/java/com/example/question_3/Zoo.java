package com.example.question_3;

public class Zoo {
    Animal tiger;
    Animal zebra;

    public Zoo(AnimalFactory animalFactory) {
        this.tiger = animalFactory.createTiger();
        this.zebra = animalFactory.createZebra();
        this.tiger.eat();
        this.zebra.eat();
    }
}
