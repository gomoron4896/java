package subtest01;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� �Է��Ͻʽÿ�.");
		int strtNum = scan.nextInt();
		System.out.println("���� ���� �Է��Ͻʽÿ�.");
		int endNum = scan.nextInt();
		scan.close();

		if (strtNum > endNum) {
			for (int i = strtNum; i >= endNum; i--) {
				System.out.println(i);
			}
		} else {
			for (int i = strtNum; i <= endNum; i++) {
				System.out.println(i);
			}

		}

	}

}
