package com.example.question_3;

public class ApplyAnimalFactory implements AnimalFactory{

    @Override
    public Animal createTiger() {
        return new Giraffe();
    }

    @Override
    public Animal createZebra() {
        return new Panda();
    }
}
