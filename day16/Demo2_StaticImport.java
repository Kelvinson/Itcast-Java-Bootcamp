package day16;

import static java.util.Arrays.sort;

import java.util.Arrays;

public class Demo2_StaticImport {

	/**
	 *  static import is the new characteristic from JDK 1.5
	 *  the usage is : import static packagename.classnaem.methodname;
	 *  because it can happens that methods with same name are imported,
	 *  so it is not advocated to be used
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,22,33,44,55};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	

}
