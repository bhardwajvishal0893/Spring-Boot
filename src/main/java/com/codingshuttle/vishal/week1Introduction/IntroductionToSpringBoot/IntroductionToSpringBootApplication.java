package com.codingshuttle.vishal.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// This class is also extending to component so it is also being mananged by IOC Container
@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {
	@Autowired
	Apple obj;

	@Autowired
	Apple obj1;

	@Autowired
	DBService dbService;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);

	}

	//The run method is non static so it wont throw error when i try to use eat method of apple class by using obj reference
	//But will give a runtime error (null pointer exception because obj is null reference)because object is not present, although since run is not static it is not creating any issue.
	//We will use @Component annotation to mark our Apple class so that ioc manages its reference
	//But just anotating will not work as we haven't injected the bean or resolved the dependency we have.
	//We can also use service annotation which is again extending from component annotation, it is just meant for the developers
	//to identify that this class will handle business logic
	//Couple of ways to create bins
	//1> Stereotype Annotation
	//2>Explicit bean declaration in Configuration class

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
		obj1.eatApple(); // Default bean creation is singleton type so even if autowired and inject two times, only one memory will be created you
		// can test this by using postConstruct annotation
		//I used App Config file to add method level annotation @scope("prototype")

		System.out.println(dbService.getData());
	}
}
