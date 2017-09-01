package day16;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo1_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 *  The benefits of generic are : 1. improve security(bring the errors of execution to compiling
		 *   2. get rid of force type conversion when you already specify the generic type of colletion
		 *   Note: from JDK 1.7, the type of latter can be omitted.
		 */
		//demo1();
		/*int [] ints = new byte[5];
		//ArrayList<Object> list = new ArrayList<Person;*/ // the types has to be consistant in the two places
		
		ArrayList<Person>  p = new ArrayList<>(); // JDK 1.7 alllows the diamond type declaration.
		

	}

	public static void demo1() {
		ArrayList<Person> list = new ArrayList();
		list.add(new Person("wang",24));
		list.add(new Person("zhang",21));
		/*list.add(true);
		list.add(21);
		*/
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p =  it.next();
			System.out.println(p.getName() + "...." + p.getAge());
		}
	}

}
