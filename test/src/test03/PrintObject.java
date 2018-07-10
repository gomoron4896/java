package test03;

public class PrintObject {
	String str = "poStr";
	
	public String toString() {
		return "이 변수는 " + str + "이라는 값을 가지고 있습니다.";
		
	}
	
	public static void main(String[] args) {
		String str = "str";
		PrintObject po = new PrintObject();
		System.out.print(po);
	}

}
