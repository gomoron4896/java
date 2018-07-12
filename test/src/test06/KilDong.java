package test06;

import java.util.Scanner;

public class KilDong extends Person {
	public void checkMuLuckyNum(int luckyNum) {
		Scanner scan = new Scanner(System.in);
		System.out.print("INSER YOUR LUCKY NUM : ");
		this.setLuckNum(scan.nextInt());
		System.out.println("YOUR NUMBER : " + this.luckyNum);
		if (this.luckyNum == luckyNum) {
			System.out.println("GET LUCKY");

		} else {
			System.out.println("GO HOME");

		}
		System.out.println("LUCKY NUM IS " + luckyNum);
	}

}
