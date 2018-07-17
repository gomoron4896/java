package test11;

import java.util.Scanner;

public class StringToNumber {

	static Scanner scan = new Scanner(System.in);
	static int num = 0;
	public static boolean parseInt() {
		try {
			System.out.println("숫자를 입력하십시오");
			num = Integer.parseInt(scan.nextLine());
			return false;
		} catch (NumberFormatException nfe) {
			System.out.println("TRY AGAIN");
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("숫자 변환 프로그램 시작");

		boolean isOk = true;
		while (isOk) {
			isOk = parseInt();
		}
		System.out.println("입력 받은 숫자 : " + num);
		System.out.println("프로그램이 정상종료 되었습니다");

		try {
			
		} catch(NumberFormatException nfe) {
			
		}
	}
}
