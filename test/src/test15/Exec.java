package test15;

import java.util.HashMap;

import test15.impl.UserDAOImpl;

public class Exec {
	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		userInfo.put("uiName", "±è±â¼·");
		userInfo.put("uiAge", "25");
		userInfo.put("uiEtc", "¹è¾ÆÇÄ");
		if (udao.insertUserInfo(userInfo) == 1) {
			System.out.println("µî·Ï ¼º°ø");
		} else {
			System.out.println("µî·Ï ½ÇÆÐ");
		}

	}

}
