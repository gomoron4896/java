package test04;

import java.util.Scanner;

public class SortMethod {
	private String splits;
	private String[] arrStr;
	private int[] arrNum;

	void setArrStr() {
		System.out.println("숫자를 입력");
		Scanner scan = new Scanner(System.in);
		splits = scan.nextLine();
		arrStr = splits.split(",");
		scan.close();
	}

	String[] getArrStr() {
		return arrStr;
	}

	public void setArrNum() {
		arrNum = new int[arrStr.length];
	}

	public int[] getArrNum() {
		return arrNum;
	}

	void initArr(String[] arrStr, int[] arrNum) {
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = Integer.parseInt(arrStr[i]);
			for (int j = 0; j < i; j++) {
				int temp;
				if (arrNum[j] < arrNum[i]) {
					temp = arrNum[j];
					arrNum[j] = arrNum[i];
					arrNum[i] = temp;
				}
			}
		}
	}

	void printArr(int[] arrNum) {
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}
}
