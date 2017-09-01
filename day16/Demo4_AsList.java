package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] arr = {"a","b","c","d"};
		//Integer [] arr = {1,2,3,4};
		//List<Integer>  list = Arrays.asList(arr);
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		String[] arr = list.toArray(new String[0]);
		
		for (String s : arr) {
			System.out.println(s);
		}
		
		//System.out.println(list);
	}

}
