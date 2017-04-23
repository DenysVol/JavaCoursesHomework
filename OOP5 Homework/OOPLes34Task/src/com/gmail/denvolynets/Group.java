package com.gmail.denvolynets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group implements Voenkom {
	public Student[] studentArray = new Student[10];

	public Group(Student[] studentArray) {
		super();
		this.studentArray = studentArray;
	}

	public Group() {
		super();
	}

	@Override
	public Group getRecruits() {
		System.out.print("Group of recruits");
		Group studentArray = new Group();
		for (int i = 0; i < this.studentArray.length; i++) {
			if (this.studentArray[i] != null && this.studentArray[i].getAge() > 18 && this.studentArray[i].isSex()) {
				studentArray.studentArray[i] = this.studentArray[i];
			}
		}
		return studentArray;
	}

	public void addNewStudent() {
		System.out.println("Let's add new student");
		String surname;
		String name;
		int age;
		boolean sex;
		String nationality;
		double averageGradePoint;
		try {
			surname = readSurname();
			name = readName();
			age = readAge();
			sex = readSex();
			nationality = readNationality();
			averageGradePoint = readAverageGradePoint();
			Student student = new Student(surname, name, age, sex, nationality, averageGradePoint);
			this.addStudent(student);
		} catch (WrongInformationException e) {
			e.printStackTrace();
		} catch (FullGroupException e) {
			e.printStackTrace();
		}
	}

	private String readSurname() throws WrongInformationException {
		String surname = "";
		System.out.println("Input Surname:");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			surname = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (CheckWithRegExpString(surname) == true) {
			return surname;
		} else {
			throw new WrongInformationException();
		}
	}

	private String readName() throws WrongInformationException {
		String name = "";
		System.out.println("Input Name:");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (CheckWithRegExpString(name) == true) {
			return name;
		} else {
			throw new WrongInformationException();
		}
	}

	private int readAge() throws WrongInformationException {
		System.out.println("Input age:");
		int age = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			age = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			throw new WrongInformationException();
		}
		return age;
	}

	private boolean readSex() throws WrongInformationException {
		System.out.println("Input sex: 1 - male, 2 - female");
		boolean sex = false;
		int test = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			test = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			throw new WrongInformationException();
		}
		if (test != 1 && test != 2) {
			throw new WrongInformationException();
		} else if (test == 1) {
			sex = true;
		}
		return sex;
	}

	private String readNationality() throws WrongInformationException {
		System.out.println("Input Nationality:");
		String nationality = "";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			nationality = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (CheckWithRegExpString(nationality) == true) {
			return nationality;
		} else {
			throw new WrongInformationException();
		}
	}

	private double readAverageGradePoint() throws WrongInformationException {
		System.out.println("Input Average Grade Point(use dot(.)):");
		double averageGradePoint = 0.0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			averageGradePoint = Double.parseDouble(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			throw new WrongInformationException();
		}
		if (averageGradePoint <= 5 && CheckWithRegExpDouble(averageGradePoint) == true) {
			return averageGradePoint;
		} else {
			throw new WrongInformationException();
		}
	}

	private boolean CheckWithRegExpDouble(double data) {
		String input = Double.toString(data);
		Pattern p = Pattern.compile("^[0-9].+");
		Matcher m = p.matcher(input);
		return m.matches();
	}

	private boolean CheckWithRegExpString(String data) {
		Pattern p = Pattern.compile("^[A-z]+$");
		Matcher m = p.matcher(data);
		return m.matches();
	}

	public void sortBySurname() {
		System.out.println();
		System.out.print("Sorted Group by Surname");
		Arrays.sort(studentArray, (a, b) -> {
			if (a == null) {
				return 0;
			} else if (b == null) {
				return -1;
			} else {
				return a.getSurname().compareToIgnoreCase(b.getSurname());
			}
		});
		this.toString();
	}

	public void addStudent(Student student) throws FullGroupException {
		int position = -1;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == null) {
				position = i;
				studentArray[i] = student;
				System.out.println("Student " + student.getSurname() + " " + student.getName() + " added.");
				return;
			}
		}
		if (position == -1) {
			throw new FullGroupException();
		}
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == student) {
				studentArray[i] = null;
				System.out.println("Student " + student.getSurname() + " " + student.getName() + " deleted.");
				return;
			} else {
				System.out.println("There is no such student");
			}
		}
	}

	public Student searchBySurname(String surname) {
		System.out.println("Search student " + surname);
		for (int i = 0; studentArray[i] != null & i < studentArray.length - 1; i++) {
			if (studentArray[i].getSurname() == surname) {
				System.out.println("This student is found: " + studentArray[i].toString());
				return studentArray[i];
			}
		}
		System.out.println("This student is not found");
		return null;
	}

	public void sortByParam(String param) throws WrongParamException {
		System.out.println();
		System.out.print("Sorted group by parametr - " + param);
		String testParam = param;
		if (testParam == "surname" || testParam == "name" || testParam == "age" || testParam == "sex"
				|| testParam == "nationality" || testParam == "averageGradePoint") {
			Arrays.sort(studentArray, (a, b) -> {
				if (a == null) {
					return 0;
				} else if (b == null) {
					return -1;
				} else if (param == "surname") {
					return a.getSurname().compareToIgnoreCase(b.getSurname());
				} else if (param == "name") {
					return a.getName().compareToIgnoreCase(b.getName());
				} else if (param == "age") {
					return Integer.compare(a.getAge(), b.getAge());
				} else if (param == "sex") {
					return Boolean.compare(a.isSex(), b.isSex());
				} else if (param == "nationality") {
					return a.getNationality().compareToIgnoreCase(b.getNationality());
				} else if (param == "averageGradePoint") {
					return Double.compare(a.getAverageGradePoint(), b.getAverageGradePoint());
				}
				return 0;
			});
		} else {
			throw new WrongParamException();
		}
		this.toString();
	}

	@Override
	public String toString() {
		System.out.println();
		for (int i = 0; i < studentArray.length; i++) {
			String output = String.format("%2.10s", i + 1);
			System.out.print("¹ " + output + " ");
			if (studentArray[i] != null) {
				studentArray[i].getInfo();
			} else {
				System.out.println("Empty");
			}
		}
		return "";
	}

	public void saveToFile(String fileName) {
		try (PrintWriter pw = new PrintWriter(fileName)) {
			int i = 0;
			for (Student student : this.studentArray) {
				String outputNum = String.format("%2.10s", i + 1);
				if (student == null) {
					pw.print("¹ " + outputNum + " ");
					pw.println("Empty");
				} else {
					pw.print("¹ " + outputNum + " ");
					pw.println(student.toString());
					i++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Student[] readFromFile(String fileName) {
		Student[] studentArray = new Student[10];
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String readStr = "";
				for (int i = 0; i < studentArray.length; i++) {
					for (; (readStr = br.readLine()) != null;) {
					if (readStr.contains("Empty")) {
						studentArray[i] = null;
					} else {
						String surname = readStr.substring(readStr.indexOf("surname=", 0) + 8, readStr.indexOf(",", 0));
						String name = readStr.substring(readStr.indexOf(" name=", 0) + 6, readStr.indexOf(", age", 0));
						int age = Integer.parseInt(readStr.substring(readStr.indexOf("age=", 0) + 4, readStr.indexOf(", sex", 0)));
						String sexStr = readStr.substring(readStr.indexOf("sex=", 0) + 4, readStr.indexOf(", nationality", 0));
						boolean sex = sexStr.equals("male") ? true : false;
						String nationality = readStr.substring(readStr.indexOf("nationality=", 0) + 12, readStr.indexOf(", averageGradePoint", 0));
						double averageGradePoint = Double.parseDouble(readStr.substring(readStr.indexOf("averageGradePoint=", 0) + 18, readStr.indexOf("]", 0)));
						studentArray[i] = new Student(surname, name, age, sex, nationality, averageGradePoint);
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return studentArray;
	}

}