package test07;

public class ThreeSixNine {
	public static void main(String[] args) {
		int ranNum = 100;
		String str;
		int count = 0;

		for (int i = 1; i <= ranNum; i++) {
			str = i + "";
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

}
