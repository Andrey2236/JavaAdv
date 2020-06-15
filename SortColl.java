package advance;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	
	int age;
	public Person(int age) {
		this.age = age;
	}
	public int compareTo(Person p) {
		return this.age - p.age;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
}
	class ComparatePerson implements Comparator<Person>{
		public int compare(Person o1,Person o2) {
			return o1.age - o2.age;
		}
	}//используеться если доступа в класс нет 


public class SortColl {
	public static void main(String[] args) {
		ComparatePerson cp = new ComparatePerson();
		Set set = new TreeSet(cp);
		set.add(new Person(3));
		set.add(new Person(0));
		set.add(new Person(9));
		set.add(new Person(5));
		for (Object o: set) {
			System.out.print(o);
		}
	}

}
