package test01;

import java.util.Scanner;

public class Calc {
	String op;
	int num1;
	int num2;

	public int add(int a, int b) {
		return (a + b);
	}

	public int min(int a, int b) {
		return (a - b);
	}

	public int mul(int a, int b) {
		return (a * b);
	}

	public int div(int a, int b) {
		return (a / b);
	}

	private void calc(String op, int num1, int num2) {
		if (op.equals("+")) {
			System.out.println(add(num1, num2));
		} else if (op.equals("-")) {
			System.out.println(min(num1, num2));
		} else if (op.equals("*")) {
			System.out.println(mul(num1, num2));
		} else if (op.equals("/")) {
			System.out.println(div(num1, num2));
		} else {
			System.out.println("연산자가 잘못됐습니다.");
		}
	}
	
	public void inst() {
		
		Scanner scan = new Scanner(System.in);
		
		op = scan.nextLine();
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		calc(op,num1,num2);
		
	}

	public static void main(String[] args) {
//		Calc cl = new Calc();
//		Scanner scan = new Scanner(System.in);
//		System.out.print("연산자 입력");
//		String select = scan.nextLine();
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//
//		if (select.equals("+")) {
//			System.out.println(cl.add(num1, num2));
//		} else if (select.equals("-")) {
//			System.out.println(cl.min(num1, num2));
//		} else if (select.equals("*")) {
//			System.out.println(cl.mul(num1, num2));
//		} else if (select.equals("/")) {
//			System.out.println(cl.div(num1, num2));
//		}

	}

}
1. �ڹٿ��� ��ӿ� ���ؼ� ������ ���� ���ּ���.
����̶� ����Ŭ������ ���� Ŭ������ Ư¡�� �ʵ�� �޼ҵ带 �״�� ���������� �ִ� Ư���̴�. �׸��� (����Ŭ����) extends (����Ŭ����) �� ���踦 �����Ѵ�.



2. �����ε��� ���ؼ� �����Ͽ� �������ּ���.
���� �޼ҵ������� ���� ������ �ٸ� �� �ٸ��޼ҵ�� ���ǵǴ°� 


3. �������̵��� ���ؼ� �����Ͽ� �������ּ���.
���� Ŭ������ ���Ǹ� ���� ����Ŭ������ �����ϰ���� �� , ���� Ŭ�������� �����ϴ� ��
super �� this��  �̿��Ѵ�.

4. �����ڿ� �޼���� �������� ���� �����Ͽ� �������ּ���.

-�޼ҵ��� �̸��� �ҹ��ڷ� �����ؾ������� , �������� �̸��� Ŭ�����̸��� �Ȱ��ƾ��Ѵ�.
�޼ҵ�� ��ȯ���� �ݵ�þ��� �����ڴ� ��ȯ���� ����
}