package test03;

public class FuncTest {

	public void printLoop(int start, int end) {
		for (int a = start; a <= end; a++) {
			System.out.println(a);
		}
	}

	public void printLoop1(int start, int end) {
		for (int a = start; a >= end; a--) {
			System.out.println(a);
		}

	}

	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		// ft.printLoop(1, 10);
		ft.printLoop1(12, 3);
		// ft.printLoop(100, 120);

	}

}
