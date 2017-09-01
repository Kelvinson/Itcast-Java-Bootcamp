package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("heima");
		list.add("itcast");
		list.add("bbb");
		list.add("aaa");
		list.add("fffffff");		
		sort(list);
		System.out.println(list);

	}
	/**
	 * sort TreeSet object but reserve duplicates, although String class has 
	 * the comparable method 
	 * but it will not allow duplictes, we want to implement a one allowing 
	 * duplicate, so we have to implement our own comparator when we 
	 * create the Trees
	 * @param list
	 */
	public static void sort(ArrayList<String> list) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
			
		});
		
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}
