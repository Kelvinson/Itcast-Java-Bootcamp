package day17;

import java.util.HashSet;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		/**
		 *  Program to get 10 numbers ranged from 1 to 20, duplicates are not allowed 
		 *  output the results to the console window
		 *  1. use Random class to create the random object
		 *  2. to create 10 random numbers and unique for these number, then we use HashSet
		 *  3. if size of hashset is less than 10, keep on storing into it, stop if greater than 10
		 *  4. Random nextInt(n) to get the random numbers. 
		 */
		
		Random r = new Random();
		
		HashSet<Integer> hs = new HashSet<>();
		while (hs.size() < 10) {
			hs.add(r.nextInt(20) + 1);
		}
		
		for (Integer Int : hs) {
			System.out.println(Int);
		}
	}

}
