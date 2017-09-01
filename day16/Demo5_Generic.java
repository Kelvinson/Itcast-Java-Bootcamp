package day16;

import java.util.ArrayList;
import java.util.List;

public class Demo5_Generic {
	
	/**
	 *  A.<?> the generic type specifier ? means it can be any type
	 *  if not specified ? means the Object type
	 *  B. ? extends E means the type can be only the subclass of E and
	 *  it restricts downwards
	 *  C. ? super E means the type can be super class of E and it restricts
	 *  upwards
	 */
	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("wang",24));
		list1.add(new Person("li",23));
		list1.add(new Person("zhou",23));
		list1.add(new Person("li",23));
		list1.add(new Person("li",23));
		
		// the generic type can be diamond type so the second Student type can be ommited
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student("wang",24));
		list2.add(new Student("li",23));
		list2.add(new Student("li",23));
		list2.add(new Student("zhou",23));
		list2.add(new Student("li",23));
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		
		

	}

}
