package day19;

public class Demo1_Exception {
	
	//try is for to examine the exception while catch is for to get the exception
	// if there is no try catch handler block the program will stop at the d.division(10,0) 
	//but the program will pass if there is the try catch handler block
	//when multiple catches follows the try block, the sub class of exception comes first while the 
	//big class exception comes later. according to morphisism the parent class of exception will
	//handle all the exceptions 
	//JDK7 can handles multiple exception like catch (ArithmeticException | NullPointerException)
	public static void main(String[] args) {
		Demo d = new Demo();
		try {
		int x = d.divison(10, 0); 
		System.out.print(x); 
		} catch (ArithmeticException a)  { //ArithmeticException a = new ArithmeticException()
			System.out.println("error occurs, division is not allowed to be 0");
		}
		System.out.println("pass the exception and continue executing the program");
		
	}

}

class Demo {
	int divison (int a, int b) {
		return a / b;
	}
}
