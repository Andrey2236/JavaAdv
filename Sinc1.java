package advance;

public class Sinc1 {
	public static void main(String[] args) throws Exception{
		Resource resource = new Resource();
		resource.setI(5);
		MyThread2 mt3 = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		mt2.setResource(resource);
		mt3.setResource(resource);
		mt2.start();
		mt3.start();
		mt2.join();
		mt3.join();
		System.out.println(resource.getI());

	


	}

}
class MyThread2 extends Thread{
	Resource resource;
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public void run() {
		resource.change1();	
	}
}
class MyThread3 extends Thread{
	Resource resource;
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public void run() {
		resource.change1();	
	}
}


class  Resource {
	
	static  int i;//sync стоит до того момента как не пройдет операция
	
	public int getI() {
		return i;
	}

	public synchronized void setI(int i) {
		this.i = i;
	}//статиеская синхронизация находиться на уровне класса  при разных локах блоки могут выполняться одновреммено

	public synchronized void  change1() {
		int i = this.i;
		i++;
		this.i = i;
	}
}