package test07;

import java.util.Scanner;

public class Monkey extends Human {
	private String specie;
	private String wlFoot;

	Monkey(String specie, String wlFoot) {
		super("��⼷", 25, 1);
		this.specie = specie;
		this.wlFoot = wlFoot;
	}

	public void printHuman() {
		System.out.println("���� : " + specie + " " + wlFoot);
		super.printHuman();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ������?");
		String specie = scan.nextLine(); 
		System.out.println("�߷� ����ϴ� ������ ������?");
		int wlFoot = scan.nextInt();
		
		Human mk = new Monkey(wlFoot + "�������ϴ�", specie);
		((Monkey)mk).printHuman();

	}

}
