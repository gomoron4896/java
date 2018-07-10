package test03;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("값을 입력 하십시오");
			int inNum = scan.nextInt();
			for (int j = 0; j < i; j++) {
				if (i != 0) {
					if (inNum == arr[j]) {
						System.out.println("중복 숫자입니다.");
						i--;
						continue;
					}
				}
			}
			arr[i] = inNum;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
