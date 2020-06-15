package advance;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_test {
		public static void main(String[] args) {
			Map <String, String> map = new HashMap<>();
			Map <String, String> map2 = new Hashtable<>();
			Map <String, String> map3 = new LinkedHashMap<>();
			Map <String, String> map4 = new TreeMap<>();

			map.put("a","b");
			String s = map.get("a");
			System.out.println(s);
			System.out.println(map.containsValue("b"));
			System.out.println(map.containsKey("a"));
			System.out.println(map.size());
			
			System.out.println(map.remove("a"));

			
			
		}

}
