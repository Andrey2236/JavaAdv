package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection1 {
//	List list = Collections.synchronizedList(new ArrayList<>());

	public static void main(String[] args) throws Exception {
		NameList nameList = new NameList();
		nameList.add("first");
		class MyThread extends Thread{
			public void run() {
				System.out.println(nameList.removeFirst());
			}
		}
		MyThread myThread = new MyThread();
		myThread.setName("one");
		myThread.start();
		new MyThread().start();
	}

	static class NameList {
		List list = Collections.synchronizedList(new ArrayList<>());// cинхронизирация нужна для возвращения

		public  void add(String name) {
			
			list.add(name);
		}

		public synchronized String removeFirst() {
			if (list.size() > 0) {
				
				return (String) list.remove(0);
			}
			return null;
		}
	}

}
