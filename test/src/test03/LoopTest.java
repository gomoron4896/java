package test03;

import java.util.Scanner;

public class LoopTest {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner ����
		
		System.out.println("���� �� �迭�� ����");
		int arrLength = scan.nextInt();
		System.out.println("ä�� ������ ���");
		int mulStart = scan.nextInt();
		// �μ� �Է� ����
		
		LoopMethod lt = new LoopMethod();
		lt.totalRunning(arrLength, mulStart);
		//�ν��Ͻ� Ŭ���� ���� �� �޼��� ����
	}
}
