package test03;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("���� �Է� �Ͻʽÿ�");
			int inNum = scan.nextInt();
			for (int j = 0; j < i; j++) {
				if (i != 0) {
					if (inNum == arr[j]) {
						System.out.println("�ߺ� �����Դϴ�.");
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
