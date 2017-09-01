package day16;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_Foreach {
	
	/**
	 *  "for"-enhanced iteration usage for (element type e : collection or array) 
	 *   to iterate the whole collection and array
	 *   advantage: simple to perform iteration
	 *   the enhanced "for" is implemented by iteration at the low level; 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		
	
	}
	public static void demo5() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("d");
		
		// enhanced for cannot delete iterativly,it can only iteate the collection
		for (String s : list) {
			list.remove(s); 
		}
		
		System.out.println(list);
	}
	public static void demo4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("d");
		
		/*Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if ("b" == it.next()) {
				//list.remove("b"); cannot modify the arrayList at the same time iterate it.
				it.remove();
			}
		}
		
		System.out.println(list);
		
	}*/
	
		// it is the same as the following one: just another way of writing code
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			if ("b" == it.next()) {
				it.remove();
			}
		}  
		
		System.out.println(list );
	}
	public static void demo3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		//list.add("b");
		list.add("c");
		list.add("b");
		list.add("d");
		
		// remove some elements through the index
		// Note the index has to be subtarcted by one in this way
		for (int i = 0; i < list.size(); i++) {  
			if (list.get(i) == "b") {
				list.remove(i--);
				//list.remove(i);
			}
		}
		
		System.out.println(list);
	}

	public static void demo2() {
		ArrayList<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("wang",24));
		list1.add(new Person("li",23));
		list1.add(new Person("zhou",23));
		list1.add(new Person("li",23));
		list1.add(new Person("li",23));
		
		for (Person p : list1) {
		System.out.println(p);
		}
	}

	public static void demo1() {
		int [] arr = {11,22,33,44,55};
		for (int i : arr) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
