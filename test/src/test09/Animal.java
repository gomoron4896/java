package test09;

public class Animal implements Action {

	@Override
	public void eat() {
		System.out.println("식사 끝");
	}

	@Override
	public void sleep() {
		System.out.println("수면 끝");
		
	}

	@Override
	public void move() {
		System.out.println("이동 끝");
		
	}
	
	public void hunt() {
		System.out.println("GOOD HUNTING");
	}

}
