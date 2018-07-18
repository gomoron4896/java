package test12;

import java.util.ArrayList;
import java.util.HashMap;

public class UserDAO {
	public ArrayList<HashMap> al = new ArrayList<HashMap>();
	public HashMap hm;

	public boolean setHm() {
		hm = new HashMap<String, String>();
		al.add(hm);
		return true;
	}

	public void instHm(int index, String key, String value) {
		al.get(index).put(key, value);
		System.out.println("입력 완료 : " + al.get(index).get(key));
	}

	// public boolean getH
}
