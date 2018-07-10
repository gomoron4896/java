package test03;

public class Son extends Father {
	public String work() {
		return "아버지의 직업은 " + super.work() + ", 하지만 난 다른 일을 할껍니다.";
		
		
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.work());
		
	}
}
