package test07;

import java.util.Scanner;

public class Monkey extends Human {
	private String specie;
	private String wlFoot;

	Monkey(String specie, String wlFoot) {
		super("김기섭", 25, 1);
		this.specie = specie;
		this.wlFoot = wlFoot;
	}

	public void printHuman() {
		System.out.println("종족 : " + specie + " " + wlFoot);
		super.printHuman();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("내 종족은?");
		String specie = scan.nextLine(); 
		System.out.println("발로 사용하는 부위의 갯수는?");
		int wlFoot = scan.nextInt();
		
		Human mk = new Monkey(wlFoot + "족보행하는", specie);
		((Monkey)mk).printHuman();

	}

}
