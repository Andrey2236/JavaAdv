package advance;

import java.util.LinkedList;
import java.util.List;

public class Linked_list1 {
	public static void main(String[] args) {
	 //линкедлист это не массив а обекты связанные в общую структуру
		List<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.size();
		list.remove(0);
		for(String string : list) {
			System.out.println(string);
		}
		list.remove(0);
		
		
	}

}
