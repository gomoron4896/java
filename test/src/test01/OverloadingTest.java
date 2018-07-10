package test01;

public class OverloadingTest {
	int a = 3;
	
	public void test() {
		
		
	}
	public int test(int a) {
		return 0;
		
	}
	public int test(String b) {
		return 0;
		
	}
	public int test(int a, String b) {
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		ot.a = 10;
		
		
	}

}
