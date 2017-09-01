package day15;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Demo3_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		demo1();
		Collection c = new ArrayList();
		/**
		 *  when new created Student object is passed into the add method
		 *  the object automatically is boxed into object type and hence 
		 *  cannot call its getName getAge method on the arr[i] object
		 *  it is explicitly executed as Object obj = new Student("jack",123); c.add(obj)
		 */
		c.add(new Student("jack",123));
		c.add(new Student("mary",23));
		c.add(new Student("lucy",45));
		
		Object [] arr = c.toArray();
		
		for (int  i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}


	}

	public static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		//toArray method returns an array containing all of the elements in this collection.
		Object [] arr = c.toArray();

		for ( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
