package day16;

import java.util.LinkedList;

public class Stack {
	
	@SuppressWarnings("rawtypes")
	private LinkedList linkedList = new LinkedList();
	
	// mimic the in stack operation
	@SuppressWarnings("unchecked")
	public void in(Object obj) {
		linkedList.addLast(obj);
	}
	
	// mimic the out stack operation
	public Object out(){
		return linkedList.removeLast();
	}
	
	// isEmpty method
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

}
