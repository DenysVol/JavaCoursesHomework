package com.gmail.denvolynets;

public class Cat {
	private String name;
	private String type;
	private boolean sex;
	private int age;

	public Cat(String name, String type, boolean sex, int age) {
		super();
		this.name = name;
		this.type = type;
		this.sex = sex;
		this.age = age;
	}

	public Cat() {

	}

	public void voice() {
		System.out.println(name + ": Meow!");
	}

	public boolean makeLove(Cat a) {
		System.out.println(this.name + " trying to make love with " + a.name + "...");
		boolean flag = false;
		if (this.sex != a.sex) {
			flag = true;
			System.out.println("Love made.");
		} else {
			System.out.println("Sorry, But it's impossible");
		}
		return flag;
	}

	public void findOldest(Cat... cats) {
		System.out.println();
		System.out.println("Lets try to find the oldest cat");
		Cat oldest = new Cat("null", "null", true, 0);
		for (Cat cat : cats) {
			if (cat.age > oldest.age) {
				oldest = cat;
			}
		}
		System.out.println("The oldest cat is " + oldest.name + ". He is " + oldest.age + " now.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// false - male, true - female
	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
