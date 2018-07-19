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
		System.out.println("�ֹ� �� �޴��� �Է��Ͻʽÿ�.");
		String mName = scan.nextLine();
		System.out.println("������ �Է��Ͻʽÿ�.");
		String mPrice = scan.nextLine();
		System.out.println("�� �κ��� �ֹ� �� �� �Է��Ͻʽÿ�.");
		String mCnt = scan.nextLine();
		HashMap<String, String> menu = new HashMap<String, String>();
		menu.put("mName", mName);
		menu.put("mPrice", mPrice);
		menu.put("mCnt", mCnt);

		int sorf = insertMenu(menu);
		if (sorf!=0) {
			System.out.println(sorf + "�� �޴��� �ֹ��Ǿ����ϴ�.");
		} else {
			System.out.println("�ֹ��� Ȯ������ ���߽��ϴ�.");
		}
	}

	public static boolean moreOrder(String yn) {
		if (yn.equals("y")) {
			System.out.println("�߰� �ֹ� Ȯ��");
			return true;
		} else {
			System.out.println("�ֹ� ����");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("***WELCOME***");
		boolean YorN = true;
		while (YorN == true) {
			inputData();
			System.out.println("�ֹ��� �� �Ͻðڽ��ϱ�?");
			Scanner scan = new Scanner(System.in);
			YorN = moreOrder(scan.nextLine());
		}

		System.out.println("�ֹ� �̷��� �̷����ϴ�.");
		System.out.println(menuList);

	}

}
