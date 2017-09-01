package day14;

public class Demo2_Regex {

	/**
	 * [abc] a or b or c character [^abc] character other than a or b or c
	 * [a-d[m-p]] a-b or m-p(one of two); [a-dm-p] (union of two)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String regex = demo1();
		// demo2(regex);
		// [d-z&&[def] d or e or f its the intersection of d-z and [def]
		// demo3();
		// demo4();
		//demo5();
		//demo6();
		//demo7();
	}

	public static void demo7() {
		// "\\w" stands for word charaters [a-zA-Z_0-9]
		String regex = "\\w";
		System.out.println("a".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("%".matches(regex));
	}

	public static void demo6() {
		// "\\S" stands for non empty character
		String regex = "\\S";
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex));
		System.out.println("a".matches(regex));
	}

	public static void demo5() {
		/**
		 * Predefined character classes . Any character (may or may not match
		 * line terminators)
		 *  \d A digit: [0-9] 
		 *  \D A non-digit: [^0-9] 
		 *  \h A horizontal whitespace character: [
		 * \t\xA0\u1680\u180e\u2000-\u200a\u202f\u205f\u3000] \H A
		 * non-horizontal whitespace character: [^\h] \s A whitespace character:
		 * [ \t\n\x0B\f\r] \S A non-whitespace character: [^\s] \v A vertical
		 * whitespace character: [\n\x0B\f\r\x85\u2028\u2029] \V A non-vertical
		 * whitespace character: [^\v] \w A word character: [a-zA-Z_0-9] \W A
		 * non-word character: [^\w]
		 */
		String regex = "\\s";
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex));
		System.out.println("    ".matches(regex));
	}

	public static void demo4() {
		String regex = "\\D{2,3}"; // '\' is escape character and if want \d not
									// the escape charater \\d is needed instead
		System.out.println("c".matches(regex));
		System.out.println("acc".matches(regex));
	}

	public static void demo3() {
		String regex = "[a-z&&[def]]";
		System.out.println("a".matches(regex));
		System.out.println("e".matches(regex));
		System.out.println("f".matches(regex));
		System.out.println("1".matches(regex));
	}

	public static String demo1() {
		String regex = "[^abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("e".matches(regex));
		System.out.println("10".matches(regex));
		return regex;
	}

	public static void demo2(String regex) {
		String regex1 = "[abc]";
		System.out.println("a".matches(regex1));
		System.out.println("b".matches(regex1));
		System.out.println("c".matches(regex1));
		System.out.println("1".matches(regex1));
		System.out.println("%".matches(regex1));
	}

}
