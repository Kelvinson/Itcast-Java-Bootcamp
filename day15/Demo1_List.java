package day15;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked","rawtypes"})

// void add(int index, E element)
// E remove(int index)
// E get(int index)
// E set(int index, E element)
public class Demo1_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		//demo3();
		List list  = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(2, "z");
		
		System.out.println(list);
		
		
	}

	public static void demo3() {
		List list  = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//		Object obj1  = list.get(3);
		//		System.out.println(obj1);
		
		// visit the whole list collection through the get method
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void demo2() {
		List list  = new ArrayList();
		
		list.add(111);
		list.add(222);
		list.add(333);
		//list.remove(111); here 111 is the index not the "111" object so the exception occurs 
	}

	public static void demo1() {
		List list  = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.add(4,"f"); // the index of the add method must less or equal the size of the list
		
		// list.add(10,"z"); // here comes the exception of Index out of bounds
		System.out.println(list);
	}

}
