package JavaBasics;

import java.util.Scanner;

// test
/**
 * Hello There
 * @author Dr.Mokter
 *
 */

public class Animal {

	public static final double FAVNUMBER = 1.6780;
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private int age;
	private long uniqueID;
	private long favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	
	static Scanner userInput = new Scanner(System.in);

	
	
	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
			numberOfAnimals++;
		
		//System.out.println("Number of Animals: " + numberOfAnimals);
		
		System.out.print("Enter the name: \n");
		
		if(userInput.hasNextLine()){
			this.setName(userInput.nextLine());
			//System.out.println();
		}
		this.setFavoriteChar();
		this.setUniqueID();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
		
	}

	public void setUniqueID() {
		long minNumber  = 1;
		long maxNumber = 100000;
		this.uniqueID = minNumber + (long) (Math.random()*((maxNumber - minNumber)+ 1));
		String stringNumber = Long.toString(maxNumber);

		System.out.println("Unique ID set to: " + this.uniqueID);
		
		
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public long getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(long favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random()* 126) + 1;
		
		this.favoriteChar = (char) randomNumber;
		
		if(randomNumber ==32){
			System.out.println("Favlrite character is set to Space");
			
		}
		else if(randomNumber > 97 && randomNumber < 122)
			System.out.println("Favorite character is a lowercase letter ");
		
		else if((randomNumber > 97 && randomNumber < 122) || (randomNumber > 64 && randomNumber < 97))
			System.out.println("Favorite character is a letter ");
		
		else if(randomNumber == 10){
			System.out.println("favorite character is set to Newline");
		}
		else{
			System.out.println("Favorite character is set to " + this.favoriteChar );
			
		}
		
		
	}
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	protected static void CountTo(int startingNumber){
		for (int i = startingNumber; i<= 100; i++){
			if( i == 90) continue;
			System.out.println(i);
		}
	}
	
	protected static String printNumbers (int maxNumbers){
		
		int i = 1;
		while (i<(maxNumbers / 2)){
			System.out.println(i);
			i++;
			
			if(i== (maxNumbers /2 )) break;
			
		}
		
		Animal.CountTo(maxNumbers/2);
		return "End";
		
	}
	
	protected static void guessNumber(){
		int aNumber;
		
		do{
			System.out.println("Guess a number up to 10, 0 for exit: ");
			while(!userInput.hasNextInt()){
				String numberEntered = userInput.next();
				System.out.printf("%s is not a number\n", numberEntered);
				
			}
			aNumber = userInput.nextInt();
			
			
		}while (aNumber !=0);
		System.out.println("The number entered is: " + aNumber);	
	}
	
	public String makeSound(){
		return "Grrrrrr";
		
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says: "+ randAnimal.makeSound());
	}
	
	public static void main(String []args){
		System.out.println("Hello there...");
		
		
		Animal aAnimal = new Animal();
		System.out.println("Number of Animals: " + numberOfAnimals);
		//Animal bAnimal = new Animal();
		System.out.println("Number of Animals: " + numberOfAnimals);
		
		int favoriteNumbers[] = new int[20];
		
		favoriteNumbers[0] = 100;
		
		String[] stringArray = {"Random", "Numner", "Here"};
		for (String word : stringArray){
			System.out.println(word);
		}
		
	}
	
}
