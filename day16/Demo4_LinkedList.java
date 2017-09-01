package day16;

import java.util.LinkedList;

public class Demo4_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use linked list to accomplish the stack data structure
		//demo1();
		Stack stack = new Stack();
		stack.in("a");
		stack.in("b");
		stack.in("c");
		stack.in("c");
		
		while (!stack.isEmpty()) {
			System.out.println(stack.out());
		}
		
		
	}

	public static void demo1() {
		LinkedList linkedList = new LinkedList();
		linkedList.addLast("a");
		linkedList.addLast("b");
		linkedList.addLast("c");
		linkedList.addLast("d");
		linkedList.addLast("e");
		
		/*System.out.println(linkedList.removeLast());
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList.removeLast());*/
		
		while (!linkedList.isEmpty()) {
			System.out.println(linkedList.removeLast());
		}
	}

}
