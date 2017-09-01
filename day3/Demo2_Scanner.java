package day3;
import java.util.Scanner;
public class Demo2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in); // new keyboard input line
//		System.out.println("Please input an integer:");
//		int x = sc.nextInt(); // Store the input int to the variable x;
//		System.out.println(x);
		
		// input two ints
		Scanner sc = new Scanner(System.in); // new keyboard input line
		System.out.println("Please input the first integer:");
		int x = sc.nextInt(); // Store the input int to the variable x;
		System.out.println(x);
		System.out.println("Please input the second integer");
		int y = sc.nextInt();
		System.out.println(y);
	}

}
