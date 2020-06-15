package advance;

public class Multi_trading {
	public static void main(String[] args) throws Exception{
		MyThread mt = new MyThread();
		mt.start();
		System.out.println(Thread.currentThread().getName());
		MyRunnamble myRunnable = new MyRunnamble();
		Thread t2 = new Thread(myRunnable);
		t2.start();
		
	}
}

class MyThread extends Thread{
	public void run() {
//		System.out.println("this is new  Thread");
//		someMethod();
		System.out.println(Thread.currentThread().getName());	
	}
//	private void someMethod() {
//		throw  new RuntimeException();
//	}
}
class MyRunnamble implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}