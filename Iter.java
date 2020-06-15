package advance;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter {
	public static void main(String[] args) {
		ArrayList<String> string = new ArrayList<>();
		string.add("1");
		string.add("2");
		string.add("3");

		for (Iterator<String> iterator = string.iterator(); iterator.hasNext();) {
			String tmp = iterator.next();
			System.out.println(tmp);
		}
	}

}
