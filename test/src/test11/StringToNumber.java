package test11;

import java.util.Scanner;

public class StringToNumber {

	static Scanner scan = new Scanner(System.in);
	static int num = 0;
	public static boolean parseInt() {
		try {
			System.out.println("���ڸ� �Է��Ͻʽÿ�");
			num = Integer.parseInt(scan.nextLine());
			return false;
		} catch (NumberFormatException nfe) {
			System.out.println("TRY AGAIN");
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("���� ��ȯ ���α׷� ����");

		boolean isOk = true;
		while (isOk) {
			isOk = parseInt();
		}
		System.out.println("�Է� ���� ���� : " + num);
		System.out.println("���α׷��� �������� �Ǿ����ϴ�");

		try {
			
		} catch(NumberFormatException nfe) {
			
		}
	}
}
