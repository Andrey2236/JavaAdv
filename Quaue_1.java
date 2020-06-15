package advance;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Quaue_1 {
	public static void  main(String[] args) {
		Queue queue = new LinkedList(); 	
		Queue queue2 = new PriorityQueue();//осортированный
		queue.add("1");
		queue.add("7");
		queue.add("6");
		while(queue.size()>0) {
			System.out.println(queue.poll());
		}
	}
	
}
