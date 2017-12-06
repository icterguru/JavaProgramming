package JavaBasics;

public class Cat extends Animal{
	
	public Cat(){
		
	}
public String makeSound(){
	return "Cat says Meaw...";
}
public static void main(String args[]){
	Animal Animal1 = new Cat();
	Animal Animal2 = new Dog();

	Animal[] theAnimals = new Animal[10];
	theAnimals[0] = Animal1;
	theAnimals[1] = Animal2;
	System.out.println("Animal1 says " + theAnimals[0].makeSound());
	
	System.out.println("Animal2 says " + theAnimals[1].makeSound());
	
	speakAnimal(Animal1);
	speakAnimal(Animal2);
	
	
}
}
