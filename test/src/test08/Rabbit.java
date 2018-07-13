package test08;

public class Rabbit {
	public String rabbitName;
	public Integer num;
	public int rank;

	Rabbit(String name, int rank) {
		this.rabbitName = name;
		this.rank = rank;
	}

	void upper(Rabbit[] arrRb) {
		for (int i = 0; i < arrRb.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrRb[i].rank > arrRb[j].rank) {
					Rabbit tmp = arrRb[j];
					arrRb[j] = arrRb[i];
					arrRb[i] = tmp;

				}
			}
		}
	}

	void downer(Rabbit[] arrRb) {
		for (int i = 0; i < arrRb.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrRb[i].rank < arrRb[j].rank) {
					Rabbit tmp = arrRb[j];
					arrRb[j] = arrRb[i];
					arrRb[i] = tmp;

				}
			}
		}
	}

	void printInfo(Rabbit[] arrRb) {
		for (int i = 0; i < arrRb.length; i++) {
			System.out.println(arrRb[i].rabbitName);
			System.out.println(arrRb[i].rank);
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Rabbit[] r = new Rabbit[10];

		for (int i = 0; i < r.length; i++) {
			int rank = (int) (Math.random() * 10) + 1;
			boolean yon = true;

			if (i >= 1) {
				for (int j = 0; j < i; j++) {
					if (rank == r[j].rank) {
						yon = false;
						break;
					}
				}
			}

			if (yon == true) {
				r[i] = new Rabbit(i+1 + "¹øÂ° Åä³¢", rank);
			} else if (yon == false) {
				i--;
			}
		}

		Rabbit rb = new Rabbit("¾È³ç", 1);
		rb.upper(r);
		rb.printInfo(r);
		// rb.downer(r);
		// rb.printInfo(r);

	}

}
