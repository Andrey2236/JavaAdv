package advance;

import java.util.Stack;

public class Steak_1 {
	public static void main(String[] args) {
		Stack<String> stack =  new Stack();
		stack.add("one");
		stack.push("two");
		System.out.println(stack.peek());//достать последний элемент 

		System.out.println(stack.pop());//достать последний элемент и удалитиь его
		 

	}

}
