package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//visit the list via the get and size methods of list
		
		List list = new ArrayList();
		list.add(new Student("jack",123));
		list.add(new Student("mary",23));
		list.add(new Student("lucy",45));
		list.add(new Student("john",18));
		
		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
			Student s = (Student) list.get(i);
			System.out.println(s);
		}
	}

}
