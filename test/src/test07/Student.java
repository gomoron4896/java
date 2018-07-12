package test07;

public class Student {
	public String name;
	public int point;

	Student(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public static void main(String[] args) {
		Student[] st = new Student[3];
		st[0] = new Student("ºùºùÀÌ", 30);
		st[1] = new Student("¹Ö¹ÖÀÌ", 70);
		st[2] = new Student("¶ò¶òÀÌ", 40);

		for (int i = 0; i < st.length; i++) {
			for (int j = i+1; j < st.length; j++) {
				if((st[i].point) < (st[j].point)) {
					Student tmp = st[i];
					st[i] = st[j];
					st[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i<st.length; i++) {
			System.out.println(st[i].name);
			System.out.println(st[i].point);
		}

	}

}
