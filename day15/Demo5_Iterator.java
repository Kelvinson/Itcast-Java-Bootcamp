package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo5_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		Collection c = new ArrayList();
		c.add(new Student("jack",123));
		c.add(new Student("mary",23));
		c.add(new Student("lucy",45));
		c.add(new Student("john",18));
		
		c.clear();
		System.out.println(c);
		
		Iterator it = c.iterator();
		
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

	public static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Iterator it = c1.iterator();
		
		boolean b1 = it.hasNext();
		Object d1 = it.next();
		System.out.println(b1);
		System.out.println(d1);
		
		boolean b2 = it.hasNext();
		Object d2 = it.next();
		System.out.println(b2);
		System.out.println(d2);
		
		// use while loop instead
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
