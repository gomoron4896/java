package test08;

public class Arr {

	public static void main(String[] args) {
		int[][] arr = new int[2][];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}

		}

	}

}
