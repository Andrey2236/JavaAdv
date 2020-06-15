package advance;

import java.util.concurrent.ThreadFactory;

public class ThFactoru {
	public static void main(String[] args) {
		// работа с однородными потоками йка потоков по анологии ( пставить приоритет)
		ThreadFactory tf = new ThreadFactory() {
			public Thread newThread(Runnable r) {
				Thread th = new Thread(r);
				th.setPriority(th.MAX_PRIORITY);
				return th;
			}

		};
		tf.newThread(new Myrun3()).start();
	}

	static class Myrun3 implements Runnable {

		@Override
		public void run() {
			System.out.print(1);
		}

	}
}
