package subtest01;

import java.util.Scanner;

public class LoopTest2 {

	public static void main(String[] args) {
		// �ּ�, �ִ밪�� ���� ���� �Է�
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� \",\"�� �����ڷ� �Է����ֽʽÿ�.");
		String numStr = scan.nextLine();
		
		// split���� String�迭 numStrs ����
		String[] numStrs = numStr.split(",");
		// ���� numStrs�� ���� ũ���� int�� �迭 nums ����
		int[] nums = new int[numStrs.length];
		
		// parseInt() �޼��带 ���� int������ ��ȯ�� numStrs�� ����� nums�� �ѱ�
		for (int i = 0; i < numStrs.length; i++) {
			nums[i] = Integer.parseInt(numStrs[i]);
		}
		  

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}

			}

		}
		//
		
		if (nums[0] < nums[nums.length-1]) {
			for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = nums[0]; i >= nums[nums.length - 1]; i--) {
				System.out.println(i);
			}

		}
	}
}