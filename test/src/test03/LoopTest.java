package test03;

import java.util.Scanner;

public class LoopTest {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 선언
		
		System.out.println("생성 할 배열의 갯수");
		int arrLength = scan.nextInt();
		System.out.println("채울 숫자의 배수");
		int mulStart = scan.nextInt();
		// 인수 입력 받음
		
		LoopMethod lt = new LoopMethod();
		lt.totalRunning(arrLength, mulStart);
		//인스턴스 클래스 생성 및 메서드 실행
	}
}
