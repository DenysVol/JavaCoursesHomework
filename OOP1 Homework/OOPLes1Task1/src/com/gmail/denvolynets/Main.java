package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat("Murzik", "British Shorthair", false, 5);
		Cat catTwo = new Cat("Kara", "Chartreux", true, 4);
		Cat catThree = new Cat("Ollie", "Cyprus", false, 7);
		Cat catFour = new Cat("Sia", "Egyptian", true, 3);
		Cat cat = new Cat();

		catOne.makeLove(catTwo);
		catOne.voice();
		catTwo.voice();
		
		catOne.makeLove(catThree);
		
		cat.findOldest(catOne, catTwo, catThree, catFour);

	}

}
