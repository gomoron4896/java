package test03;

/*
원하는 수(mulStart)의 배수를 원하는 크기(arrLength)의 배열에 넣고 출력하는 코드
귀찮아서 변수는 Array만 선언했고 다른 것들은 메소드에서 바로 return함
때문에 메소드를 많이 활용했지만, 코드가 정갈하진 않은 듯
*/

public class LoopMethod {
	private int[] intArr; // 배열 변수 선언

	public int[] setArr(int arrLength) {
		intArr = new int[arrLength];
		return intArr;

	} // 인수를 대입해서 배열을 생성 후 멤버변수에 저장, 리턴하는 메소드

	public int mul(int mulStart, int mul) {
		return mulStart * (++mul);

	} // mulStart의 배수를 생성하는 메소드

	public void loop(int arrLength, int mulStart, int[] arr) {
		for (int i = 0; i < arrLength; i++) {

			arr[i] = mul(mulStart, i);
		}
	} // arrLength만큼 반복하는, mul()을 통해 배수를 생성하여 배열에 넣는 메소드 

	public void print(int arrLength) {
		for (int i = 0; i < arrLength; i++) {
			System.out.println(intArr[i]);
		}

	} // arrLength만큼 반복하는 배열의 데이터 출력 메소드

	public void totalRunning(int arrLength, int mulStart) {
		setArr(arrLength);
		loop(arrLength, mulStart, intArr);
		print(arrLength);

	} // 배열 생성, 배수의 생성 및 입력, 출력을 하나로 묶은 메소드

}
