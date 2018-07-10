package test02;

import java.util.Scanner;

public class StudentCmd {	
	public String which(String choice, String inst) {
		
		if(choice.equals("반")) {
			return inst;
		} else if(choice.equals("이름")) {
			return inst;
		} else if(choice.equals("학년")) {
			return inst;
		} else {
			return "입력할 정보의 종류를 알 수 없습니다.";
		}
	}
	
	public void take() {
		Scanner scan = new Scanner(System.in);
		System.out.println("어떤 정보를 입력하시겠습니까? (반, 이름, 학년)");
		String choice = scan.nextLine();
		System.out.println("정보의 값을 입력해주세요");
		String inst = scan.nextLine();
		scan.close();
		which(choice, inst);
	}
	
//	public void printWhich() {
//		System.out.println("어떤 학생의 정보를 읽어오겠습니까?");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//	}


}
