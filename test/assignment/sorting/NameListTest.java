package assignment.sorting;

import org.junit.Test;

import assignment.sorting.NameList;

public class NameListTest {

	@Test
	public void testSortName() {
//		fail("Not yet implemented");
		String[] myNames = {"dilip", "mohit", "rahul", "abhishek"};
		NameList nameList = new NameList(myNames);
		nameList.sortName();
		nameList.printNameList();
		
	}

//	@Test
	public void testPrintNameList() {
//		fail("Not yet implemented");
		String[] myNames = {"dilip", "mohit", "rahul", "abhishek"};
		NameList nameList = new NameList(myNames);
		nameList.printNameList();
	}

}
