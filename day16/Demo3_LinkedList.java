package day16;

import java.util.LinkedList;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Demo3_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst("a");
		linkedList.addFirst("b");
		linkedList.addFirst("c");
		linkedList.addFirst("d");
		linkedList.addLast("e");
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.removeFirst());
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList.get(2));
		System.out.println(linkedList);
		
		
	}

}
