package test04;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		SortMethod sm = new SortMethod();
		sm.setArrStr();
		sm.setArrNum();
		sm.initArr(sm.getArrStr(), sm.getArrNum());
		sm.printArr(sm.getArrNum());
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 ,로 구분하여 입력");
//		String str = scan.nextLine();
//		String[] arrStr = str.split(",");
//		int[] arrNum = new int[arrStr.length];
//		scan.close();
//
//		for (int i = 0; i < arrNum.length; i++) {
//			arrNum[i] = Integer.parseInt(arrStr[i]);
//			for (int j = 0; j < i; j++) {
//				int temp;
//				if (arrNum[j] < arrNum[i]) {
//					temp = arrNum[j];
//					arrNum[j] = arrNum[i];
//					arrNum[i] = temp;
//				}
//			}
//		}
//
//		for (int i = 0; i < arrNum.length; i++) {
//			System.out.println(arrNum[i]);
//
//		}

	}

}
