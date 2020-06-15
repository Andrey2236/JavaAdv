package advance;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Bq {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new PriorityBlockingQueue<>();
		new Thread() {
			public void run() { 
				try {
					System.out.println(queue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {//без блока этот поток выполниться позже
			public void run() {
				queue.add("this string");
			}
		}.start();
	}
}
