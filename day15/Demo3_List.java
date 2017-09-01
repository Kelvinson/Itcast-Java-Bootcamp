package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo3_List {
   
	// the task of this method is to test if there is a "world" in the list , 
	// if so "javaee" is added into the list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list  = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("world");
		
		list.set(2, "z");

		// get the iterator of the collection
		/*Iterator it = list.iterator();
		// iterate the list through the next method
		// the concurrency problem occurs because the modification
		// and the iterating process happens at the same time
		while (it.hasNext()) {
			String s = (String) it.next();
			if (s == "world") {
				list.add("javaee");  // here comes the ConcurrentModificationException 
									 // because modification on the list and the iterator happens
									// at the same time
			}
		}*/
		
		/**
		 *  there are two solutions to tackle this task 1.use the listIterator 
		 *   2. do not use the list iterator to iterate the whole list
		 */
		// here use the ListIterator to perform the same task
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			
			if(s.equals("world")) {
				lit.add("javaee");
			}
		}
		
		System.out.println(list);
	}

}
