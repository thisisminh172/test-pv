package com.example.question_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Question3Application {

	public static void main(String[] args) {
		SpringApplication.run(Question3Application.class, args);
		AnimalFactory animalFactory = new ApplyAnimalFactory();
		Zoo zoo = new Zoo(animalFactory);
	}

}
