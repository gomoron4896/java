package test05;

public class LapTop extends Computer {
	public int weight;
	
	LapTop(String cpu, String hdd, int ram, int weight) {
		super.cpu = cpu;
		super.hdd = hdd;
		super.ram = ram;
		this.weight = weight;
	}

	void printInfo() {
		System.out.println(cpu);
		System.out.println(hdd);
		System.out.println(ram);
		System.out.println(weight);
		
	}

}
