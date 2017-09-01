package day8;

/**
 * 
 * @author kelvinson
 * final used on class , the class can't be inherited to the method , the method can't be override and the variable cannot be override
 * final variable is used as public static final variable_name;
 */
public class Demo1_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 s1 = new Son1();
		s1.print();
	}

}

/**
 * this example shows that the final variables can be initialized at 1: explicitly initialized when created 2. before the objected constructed
 * @author kelvinson
 *
 */

class Son1 {
	
	final int NUM;
	
	public Son1() {
		NUM = 10;
	}
	
	public void print() {
//		NUM = 10;
		System.out.println(NUM);
	}
}