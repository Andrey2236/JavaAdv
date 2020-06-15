package advance;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fjf {
	static  long  num = 10000000000l;
	static int nT = Runtime.getRuntime().availableProcessors();
	public static void main(String[] args) throws Exception{
		System.out.println(new Date());
//		long j = 0; 
//		for(long i = 0 ; i < num; i++) {
//			j += num;// опирация  заняла 8 сек
//		}
//		System.out.println(j);
		
		ForkJoinPool pool = new ForkJoinPool(nT);
		pool.invoke(new MyFork(0,num));
		System.out.println(new Date());
	}
	static class MyFork extends RecursiveTask<Long>{
			long from , to;
			
			
		public MyFork(long from, long to) {
				this.from = from;
				this.to = to;
			}


		@Override
		protected Long compute() {
			// TODO Auto-generated method stub
//			if(если операця разбита на достаточное количество тогда выполняем операцию0) {
//				
//			}else {разбиваем помельче};
			
			if((to - from) <= num / nT ) {
				System.out.println(new Date());
				long j = 0; 
				for(long i = 0 ; i < num; i++) {
					j += num;// опирация  заняла 2 сек
				}
				return j;
			}else {
				long midle = (to + from)/ 2 ;
				MyFork firstHal =  new MyFork(from , midle);
				firstHal.fork();
				MyFork secondHal = new MyFork(midle + 1,to);
				long secondValue = secondHal.compute();
				return firstHal.join() + secondValue;
			}
			
			
		}
		 
	}
}
