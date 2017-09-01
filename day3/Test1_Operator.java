package day3;

public class Test1_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Compare whether two ints are the same or not
		 * 2. Get the maximum from 3 ints
		 *  
		 */
		
		int x = 10;
		int y = 5;
		//boolean b = (x == y ? true : false);
		boolean bool = (x == y);
		System.out.print(bool);
		
		// 2. get the maximum
		int a = 10;
		int b = 20;
		int c = 30;
		// get the maximum from a and b
		int temp = a > b? a : b;
		// get the maximum from temp and c
		int max = temp > c ? temp : c;
		System.out.println("The max number is " + max);
	}

}
