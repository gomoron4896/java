package test03;

public class PrintObject {
	String str = "poStr";
	
	public String toString() {
		return "�� ������ " + str + "�̶�� ���� ������ �ֽ��ϴ�.";
		
	}
	
	public static void main(String[] args) {
		String str = "str";
		PrintObject po = new PrintObject();
		System.out.print(po);
	}

}
