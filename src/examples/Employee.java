package examples;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeAdders;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAdders() {
		return employeeAdders;
	}

	public void setEmployeeAdders(String employeeAdders) {
		this.employeeAdders = employeeAdders;
	}

	public Employee(int employeeId, String employeeName, String employeeAdders) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAdders = employeeAdders;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAdders="
				+ employeeAdders + "]";
	}
	

}
