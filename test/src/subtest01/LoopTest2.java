package subtest01;

import java.util.Scanner;

public class LoopTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 \",\"를 구분자로 입력해주십시오.");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		int[] nums = new int[numStrs.length];
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