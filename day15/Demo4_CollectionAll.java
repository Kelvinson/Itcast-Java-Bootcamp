package day15;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"unchecked","rawtypes"})
public class Demo4_CollectionAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// methods with All in Collection interface;
		// addAll, removeAll, retainAll, containsAll
		//		demo1();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
//		c2.add("e");
//		c2.add("f");
		
		/**
		 * Retains only the elements in this collection that are contained in the 
		 * specified collection (optional operation). In other words, removes from 
		 * this collection all of its elements that are not contained in the specified collection.
		 * Parameters: c - collection containing elements to be retained in this collection
         * Returns:true if this collection changed as a result of the call
		 */
		boolean b = c1.retainAll(c2);
		System.out.println(b);
		System.out.println(c1);

	}

	public static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");

		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		//		c2.add("d");

		boolean b = c1.retainAll(c2);
		System.out.println(b);
		System.out.println(c1);
	}

}
