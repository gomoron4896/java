package test10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("CHY");
		strList.add("HRK");
		strList.add("MKT");
		strList.add("MK");
		strList.add("IOR");
		System.out.println(strList.size());
		strList.remove("HRK");
		
		
		
		int idx = strList.indexOf("MK");
		System.out.println(idx);
		
//		for (String str : strList) {
//			System.out.print(str);
//
//		}

	}

}
