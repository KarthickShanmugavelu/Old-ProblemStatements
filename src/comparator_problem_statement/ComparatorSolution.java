package comparator_problem_statement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	public Employee(String string1, String string2) {
		this.firstName=string1;
		this.lastName=string2;
	}
	String firstName;
	String lastName;
}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		
		if(e1.firstName.compareTo(e2.firstName)<0) {
			return -1;
		}
		else if(e1.firstName.compareTo(e2.firstName)>0){
			return 1;
		}
		else {
			if(e1.lastName.compareTo(e2.lastName)<0) {
				return -1;
			}
			else if(e1.lastName.compareTo(e2.lastName)>0) {
				return 1;
			}
			else 
				return 0;
		}
			//return 0;
		
	}
	
}

public class ComparatorSolution {
	
	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("VIJAY","KUMAR"));
		emp.add(new Employee("VIJAY","ANAND"));
		emp.add(new Employee("AJAY","ANAND"));
		emp.add(new Employee("VIJAY","BHASKAR"));
		emp.add(new Employee("ZEFFRY","ADAMS"));
		
		Collections.sort(emp,new EmployeeComparator());
		
		for(Employee empl:emp) {
		System.out.print(empl.firstName+" "+empl.lastName);
		System.out.println();
		}
	}

}
