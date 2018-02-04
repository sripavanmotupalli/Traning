package examples;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee(1601010210, "Pavan", "San jose");

		/*
		 * Employee emp1 = new Employee(1601010211, "Rahul", "CA"); Employee
		 * emp2 = new Employee(1601010212, "Mahi", "NJ"); Employee emp3 = new
		 * Employee(1601010213, "Sree", "Ny"); Employee emp4 = new
		 * Employee(1601010214, "Renteth", "GeekSoft"); Employee emp5 = new
		 * Employee(1601010215, "Naresh", "PlainFelid Rd");
		 */
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp);
		employeeList.add(new Employee(1, "Rahul", "CA"));
		employeeList.add(new Employee(2, "Mahi", "NJ"));
		employeeList.add(new Employee(3, "Sree", "Ny"));
		employeeList.add(new Employee(4, "Renteth", "GeekSoft"));
		employeeList.add(new Employee(5, "Naresh", "PlainFelid Rd"));

		/*
		 * for (int i = 0; i < employeeList.size(); i++) { Employee empTemp =
		 * (Employee) employeeList.get(i);
		 * 
		 * if (empTemp.getEmployeeName().startsWith("M")) {
		 * System.out.println(empTemp.getEmployeeName()); }
		 * 
		 * }
		 */

		// Better way of iterating over the list
		int sumIds = 0;
		String appendNames = "";
		for (Employee empTemp : employeeList) {

			if (empTemp.getEmployeeName() != null && empTemp.getEmployeeName().startsWith("M")
					|| empTemp.getEmployeeAdders().startsWith("N")) {
				System.out.println(empTemp.toString());
				System.out.println(empTemp.getEmployeeName());
				sumIds += empTemp.getEmployeeId();
				appendNames += empTemp.getEmployeeName();
			}

		}

		System.out.println(sumIds);
		System.out.println(appendNames);

	}

}
