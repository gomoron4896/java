package test09;

public class Person extends Animal implements Action {

	@Override
	public void eat() {
		System.out.println("�Ļ� ��");
	}

	@Override
	public void sleep() {
		System.out.println("���� ��");
		
	}

	@Override
	public void move() {
		System.out.println("�̵� ��");
		
	}
	
	public void work() {
		System.out.println("WORK HARD");
		
	}
	
	
}
