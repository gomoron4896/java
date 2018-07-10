package test03;

public class LoopMethod {
	private int[] intArr;
	private int mulResult;

	public int[] setArr(int arrLength) {
		intArr = new int[arrLength];
		return intArr;

	}

	public void loop(int arrLength, int mulStart, int[] arr) {
		for (int i = 0; i < arrLength; i++) {
			mul(mulStart, i);
			arr[i] = mulResult;
		}
	}

	public void mul(int mulStart, int mul) {
		mulResult = mulStart * (++mul);

	}

	public void print(int arrLength) {
		for (int i = 0; i < arrLength; i++) {
			System.out.println(intArr[i]);
		}

	}

	public void totalRunning(int arrLength, int mulStart) {
		setArr(arrLength);
		loop(arrLength, mulStart, intArr);
		print(arrLength);

	}


}
