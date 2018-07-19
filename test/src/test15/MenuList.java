package test15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuList {
	private static ArrayList<HashMap<String, String>> menuList = new ArrayList<HashMap<String, String>>();

	public static int insertMenu(HashMap<String, String> menu) {
		menuList.add(menu);
		return menuList.size();
	}

	public static void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주문 할 메뉴를 입력하십시오.");
		String mName = scan.nextLine();
		System.out.println("가격을 입력하십시오.");
		String mPrice = scan.nextLine();
		System.out.println("몇 인분을 주문 할 지 입력하십시오.");
		String mCnt = scan.nextLine();
		HashMap<String, String> menu = new HashMap<String, String>();
		menu.put("mName", mName);
		menu.put("mPrice", mPrice);
		menu.put("mCnt", mCnt);

		int sorf = insertMenu(menu);
		if (sorf!=0) {
			System.out.println(sorf + "번 메뉴가 주문되었습니다.");
		} else {
			System.out.println("주문을 확인하지 못했습니다.");
		}
	}

	public static boolean moreOrder(String yn) {
		if (yn.equals("y")) {
			System.out.println("추가 주문 확인");
			return true;
		} else {
			System.out.println("주문 종료");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("***WELCOME***");
		boolean YorN = true;
		while (YorN == true) {
			inputData();
			System.out.println("주문을 더 하시겠습니까?");
			Scanner scan = new Scanner(System.in);
			YorN = moreOrder(scan.nextLine());
		}

		System.out.println("주문 이력은 이렇습니다.");
		System.out.println(menuList);

	}

}
