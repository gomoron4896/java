package test07;

public class Human {
	protected String name;
	protected int age;
	public int num;

	public Human(String name, int age, int num) {
		this.name = name;
		this.age = age;
		this.num = num;

	}

	public void printHuman() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("내 목표는 " + num + "등");

	}

}
