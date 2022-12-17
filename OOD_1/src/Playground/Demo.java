package Playground;

import java.util.ArrayList;
import java.util.List;




public class Demo {

	public static void main(String[] args) {
		
		Cat myCat = new Cat(1);
		Cat anotherCat = new Cat(2, "Lucy", "mew");
		Cat cat3 = new Cat(3, "Leonard");
		System.out.println(anotherCat);
		anotherCat.move();

		// UP Casting
		//The ability to store an object in a reference of its parent type
		List<Cat> cats = new ArrayList<>();
		cats.add(anotherCat);

		// DOWN Casting
		//taking a parent reference and storing it in a child reference
		Animal animalToCastDown = new Dog();
		

		if (animalToCastDown instanceof Cat) {
			Cat downcastAnimal = (Cat) animalToCastDown;
			downcastAnimal.makeSound();
		}

		List<Animal> animals = new ArrayList<>();
		animals.add(myCat);
		animals.add(animalToCastDown);
		animals.add(anotherCat);
		animals.add(cat3);

		// I want to grab the cat named Leonard
		// Using a for loop, we can continue to loop through the list after
		// modification.
		for (int i = animals.size() - 1; i >= 0; i--) {
			Animal a = animals.get(i);
			if (a instanceof Cat) {
				Cat aCat = (Cat) a;
				if (aCat.getName() != null && aCat.getName().equals("Leonard")) {
					animals.remove(a);
				}
			}
		}

		// We must exit the loop using break after modification if we use a for-each
		// loop.
		for (Animal a : animals) {
			if (a instanceof Cat) {
				Cat aCat = (Cat) a;
				if (aCat.getName() != null && aCat.getName().equals("Leonard")) {
					animals.remove(a);
					break;
				}
			}
		}

	}

}
