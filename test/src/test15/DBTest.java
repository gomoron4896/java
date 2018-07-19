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
			System.out.println(i + 1 + "번째 유저 정보 : " + user);
		}

	}

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("나이를 입력해주세요");
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

		System.out.println("찾고싶은 유저 (모든 유저 입력 시 리스트 전체 출력");
		String findUser = scan.nextLine();

		if (findUser.equals("모든 유저")) {
			slctUserList();
		} else {
			HashMap<String, String> searchUser = getUser(findUser);
			System.out.println("검색된 유저 : " + searchUser);
		}

		System.out.println("지울 유저");
		String removeUser = scan.nextLine();
		System.out.println("지워진 유저 수 : " + reMoveUser(removeUser) + "명");

		slctUserList();

		System.out.println("BYE");

	}

}
