package advance;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exrct {
	 public static  void main(String[] args) throws InterruptedException, ExecutionException {
		 //создает пулл потоков  перееиспользование потоков
		 ExecutorService executorService = Executors.newFixedThreadPool(2) ;
		 executorService.submit(new MyRunable1());
		 System.out.println( executorService.submit(new MyRunable2()).get());
		 executorService.shutdown();
		 
		 
	 }
	static class MyRunable1 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.print("1");
		}
		
	}
	static class MyRunable2 implements Callable<String>{

		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			return "2";
		}
		
	}
}
