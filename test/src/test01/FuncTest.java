package test01;

import java.util.Scanner;

public class FuncTest {
	public void add(int a, int b) {
		System.out.println("���ϱ� : " + (a+b));
		
	}
	public void min(int a, int b) {
		System.out.println("���� : " + (a-b));
		
	}
	
	public void mul(int a, int b) {
		System.out.println("���ϱ� : " + (a-b));
		
	}
	
	public void div(int a, int b) {
		System.out.println("������ : " + (a-b));
		
	}
	
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		ft.add(a, b);
		ft.min(a, b);
		ft.mul(a, b);
		ft.div(a, b);
	}

}
