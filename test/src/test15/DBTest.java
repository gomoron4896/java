package test15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {
	public static ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();

	public static int instUser(HashMap<String, String> user) {
		int result = 0;
		int uNum = userList.size() + 1;
		try {
			user.put("uNum", uNum + "");
			userList.add(user);
			result = 1;
		} catch (Exception e) {
			System.out.println("I'M NOTHING");
		}
		return result;
	}

	public static void slctUserList() {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			System.out.println(i + 1 + "��° ���� ���� : " + user);
		}

	}

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		String name = scan.nextLine();
		System.out.println("���̸� �Է����ּ���");
		String age = scan.nextLine();
		hm.put("uName", name);
		hm.put("uAge", age);
		int cnt = instUser(hm);
		if (cnt == 1) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAILED");
		}
	}

	public static HashMap<String, String> getUser(String uName) {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			if (user.get("uName").equals(uName)) {
				return user;
			}
		}
		return null;
	}

	public static int reMoveUser(String uName) {
		int removed = 0;
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).get("uName").equals(uName)) {
				userList.remove(i);
				removed++;
			}
		}
		return removed;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String yorn = "Y";

		while (yorn.equals("Y") || yorn.equals("y")) {
			System.out.println("START");
			inputUser();
			System.out.println("AGAIN? Y/N");
			yorn = scan.nextLine();
		}

		System.out.println("ã����� ���� (��� ���� �Է� �� ����Ʈ ��ü ���");
		String findUser = scan.nextLine();

		if (findUser.equals("��� ����")) {
			slctUserList();
		} else {
			HashMap<String, String> searchUser = getUser(findUser);
			System.out.println("�˻��� ���� : " + searchUser);
		}

		System.out.println("���� ����");
		String removeUser = scan.nextLine();
		System.out.println("������ ���� �� : " + reMoveUser(removeUser) + "��");

		slctUserList();

		System.out.println("BYE");

	}

}
