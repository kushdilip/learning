package assignment.sorting;

import org.junit.Test;

public class EmployeeDataTest {

	@Test
	public void testSortEmployee() {
		String inFileName = "D:\\TavantTraining\\workspace\\Learning\\Data\\employeeFile.txt";
		EmployeeOperations myData = new EmployeeOperations(inFileName);

		try {
			myData.getData();
			myData.sortEmployee();
			myData.printList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
	}
}
