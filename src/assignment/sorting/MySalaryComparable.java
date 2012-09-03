package assignment.sorting;

import java.util.Comparator;

public class MySalaryComparable implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2){
		int s1 = e1.getEmployeeSalary();
		int s2 = e2.getEmployeeSalary();
		return (s1 > s2 ? 1 : (s1 == s2 ? 0 : -1));
	}
}
