package advance;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CbleAndFut {
	public static void main(String[] args) throws Exception {
		Callable<Integer> callable = new MyCallable();// заменяет ранубле 
		FutureTask futureTask = new FutureTask(callable);// имплементс  от ранейбл (метод ран )  и фючер  адд новые методы 
		new Thread(futureTask).start();
		System.out.println(futureTask.get());
		
	}

	static class MyCallable implements Callable<Integer> {
		public Integer call() throws Exception {
			int j = 0;
			for (int i = 0; i < 10; i++, j++) {
				Thread.sleep(200);
			}
			return j;
		}
	}
}
