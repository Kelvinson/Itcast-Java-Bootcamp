package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8_Pattern {

	public static void main(String[] args) {
		/**
		 * Pattern p  = Pattern.compile("a*b");
		 * Matcher m = p.matcher("aaaaab");
		 * boolean b = m.matches();
		 */
		//demo1();
		//task : extract phone numbers from a string .
		String s = "My phone number is 18811346112,15011422579 is another number, I have used 18933277272";
		String regex = "1[3578]]\\d{9}";
		/** Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		boolean b = m.matches(); */
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		//boolean b1 = m.find();
		
		while (m.find()) {
			System.out.println(m.group());
		}
		
		System.out.println("finished!");
	}
	public static void demo1() {
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		
		while (m.find()) {
			System.out.println(m.group());
		}
		
		System.out.println(b);  
		System.out.println("aaaaab".matches("a*b")); // the same result as the above three lines of code
	}

}
