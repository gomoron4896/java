package test01;

public class ClassTest {
	int num;
	String str;
	
	public void test() {
		System.out.println("전 누구인가요");
		
	}
	
	
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		System.out.println(ct.num);
		ct.test();
		
	}

}
