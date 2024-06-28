package collectioninterface;

public class Employee implements Comparable<Employee> {

	private int age;
	private String name;

	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.age == o.age) {
			return 0;
		} else if (this.age > o.age) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}

}
