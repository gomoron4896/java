package test12;

public class Service extends UserDAO {
	public String linkSetHm() {
		if (setHm()) {
			return "蜡历 积己 肯丰";
		} else {
			return "蜡历 积己 角菩";
		}

	}

	public void linkInstHm(int index, String key, String value) {
		instHm(index, key, value);

	}

}
