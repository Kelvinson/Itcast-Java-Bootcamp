package day16;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("wang",24));
		list.add(new Person("zhang",21));
		list.add(new Person("li",19));	
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() +"...." + p.getAge());
		}


	}

	public static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
