package test08;

import java.util.Scanner;

public class Exec {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person[] ps = new Person[5];
		for(int i = 0; i<ps.length;i++) {
			ps[i] = new Person();
			ps[i].name = (i+1)+"��° ���";
			System.out.println(i+1 + "��° ����� ������ �Է����ּ���");
			ps[i].point = Integer.parseInt(scan.nextLine());
		}
		
		Person psn = new Person();
		psn.rankIn(ps);
		
		for(int i=0; i<ps.length; i++) {
			System.out.println(ps[i].name + "���� ������" + ps[i].point + "�Դϴ�.");
			System.out.println(ps[i].name + "���� ��ŷ��" + ps[i].rank + "�Դϴ�.");
			System.out.println("");
		}
		
	}
}
