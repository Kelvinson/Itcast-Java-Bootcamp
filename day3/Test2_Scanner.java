package day3;
import java.util.Scanner;
public class Test2_Scanner {

	public static void main(String[] args) {
		// input two variables and output the sum and median of the two
		Scanner  sc = new Scanner(System.in);
		System.out.println("Please input the first int:");
		int x = sc.nextInt();
		System.out.println("Please input the second int:");
		int y = sc.nextInt();
		System.out.println("the sum of the two inputs is:" + (x + y));
		System.out.println("the median of the two inputs is:" + (x + y)/2);
	}

}
