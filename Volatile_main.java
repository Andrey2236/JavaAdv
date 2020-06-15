package advance;

public class Volatile_main {
	volatile static int i ;
	
	public static void main(String[] args) {
		new MyThereadRead().start();
		new MyThereadWrite().start();

	}
	
	static class MyThereadRead extends Thread{
		public void run() {
			while(i<5) {
				System.out.println("print" + (++i));
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	static class MyThereadWrite extends Thread{
		public void run() {
			int localvar = i;// volatile без него нечего 
			while(localvar < 5) {
				if(localvar !=i) {
					System.out.println("i gros" + i);
					localvar = i;
				}
			}
		}
	}

}
