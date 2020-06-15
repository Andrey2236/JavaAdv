package advance;

import java.util.concurrent.CountDownLatch;

public class Cdl {
	public static void main(String[] args) throws InterruptedException{
		CountDownLatch cdl =  new CountDownLatch(3);//счечик
//		cdl.countDown();
//		cdl.await();
		new Work65(cdl);
		new Work65(cdl);
		new Work65(cdl);
		cdl.await();
		System.out.print("all jobs down");
	}

}

class Work65 extends Thread {
	CountDownLatch cdl ;

	public Work65(CountDownLatch cdl) {
		this.cdl = cdl;
		start();
	}

	@Override
	public void run() {
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("down worck");
		cdl.countDown();
	}
	
}
