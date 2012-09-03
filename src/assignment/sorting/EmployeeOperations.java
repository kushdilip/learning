package assignment.sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeOperations {
	private ArrayList<Employee> listOfEmployees;
	private String inFileName;

	public EmployeeOperations(String inFileName) {
		super();
		this.inFileName = inFileName;
		listOfEmployees = new ArrayList<Employee>();
	}

	public ArrayList<Employee> getData() throws Exception {
		String empData;
		String[] empDataArray;
		try {
			BufferedReader in = new BufferedReader(new FileReader(inFileName));
			while ((empData = in.readLine()) != null) {
				if (!empData.isEmpty()) {
					empDataArray = empData.split(",");
					if (empDataArray.length == 4) {
						listOfEmployees.add(new Employee(empDataArray[0],
								empDataArray[1], empDataArray[2], Integer
										.parseInt(empDataArray[3])));
					} else {
						in.close();
						throw new Exception("Some data has error");

					}
				}
			}
			in.close();
		} catch (IOException e) {
			System.out.println("Couldn't read the file");
		}
		return listOfEmployees;
	}

	public ArrayList<Employee> sortEmployee() {
		Collections.sort(listOfEmployees, new MySalaryComparable());
		return listOfEmployees;
	}

	public void printList() {
		if (listOfEmployees.isEmpty())
			System.out.println("First read the Data");
		else {
			System.out
					.println("EMPLOYEE DATA:\nID----NAME---DESIGNATION---SALARY\n");
			for (Employee emp : listOfEmployees) {
				System.out.println(emp.getEmloyeeID() + ": "
						+ emp.getEmployeeName() + ": " + emp.getEmployeeDesig()
						+ ": " + emp.getEmployeeSalary());
			}
		}
	}

}
