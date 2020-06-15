package advance;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Cbarier {
	public static void main(String[]args) {
		CyclicBarrier cyclicBarier = new CyclicBarrier(3, new Run2()); // как только 3 спорсмена собируться код выполниться
		new Sportsman(cyclicBarier);
		new Sportsman(cyclicBarier);
		new Sportsman(cyclicBarier);
	}
	
	static  class Run2 extends Thread {
		CyclicBarrier barrier;

		@Override
		public void run() {
			System.out.print("Run  is begin");
		}

		
		
	}
	static  class Sportsman extends Thread{
		CyclicBarrier barrier;

		public Sportsman(CyclicBarrier barrier) {
			this.barrier = barrier;
			start();
		}

		@Override
		public void run() {
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
	}
}
