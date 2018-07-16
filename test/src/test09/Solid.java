package test09;

public class Solid extends Cart {
	public Solid(String name, int speed, int damage) {
		super(name, speed, damage);	
	}
	
	public String attack(int damage) {
		return (this.damage + damage)+ "만큼 더 강력하게 공격합니다.";
		
	}
	
}
