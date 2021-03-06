package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* Stack//클래쓰
 * 마지막에 저장한 데이터를 가장 먼저 꺼낸다 => LIFO (Last in First out)
 * 
 * push() : 삽입, pop() : 인출, empty() : 비어있음
 * 
 * 
 * Queue//인터페이스
 * 처음에 저장한 데이터를 가장 먼저 꺼낸다 => FIFO (First in First out)
 * offer() : 삽입, poll() : 인출
 */


public class StackEx {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>(); 
		
		//스택에 삽입
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		//큐에 삽입
		queue.offer("10");
		queue.offer("9");
		queue.offer("8");
		queue.offer("7");
		queue.offer("6");
		
		//스택에서 인출
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println();

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
