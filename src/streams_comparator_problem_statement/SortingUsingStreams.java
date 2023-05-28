package streams_comparator_problem_statement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee> {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}

	int id;
	String name;
	int Salary;

	public Employee() {

	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Salary == other.Salary;
	}

	@Override
	public int compareTo(Employee e1) {
		if (this.getSalary() < e1.getSalary()) {
			return -1;
		}
		if (this.getSalary() > e1.getSalary()) {
			return 1;
		} else
			return 0;
	}

}

class EmpComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if (e1.getSalary() < e2.getSalary()) {
			return 1;
		}
		if (e1.getSalary() > e2.getSalary()) {
			return -1;
		} else
			return 0;
	}

}

public class SortingUsingStreams {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Sathish", 3000));
		empList.add(new Employee(1, "Dinesh", 10000));
		empList.add(new Employee(1, "Ramesh", 4000));
		empList.add(new Employee(1, "Suresh", 2000));

		// Using custom comparator
		System.out.println("==============Using custom comparator====================");
		Collections.sort(empList, new EmpComparator());
		for (Employee emp : empList) {
			System.out.println(emp);
		}

		empList.removeAll(empList);
		empList.add(new Employee(1, "Sathish", 3000));
		empList.add(new Employee(1, "Dinesh", 10000));
		empList.add(new Employee(1, "Ramesh", 4000));
		empList.add(new Employee(1, "Suresh", 2000));

		// Using inbuilt method
		System.out.println();
		System.out.println("==============Using Comparable & Collections.reverseOrder()====================");
		Collections.sort(empList, Collections.reverseOrder());
		for (Employee emp : empList) {
			System.out.println(emp);
		}

		empList.clear();
		empList.add(new Employee(1, "Sathish", 3000));
		empList.add(new Employee(1, "Dinesh", 10000));
		empList.add(new Employee(1, "Ramesh", 4000));
		empList.add(new Employee(1, "Suresh", 2000));

		// using Streams
		System.out.println();
		System.out.println("==============Using Streams====================");
		empList.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);

	}

}
