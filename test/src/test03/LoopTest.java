package test03;

import java.util.Scanner;

public class LoopTest {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� �迭�� ����");
		int arrLength = scan.nextInt();
		System.out.print("ä�� ������ ���");
		int mulStart = scan.nextInt();
		
		LoopMethod lt = new LoopMethod();
		lt.totalRunning(arrLength, mulStart);
	}
}
