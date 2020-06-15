package advance;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RentLock {
	public static void main(String[] args) throws Exception {
		Resource resource = new Resource();
		resource.i = 5;
		MyThread2 mt3 = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		mt2.setResource(resource);
		mt3.setResource(resource);
		mt2.start();
		mt3.start();
		mt2.join();
		mt3.join();
		System.out.println(resource.i);

	}

	class MyThread2 extends Thread {
		Resource resource;

		public void setResource(Resource resource) {
			this.resource = resource;
		}

		public void run() {
			resource.change1();
		}
	}

}

class Resource {

	static int i;
	Lock lock = new ReentrantLock();// альтернатива синхронизации

	public void change1() {
		lock.lock();

		int i = this.i;
		i++;
		this.i = i;
		lock.unlock();
	}
}
