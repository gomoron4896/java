package test03;

/*
���ϴ� ��(mulStart)�� ����� ���ϴ� ũ��(arrLength)�� �迭�� �ְ� ����ϴ� �ڵ�
�����Ƽ� ������ Array�� �����߰� �ٸ� �͵��� �޼ҵ忡�� �ٷ� return��
������ �޼ҵ带 ���� Ȱ��������, �ڵ尡 �������� ���� ��
*/

public class LoopMethod {
	private int[] intArr; // �迭 ���� ����

	public int[] setArr(int arrLength) {
		intArr = new int[arrLength];
		return intArr;

	} // �μ��� �����ؼ� �迭�� ���� �� ��������� ����, �����ϴ� �޼ҵ�

	public int mul(int mulStart, int mul) {
		return mulStart * (++mul);

	} // mulStart�� ����� �����ϴ� �޼ҵ�

	public void loop(int arrLength, int mulStart, int[] arr) {
		for (int i = 0; i < arrLength; i++) {

			arr[i] = mul(mulStart, i);
		}
	} // arrLength��ŭ �ݺ��ϴ�, mul()�� ���� ����� �����Ͽ� �迭�� �ִ� �޼ҵ� 

	public void print(int arrLength) {
		for (int i = 0; i < arrLength; i++) {
			System.out.println(intArr[i]);
		}

	} // arrLength��ŭ �ݺ��ϴ� �迭�� ������ ��� �޼ҵ�

	public void totalRunning(int arrLength, int mulStart) {
		setArr(arrLength);
		loop(arrLength, mulStart, intArr);
		print(arrLength);

	} // �迭 ����, ����� ���� �� �Է�, ����� �ϳ��� ���� �޼ҵ�

}
