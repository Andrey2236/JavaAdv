package advance;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cond {
	static Lock lock = new ReentrantLock();
	static Condition condition = lock.newCondition();
	 static int account = 0;
	public static void main(String[] args)  throws InterruptedException{
		new  AccountMinus().start();;
		new	AccountPlus().start();;
	}
	static  class AccountPlus extends Thread{
		public  void run() {
			lock.lock();
			account +=10;
			condition.signal();
		lock.unlock();
			
		}
	}
	static  class AccountMinus extends Thread{
		public  void run() {
			if(account < 10) {
				try {
					lock.lock();
					System.out.print(account);
					condition.await();
					System.out.print(account);
					lock.unlock();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			account -=10;	
		}
	}

}
