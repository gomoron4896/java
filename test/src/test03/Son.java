package test03;

public class Son extends Father {
	public String work() {
		return "�ƹ����� ������ " + super.work() + ", ������ �� �ٸ� ���� �Ҳ��ϴ�.";
		
		
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.work());
		
	}
}
