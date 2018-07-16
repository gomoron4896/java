package test10;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		for (int i = 1; i <= 5; i++) {
			String name = "Å×½ºÆ®" + i;
			int grade = (int) (Math.random() * 3) + 1;
			sList.add(new Student(name, grade));
			System.out.print(sList.get(i-1).name + ", ");
			System.out.println(sList.get(i-1).grade);
		}


	}

}
