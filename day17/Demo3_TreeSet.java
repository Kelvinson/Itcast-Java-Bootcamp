package day17;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3_TreeSet {
	
	/**
	 * TreeSet can be used to sort and can ensure the uniquness of the elements
	 * when compareTo return 0 the set only contains one element
	 * when compareTo return positive number contains as the elements as they are added
	 * when compareTo return negative number contains elements in reverse order as added
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		// sort strings as the length of the string
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("aaabss");
		ts.add("ddss");
		ts.add("adgww");
		ts.add("sge");
		ts.add("b");
		ts.add("a");
		ts.add("jibaladogn");
		
		System.out.println(ts );
		
	}

	public static void demo4() {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 24));
		ts.add(new Person("wu",13));
		ts.add(new Person("qiu",46));
		ts.add(new Person("b", 33));
		ts.add(new Person("a", 3));
		ts.add(new Person("jibaladogn", 24));
		
		System.out.println(ts );
	}

	public static void demo3() {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 24));
		ts.add(new Person("zhouqi",13));
		ts.add(new Person("zhaoliu",46));
		ts.add(new Person("zhangsan", 33));
		ts.add(new Person("lisi", 24));
		
		System.out.println(ts );
	}

	public static void demo2() {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 24));
		ts.add(new Person("zhouqi",24));
		ts.add(new Person("zhaoliu",25));
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 24));
		
		System.out.println(ts);
	}

	public static void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(1);
		ts.add(2);
		ts.add(3);
		System.out.println(ts);
	}

}

class CompareByLen implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int num = s1.length() - s2.length();
		return num == 0 ? s1.compareTo(s2) : num;		
	}
	
}
