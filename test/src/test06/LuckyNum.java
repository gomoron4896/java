package test06;

public class LuckyNum {
	private int luckyNum;

	LuckyNum() {
		luckyNum = (int)(Math.random()) * 10 + 1;

	}

	public void checkLuckyGuy(Person p) {
		if (p instanceof KilDong) {
			((KilDong) p).checkMuLuckyNum(luckyNum);

		}

	}

}
