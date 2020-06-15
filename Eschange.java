package advance;

import java.util.concurrent.Exchanger;

public class Eschange {
	public static void main(String[] args) throws InterruptedException{
		Exchanger<String> exchenger  = new Exchanger<>(); // обмен обектами в разных потоков
		new Mike(exchenger);
		new Ancet(exchenger);
		
	}
	static class Mike extends Thread{
		Exchanger<String> exchenger;

		public Mike(Exchanger<String> exchenger) {
			this.exchenger = exchenger;
			start(); 
		}

		@Override
		public void run() {
			try {
				exchenger.exchange("my 20 years old");
				sleep(1000);

				exchenger.exchange("Hi my name mike");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	static class  Ancet extends Thread{
		Exchanger<String> exchenger;

		public Ancet(Exchanger<String> exchenger) {
			this.exchenger = exchenger;
			start();
		}

		@Override
		public void run() {
			try {
				String info = exchenger.exchange(null);
				System.out.println(exchenger.exchange(null));
				System.out.println(exchenger.exchange(null));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
