package day17;

import java.util.HashSet;

public class Demo1_HashSet {
	/**
	 *  Set collection, no index, duplicates are allowed
	 *  store and get is unordered sequence.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("zhangsan",23));
		hs.add(new Person("lisi",24));
		hs.add(new Person("zhangsan",23));
		hs.add(new Person("lisi",24));
		hs.add(new Person("lisi",24));
		hs.add(new Person("lisi",24));
		
		System.out.println(hs.size());
		
		
	}

	public static void demo1() {
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		// when store duplicate elements to the set collection, 
		// it returns false and is not successful.
		boolean b2 = hs.add("a"); 
		hs.add("c");
		hs.add("d");
		
		System.out.println(hs);   //HashSet has override the toString method in the AbstractCollection
		System.out.println(b1);
		System.out.println(b2);
		
		for (String h : hs) {
			System.out.println(h);			
		}
	}

}
