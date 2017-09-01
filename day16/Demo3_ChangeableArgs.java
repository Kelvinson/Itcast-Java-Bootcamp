package day16;

import java.util.Arrays;

public class Demo3_ChangeableArgs {
	
	/**
	 *  A don't know how many args to give when defining
	 *  B usage: spcifier returntype methodname(parametertype ... parametername)
	 *  C if a method has multiple and changeable parameters, then the changeable 
	 *  must be the last one.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {11,22,33,44,55};
//		System.out.println(Arrays.toString(arr));
		print(4,3,44,4);
		
	}
	
	/*public static void print(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}*/
	
	//  the changeable parameter is actually an array.
	// but it is more powerful than the int[] array parameter
	// in print(11,22,33,44) is envoked the parameter(11,22,33,44) 
	// is packaged int an int arr to form the parameter int[] arr,
	// the number of parameters can be 0 to infinity.
	public static void print(int x, int ... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
