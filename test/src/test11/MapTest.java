package test11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("��¥", "7/17");
		hm.put("����", "ȭ����");
		hm.put("�����", "�ʺ�");
		ArrayList<HashMap> arrList = new ArrayList<HashMap>();
		arrList.add(hm);
		System.out.println(arrList.get(0));
		hm.get(key);
		
		
		
	}

}
