package advance;

public class DeadL {
	public static void main	(String[] args) throws Exception{
		ResourceA resourceA = new ResourceA();
		ResourceB resourceB = new ResourceB();
		resourceA.resourceB = resourceB; 	
		resourceB.resourceA = resourceA;

		
		MyThread6 myThread6 = new MyThread6();
		MyThread7 myThread7 = new MyThread7();
		myThread6.resourceA = resourceA;
		myThread7.resourceB = resourceB;

		myThread6.start(); 
		myThread7.start();

		//происходит дедлок пытаються достуаться до попотоков оторые в пятле дедлок это где 2 потоа и 2 ресурса лоат друг друга 
	}

}

class MyThread6 extends Thread{
	ResourceA resourceA;

	public void run() {
	System.out.print(resourceA.getI());
	}
}

class MyThread7 extends Thread{
	ResourceB	 resourceB;

	public void run() {
	System.out.print(resourceB.getI());
	}
}



class ResourceA{
	ResourceB resourceB;
	public synchronized int getI() {
		return resourceB.returnI();
	}
	public synchronized int returnI() {
		return 1;
	}
}
class ResourceB{
	ResourceA resourceA;
	public synchronized int getI() {
		return resourceA.returnI();
	}
	public synchronized int returnI() {
		return 2;
	}
}