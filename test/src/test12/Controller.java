package test12;

public class Controller {

	public void callOrder(String order) {
		if ("1".equals(order)) {
			System.out.println("��������Ʈ �����մϴ�");
		} else if ("2".equals(order)) {
			System.out.println("���� �߰��� �����մϴ�");
		} else if ("3".equals(order)) {
			System.out.println("���� ������ �����մϴ�");
		} else if ("4".equals(order)) {
			System.out.println("���� ������ �����մϴ�");
		} else if ("q".equals(order)) {
			System.out.println("���α׷��� �����մϴ�");
		} else {
			System.out.println("�������� ���� ��ɾ�");
		}

	}

}
