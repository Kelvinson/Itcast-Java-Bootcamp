package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
		// create new Scanner object 
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				int num = o2 - o1;
				return num == 0 ? 1 : num;
			}
			
		});
		
		while (true) {
			String line = sc.nextLine();
			if (line.equals("quit") || line.equals("")) { 
				break;
			}
			Integer i = Integer.parseInt(line);
			ts.add(i);
		}
		
		for (Integer i : ts) {
			System.out.println(i);
		}
	}

}
