package day14;

public class Demo3_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Greedy quantifiers X? X, once or not at all X* X, zero or more times
		 * X+ X, one or more times X{n} X, exactly n times X{n,} X, at least n
		 * times X{n,m} X, at least n but not more than m times
		 */
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();

	}

	public static void demo5() {
		// "[abc]{n,}" stands for  characters abc (single or combination) appears at least n times
		// that' to say the string just conatins characters made of at least n abcs.
		String regex = "[abc]{5,}";
		System.out.println("abcab".matches(regex));
		System.out.println("abccabccc".matches(regex));
		System.out.println("ccccc".matches(regex));
		System.out.println("ab".matches(regex));
	}

	public static void demo4() {
		// "[abc]{n}" stands for  characters abc (single or combination) appears exact n times
		// that' to say the string just conatins characters made of n abcs.
		String regex = "[abc]{5}";
		System.out.println("abcab".matches(regex));
		System.out.println("abcc".matches(regex));
		System.out.println("ccccc".matches(regex));
		System.out.println("".matches(regex));
	}

	public static void demo3() {
		// "[abc]+" stands for  characters abc (single or combination) appears one or many times.
		// that' to say the string just conatins characters made of multiple abcs but cannot be empty.
		String regex = "[abc]+";
		System.out.println("a".matches(regex));
		System.out.println("abcc".matches(regex));
		System.out.println("ccccc".matches(regex));
		System.out.println("".matches(regex));
	}

	public static void demo2() {
		// "[abc]*" stands for  characters abc (single or combination) appears zero or many times.
		// that' to say the string just conatins characters made of multiple abcs or empty.
		String regex = "[abc]*";
		System.out.println("a".matches(regex));
		System.out.println("abcc".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("".matches(regex));
	}

	public static void demo1() {
		// "X?" stands for single character X appears once or zero time.
		String regex = "[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("".matches(regex));
	}

}
