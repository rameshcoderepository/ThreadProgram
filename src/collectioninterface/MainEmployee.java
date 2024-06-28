package collectioninterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEmployee {

	public static void main(String[] args) {

		Employee employee1= new Employee(30, "A");
		Employee employee2= new Employee(21, "D");
		Employee employee3= new Employee(25, "C");
		Employee employee4= new Employee(27, "D");
		
		List<Employee> empList = new ArrayList<Employee>();	
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		
		Collections.sort(empList);
		
		for(Employee emp:empList) {
			System.out.println(emp.toString());
		}
	}
}
