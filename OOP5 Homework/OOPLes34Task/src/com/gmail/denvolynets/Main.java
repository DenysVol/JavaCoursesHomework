package com.gmail.denvolynets;

public class Main {
	public static void main(String[] args) {
		Group grOne = new Group();
		Group grRecruits = new Group();
		Student stOne = new Student("Volynets", "Denys", 21, true, "ukrainian", 4.0);
		Student stTwo = new Student("Antoshkin", "Ruslan", 21, true, "ukrainian", 4.4);
		Student stThree = new Student("Bereh", "Max", 21, true, "ukrainian", 4.6);
		Student stFour = new Student("Huston", "Mary", 20, false, "american", 4.2);
		Student stFive = new Student("Shapran", "Karina", 22, false, "ukrainian", 5.0);
		Student stSix = new Student("Bort", "Roma", 20, true, "ukrainian", 4.5);
		Student stSeven = new Student("Pikul", "Vitaly", 20, true, "russian", 3.8);
		Student stEight = new Student("Johnson", "Carl", 19, true, "englishman", 4.3);
		Student stNine = new Student("Williams", "Robin", 22, true, "canadian", 3.9);
		Student stTen = new Student("Ivanov", "Victor", 21, true, "ukrainian", 4.9);
		Student stEleven = new Student("Dovgal", "Dmitry", 21, true, "ukrainian", 4.7);
		try {
			grOne.addStudent(stOne);
			grOne.addStudent(stTwo);
			grOne.addStudent(stThree);
			grOne.addStudent(stFour);
			grOne.addStudent(stFive);
			grOne.addStudent(stSix);
			grOne.addStudent(stSeven);
			grOne.addStudent(stEight);
			grOne.addStudent(stNine);
			grOne.addStudent(stTen);
			grOne.deleteStudent(stOne);
			grOne.deleteStudent(stTwo);
			grOne.addStudent(stEleven);
			grOne.toString();
			grOne.searchBySurname("Dovgal");
			grOne.addNewStudent();
			grOne.addNewStudent();
			grRecruits = grOne.getRecruits();
			grRecruits.sortBySurname();
			grRecruits.sortByParam("age");
			grOne.sortByParam("averageGradePoint");
			grOne.saveToFile("group.txt");
			Group grNew = new Group(Group.readFromFile("group.txt"));
			grNew.toString();
			
		} catch (FullGroupException e) {
			e.printStackTrace();
		} catch (WrongParamException e) {
			e.printStackTrace();
		} 
	}

}
