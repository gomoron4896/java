package test02;

import java.util.Scanner;

public class Student {
	private String name;
	private String grade;
	private String clazz;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setClazz(String Clazz) {
		this.clazz = clazz;
	}
	
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public String getClazz() {
		return clazz;
	}
	
//	public void printWhich() {
//		System.out.println("어떤 학생의 정보를 읽어오겠습니까?");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//	}

}

//해당 클래스의 class name grade 를 출력하는 함수는 1개로 가능