package day3;

public class Demo3_Operator {

	public static void main(String[] args) {
		/**
		 * << left shift, the left most bit is discarded and the right is stuffed with 0;
		 * >> right shift, if the left most bit is 1, the left part is stuffed with 1, 0 like versus.
		 * >>> no sign right shift. no matter what the left most bit is, stuff the left part bits with 0;
		 */
		// left shift n bits and the result will be base * 2^(n)
		System.out.println(12 << 1);
		System.out.println(12 << 2);
		// right shift n bits and the result will be base / 2^(n)
		System.out.println(12 >> 1);
		System.out.println(12 >> 2);
		
		// compute 2 * 8 most efficiently
		System.out.println(2 << 3);
		 
	}

}
