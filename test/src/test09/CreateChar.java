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
	
	//�ɷ�ġ �Է�
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
	
	//�ɷ�ġ ���
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
		System.out.println("�ٷ� : " + getStr());
		System.out.println("��ø : " + getDex());
		System.out.println("���� : " + getIntel());
		System.out.println("SP : " + getSP());
	}
	

}
