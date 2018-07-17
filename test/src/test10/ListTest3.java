package test10;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		for (int i = 1; i <= 10; i++) {
			String name = "Å×½ºÆ®" + i;
			int grade = (int) (Math.random() * 10) + 1;
			sList.add(new Student(name, grade));
		}
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < sList.size(); i++) {
			for(int j = i+1; j < sList.size(); j++) {
				if(sList.get(i).grade < sList.get(j).grade) {
					Student tmp = sList.get(i);
					sList.set
					
				}
				
			}
		}


	}

}
