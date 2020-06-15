package advance;

import java.util.concurrent.Semaphore;

public class Sempof {
	public static void main(String[] args) {
		Semaphore table = new Semaphore(2);//ожидане свободного стола
		Person00 person = new Person00();
		Person00 person2 = new Person00();
		Person00 person3 = new Person00();
		Person00 person4 = new Person00();
		Person00 person5 = new Person00();
		Person00 person6 = new Person00();
		Person00 person7 = new Person00();
		
		person.table = table;
		person2.table = table;
		person3.table = table;
		person4.table = table;
		person5.table = table;
		person6.table = table;
		person7.table = table;
		
		person.start();
		person2.start();
		person3.start();
		person4.start();
		person4.start();
		person6.start();
		person7.start();


		
	}

}	

class Person00 extends Thread {
	Semaphore table;
	@Override
	public void run() {
		System.out.println(this.getName() + "waitong on table");
		try {
			table.acquire();
			System.out.println(this.getName() + "eat on table");
			this.sleep(1000);
			System.out.println(this.getName() + "ralise on table");
			table.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
