package assignment.sorting;

import java.util.Arrays;

//import java.util.List;

public class NameList {
	private String[] myNames;

	public NameList(String[] myNames) {
		super();
		this.myNames = myNames;
	}

	public void sortName() {
		Arrays.sort(myNames);
	}

	public void printNameList(){
		for (String str: myNames) {
			System.out.println(str);
		}
	}
}
