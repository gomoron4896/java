package test12;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("***유저 프로그램***");
		System.out.println("1. 유저 리스트, 2. 유저 생성, 3. 유저 수정, 4. 유저 삭제, q. 종료");
		String order = "";
		Controller c = new Controller();
		Service s = new Service();

		while (!"q".equals(order)) {
			System.out.println("알맞은 명령어를 입력하십시오");
			order = scan.nextLine();
			
			if (order.equals("1")) {
				c.callOrder(order);
				System.out.println(s.linkSetHm());
				
			} else if (order.equals("2")) {
				c.callOrder(order);
				System.out.println("인덱스");
				String[] arrStr = new String[3];
				String str = scan.nextLine();
				arrStr = str.split(",");
				s.instHm(Integer.parseInt(arrStr[0]), arrStr[1], arrStr[2]);
			}

		}
		System.out.println("***유저 프로그램 종료***");

	}

}
