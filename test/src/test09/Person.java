package test09;

public class Person extends Animal implements Action {

	@Override
	public void eat() {
		System.out.println("식사 중");
	}

	@Override
	public void sleep() {
		System.out.println("수면 중");
		
	}

	@Override
	public void move() {
		System.out.println("이동 중");
		
	}
	
	public void work() {
		System.out.println("WORK HARD");
		
	}
	
	
}
