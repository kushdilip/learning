package assignment.sorting;

import java.util.HashMap;

public class Employee {
	private String employeeID;
	private String employeeName;
	private String employeeDesig;
	private int employeeSalary;

	public Employee(String employeeID, String employeeName,
			String employeeDesig, int salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeDesig = employeeDesig;
		this.employeeSalary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeID == null) ? 0 : employeeID.hashCode());
		return result;
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
		if (employeeID == null) {
			if (other.employeeID != null)
				return false;
		} else if (!employeeID.equals(other.employeeID))
			return false;

		return true;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeDesig(String employeeDesig) {
		this.employeeDesig = employeeDesig;
	}

	public void setEmployeeID(int salary) {
		this.employeeSalary = salary;
	}

	public String getEmloyeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDesig() {
		return employeeDesig;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee("K0104", "Dilip", "SE", 34000);
		Employee employee2 = new Employee("K0105", "mohit", "SE",
				34000);

		System.out.println("Employees are equal: "
				+ employee1.equals(employee2));
		System.out.println("Employees hashcode are equal "
				+ employee1.hashCode() + " " + employee2.hashCode() + " "
				+ (employee1.hashCode() == employee2.hashCode()));

		HashMap<String, Employee> hashMap = new HashMap<String, Employee>();
		hashMap.put("K0106", employee1);
		hashMap.put("K0105", employee2);
		
		System.out.println("employee count "+ hashMap.size());
		System.out.println("remove  employe K0104: " +hashMap.remove("K0104"));
		System.out.println("employee count "+ hashMap.size());
	}

}
