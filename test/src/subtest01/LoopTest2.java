package subtest01;

import java.util.Scanner;

public class LoopTest2 {

	public static void main(String[] args) {
		// 최소, 최대값을 비교할 숫자 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 \",\"를 구분자로 입력해주십시오.");
		String numStr = scan.nextLine();
		
		// split으로 String배열 numStrs 생성
		String[] numStrs = numStr.split(",");
		// 이후 numStrs와 같은 크기의 int형 배열 nums 생성
		int[] nums = new int[numStrs.length];
		
		// parseInt() 메서드를 통해 int형으로 변환한 numStrs의 밸류를 nums로 넘김
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