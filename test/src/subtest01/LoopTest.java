package subtest01;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 값을 입력하십시오.");
		int strtNum = scan.nextInt();
		System.out.println("종료 값을 입력하십시오.");
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
