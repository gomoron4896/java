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
//		System.out.println("� �л��� ������ �о���ڽ��ϱ�?");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//	}

}

//�ش� Ŭ������ class name grade �� ����ϴ� �Լ��� 1���� ����