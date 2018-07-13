package test08;

public class SortTest {

	void test(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	void printInfo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 2, 1, 4, 5, 8 };
		SortTest st = new SortTest();
		st.test(arr);
		st.printInfo(arr);

	}

}
