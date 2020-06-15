package advance;

import java.util.HashMap;
import java.util.Map;

class Book {
	String autor;
	String name;
}
class Ticket{
	int number;
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Ticket ticket = (Ticket) o ;
		return number == ticket.number;

	}
	
	public int hashCode() {
		return number;
	}
	
}

public class HeashCode_test extends Object {
	int value;

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		ticket.number = 323;
		HeashCode_test main = new HeashCode_test();
		main.value = 5;
		Book book = new Book();
		book.autor = "karnegi";
		book.name = "How to get frends";
		Map<Ticket, Book> library = new HashMap();
		library.put(ticket, book);
		
		Ticket ticket2 = new Ticket();
		ticket2.number = 323;

		Book KagnegiBook = library.get(ticket);
		
		System.out.println(KagnegiBook.autor);//работает на основе хешакода - код ячейки 
		// хешкод и  equals переопределяються в колекциях

	}
}
