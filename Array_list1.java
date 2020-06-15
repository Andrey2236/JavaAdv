package advance;
import java.util.ArrayList;
import java.util.List;

public class Array_list1 {
	public static void main (String[] args) {
		List <Integer>  array_list =  new ArrayList<>();//обычный массив . но если не умешаеться в массив  1 то создаеться массив 2  в 2 раза богльше и копируеться туда массив 1 
		// согласно конвенции ссылать объект класса на  переменую инерфейса
		
		for(int i = 0; i < 10; i++) {
			array_list.add(i);
		}
		array_list.remove(5);
		System.out.println(array_list);
		
		System.out.println(array_list.get(0));
		
		System.out.println(array_list.size());

		for(int i = 0; i < array_list.size(); i++) {
			System.out.println(array_list.get(i));

		}
		
		for(Integer x : array_list)//foreach
			System.out.println(x);
		
		//мы проводим много удалений из нашего листа 
		array_list = new LinkedList();
		

	}
}
