package advance;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ses {
	public static void main(String[] args)throws InterruptedException, ExecutionException {
		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
		ses.schedule(new MyThread01(),3, TimeUnit.SECONDS);
		ses.shutdown();
		// выполняет задачи через определенное время 
	}
	static  class  MyThread01 extends Thread {

		@Override
		public void run() {
			System.out.println("1");
		}
		
	}
}
