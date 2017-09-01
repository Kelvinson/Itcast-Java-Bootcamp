package day14;

public class Demo7_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// group and captures
		/**
		 * Group number
		 * 
		 * Capturing groups are numbered by counting their opening parentheses
		 * from left to right. In the expression ((A)(B(C))), for example, there
		 * are four such groups:
		 * 
		 * 1 ((A)(B(C))) 
		 * 2 (A) 
		 * 3 (B(C)) 
		 * 4 (C) 
		 * Group zero always stands for the entire expression
		 * 
		 * Capturing groups are so named because, during a match, each
		 * subsequence of the input sequence that matches such a group is saved.
		 * The captured subsequence may be used later in the expression, via a
		 * back reference, and may also be retrieved from the matcher once the
		 * match operation is complete.
		 */
		 //demo1();
		//demo2();
		 String s = "我....我..要...要...学.学.学.编程..编程..编程..";
		 //String s2 = s.replaceAll("\\.1+",""); 
		 String s2 = s.replaceAll("\\.+",""); 
		 System.out.println(s2);
		 String s3 = s2.replaceAll("(.+)\\1+","$1"); //$1 stands for the content in the fisrt group 
		 System.out.println(s3);

	}

	public static void demo2() {
		//slice the repeated patterns like "sdqqfgkkkhjppppkl"
		String regex = "(.)\\1+"; // "+" stands for once or more times
		String s = "sdqqfgkkkhjppppkl" ;
		String arr[] = s.split(regex);
		
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

	public static void demo1() {
		// patterns like "aabb"
		String regex = "(.*)\\1(.)\\2"; //the first group repeats once aain
		System.out.println("快快乐乐".matches(regex));
		System.out.println("高兴高兴".matches(regex));
		
		//patterns like "abab"
		String regex2 = "(..)\\1";
		System.out.println("高兴高兴".matches(regex2 ));
	}

}
