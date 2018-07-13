package test08;

public class Person {
	String name;
	int point;
	int rank = 1;

	void rankIn(Person[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].point < arr[j].point) {
					arr[i].rank++;
					// break;
				}
			}
		}
	}
}
