package test12;

public class Service extends UserDAO {
	public String linkSetHm() {
		if (setHm()) {
			return "���� ���� �Ϸ�";
		} else {
			return "���� ���� ����";
		}

	}

	public void linkInstHm(int index, String key, String value) {
		instHm(index, key, value);

	}

}
