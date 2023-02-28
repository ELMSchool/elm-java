package section8_6;

import java.util.*;

public class ComplieTimePolymorphism {
	
	public static void main(String[] args) {
	
		//compile time/static polymorphism more efficient less flexible
		//Overloading is happening within same class
		
		//we can not override static methods. Because static methods are not belong to objects they are shared all over class
		
		//runtime/dynamic polymorphism less efficient more flexible
		//overriding happens in between sub and parent class
		//same name, same parameter, same return type
		
	
		//there IS A relationship in between sub and super classes
		
//		Animal animal1 = new Cat();  //upcasting
//		Animal animal2 = new Dog();
//		Animal animal3 = new Tiger();
//
//		animal1.sound();
//		animal2.sound();
//		animal3.sound();
		
		Animal [] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Tiger();
		
		animals[0].sound();
		animals[1].sound();
		animals[2].sound();
	
		//instanceof
		for (Animal animal : animals) {
			
			if (animal instanceof Cat) {
				
				((Cat)animal).infoAboutCats(); //downcast
				
			}
			
		}
		
	Pet cat = new Cat();
	cat.play();
		
	Pet dog = new Dog();
	dog.play();
	}
	
	

}
