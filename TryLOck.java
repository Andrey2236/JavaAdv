package advance;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLOck {
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		new Thread11().start();
		new Thread22().start();


	}

	static class Thread11 extends Thread {
		public void run() {
			lock.lock();
			System.out.println(getName() + "start worck");
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + "stop");
			lock.unlock();
			System.out.println(getName() + "lock is relesed");
		}
	}

	static class Thread22 extends Thread {
		public void run() {
			System.out.println(getName() + "begin ");
			while (true) {
				if (lock.tryLock()) {
					System.out.println(getName() + "worck ");
					break;
				} else {
					System.out.println(getName() + "waiting ");
				}
			}
		}
	}

}
