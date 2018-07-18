package test12;

public class Controller {

	public void callOrder(String order) {
		if ("1".equals(order)) {
			System.out.println("유저리스트 생성합니다");
		} else if ("2".equals(order)) {
			System.out.println("유저 추가를 실행합니다");
		} else if ("3".equals(order)) {
			System.out.println("유저 수정을 실행합니다");
		} else if ("4".equals(order)) {
			System.out.println("유저 삭제를 실행합니다");
		} else if ("q".equals(order)) {
			System.out.println("프로그램을 종료합니다");
		} else {
			System.out.println("존재하지 않은 명령어");
		}

	}

}
