package test12;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("***���� ���α׷�***");
		System.out.println("1. ���� ����Ʈ, 2. ���� ����, 3. ���� ����, 4. ���� ����, q. ����");
		String order = "";
		Controller c = new Controller();
		Service s = new Service();

		while (!"q".equals(order)) {
			System.out.println("�˸��� ��ɾ �Է��Ͻʽÿ�");
			order = scan.nextLine();
			
			if (order.equals("1")) {
				c.callOrder(order);
				System.out.println(s.linkSetHm());
				
			} else if (order.equals("2")) {
				c.callOrder(order);
				System.out.println("�ε���");
				String[] arrStr = new String[3];
				String str = scan.nextLine();
				arrStr = str.split(",");
				s.instHm(Integer.parseInt(arrStr[0]), arrStr[1], arrStr[2]);
			}

		}
		System.out.println("***���� ���α׷� ����***");

	}

}
