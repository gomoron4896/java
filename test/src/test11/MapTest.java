package test11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("날짜", "7/17");
		hm.put("요일", "화요일");
		hm.put("기념일", "초복");
		ArrayList<HashMap> arrList = new ArrayList<HashMap>();
		arrList.add(hm);
		System.out.println(arrList.get(0));
		hm.get(key);
		
		
		
	}

}
