package day14;

import java.util.Random;

public class Demo2_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random  r = new Random();
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(r.nextInt(100)); // it is important nextInt(n) generates numbers from [0,n) 0(included) to n(excluded)
		}
		
		//use 1+nextInt(100) can generate numbes in the range of [1,101), so 100 can be generated;
		
		//when the random seed is specified, the generated numbers are the same in two times
//		Random r2 = new Random(1001);
//		
//		int a = r2.nextInt();
//		int b = r2.nextInt();
//		
//		System.out.println(a);
//		System.out.println(b);
				
	}

}
