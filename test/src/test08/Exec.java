package test08;

import java.util.Scanner;

public class Exec {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person[] ps = new Person[5];
		for(int i = 0; i<ps.length;i++) {
			ps[i] = new Person();
			ps[i].name = (i+1)+"번째 사람";
			System.out.println(i+1 + "번째 사람의 점수를 입력해주세요");
			ps[i].point = Integer.parseInt(scan.nextLine());
		}
		
		Person psn = new Person();
		psn.rankIn(ps);
		
		for(int i=0; i<ps.length; i++) {
			System.out.println(ps[i].name + "님의 점수는" + ps[i].point + "입니다.");
			System.out.println(ps[i].name + "님의 랭킹은" + ps[i].rank + "입니다.");
			System.out.println("");
		}
		
	}
}
