package test02;

import java.util.Scanner;

public class StudentCmd {	
	public String which(String choice, String inst) {
		
		if(choice.equals("��")) {
			return inst;
		} else if(choice.equals("�̸�")) {
			return inst;
		} else if(choice.equals("�г�")) {
			return inst;
		} else {
			return "�Է��� ������ ������ �� �� �����ϴ�.";
		}
	}
	
	public void take() {
		Scanner scan = new Scanner(System.in);
		System.out.println("� ������ �Է��Ͻðڽ��ϱ�? (��, �̸�, �г�)");
		String choice = scan.nextLine();
		System.out.println("������ ���� �Է����ּ���");
		String inst = scan.nextLine();
		scan.close();
		which(choice, inst);
	}
	
//	public void printWhich() {
//		System.out.println("� �л��� ������ �о���ڽ��ϱ�?");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//	}


}
