package test09;

public class CreateChar implements Character {
	private int str;
	private int dex;
	private int intel;
	private String sp;
	
	CreateChar(int str, int dex, int intel, String sp) {
		setStr(str);
		setDex(dex);
		setIntel(intel);
		setSP(sp);
	}
	
	//능력치 입력
	public void setStr(int abil) {
		this.str = abil;
	}
	
	public void setDex(int abil) {
		this.dex = abil;
	}
	
	public void setIntel(int abil) {
		this.intel = abil;
	}
	
	public void setSP(String sp) {
		this.sp = sp;
	}
	
	//능력치 출력
	public int getStr() {
		return this.str;
	}
	
	public int getDex() {
		return this.dex;
	}
	
	public int getIntel() {
		return this.intel;
	}
	
	public String getSP() {
		return this.sp;
	}
	
	public void urChar() {
		System.out.println("근력 : " + getStr());
		System.out.println("민첩 : " + getDex());
		System.out.println("지능 : " + getIntel());
		System.out.println("SP : " + getSP());
	}
	

}
