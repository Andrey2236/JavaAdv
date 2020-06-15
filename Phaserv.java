package advance;

import java.util.concurrent.Phaser;

public class Phaserv {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(2);
		new Wash(phaser);
		new Wash(phaser);

	}

	static class Wash extends Thread {
		Phaser phaser;

		public Wash(Phaser phaser) {
			// phaser.register();

			this.phaser = phaser;
			start();
		}

		@Override
		public void run() {
			for (int i = 0; i < 3; i++)
				System.out.println(getName()+"washing the car");
			phaser.arriveAndAwaitAdvance();// пока оба потока не вызавут этот метод мы не можем идти дальше
		}
		// phaser.arriveAndDeregister();
	}

}
