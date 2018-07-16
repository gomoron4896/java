package test09;

public class Cart implements Drive {
		protected String name;
		protected int speed;
		protected int damage;
		
		Cart(String name, int speed, int damahe) {
			this.name = name;
			this.speed = speed;
			this.damage = damage;
		}
		
		
	@Override
	public String attack(int damage) {
		return damage + "로 공격합니다.";
	}

	@Override
	public void start() {
		System.out.println(speed + "로 달립니다.");

	}

	@Override
	public void stop() {
		System.out.println(name + "이(가) 정지합니다.");
	}

}
