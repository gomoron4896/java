package test09;

public class ForEach {

	public static void main(String[] args) {
		String[] arrStr = new String[4];
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = "�׽�Ʈ" + i;

		}

		for (String str : arrStr) {
			System.out.println(str);

		}

		String[][] multiArr = { { "1", "2", "3", "4" }, { "5" }, { "6", "7" } };

		for (String[] strs : multiArr) {
			for (String str : strs) {
				System.out.println(str);
			}
		}
	}
}
