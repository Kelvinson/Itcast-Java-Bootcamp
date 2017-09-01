package day16;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_ArrayList {

	
	// In this example, the task is to remove duplicates in the Person objects, so
	// the equals method of the Person class has to be override, otherwise two 
	// same Person objects will be regarded different for they have different 
	// reference pointers to address.
	
	// Note the two methods contains and remove all depend on the override equals method.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Person("wang",24));
		list.add(new Person("li",23));
		list.add(new Person("zhou",23));
		list.add(new Person("li",23));
		list.add(new Person("li",23));
		
		/*ArrayList newlist = new ArrayList();
		newlist = getSingle(list);*/
		list.remove(new Person("li",23));
		System.out.println(list);
	}
	
	
	
	/**
	 * input parameters: type ArrayList
	 * output parameters: type ArrayList
	 *  1. create a new ArrayList
	 *  2. iterator the old arrayList 
	 *  3. if there the element exists in the old array remove it, else add it
	 */

		public static ArrayList getSingle(ArrayList list) {
		ArrayList newList  = new ArrayList();
		Iterator it = list.iterator();   
		
		while (it.hasNext()) {
			Object obj = it.next();
			if (!newList.contains(obj)) {      // if the new list does not contain the element ,
				newList.add(obj);  				// then add it to the old list
			}
		}
		return newList;
		
		}

}
