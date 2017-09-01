package day16;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the task of this program is to remove duplicates in the list
		// the solution is to create a new list
		ArrayList newList = new ArrayList();
		ArrayList List = new ArrayList();
		List.add("wang");
		List.add("li");
		List.add(true);
		List.add("wang");
		List.add("wang");
		List.add("wang");
		newList = getSingle(List);
		
		System.out.println(newList);
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
				newList.add(obj);				// then add it to the old list
			}
		}
		return newList;
		
	}

}
