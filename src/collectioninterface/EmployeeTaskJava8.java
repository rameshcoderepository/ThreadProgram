package collectioninterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employe {

	private String Name;
	private int Age;
	private String Gender;
	private double salary;

	public Employe(String name, int age, String gender, double salary) {
		super();
		Name = name;
		Age = age;
		Gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class EmployeeTaskJava8 {

	public static void main(String args[]) {

		List<Employe> emp = new ArrayList<>();

		emp.add(new Employe("Prasanna", 27, "Male", 70000));
		emp.add(new Employe("Kavin", 28, "Male", 90000));
		emp.add(new Employe("Mohan", 23, "Male", 20000));
		emp.add(new Employe("Mathi", 22, "Female", 25000));
		emp.add(new Employe("Lekha", 27, "Female", 60000));
		emp.add(new Employe("Durai", 24, "Male", 60000));
		emp.add(new Employe("Naveen", 26, "Male", 65000));

		List<Employe> HighSal = emp.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());

		// sort by Age

		HighSal.sort(Comparator.comparingInt(Employe::getAge));

		System.out.println("Employe with Salary >50000 by Age: ");

		HighSal.forEach(e -> System.out.println(e.getName() + " " + e.getAge() + " " + e.getGender()));

		// sort by gender

		HighSal.sort(Comparator.comparing(Employe::getGender));

		System.out.println("Employe with Salary >50000 by Gender: ");

		HighSal.forEach(e -> System.out.println(e.getName() + " " + e.getAge() + " " + e.getGender()));

		// count of Employe

		long count = HighSal.size();
		System.out.println("Number of Employe With Salary >50000 : " + count);
	}
}