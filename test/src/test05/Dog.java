package test05;

public class Dog extends Animal {
	public String type;
	public Dog() {
		System.out.println("난 도그 생성자");
		
	}
	public void printIfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(type);
		
	}
}
