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
		return damage + "�� �����մϴ�.";
	}

	@Override
	public void start() {
		System.out.println(speed + "�� �޸��ϴ�.");

	}

	@Override
	public void stop() {
		System.out.println(name + "��(��) �����մϴ�.");
	}

}
