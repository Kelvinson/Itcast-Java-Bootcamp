import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class Test3 {
	// remove the duplicates in array
	public static void main(String [] args){
		// create list to store some duplicate elements
		// create seperate methods to remove duplicates
		// print the list array
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");	
		
		getUnique(list);
		System.out.println(list);
		
	}
	
	/**
	 * <p>getUnique method removes the duplicates of a list of String and return the 
	 * unque string sets.</p> <p> It first create a new LinkedHashSet of String type 
	 * and then use the addAll method of linkedhashset thus when added only the unique
	 * strings are left and then clear all strings of original list, addAll strings 
	 * in the hashset to the original list.
	 * 
	 * @param list
	 */
	public static void getUnique(List<String> list) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list);
		list.clear();
		
		list.addAll(lhs);
		
	}
}
