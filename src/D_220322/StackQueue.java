package D_220322;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack<>();
		Queue queue = new LinkedList<>();
		
		stack.push("test1");
		stack.push("test2");
		stack.push("test3");
		stack.push("test4");
		
		queue.offer("test1");
		queue.offer("test2");
		queue.offer("test3");
		queue.offer("test4");

		System.out.println(queue.isEmpty());
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}
}