package advance;

import java.util.concurrent.atomic.AtomicInteger;

public class Atom_per {
	Integer I;
	
	static AtomicInteger atomicInteger =  new AtomicInteger(0);
	
	public static void main(String[] args) throws Exception{
		for (int j = 0; j < 10000; j++) {
			new MyThread().start();
		}
		Thread.sleep(2000);
		System.out.println(atomicInteger.get()); //  не обезательно 10000 почему 
	}
	static  class MyThread extends Thread{
		public void run() {
			atomicInteger.incrementAndGet();
//		потому то не атомарные переменные 	
//			int k  = i + 1;// i = 4; k = 5
//			int k  = i + 1; i = 4; k = 5
//			i=k;
//			i=k;
//			
//			int k  = i + 1;
//			i=k;
		}
	}
}
