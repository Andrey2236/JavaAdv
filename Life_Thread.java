package advance;

public class Life_Thread {
	public static void main(String[] args) throws Exception{
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		mt1.sleep(500);
		mt1.setPriority(Thread.MAX_PRIORITY);
		Thread.yield(); //runing ->runable
		System.out.println("thread main");	
	}
	

}
class MyThread1 extends Thread{
	public void run() {
		System.out.println("0");	
	}
}

