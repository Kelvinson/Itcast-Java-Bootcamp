package day15;

import java.util.*;
@SuppressWarnings({"rawtypes","unchecked"})
public class Demo2_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		demo1();
		// this demo program show the methods of collection type and its sub class 
		// as the methods are add,remove, clear, isEmpty, contains;
		Collection<Object> c = new ArrayList<Object>();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");

		c.remove("d");
//		c.clear();
		System.out.println(c.contains("b"));
		System.out.println(c.isEmpty());
		System.out.println(c.isEmpty());
		 System.out.println(c.size());
	}

	public static void demo1() {
		Collection<Object> c = new ArrayList<Object>(); //the father class reference points to child class object;
		@SuppressWarnings("unchecked")
		boolean	b1 = c.add("abc"); //the parameter of Collection's add method is Object type
		/**
		 * new boxed to be (Boolean true), true is primitive type, 
		 * when passed in as parameter of add.
		 *  it will be boxed automatically.However this version of JDK not support 
		 */
		// List collection will always return true as the result but set collection can return false
		// The father class of ArrayList class override the toString the toString method, 
		// so when c is printed not the Object results are printed it is the common readable one.
		boolean b2 = c.add(new Boolean(true)); 
		boolean b3 = c.add(new Student("zhangsi",23));
		boolean b4 = c.add(new Integer(100));
		//		boolean b6= c.add(false);
		
		boolean b5 = c.add("abc");

		/**
		 *  when compiled it will typecheck the father class Collection and 
		 *  when it runs it will type check the sub class of ArrayList.
		 */

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

		System.out.println(c);
		System.out.println(c.toString());
	}

}
