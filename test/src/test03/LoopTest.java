package test03;

import java.util.Scanner;

public class LoopTest {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("생성 할 배열의 갯수");
		int arrLength = scan.nextInt();
		System.out.print("채울 숫자의 배수");
		int mulStart = scan.nextInt();
		
		LoopMethod lt = new LoopMethod();
		lt.totalRunning(arrLength, mulStart);
	}
}
